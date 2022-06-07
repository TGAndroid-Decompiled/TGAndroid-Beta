package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputEncryptedFile;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputFile;
import org.telegram.tgnet.TLRPC$TL_inputFileBig;

public class FileUploadOperation {
    private static final int initialRequestsCount = 8;
    private static final int initialRequestsSlowNetworkCount = 1;
    private static final int maxUploadingKBytes = 2048;
    private static final int maxUploadingSlowNetworkKBytes = 32;
    private static final int minUploadChunkSize = 128;
    private static final int minUploadChunkSlowNetworkSize = 32;
    private long availableSize;
    private int currentAccount;
    private long currentFileId;
    private int currentPartNum;
    private int currentType;
    private int currentUploadRequetsCount;
    private FileUploadOperationDelegate delegate;
    private long estimatedSize;
    private String fileKey;
    private int fingerprint;
    private boolean forceSmallFile;
    private ArrayList<byte[]> freeRequestIvs;
    private boolean isBigFile;
    private boolean isEncrypted;
    private boolean isLastPart;
    private byte[] iv;
    private byte[] ivChange;
    private byte[] key;
    protected long lastProgressUpdateTime;
    private int lastSavedPartNum;
    private int maxRequestsCount;
    private boolean nextPartFirst;
    private int operationGuid;
    private SharedPreferences preferences;
    private byte[] readBuffer;
    private long readBytesCount;
    private int requestNum;
    private int saveInfoTimes;
    private boolean slowNetwork;
    private boolean started;
    private int state;
    private RandomAccessFile stream;
    private long totalFileSize;
    private int totalPartsCount;
    private boolean uploadFirstPartLater;
    private int uploadStartTime;
    private long uploadedBytesCount;
    private String uploadingFilePath;
    private int uploadChunkSize = CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT;
    private SparseIntArray requestTokens = new SparseIntArray();
    private SparseArray<UploadCachedResult> cachedResults = new SparseArray<>();

    public interface FileUploadOperationDelegate {
        void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j, long j2);

        void didFailedUploadingFile(FileUploadOperation fileUploadOperation);

        void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC$InputFile tLRPC$InputFile, TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile, byte[] bArr, byte[] bArr2);
    }

    public static class UploadCachedResult {
        private long bytesOffset;
        private byte[] iv;

        private UploadCachedResult() {
        }
    }

    public FileUploadOperation(int i, String str, boolean z, long j, int i2) {
        this.currentAccount = i;
        this.uploadingFilePath = str;
        this.isEncrypted = z;
        this.estimatedSize = j;
        this.currentType = i2;
        this.uploadFirstPartLater = j != 0 && !z;
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void setDelegate(FileUploadOperationDelegate fileUploadOperationDelegate) {
        this.delegate = fileUploadOperationDelegate;
    }

    public void start() {
        if (this.state == 0) {
            this.state = 1;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileUploadOperation.this.lambda$start$0();
                }
            });
        }
    }

    public void lambda$start$0() {
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        this.slowNetwork = ApplicationLoader.isConnectionSlow();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload on slow network = " + this.slowNetwork);
        }
        int i = this.slowNetwork ? 1 : 8;
        for (int i2 = 0; i2 < i; i2++) {
            startUploadRequest();
        }
    }

    public void onNetworkChanged(final boolean z) {
        if (this.state == 1) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileUploadOperation.this.lambda$onNetworkChanged$1(z);
                }
            });
        }
    }

    public void lambda$onNetworkChanged$1(boolean z) {
        int i;
        if (this.slowNetwork != z) {
            this.slowNetwork = z;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("network changed to slow = " + this.slowNetwork);
            }
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= this.requestTokens.size()) {
                    break;
                }
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i2), true);
                i2++;
            }
            this.requestTokens.clear();
            cleanup();
            this.isLastPart = false;
            this.nextPartFirst = false;
            this.requestNum = 0;
            this.currentPartNum = 0;
            this.readBytesCount = 0L;
            this.uploadedBytesCount = 0L;
            this.saveInfoTimes = 0;
            this.key = null;
            this.iv = null;
            this.ivChange = null;
            this.currentUploadRequetsCount = 0;
            this.lastSavedPartNum = 0;
            this.uploadFirstPartLater = false;
            this.cachedResults.clear();
            this.operationGuid++;
            if (!this.slowNetwork) {
                i = 8;
            }
            for (int i3 = 0; i3 < i; i3++) {
                startUploadRequest();
            }
        }
    }

    public void cancel() {
        if (this.state != 3) {
            this.state = 2;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileUploadOperation.this.lambda$cancel$2();
                }
            });
            this.delegate.didFailedUploadingFile(this);
            cleanup();
        }
    }

    public void lambda$cancel$2() {
        for (int i = 0; i < this.requestTokens.size(); i++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i), true);
        }
    }

    private void cleanup() {
        if (this.preferences == null) {
            this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        }
        SharedPreferences.Editor edit = this.preferences.edit();
        SharedPreferences.Editor remove = edit.remove(this.fileKey + "_time");
        SharedPreferences.Editor remove2 = remove.remove(this.fileKey + "_size");
        SharedPreferences.Editor remove3 = remove2.remove(this.fileKey + "_uploaded");
        SharedPreferences.Editor remove4 = remove3.remove(this.fileKey + "_id");
        SharedPreferences.Editor remove5 = remove4.remove(this.fileKey + "_iv");
        SharedPreferences.Editor remove6 = remove5.remove(this.fileKey + "_key");
        remove6.remove(this.fileKey + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.stream;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.stream = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void checkNewDataAvailable(final long j, final long j2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileUploadOperation.this.lambda$checkNewDataAvailable$3(j2, j);
            }
        });
    }

    public void lambda$checkNewDataAvailable$3(long j, long j2) {
        if (!(this.estimatedSize == 0 || j == 0)) {
            this.estimatedSize = 0L;
            this.totalFileSize = j;
            calcTotalPartsCount();
            if (!this.uploadFirstPartLater && this.started) {
                storeFileUploadInfo();
            }
        }
        if (j <= 0) {
            j = j2;
        }
        this.availableSize = j;
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    private void storeFileUploadInfo() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putInt(this.fileKey + "_time", this.uploadStartTime);
        edit.putLong(this.fileKey + "_size", this.totalFileSize);
        edit.putLong(this.fileKey + "_id", this.currentFileId);
        edit.remove(this.fileKey + "_uploaded");
        if (this.isEncrypted) {
            edit.putString(this.fileKey + "_iv", Utilities.bytesToHex(this.iv));
            edit.putString(this.fileKey + "_ivc", Utilities.bytesToHex(this.ivChange));
            edit.putString(this.fileKey + "_key", Utilities.bytesToHex(this.key));
        }
        edit.commit();
    }

    private void calcTotalPartsCount() {
        if (!this.uploadFirstPartLater) {
            long j = this.totalFileSize;
            int i = this.uploadChunkSize;
            this.totalPartsCount = (int) (((j + i) - 1) / i);
        } else if (this.isBigFile) {
            long j2 = this.totalFileSize;
            int i2 = this.uploadChunkSize;
            this.totalPartsCount = ((int) ((((j2 - i2) + i2) - 1) / i2)) + 1;
        } else {
            int i3 = this.uploadChunkSize;
            this.totalPartsCount = ((int) ((((this.totalFileSize - 1024) + i3) - 1) / i3)) + 1;
        }
    }

    public void setForceSmallFile() {
        this.forceSmallFile = true;
    }

    private void startUploadRequest() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileUploadOperation.startUploadRequest():void");
    }

    public void lambda$startUploadRequest$4(int i, int i2, byte[] bArr, int i3, int i4, int i5, long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        long j2;
        TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile;
        TLRPC$InputFile tLRPC$InputFile;
        byte[] bArr2 = bArr;
        if (i == this.operationGuid) {
            int currentNetworkType = tLObject != null ? tLObject.networkType : ApplicationLoader.getCurrentNetworkType();
            int i6 = this.currentType;
            if (i6 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i2);
            } else if (i6 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i2);
            } else if (i6 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i2);
            } else if (i6 == 67108864) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i2);
            }
            if (bArr2 != null) {
                this.freeRequestIvs.add(bArr2);
            }
            this.requestTokens.delete(i3);
            if (!(tLObject instanceof TLRPC$TL_boolTrue)) {
                this.state = 4;
                this.delegate.didFailedUploadingFile(this);
                cleanup();
            } else if (this.state == 1) {
                this.uploadedBytesCount += i4;
                long j3 = this.estimatedSize;
                if (j3 != 0) {
                    j2 = Math.max(this.availableSize, j3);
                } else {
                    j2 = this.totalFileSize;
                }
                this.delegate.didChangedUploadProgress(this, this.uploadedBytesCount, j2);
                int i7 = this.currentUploadRequetsCount - 1;
                this.currentUploadRequetsCount = i7;
                if (this.isLastPart && i7 == 0 && this.state == 1) {
                    this.state = 3;
                    if (this.key == null) {
                        if (this.isBigFile) {
                            tLRPC$InputFile = new TLRPC$TL_inputFileBig();
                        } else {
                            tLRPC$InputFile = new TLRPC$TL_inputFile();
                            tLRPC$InputFile.md5_checksum = "";
                        }
                        tLRPC$InputFile.parts = this.currentPartNum;
                        tLRPC$InputFile.id = this.currentFileId;
                        String str = this.uploadingFilePath;
                        tLRPC$InputFile.name = str.substring(str.lastIndexOf("/") + 1);
                        this.delegate.didFinishUploadingFile(this, tLRPC$InputFile, null, null, null);
                        cleanup();
                    } else {
                        if (this.isBigFile) {
                            tLRPC$InputEncryptedFile = new TLRPC$InputEncryptedFile() {
                                public static int constructor = 767652808;

                                @Override
                                public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
                                    this.id = abstractSerializedData.readInt64(z);
                                    this.parts = abstractSerializedData.readInt32(z);
                                    this.key_fingerprint = abstractSerializedData.readInt32(z);
                                }

                                @Override
                                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                                    abstractSerializedData.writeInt32(constructor);
                                    abstractSerializedData.writeInt64(this.id);
                                    abstractSerializedData.writeInt32(this.parts);
                                    abstractSerializedData.writeInt32(this.key_fingerprint);
                                }
                            };
                        } else {
                            tLRPC$InputEncryptedFile = new TLRPC$InputEncryptedFile() {
                                public static int constructor = 1690108678;

                                @Override
                                public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
                                    this.id = abstractSerializedData.readInt64(z);
                                    this.parts = abstractSerializedData.readInt32(z);
                                    this.md5_checksum = abstractSerializedData.readString(z);
                                    this.key_fingerprint = abstractSerializedData.readInt32(z);
                                }

                                @Override
                                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                                    abstractSerializedData.writeInt32(constructor);
                                    abstractSerializedData.writeInt64(this.id);
                                    abstractSerializedData.writeInt32(this.parts);
                                    abstractSerializedData.writeString(this.md5_checksum);
                                    abstractSerializedData.writeInt32(this.key_fingerprint);
                                }
                            };
                            tLRPC$InputEncryptedFile.md5_checksum = "";
                        }
                        tLRPC$InputEncryptedFile.parts = this.currentPartNum;
                        tLRPC$InputEncryptedFile.id = this.currentFileId;
                        tLRPC$InputEncryptedFile.key_fingerprint = this.fingerprint;
                        this.delegate.didFinishUploadingFile(this, null, tLRPC$InputEncryptedFile, this.key, this.iv);
                        cleanup();
                    }
                    int i8 = this.currentType;
                    if (i8 == 50331648) {
                        StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
                    } else if (i8 == 33554432) {
                        StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
                    } else if (i8 == 16777216) {
                        StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
                    } else if (i8 == 67108864) {
                        StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                    }
                } else if (i7 < this.maxRequestsCount) {
                    if (this.estimatedSize == 0 && !this.uploadFirstPartLater && !this.nextPartFirst) {
                        if (this.saveInfoTimes >= 4) {
                            this.saveInfoTimes = 0;
                        }
                        int i9 = this.lastSavedPartNum;
                        if (i5 == i9) {
                            this.lastSavedPartNum = i9 + 1;
                            long j4 = j;
                            while (true) {
                                UploadCachedResult uploadCachedResult = this.cachedResults.get(this.lastSavedPartNum);
                                if (uploadCachedResult == null) {
                                    break;
                                }
                                j4 = uploadCachedResult.bytesOffset;
                                bArr2 = uploadCachedResult.iv;
                                this.cachedResults.remove(this.lastSavedPartNum);
                                this.lastSavedPartNum++;
                            }
                            boolean z = this.isBigFile;
                            if ((z && j4 % 1048576 == 0) || (!z && this.saveInfoTimes == 0)) {
                                SharedPreferences.Editor edit = this.preferences.edit();
                                edit.putLong(this.fileKey + "_uploaded", j4);
                                if (this.isEncrypted) {
                                    edit.putString(this.fileKey + "_ivc", Utilities.bytesToHex(bArr2));
                                }
                                edit.commit();
                            }
                        } else {
                            UploadCachedResult uploadCachedResult2 = new UploadCachedResult();
                            uploadCachedResult2.bytesOffset = j;
                            if (bArr2 != null) {
                                uploadCachedResult2.iv = new byte[32];
                                System.arraycopy(bArr2, 0, uploadCachedResult2.iv, 0, 32);
                            }
                            this.cachedResults.put(i5, uploadCachedResult2);
                        }
                        this.saveInfoTimes++;
                    }
                    startUploadRequest();
                }
            }
        }
    }

    public void lambda$startUploadRequest$6() {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileUploadOperation.this.lambda$startUploadRequest$5();
            }
        });
    }

    public void lambda$startUploadRequest$5() {
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }
}
