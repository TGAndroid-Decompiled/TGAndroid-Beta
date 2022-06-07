package org.telegram.messenger;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputFileLocation;
import org.telegram.tgnet.TLRPC$InputWebFileLocation;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_fileHash;
import org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated;
import org.telegram.tgnet.TLRPC$TL_inputDocumentFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputPeerPhotoFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputPhotoFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetThumb;
import org.telegram.tgnet.TLRPC$TL_secureFile;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.tgnet.TLRPC$TL_upload_cdnFile;
import org.telegram.tgnet.TLRPC$TL_upload_cdnFileReuploadNeeded;
import org.telegram.tgnet.TLRPC$TL_upload_file;
import org.telegram.tgnet.TLRPC$TL_upload_fileCdnRedirect;
import org.telegram.tgnet.TLRPC$TL_upload_getCdnFile;
import org.telegram.tgnet.TLRPC$TL_upload_getCdnFileHashes;
import org.telegram.tgnet.TLRPC$TL_upload_getFile;
import org.telegram.tgnet.TLRPC$TL_upload_getWebFile;
import org.telegram.tgnet.TLRPC$TL_upload_reuploadCdnFile;
import org.telegram.tgnet.TLRPC$TL_upload_webFile;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$WebPage;

public class FileLoadOperation {
    private static final int preloadMaxBytes = 2097152;
    private static final int stateDownloading = 1;
    private static final int stateFailed = 2;
    private static final int stateFinished = 3;
    private static final int stateIdle = 0;
    private boolean allowDisordererFileSave;
    private int bigFileSizeFrom;
    private long bytesCountPadding;
    private File cacheFileFinal;
    private File cacheFileGzipTemp;
    private File cacheFileParts;
    private File cacheFilePreload;
    private File cacheFileTemp;
    private File cacheIvTemp;
    private byte[] cdnCheckBytes;
    private int cdnChunkCheckSize;
    private int cdnDatacenterId;
    private HashMap<Long, TLRPC$TL_fileHash> cdnHashes;
    private byte[] cdnIv;
    private byte[] cdnKey;
    private byte[] cdnToken;
    private int currentAccount;
    private int currentDownloadChunkSize;
    private int currentMaxDownloadRequests;
    private int currentQueueType;
    private int currentType;
    private int datacenterId;
    private ArrayList<RequestInfo> delayedRequestInfos;
    private FileLoadOperationDelegate delegate;
    private int downloadChunkSize;
    private int downloadChunkSizeBig;
    private long downloadedBytes;
    private boolean encryptFile;
    private byte[] encryptIv;
    private byte[] encryptKey;
    private String ext;
    private String fileName;
    private RandomAccessFile fileOutputStream;
    private RandomAccessFile filePartsStream;
    private RandomAccessFile fileReadStream;
    private RandomAccessFile fiv;
    private boolean forceBig;
    private long foundMoovSize;
    private int initialDatacenterId;
    private boolean isCdn;
    private boolean isForceRequest;
    private boolean isPreloadVideoOperation;
    private byte[] iv;
    private byte[] key;
    protected long lastProgressUpdateTime;
    protected TLRPC$InputFileLocation location;
    private int maxCdnParts;
    private int maxDownloadRequests;
    private int maxDownloadRequestsBig;
    private int moovFound;
    private long nextAtomOffset;
    private boolean nextPartWasPreloaded;
    private long nextPreloadDownloadOffset;
    private ArrayList<Range> notCheckedCdnRanges;
    private ArrayList<Range> notLoadedBytesRanges;
    private volatile ArrayList<Range> notLoadedBytesRangesCopy;
    private ArrayList<Range> notRequestedBytesRanges;
    public Object parentObject;
    public FilePathDatabase.PathData pathSaveData;
    private volatile boolean paused;
    private boolean preloadFinished;
    private long preloadNotRequestedBytesCount;
    private RandomAccessFile preloadStream;
    private int preloadStreamFileOffset;
    private byte[] preloadTempBuffer;
    private int preloadTempBufferCount;
    private HashMap<Long, PreloadRange> preloadedBytesRanges;
    private int priority;
    private RequestInfo priorityRequestInfo;
    private int renameRetryCount;
    private ArrayList<RequestInfo> requestInfos;
    private long requestedBytesCount;
    private HashMap<Long, Integer> requestedPreloadedBytesRanges;
    private boolean requestingCdnOffsets;
    protected boolean requestingReference;
    private int requestsCount;
    private boolean reuploadingCdn;
    private boolean started;
    private volatile int state;
    private String storeFileName;
    private File storePath;
    private ArrayList<FileLoadOperationStream> streamListeners;
    private long streamPriorityStartOffset;
    private long streamStartOffset;
    private boolean supportsPreloading;
    private File tempPath;
    private long totalBytesCount;
    private int totalPreloadedBytes;
    private boolean ungzip;
    private WebFile webFile;
    private TLRPC$InputWebFileLocation webLocation;

    public interface FileLoadOperationDelegate {
        void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j, long j2);

        void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i);

        void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file);

        void saveFilePath(FilePathDatabase.PathData pathData, File file);
    }

    public static class RequestInfo {
        private long offset;
        private int requestToken;
        private TLRPC$TL_upload_file response;
        private TLRPC$TL_upload_cdnFile responseCdn;
        private TLRPC$TL_upload_webFile responseWeb;

        protected RequestInfo() {
        }
    }

    public static class Range {
        private long end;
        private long start;

        private Range(long j, long j2) {
            this.start = j;
            this.end = j2;
        }
    }

    public static class PreloadRange {
        private long fileOffset;
        private long length;

        private PreloadRange(long j, long j2) {
            this.fileOffset = j;
            this.length = j2;
        }
    }

    private void updateParams() {
        if (MessagesController.getInstance(this.currentAccount).getfileExperimentalParams) {
            this.downloadChunkSizeBig = 524288;
            this.maxDownloadRequests = 8;
            this.maxDownloadRequestsBig = 8;
        } else {
            this.downloadChunkSizeBig = 131072;
            this.maxDownloadRequests = 4;
            this.maxDownloadRequestsBig = 4;
        }
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / this.downloadChunkSizeBig);
    }

    public FileLoadOperation(ImageLocation imageLocation, Object obj, String str, long j) {
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 1048576;
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / 131072);
        this.preloadTempBuffer = new byte[24];
        boolean z = false;
        this.state = 0;
        updateParams();
        this.parentObject = obj;
        this.forceBig = imageLocation.imageType == 2;
        if (imageLocation.isEncrypted()) {
            TLRPC$InputFileLocation tLRPC$TL_inputEncryptedFileLocation = new TLRPC$InputFileLocation() {
                public static int constructor = -182231723;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData, boolean z2) {
                    this.id = abstractSerializedData.readInt64(z2);
                    this.access_hash = abstractSerializedData.readInt64(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                    abstractSerializedData.writeInt64(this.id);
                    abstractSerializedData.writeInt64(this.access_hash);
                }
            };
            this.location = tLRPC$TL_inputEncryptedFileLocation;
            TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated = imageLocation.location;
            long j2 = tLRPC$TL_fileLocationToBeDeprecated.volume_id;
            tLRPC$TL_inputEncryptedFileLocation.id = j2;
            tLRPC$TL_inputEncryptedFileLocation.volume_id = j2;
            tLRPC$TL_inputEncryptedFileLocation.local_id = tLRPC$TL_fileLocationToBeDeprecated.local_id;
            tLRPC$TL_inputEncryptedFileLocation.access_hash = imageLocation.access_hash;
            byte[] bArr = new byte[32];
            this.iv = bArr;
            System.arraycopy(imageLocation.iv, 0, bArr, 0, bArr.length);
            this.key = imageLocation.key;
        } else if (imageLocation.photoPeer != null) {
            TLRPC$TL_inputPeerPhotoFileLocation tLRPC$TL_inputPeerPhotoFileLocation = new TLRPC$TL_inputPeerPhotoFileLocation();
            TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated2 = imageLocation.location;
            long j3 = tLRPC$TL_fileLocationToBeDeprecated2.volume_id;
            tLRPC$TL_inputPeerPhotoFileLocation.id = j3;
            tLRPC$TL_inputPeerPhotoFileLocation.volume_id = j3;
            tLRPC$TL_inputPeerPhotoFileLocation.local_id = tLRPC$TL_fileLocationToBeDeprecated2.local_id;
            tLRPC$TL_inputPeerPhotoFileLocation.photo_id = imageLocation.photoId;
            tLRPC$TL_inputPeerPhotoFileLocation.big = imageLocation.photoPeerType == 0;
            tLRPC$TL_inputPeerPhotoFileLocation.peer = imageLocation.photoPeer;
            this.location = tLRPC$TL_inputPeerPhotoFileLocation;
        } else if (imageLocation.stickerSet != null) {
            TLRPC$TL_inputStickerSetThumb tLRPC$TL_inputStickerSetThumb = new TLRPC$TL_inputStickerSetThumb();
            TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated3 = imageLocation.location;
            long j4 = tLRPC$TL_fileLocationToBeDeprecated3.volume_id;
            tLRPC$TL_inputStickerSetThumb.id = j4;
            tLRPC$TL_inputStickerSetThumb.volume_id = j4;
            tLRPC$TL_inputStickerSetThumb.local_id = tLRPC$TL_fileLocationToBeDeprecated3.local_id;
            tLRPC$TL_inputStickerSetThumb.thumb_version = imageLocation.thumbVersion;
            tLRPC$TL_inputStickerSetThumb.stickerset = imageLocation.stickerSet;
            this.location = tLRPC$TL_inputStickerSetThumb;
        } else if (imageLocation.thumbSize != null) {
            if (imageLocation.photoId != 0) {
                TLRPC$TL_inputPhotoFileLocation tLRPC$TL_inputPhotoFileLocation = new TLRPC$TL_inputPhotoFileLocation();
                this.location = tLRPC$TL_inputPhotoFileLocation;
                tLRPC$TL_inputPhotoFileLocation.id = imageLocation.photoId;
                TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated4 = imageLocation.location;
                tLRPC$TL_inputPhotoFileLocation.volume_id = tLRPC$TL_fileLocationToBeDeprecated4.volume_id;
                tLRPC$TL_inputPhotoFileLocation.local_id = tLRPC$TL_fileLocationToBeDeprecated4.local_id;
                tLRPC$TL_inputPhotoFileLocation.access_hash = imageLocation.access_hash;
                tLRPC$TL_inputPhotoFileLocation.file_reference = imageLocation.file_reference;
                tLRPC$TL_inputPhotoFileLocation.thumb_size = imageLocation.thumbSize;
                if (imageLocation.imageType == 2) {
                    this.allowDisordererFileSave = true;
                }
            } else {
                TLRPC$TL_inputDocumentFileLocation tLRPC$TL_inputDocumentFileLocation = new TLRPC$TL_inputDocumentFileLocation();
                this.location = tLRPC$TL_inputDocumentFileLocation;
                tLRPC$TL_inputDocumentFileLocation.id = imageLocation.documentId;
                TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated5 = imageLocation.location;
                tLRPC$TL_inputDocumentFileLocation.volume_id = tLRPC$TL_fileLocationToBeDeprecated5.volume_id;
                tLRPC$TL_inputDocumentFileLocation.local_id = tLRPC$TL_fileLocationToBeDeprecated5.local_id;
                tLRPC$TL_inputDocumentFileLocation.access_hash = imageLocation.access_hash;
                tLRPC$TL_inputDocumentFileLocation.file_reference = imageLocation.file_reference;
                tLRPC$TL_inputDocumentFileLocation.thumb_size = imageLocation.thumbSize;
            }
            TLRPC$InputFileLocation tLRPC$InputFileLocation = this.location;
            if (tLRPC$InputFileLocation.file_reference == null) {
                tLRPC$InputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC$InputFileLocation tLRPC$TL_inputFileLocation = new TLRPC$InputFileLocation() {
                public static int constructor = -539317279;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData, boolean z2) {
                    this.volume_id = abstractSerializedData.readInt64(z2);
                    this.local_id = abstractSerializedData.readInt32(z2);
                    this.secret = abstractSerializedData.readInt64(z2);
                    this.file_reference = abstractSerializedData.readByteArray(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                    abstractSerializedData.writeInt64(this.volume_id);
                    abstractSerializedData.writeInt32(this.local_id);
                    abstractSerializedData.writeInt64(this.secret);
                    abstractSerializedData.writeByteArray(this.file_reference);
                }
            };
            this.location = tLRPC$TL_inputFileLocation;
            TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated6 = imageLocation.location;
            tLRPC$TL_inputFileLocation.volume_id = tLRPC$TL_fileLocationToBeDeprecated6.volume_id;
            tLRPC$TL_inputFileLocation.local_id = tLRPC$TL_fileLocationToBeDeprecated6.local_id;
            tLRPC$TL_inputFileLocation.secret = imageLocation.access_hash;
            byte[] bArr2 = imageLocation.file_reference;
            tLRPC$TL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tLRPC$TL_inputFileLocation.file_reference = new byte[0];
            }
            this.allowDisordererFileSave = true;
        }
        int i = imageLocation.imageType;
        this.ungzip = (i == 1 || i == 3) ? true : z;
        int i2 = imageLocation.dc_id;
        this.datacenterId = i2;
        this.initialDatacenterId = i2;
        this.currentType = ConnectionsManager.FileTypePhoto;
        this.totalBytesCount = j;
        this.ext = str == null ? "jpg" : str;
    }

    public FileLoadOperation(SecureDocument secureDocument) {
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 1048576;
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / 131072);
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        updateParams();
        TLRPC$InputFileLocation tLRPC$TL_inputSecureFileLocation = new TLRPC$InputFileLocation() {
            public static int constructor = -876089816;

            @Override
            public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
                this.id = abstractSerializedData.readInt64(z);
                this.access_hash = abstractSerializedData.readInt64(z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(constructor);
                abstractSerializedData.writeInt64(this.id);
                abstractSerializedData.writeInt64(this.access_hash);
            }
        };
        this.location = tLRPC$TL_inputSecureFileLocation;
        TLRPC$TL_secureFile tLRPC$TL_secureFile = secureDocument.secureFile;
        tLRPC$TL_inputSecureFileLocation.id = tLRPC$TL_secureFile.id;
        tLRPC$TL_inputSecureFileLocation.access_hash = tLRPC$TL_secureFile.access_hash;
        this.datacenterId = tLRPC$TL_secureFile.dc_id;
        this.totalBytesCount = tLRPC$TL_secureFile.size;
        this.allowDisordererFileSave = true;
        this.currentType = ConnectionsManager.FileTypeFile;
        this.ext = ".jpg";
    }

    public FileLoadOperation(int i, WebFile webFile) {
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 1048576;
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / 131072);
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        updateParams();
        this.currentAccount = i;
        this.webFile = webFile;
        this.webLocation = webFile.location;
        this.totalBytesCount = webFile.size;
        int i2 = MessagesController.getInstance(i).webFileDatacenterId;
        this.datacenterId = i2;
        this.initialDatacenterId = i2;
        String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
        if (webFile.mime_type.startsWith("image/")) {
            this.currentType = ConnectionsManager.FileTypePhoto;
        } else if (webFile.mime_type.equals("audio/ogg")) {
            this.currentType = ConnectionsManager.FileTypeAudio;
        } else if (webFile.mime_type.startsWith("video/")) {
            this.currentType = ConnectionsManager.FileTypeVideo;
        } else {
            this.currentType = ConnectionsManager.FileTypeFile;
        }
        this.allowDisordererFileSave = true;
        this.ext = ImageLoader.getHttpUrlExtension(webFile.url, mimeTypePart);
    }

    public FileLoadOperation(org.telegram.tgnet.TLRPC$Document r12, java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.<init>(org.telegram.tgnet.TLRPC$Document, java.lang.Object):void");
    }

    public void setEncryptFile(boolean z) {
        this.encryptFile = z;
        if (z) {
            this.allowDisordererFileSave = false;
        }
    }

    public int getDatacenterId() {
        return this.initialDatacenterId;
    }

    public void setForceRequest(boolean z) {
        this.isForceRequest = z;
    }

    public boolean isForceRequest() {
        return this.isForceRequest;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPaths(int i, String str, int i2, File file, File file2, String str2) {
        this.storePath = file;
        this.tempPath = file2;
        this.currentAccount = i;
        this.fileName = str;
        this.storeFileName = str2;
        this.currentQueueType = i2;
    }

    public int getQueueType() {
        return this.currentQueueType;
    }

    public boolean wasStarted() {
        return this.started && !this.paused;
    }

    public int getCurrentType() {
        return this.currentType;
    }

    private void removePart(ArrayList<Range> arrayList, long j, long j2) {
        boolean z;
        if (arrayList != null && j2 >= j) {
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Range range = arrayList.get(i2);
                if (j == range.end) {
                    range.end = j2;
                } else if (j2 == range.start) {
                    range.start = j;
                }
                z = true;
            }
            z = false;
            Collections.sort(arrayList, FileLoadOperation$$ExternalSyntheticLambda11.INSTANCE);
            while (i < arrayList.size() - 1) {
                Range range2 = arrayList.get(i);
                int i3 = i + 1;
                Range range3 = arrayList.get(i3);
                if (range2.end == range3.start) {
                    range2.end = range3.end;
                    arrayList.remove(i3);
                    i--;
                }
                i++;
            }
            if (!z) {
                arrayList.add(new Range(j, j2));
            }
        }
    }

    public static int lambda$removePart$0(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        return range.start < range2.start ? -1 : 0;
    }

    private void addPart(ArrayList<Range> arrayList, long j, long j2, boolean z) {
        boolean z2;
        if (arrayList != null && j2 >= j) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                z2 = true;
                if (i >= size) {
                    z2 = false;
                    break;
                }
                Range range = arrayList.get(i);
                if (j <= range.start) {
                    if (j2 >= range.end) {
                        arrayList.remove(i);
                        break;
                    } else if (j2 > range.start) {
                        range.start = j2;
                        break;
                    } else {
                        i++;
                    }
                } else if (j2 < range.end) {
                    arrayList.add(0, new Range(range.start, j));
                    range.start = j2;
                    break;
                } else if (j < range.end) {
                    range.end = j;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                return;
            }
            if (z2) {
                try {
                    this.filePartsStream.seek(0L);
                    int size2 = arrayList.size();
                    this.filePartsStream.writeInt(size2);
                    for (int i2 = 0; i2 < size2; i2++) {
                        Range range2 = arrayList.get(i2);
                        this.filePartsStream.writeLong(range2.start);
                        this.filePartsStream.writeLong(range2.end);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ArrayList<FileLoadOperationStream> arrayList2 = this.streamListeners;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        this.streamListeners.get(i3).newDataAvailable();
                    }
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j + " - " + j2);
            }
        }
    }

    public File getCacheFileFinal() {
        return this.cacheFileFinal;
    }

    public File getCurrentFile() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final File[] fileArr = new File[1];
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.this.lambda$getCurrentFile$1(fileArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return fileArr[0];
    }

    public void lambda$getCurrentFile$1(File[] fileArr, CountDownLatch countDownLatch) {
        if (this.state == 3) {
            fileArr[0] = this.cacheFileFinal;
        } else {
            fileArr[0] = this.cacheFileTemp;
        }
        countDownLatch.countDown();
    }

    private long getDownloadedLengthFromOffsetInternal(ArrayList<Range> arrayList, long j, long j2) {
        long j3;
        if (arrayList == null || this.state == 3 || arrayList.isEmpty()) {
            long j4 = this.downloadedBytes;
            return j4 == 0 ? j2 : Math.min(j2, Math.max(j4 - j, 0L));
        }
        int size = arrayList.size();
        Range range = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                j3 = j2;
                break;
            }
            Range range2 = arrayList.get(i);
            if (j <= range2.start && (range == null || range2.start < range.start)) {
                range = range2;
            }
            if (range2.start <= j && range2.end > j) {
                j3 = 0;
                break;
            }
            i++;
        }
        if (j3 == 0) {
            return 0L;
        }
        if (range != null) {
            return Math.min(j2, range.start - j);
        }
        return Math.min(j2, Math.max(this.totalBytesCount - j, 0L));
    }

    public float getDownloadedLengthFromOffset(float f) {
        ArrayList<Range> arrayList = this.notLoadedBytesRangesCopy;
        long j = this.totalBytesCount;
        if (j == 0 || arrayList == null) {
            return 0.0f;
        }
        return f + (((float) getDownloadedLengthFromOffsetInternal(arrayList, (int) (((float) j) * f), j)) / ((float) this.totalBytesCount));
    }

    public long[] getDownloadedLengthFromOffset(final int i, final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final long[] jArr = new long[2];
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.this.lambda$getDownloadedLengthFromOffset$2(jArr, i, j, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return jArr;
    }

    public void lambda$getDownloadedLengthFromOffset$2(long[] jArr, int i, long j, CountDownLatch countDownLatch) {
        jArr[0] = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, i, j);
        if (this.state == 3) {
            jArr[1] = 1;
        }
        countDownLatch.countDown();
    }

    public String getFileName() {
        return this.fileName;
    }

    public void removeStreamListener(final FileLoadOperationStream fileLoadOperationStream) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.this.lambda$removeStreamListener$3(fileLoadOperationStream);
            }
        });
    }

    public void lambda$removeStreamListener$3(FileLoadOperationStream fileLoadOperationStream) {
        ArrayList<FileLoadOperationStream> arrayList = this.streamListeners;
        if (arrayList != null) {
            arrayList.remove(fileLoadOperationStream);
        }
    }

    private void copyNotLoadedRanges() {
        if (this.notLoadedBytesRanges != null) {
            this.notLoadedBytesRangesCopy = new ArrayList<>(this.notLoadedBytesRanges);
        }
    }

    public void pause() {
        if (this.state == 1) {
            this.paused = true;
        }
    }

    public boolean start() {
        return start(null, 0L, false);
    }

    public boolean start(final org.telegram.messenger.FileLoadOperationStream r31, final long r32, final boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.start(org.telegram.messenger.FileLoadOperationStream, long, boolean):boolean");
    }

    public void lambda$start$4(boolean z, long j, FileLoadOperationStream fileLoadOperationStream, boolean z2) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (z) {
            int i = this.currentDownloadChunkSize;
            long j2 = (j / i) * i;
            RequestInfo requestInfo = this.priorityRequestInfo;
            if (!(requestInfo == null || requestInfo.offset == j2)) {
                this.requestInfos.remove(this.priorityRequestInfo);
                this.requestedBytesCount -= this.currentDownloadChunkSize;
                removePart(this.notRequestedBytesRanges, this.priorityRequestInfo.offset, this.currentDownloadChunkSize + this.priorityRequestInfo.offset);
                if (this.priorityRequestInfo.requestToken != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.priorityRequestInfo.requestToken, true);
                    this.requestsCount--;
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("frame get cancel request at offset " + this.priorityRequestInfo.offset);
                }
                this.priorityRequestInfo = null;
            }
            if (this.priorityRequestInfo == null) {
                this.streamPriorityStartOffset = j2;
            }
        } else {
            int i2 = this.currentDownloadChunkSize;
            this.streamStartOffset = (j / i2) * i2;
        }
        this.streamListeners.add(fileLoadOperationStream);
        if (z2) {
            if (!(this.preloadedBytesRanges == null || getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, this.streamStartOffset, 1L) != 0 || this.preloadedBytesRanges.get(Long.valueOf(this.streamStartOffset)) == null)) {
                this.nextPartWasPreloaded = true;
            }
            startDownloadRequest();
            this.nextPartWasPreloaded = false;
        }
    }

    public void lambda$start$5(boolean[] zArr) {
        long j = this.totalBytesCount;
        if (j == 0 || ((!this.isPreloadVideoOperation || !zArr[0]) && this.downloadedBytes != j)) {
            startDownloadRequest();
            return;
        }
        try {
            onFinishLoadingFile(false);
        } catch (Exception unused) {
            onFail(true, 0);
        }
    }

    public void updateProgress() {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            long j = this.downloadedBytes;
            long j2 = this.totalBytesCount;
            if (j != j2 && j2 > 0) {
                fileLoadOperationDelegate.didChangedLoadProgress(this, j, j2);
            }
        }
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void setIsPreloadVideoOperation(final boolean z) {
        boolean z2 = this.isPreloadVideoOperation;
        if (z2 == z) {
            return;
        }
        if (z && this.totalBytesCount <= 2097152) {
            return;
        }
        if (z || !z2) {
            this.isPreloadVideoOperation = z;
        } else if (this.state == 3) {
            this.isPreloadVideoOperation = z;
            this.state = 0;
            this.preloadFinished = false;
            start();
        } else if (this.state == 1) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoadOperation.this.lambda$setIsPreloadVideoOperation$6(z);
                }
            });
        } else {
            this.isPreloadVideoOperation = z;
        }
    }

    public void lambda$setIsPreloadVideoOperation$6(boolean z) {
        this.requestedBytesCount = 0L;
        clearOperaion(null, true);
        this.isPreloadVideoOperation = z;
        startDownloadRequest();
    }

    public boolean isPreloadVideoOperation() {
        return this.isPreloadVideoOperation;
    }

    public boolean isPreloadFinished() {
        return this.preloadFinished;
    }

    public void cancel() {
        cancel(false);
    }

    public void cancel(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.this.lambda$cancel$7(z);
            }
        });
    }

    public void lambda$cancel$7(boolean z) {
        if (!(this.state == 3 || this.state == 2)) {
            if (this.requestInfos != null) {
                for (int i = 0; i < this.requestInfos.size(); i++) {
                    RequestInfo requestInfo = this.requestInfos.get(i);
                    if (requestInfo.requestToken != 0) {
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true);
                    }
                }
            }
            onFail(false, 1);
        }
        if (z) {
            File file = this.cacheFileFinal;
            if (file != null) {
                try {
                    if (!file.delete()) {
                        this.cacheFileFinal.deleteOnExit();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            File file2 = this.cacheFileTemp;
            if (file2 != null) {
                try {
                    if (!file2.delete()) {
                        this.cacheFileTemp.deleteOnExit();
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            File file3 = this.cacheFileParts;
            if (file3 != null) {
                try {
                    if (!file3.delete()) {
                        this.cacheFileParts.deleteOnExit();
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            File file4 = this.cacheIvTemp;
            if (file4 != null) {
                try {
                    if (!file4.delete()) {
                        this.cacheIvTemp.deleteOnExit();
                    }
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            File file5 = this.cacheFilePreload;
            if (file5 != null) {
                try {
                    if (!file5.delete()) {
                        this.cacheFilePreload.deleteOnExit();
                    }
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
            }
        }
    }

    private void cleanup() {
        try {
            RandomAccessFile randomAccessFile = this.fileOutputStream;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.fileOutputStream.close();
                this.fileOutputStream = null;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.preloadStream;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                this.preloadStream.close();
                this.preloadStream = null;
            }
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.fileReadStream;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
                this.fileReadStream.close();
                this.fileReadStream = null;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.filePartsStream;
            if (randomAccessFile4 != null) {
                try {
                    randomAccessFile4.getChannel().close();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                this.filePartsStream.close();
                this.filePartsStream = null;
            }
        } catch (Exception e8) {
            FileLog.e(e8);
        }
        try {
            RandomAccessFile randomAccessFile5 = this.fiv;
            if (randomAccessFile5 != null) {
                randomAccessFile5.close();
                this.fiv = null;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (this.delayedRequestInfos != null) {
            for (int i = 0; i < this.delayedRequestInfos.size(); i++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i);
                if (requestInfo.response != null) {
                    requestInfo.response.disableFree = false;
                    requestInfo.response.freeResources();
                } else if (requestInfo.responseWeb != null) {
                    requestInfo.responseWeb.disableFree = false;
                    requestInfo.responseWeb.freeResources();
                } else if (requestInfo.responseCdn != null) {
                    requestInfo.responseCdn.disableFree = false;
                    requestInfo.responseCdn.freeResources();
                }
            }
            this.delayedRequestInfos.clear();
        }
    }

    private void onFinishLoadingFile(final boolean z) {
        int lastIndexOf;
        String str;
        if (this.state == 1) {
            this.state = 3;
            cleanup();
            if (this.isPreloadVideoOperation) {
                this.preloadFinished = true;
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("finished preloading file to " + this.cacheFileTemp + " loaded " + this.totalPreloadedBytes + " of " + this.totalBytesCount);
                }
            } else {
                File file = this.cacheIvTemp;
                if (file != null) {
                    file.delete();
                    this.cacheIvTemp = null;
                }
                File file2 = this.cacheFileParts;
                if (file2 != null) {
                    file2.delete();
                    this.cacheFileParts = null;
                }
                File file3 = this.cacheFilePreload;
                if (file3 != null) {
                    file3.delete();
                    this.cacheFilePreload = null;
                }
                if (this.cacheFileTemp != null) {
                    boolean z2 = false;
                    if (this.ungzip) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(this.cacheFileTemp));
                            FileLoader.copyFile(gZIPInputStream, this.cacheFileGzipTemp, preloadMaxBytes);
                            gZIPInputStream.close();
                            this.cacheFileTemp.delete();
                            this.cacheFileTemp = this.cacheFileGzipTemp;
                            this.ungzip = false;
                        } catch (ZipException unused) {
                            this.ungzip = false;
                        } catch (Throwable th) {
                            FileLog.e(th);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("unable to ungzip temp = " + this.cacheFileTemp + " to final = " + this.cacheFileFinal);
                            }
                        }
                    }
                    if (!this.ungzip) {
                        if (this.parentObject instanceof TLRPC$TL_theme) {
                            try {
                                z2 = AndroidUtilities.copyFile(this.cacheFileTemp, this.cacheFileFinal);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else {
                            try {
                                if (this.pathSaveData != null) {
                                    this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                                    int i = 1;
                                    while (this.cacheFileFinal.exists()) {
                                        if (this.storeFileName.lastIndexOf(46) > 0) {
                                            str = this.storeFileName.substring(0, lastIndexOf) + " (" + i + ")" + this.storeFileName.substring(lastIndexOf);
                                        } else {
                                            str = this.storeFileName + " (" + i + ")";
                                        }
                                        this.cacheFileFinal = new File(this.storePath, str);
                                        i++;
                                    }
                                }
                                z2 = this.cacheFileTemp.renameTo(this.cacheFileFinal);
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                        }
                        if (!z2) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("unable to rename temp = " + this.cacheFileTemp + " to final = " + this.cacheFileFinal + " retry = " + this.renameRetryCount);
                            }
                            int i2 = this.renameRetryCount + 1;
                            this.renameRetryCount = i2;
                            if (i2 < 3) {
                                this.state = 1;
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        FileLoadOperation.this.lambda$onFinishLoadingFile$8(z);
                                    }
                                }, 200L);
                                return;
                            }
                            this.cacheFileFinal = this.cacheFileTemp;
                        }
                        if (this.pathSaveData != null && this.cacheFileFinal.exists()) {
                            this.delegate.saveFilePath(this.pathSaveData, this.cacheFileFinal);
                        }
                    } else {
                        onFail(false, 0);
                        return;
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("finished downloading file to " + this.cacheFileFinal);
                }
                if (z) {
                    int i3 = this.currentType;
                    if (i3 == 50331648) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
                    } else if (i3 == 33554432) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
                    } else if (i3 == 16777216) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
                    } else if (i3 == 67108864) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                    }
                }
            }
            this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
        }
    }

    public void lambda$onFinishLoadingFile$8(boolean z) {
        try {
            onFinishLoadingFile(z);
        } catch (Exception unused) {
            onFail(false, 0);
        }
    }

    private void delayRequestInfo(RequestInfo requestInfo) {
        this.delayedRequestInfos.add(requestInfo);
        if (requestInfo.response != null) {
            requestInfo.response.disableFree = true;
        } else if (requestInfo.responseWeb != null) {
            requestInfo.responseWeb.disableFree = true;
        } else if (requestInfo.responseCdn != null) {
            requestInfo.responseCdn.disableFree = true;
        }
    }

    private long findNextPreloadDownloadOffset(long j, long j2, NativeByteBuffer nativeByteBuffer) {
        long j3;
        int limit = nativeByteBuffer.limit();
        long j4 = j;
        do {
            if (j4 >= j2 - (this.preloadTempBuffer != null ? 16 : 0)) {
                j3 = j2 + limit;
                if (j4 < j3) {
                    if (j4 >= j3 - 16) {
                        long j5 = j3 - j4;
                        if (j5 <= 2147483647L) {
                            this.preloadTempBufferCount = (int) j5;
                            nativeByteBuffer.position(nativeByteBuffer.limit() - this.preloadTempBufferCount);
                            nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, this.preloadTempBufferCount, false);
                            return j3;
                        }
                        throw new RuntimeException("!!!");
                    }
                    if (this.preloadTempBufferCount != 0) {
                        nativeByteBuffer.position(0);
                        byte[] bArr = this.preloadTempBuffer;
                        int i = this.preloadTempBufferCount;
                        nativeByteBuffer.readBytes(bArr, i, 16 - i, false);
                        this.preloadTempBufferCount = 0;
                    } else {
                        long j6 = j4 - j2;
                        if (j6 <= 2147483647L) {
                            nativeByteBuffer.position((int) j6);
                            nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, 16, false);
                        } else {
                            throw new RuntimeException("!!!");
                        }
                    }
                    byte[] bArr2 = this.preloadTempBuffer;
                    int i2 = ((bArr2[0] & 255) << 24) + ((bArr2[1] & 255) << 16) + ((bArr2[2] & 255) << 8) + (bArr2[3] & 255);
                    if (i2 == 0) {
                        return 0L;
                    }
                    if (i2 == 1) {
                        i2 = ((bArr2[12] & 255) << 24) + ((bArr2[13] & 255) << 16) + ((bArr2[14] & 255) << 8) + (bArr2[15] & 255);
                    }
                    if (bArr2[4] == 109 && bArr2[5] == 111 && bArr2[6] == 111 && bArr2[7] == 118) {
                        return -i2;
                    }
                    j4 += i2;
                }
            }
            return 0L;
        } while (j4 < j3);
        return j4;
    }

    private void requestFileOffsets(long j) {
        if (!this.requestingCdnOffsets) {
            this.requestingCdnOffsets = true;
            TLRPC$TL_upload_getCdnFileHashes tLRPC$TL_upload_getCdnFileHashes = new TLRPC$TL_upload_getCdnFileHashes();
            tLRPC$TL_upload_getCdnFileHashes.file_token = this.cdnToken;
            tLRPC$TL_upload_getCdnFileHashes.offset = j;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_upload_getCdnFileHashes, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileLoadOperation.this.lambda$requestFileOffsets$9(tLObject, tLRPC$TL_error);
                }
            }, null, null, 0, this.datacenterId, 1, true);
        }
    }

    public void lambda$requestFileOffsets$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            onFail(false, 0);
            return;
        }
        this.requestingCdnOffsets = false;
        TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
        if (!tLRPC$Vector.objects.isEmpty()) {
            if (this.cdnHashes == null) {
                this.cdnHashes = new HashMap<>();
            }
            for (int i = 0; i < tLRPC$Vector.objects.size(); i++) {
                TLRPC$TL_fileHash tLRPC$TL_fileHash = (TLRPC$TL_fileHash) tLRPC$Vector.objects.get(i);
                this.cdnHashes.put(Long.valueOf(tLRPC$TL_fileHash.offset), tLRPC$TL_fileHash);
            }
        }
        for (int i2 = 0; i2 < this.delayedRequestInfos.size(); i2++) {
            RequestInfo requestInfo = this.delayedRequestInfos.get(i2);
            if (this.notLoadedBytesRanges != null || this.downloadedBytes == requestInfo.offset) {
                this.delayedRequestInfos.remove(i2);
                if (processRequestResult(requestInfo, null)) {
                    return;
                }
                if (requestInfo.response != null) {
                    requestInfo.response.disableFree = false;
                    requestInfo.response.freeResources();
                    return;
                } else if (requestInfo.responseWeb != null) {
                    requestInfo.responseWeb.disableFree = false;
                    requestInfo.responseWeb.freeResources();
                    return;
                } else if (requestInfo.responseCdn != null) {
                    requestInfo.responseCdn.disableFree = false;
                    requestInfo.responseCdn.freeResources();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public boolean processRequestResult(org.telegram.messenger.FileLoadOperation.RequestInfo r41, org.telegram.tgnet.TLRPC$TL_error r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.processRequestResult(org.telegram.messenger.FileLoadOperation$RequestInfo, org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public void onFail(boolean z, final int i) {
        cleanup();
        this.state = 2;
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate == null) {
            return;
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoadOperation.this.lambda$onFail$10(i);
                }
            });
        } else {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i);
        }
    }

    public void lambda$onFail$10(int i) {
        this.delegate.didFailedLoadingFile(this, i);
    }

    private void clearOperaion(RequestInfo requestInfo, boolean z) {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.requestInfos.size(); i++) {
            RequestInfo requestInfo2 = this.requestInfos.get(i);
            j = Math.min(requestInfo2.offset, j);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo2.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo2.offset, this.currentDownloadChunkSize + requestInfo2.offset);
            }
            if (!(requestInfo == requestInfo2 || requestInfo2.requestToken == 0)) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true);
            }
        }
        this.requestInfos.clear();
        for (int i2 = 0; i2 < this.delayedRequestInfos.size(); i2++) {
            RequestInfo requestInfo3 = this.delayedRequestInfos.get(i2);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo3.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo3.offset, this.currentDownloadChunkSize + requestInfo3.offset);
            }
            if (requestInfo3.response != null) {
                requestInfo3.response.disableFree = false;
                requestInfo3.response.freeResources();
            } else if (requestInfo3.responseWeb != null) {
                requestInfo3.responseWeb.disableFree = false;
                requestInfo3.responseWeb.freeResources();
            } else if (requestInfo3.responseCdn != null) {
                requestInfo3.responseCdn.disableFree = false;
                requestInfo3.responseCdn.freeResources();
            }
            j = Math.min(requestInfo3.offset, j);
        }
        this.delayedRequestInfos.clear();
        this.requestsCount = 0;
        if (!z && this.isPreloadVideoOperation) {
            this.requestedBytesCount = this.totalPreloadedBytes;
        } else if (this.notLoadedBytesRanges == null) {
            this.downloadedBytes = j;
            this.requestedBytesCount = j;
        }
    }

    private void requestReference(RequestInfo requestInfo) {
        TLRPC$WebPage tLRPC$WebPage;
        if (!this.requestingReference) {
            clearOperaion(requestInfo, false);
            this.requestingReference = true;
            Object obj = this.parentObject;
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                if (messageObject.getId() < 0 && (tLRPC$WebPage = messageObject.messageOwner.media.webpage) != null) {
                    this.parentObject = tLRPC$WebPage;
                }
            }
            FileRefController.getInstance(this.currentAccount).requestReference(this.parentObject, this.location, this, requestInfo);
        }
    }

    public void startDownloadRequest() {
        int i;
        long j;
        int i2;
        final TLRPC$TL_upload_getFile tLRPC$TL_upload_getFile;
        long j2;
        HashMap<Long, PreloadRange> hashMap;
        PreloadRange preloadRange;
        ArrayList<Range> arrayList;
        long j3;
        boolean z;
        if (!(this.paused || this.reuploadingCdn)) {
            int i3 = 1;
            if (this.state == 1) {
                long j4 = 0;
                if (this.streamPriorityStartOffset == 0) {
                    if (!this.nextPartWasPreloaded && this.requestInfos.size() + this.delayedRequestInfos.size() >= this.currentMaxDownloadRequests) {
                        return;
                    }
                    if (this.isPreloadVideoOperation) {
                        if (this.requestedBytesCount > 2097152) {
                            return;
                        }
                        if (this.moovFound != 0 && this.requestInfos.size() > 0) {
                            return;
                        }
                    }
                }
                boolean z2 = false;
                int max = (this.streamPriorityStartOffset != 0 || this.nextPartWasPreloaded || (this.isPreloadVideoOperation && this.moovFound == 0) || this.totalBytesCount <= 0) ? 1 : Math.max(0, this.currentMaxDownloadRequests - this.requestInfos.size());
                int i4 = 0;
                while (i4 < max) {
                    if (!this.isPreloadVideoOperation) {
                        ArrayList<Range> arrayList2 = this.notRequestedBytesRanges;
                        if (arrayList2 != null) {
                            long j5 = this.streamPriorityStartOffset;
                            if (j5 == j4) {
                                j5 = this.streamStartOffset;
                            }
                            int size = arrayList2.size();
                            long j6 = Long.MAX_VALUE;
                            i = max;
                            int i5 = 0;
                            long j7 = Long.MAX_VALUE;
                            while (true) {
                                if (i5 >= size) {
                                    j5 = j6;
                                    break;
                                }
                                Range range = this.notRequestedBytesRanges.get(i5);
                                if (j5 != j4) {
                                    if (range.start <= j5 && range.end > j5) {
                                        j7 = 2147483647L;
                                        break;
                                    } else if (j5 < range.start && range.start < j6) {
                                        j6 = range.start;
                                    }
                                }
                                j7 = Math.min(j7, range.start);
                                i5++;
                                j4 = 0;
                            }
                            if (j5 != Long.MAX_VALUE) {
                                j3 = j5;
                            } else if (j7 != Long.MAX_VALUE) {
                                j3 = j7;
                            } else {
                                return;
                            }
                        } else {
                            i = max;
                            j3 = this.requestedBytesCount;
                        }
                        j = j3;
                    } else if (this.moovFound == 0 || this.preloadNotRequestedBytesCount > j4) {
                        long j8 = this.nextPreloadDownloadOffset;
                        if (j8 == -1) {
                            long j9 = j4;
                            for (int i6 = (preloadMaxBytes / this.currentDownloadChunkSize) + 2; i6 != 0; i6--) {
                                if (!this.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j9))) {
                                    j8 = j9;
                                    z = true;
                                    break;
                                }
                                int i7 = this.currentDownloadChunkSize;
                                j9 += i7;
                                long j10 = this.totalBytesCount;
                                if (j9 > j10) {
                                    break;
                                }
                                if (this.moovFound == 2 && j9 == i7 * 8) {
                                    j9 = ((j10 - 1048576) / i7) * i7;
                                }
                            }
                            j8 = j9;
                            z = false;
                            if (!z && this.requestInfos.isEmpty()) {
                                onFinishLoadingFile(z2);
                            }
                        }
                        if (this.requestedPreloadedBytesRanges == null) {
                            this.requestedPreloadedBytesRanges = new HashMap<>();
                        }
                        this.requestedPreloadedBytesRanges.put(Long.valueOf(j8), Integer.valueOf(i3));
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("start next preload from " + j8 + " size " + this.totalBytesCount + " for " + this.cacheFilePreload);
                        }
                        this.preloadNotRequestedBytesCount -= this.currentDownloadChunkSize;
                        j = j8;
                        i = max;
                    } else {
                        return;
                    }
                    if (this.isPreloadVideoOperation || (arrayList = this.notRequestedBytesRanges) == null) {
                        i2 = 2;
                    } else {
                        i2 = 2;
                        addPart(arrayList, j, j + this.currentDownloadChunkSize, false);
                    }
                    long j11 = this.totalBytesCount;
                    if (j11 <= 0 || j < j11) {
                        boolean z3 = j11 <= 0 || i4 == i + (-1) || (j11 > 0 && ((long) this.currentDownloadChunkSize) + j >= j11);
                        int i8 = this.requestsCount % i2 == 0 ? 2 : ConnectionsManager.ConnectionTypeDownload2;
                        int i9 = this.isForceRequest ? 32 : 0;
                        if (this.isCdn) {
                            TLRPC$TL_upload_getCdnFile tLRPC$TL_upload_getCdnFile = new TLRPC$TL_upload_getCdnFile();
                            tLRPC$TL_upload_getCdnFile.file_token = this.cdnToken;
                            tLRPC$TL_upload_getCdnFile.offset = j;
                            tLRPC$TL_upload_getCdnFile.limit = this.currentDownloadChunkSize;
                            i9 |= 1;
                            tLRPC$TL_upload_getFile = tLRPC$TL_upload_getCdnFile;
                        } else if (this.webLocation != null) {
                            TLRPC$TL_upload_getWebFile tLRPC$TL_upload_getWebFile = new TLRPC$TL_upload_getWebFile();
                            tLRPC$TL_upload_getWebFile.location = this.webLocation;
                            tLRPC$TL_upload_getWebFile.offset = (int) j;
                            tLRPC$TL_upload_getWebFile.limit = this.currentDownloadChunkSize;
                            tLRPC$TL_upload_getFile = tLRPC$TL_upload_getWebFile;
                        } else {
                            TLRPC$TL_upload_getFile tLRPC$TL_upload_getFile2 = new TLRPC$TL_upload_getFile();
                            tLRPC$TL_upload_getFile2.location = this.location;
                            tLRPC$TL_upload_getFile2.offset = j;
                            tLRPC$TL_upload_getFile2.limit = this.currentDownloadChunkSize;
                            tLRPC$TL_upload_getFile2.cdn_supported = true;
                            tLRPC$TL_upload_getFile = tLRPC$TL_upload_getFile2;
                        }
                        int i10 = i9;
                        this.requestedBytesCount += this.currentDownloadChunkSize;
                        final RequestInfo requestInfo = new RequestInfo();
                        this.requestInfos.add(requestInfo);
                        requestInfo.offset = j;
                        if (!(this.isPreloadVideoOperation || !this.supportsPreloading || this.preloadStream == null || (hashMap = this.preloadedBytesRanges) == null || (preloadRange = hashMap.get(Long.valueOf(requestInfo.offset))) == null)) {
                            requestInfo.response = new TLRPC$TL_upload_file();
                            try {
                                if (BuildVars.DEBUG_VERSION && preloadRange.length > 2147483647L) {
                                    throw new RuntimeException("cast long to integer");
                                    break;
                                }
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) preloadRange.length);
                                this.preloadStream.seek(preloadRange.fileOffset);
                                this.preloadStream.getChannel().read(nativeByteBuffer.buffer);
                                try {
                                    nativeByteBuffer.buffer.position(0);
                                    requestInfo.response.bytes = nativeByteBuffer;
                                    Utilities.stageQueue.postRunnable(new Runnable() {
                                        @Override
                                        public final void run() {
                                            FileLoadOperation.this.lambda$startDownloadRequest$11(requestInfo);
                                        }
                                    });
                                    j2 = 0;
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                            i4++;
                            j4 = j2;
                            max = i;
                            i3 = 1;
                            z2 = false;
                        }
                        if (this.streamPriorityStartOffset != 0) {
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("frame get offset = " + this.streamPriorityStartOffset);
                            }
                            j2 = 0;
                            this.streamPriorityStartOffset = 0L;
                            this.priorityRequestInfo = requestInfo;
                        } else {
                            j2 = 0;
                        }
                        TLRPC$InputFileLocation tLRPC$InputFileLocation = this.location;
                        if (!(tLRPC$InputFileLocation instanceof TLRPC$TL_inputPeerPhotoFileLocation) || ((TLRPC$TL_inputPeerPhotoFileLocation) tLRPC$InputFileLocation).photo_id != j2) {
                            requestInfo.requestToken = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_upload_getFile, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    FileLoadOperation.this.lambda$startDownloadRequest$13(requestInfo, tLRPC$TL_upload_getFile, tLObject, tLRPC$TL_error);
                                }
                            }, null, null, i10, this.isCdn ? this.cdnDatacenterId : this.datacenterId, i8, z3);
                            this.requestsCount++;
                        } else {
                            requestReference(requestInfo);
                        }
                        i4++;
                        j4 = j2;
                        max = i;
                        i3 = 1;
                        z2 = false;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void lambda$startDownloadRequest$11(RequestInfo requestInfo) {
        processRequestResult(requestInfo, null);
        requestInfo.response.freeResources();
    }

    public void lambda$startDownloadRequest$13(final RequestInfo requestInfo, TLObject tLObject, TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
        byte[] bArr;
        if (this.requestInfos.contains(requestInfo)) {
            if (requestInfo == this.priorityRequestInfo) {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("frame get request completed " + this.priorityRequestInfo.offset);
                }
                this.priorityRequestInfo = null;
            }
            if (tLRPC$TL_error != null) {
                if (FileRefController.isFileRefError(tLRPC$TL_error.text)) {
                    requestReference(requestInfo);
                    return;
                } else if ((tLObject instanceof TLRPC$TL_upload_getCdnFile) && tLRPC$TL_error.text.equals("FILE_TOKEN_INVALID")) {
                    this.isCdn = false;
                    clearOperaion(requestInfo, false);
                    startDownloadRequest();
                    return;
                }
            }
            if (tLObject2 instanceof TLRPC$TL_upload_fileCdnRedirect) {
                TLRPC$TL_upload_fileCdnRedirect tLRPC$TL_upload_fileCdnRedirect = (TLRPC$TL_upload_fileCdnRedirect) tLObject2;
                if (!tLRPC$TL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                    if (this.cdnHashes == null) {
                        this.cdnHashes = new HashMap<>();
                    }
                    for (int i = 0; i < tLRPC$TL_upload_fileCdnRedirect.file_hashes.size(); i++) {
                        TLRPC$TL_fileHash tLRPC$TL_fileHash = tLRPC$TL_upload_fileCdnRedirect.file_hashes.get(i);
                        this.cdnHashes.put(Long.valueOf(tLRPC$TL_fileHash.offset), tLRPC$TL_fileHash);
                    }
                }
                byte[] bArr2 = tLRPC$TL_upload_fileCdnRedirect.encryption_iv;
                if (bArr2 == null || (bArr = tLRPC$TL_upload_fileCdnRedirect.encryption_key) == null || bArr2.length != 16 || bArr.length != 32) {
                    TLRPC$TL_error tLRPC$TL_error2 = new TLRPC$TL_error();
                    tLRPC$TL_error2.text = "bad redirect response";
                    tLRPC$TL_error2.code = 400;
                    processRequestResult(requestInfo, tLRPC$TL_error2);
                    return;
                }
                this.isCdn = true;
                if (this.notCheckedCdnRanges == null) {
                    ArrayList<Range> arrayList = new ArrayList<>();
                    this.notCheckedCdnRanges = arrayList;
                    arrayList.add(new Range(0L, this.maxCdnParts));
                }
                this.cdnDatacenterId = tLRPC$TL_upload_fileCdnRedirect.dc_id;
                this.cdnIv = tLRPC$TL_upload_fileCdnRedirect.encryption_iv;
                this.cdnKey = tLRPC$TL_upload_fileCdnRedirect.encryption_key;
                this.cdnToken = tLRPC$TL_upload_fileCdnRedirect.file_token;
                clearOperaion(requestInfo, false);
                startDownloadRequest();
            } else if (!(tLObject2 instanceof TLRPC$TL_upload_cdnFileReuploadNeeded)) {
                if (tLObject2 instanceof TLRPC$TL_upload_file) {
                    requestInfo.response = (TLRPC$TL_upload_file) tLObject2;
                } else if (tLObject2 instanceof TLRPC$TL_upload_webFile) {
                    requestInfo.responseWeb = (TLRPC$TL_upload_webFile) tLObject2;
                    if (this.totalBytesCount == 0 && requestInfo.responseWeb.size != 0) {
                        this.totalBytesCount = requestInfo.responseWeb.size;
                    }
                } else {
                    requestInfo.responseCdn = (TLRPC$TL_upload_cdnFile) tLObject2;
                }
                if (tLObject2 != null) {
                    int i2 = this.currentType;
                    if (i2 == 50331648) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
                    } else if (i2 == 33554432) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
                    } else if (i2 == 16777216) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
                    } else if (i2 == 67108864) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                    }
                }
                processRequestResult(requestInfo, tLRPC$TL_error);
            } else if (!this.reuploadingCdn) {
                clearOperaion(requestInfo, false);
                this.reuploadingCdn = true;
                TLRPC$TL_upload_reuploadCdnFile tLRPC$TL_upload_reuploadCdnFile = new TLRPC$TL_upload_reuploadCdnFile();
                tLRPC$TL_upload_reuploadCdnFile.file_token = this.cdnToken;
                tLRPC$TL_upload_reuploadCdnFile.request_token = ((TLRPC$TL_upload_cdnFileReuploadNeeded) tLObject2).request_token;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_upload_reuploadCdnFile, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject3, TLRPC$TL_error tLRPC$TL_error3) {
                        FileLoadOperation.this.lambda$startDownloadRequest$12(requestInfo, tLObject3, tLRPC$TL_error3);
                    }
                }, null, null, 0, this.datacenterId, 1, true);
            }
        }
    }

    public void lambda$startDownloadRequest$12(RequestInfo requestInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.reuploadingCdn = false;
        if (tLRPC$TL_error == null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            if (!tLRPC$Vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i = 0; i < tLRPC$Vector.objects.size(); i++) {
                    TLRPC$TL_fileHash tLRPC$TL_fileHash = (TLRPC$TL_fileHash) tLRPC$Vector.objects.get(i);
                    this.cdnHashes.put(Long.valueOf(tLRPC$TL_fileHash.offset), tLRPC$TL_fileHash);
                }
            }
            startDownloadRequest();
        } else if (tLRPC$TL_error.text.equals("FILE_TOKEN_INVALID") || tLRPC$TL_error.text.equals("REQUEST_TOKEN_INVALID")) {
            this.isCdn = false;
            clearOperaion(requestInfo, false);
            startDownloadRequest();
        } else {
            onFail(false, 0);
        }
    }

    public void setDelegate(FileLoadOperationDelegate fileLoadOperationDelegate) {
        this.delegate = fileLoadOperationDelegate;
    }
}
