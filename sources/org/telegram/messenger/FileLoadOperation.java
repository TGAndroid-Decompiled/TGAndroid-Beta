package org.telegram.messenger;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.utils.ImmutableByteArrayOutputStream;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda482;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Storage.CacheModel;

public class FileLoadOperation {
    private static final int FINISH_CODE_DEFAULT = 0;
    private static final int FINISH_CODE_FILE_ALREADY_EXIST = 1;
    public static ImmutableByteArrayOutputStream filesQueueByteBuffer = null;
    private static int globalRequestPointer = 0;
    private static final int preloadMaxBytes = 2097152;
    private static final int stateCanceled = 4;
    private static final int stateCancelling = 5;
    private static final int stateDownloading = 1;
    private static final int stateFailed = 2;
    private static final int stateFinished = 3;
    private static final int stateIdle = 0;
    private final boolean FULL_LOGS;
    private boolean allowDisordererFileSave;
    private int bigFileSizeFrom;
    private long bytesCountPadding;
    private File cacheFileFinal;
    private boolean cacheFileFinalReady;
    private File cacheFileGzipTemp;
    private File cacheFileParts;
    private File cacheFilePreload;
    private File cacheFileTemp;
    private File cacheIvTemp;
    private final Runnable cancelAfterNoStreamListeners;
    private ArrayList<RequestInfo> cancelledRequestInfos;
    public volatile boolean caughtPremiumFloodWait;
    private byte[] cdnCheckBytes;
    private int cdnChunkCheckSize;
    private int cdnDatacenterId;
    private HashMap<Long, TLRPC.TL_fileHash> cdnHashes;
    private byte[] cdnIv;
    private byte[] cdnKey;
    private byte[] cdnToken;
    private volatile boolean closeFilePartsStreamOnWriteEnd;
    public int currentAccount;
    private int currentDownloadChunkSize;
    private int currentMaxDownloadRequests;
    private int currentType;
    private int datacenterId;
    private ArrayList<RequestInfo> delayedRequestInfos;
    private FileLoadOperationDelegate delegate;
    private long documentId;
    private int downloadChunkSize;
    private int downloadChunkSizeAnimation;
    private int downloadChunkSizeBig;
    private long downloadedBytes;
    private boolean encryptFile;
    private byte[] encryptIv;
    private byte[] encryptKey;
    private String ext;
    private FilePathDatabase.FileMeta fileMetadata;
    private String fileName;
    private RandomAccessFile fileOutputStream;
    private RandomAccessFile filePartsStream;
    private RandomAccessFile fileReadStream;
    private Runnable fileWriteRunnable;
    private RandomAccessFile fiv;
    private boolean forceSmallChunk;
    private long foundMoovSize;
    private int initialDatacenterId;
    private boolean isCdn;
    private boolean isForceRequest;
    private boolean isPreloadVideoOperation;
    public boolean isStory;
    private boolean isStream;
    private byte[] iv;
    private byte[] key;
    protected long lastProgressUpdateTime;
    protected TLRPC.InputFileLocation location;
    private int maxCdnParts;
    private int maxDownloadRequests;
    private int maxDownloadRequestsAnimation;
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
    public boolean preFinished;
    private boolean preloadFinished;
    private long preloadNotRequestedBytesCount;
    private int preloadPrefixSize;
    private RandomAccessFile preloadStream;
    private int preloadStreamFileOffset;
    private byte[] preloadTempBuffer;
    private int preloadTempBufferCount;
    private HashMap<Long, PreloadRange> preloadedBytesRanges;
    private int priority;
    private FileLoaderPriorityQueue priorityQueue;
    private RequestInfo priorityRequestInfo;
    private int renameRetryCount;
    public ArrayList<RequestInfo> requestInfos;
    private long requestedBytesCount;
    private HashMap<Long, Integer> requestedPreloadedBytesRanges;
    private boolean requestedReference;
    private boolean requestingCdnOffsets;
    protected boolean requestingReference;
    private int requestsCount;
    private boolean reuploadingCdn;
    private long startTime;
    private boolean started;
    private volatile int state;
    private String storeFileName;
    private File storePath;
    FileLoadOperationStream stream;
    private ArrayList<FileLoadOperationStream> streamListeners;
    long streamOffset;
    boolean streamPriority;
    private long streamPriorityStartOffset;
    private long streamStartOffset;
    private boolean supportsPreloading;
    private File tempPath;
    public long totalBytesCount;
    private int totalPreloadedBytes;
    long totalTime;
    public final ArrayList<Integer> uiRequestTokens;
    private boolean ungzip;
    private WebFile webFile;
    private TLRPC.InputWebFileLocation webLocation;
    private volatile boolean writingToFilePartsStream;
    public static volatile DispatchQueue filesQueue = new DispatchQueue("writeFileQueue");
    private static final Object lockObject = new Object();

    public interface FileLoadOperationDelegate {
        void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j, long j2);

        void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i);

        void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file);

        void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file);

        boolean hasAnotherRefOnFile(String str);

        boolean isLocallyCreatedFile(String str);

        void saveFilePath(FilePathDatabase.PathData pathData, File file);
    }

    public static class PreloadRange {
        private long fileOffset;
        private long length;

        private PreloadRange(long j, long j2) {
            this.fileOffset = j;
            this.length = j2;
        }
    }

    public static class Range {
        private long end;
        private long start;

        public String toString() {
            return "Range{start=" + this.start + ", end=" + this.end + '}';
        }

        private Range(long j, long j2) {
            this.start = j;
            this.end = j2;
        }
    }

    public static class RequestInfo {
        public boolean cancelled;
        public boolean cancelling;
        public int chunkSize;
        public int connectionType;
        private boolean forceSmallChunk;
        private long offset;
        public long requestStartTime;
        public int requestToken;
        private TLRPC.TL_upload_file response;
        private TLRPC.TL_upload_cdnFile responseCdn;
        private TLRPC.TL_upload_webFile responseWeb;
        public Runnable whenCancelled;
    }

    public FileLoadOperation(ImageLocation imageLocation, Object obj, String str, long j) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new FileLoadOperation$$ExternalSyntheticLambda4(this, 5);
        updateParams();
        this.parentObject = obj;
        this.isStory = obj instanceof TL_stories.TL_storyItem;
        this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
        this.isStream = imageLocation.imageType == 2;
        if (imageLocation.isEncrypted()) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.location = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
            long j2 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j2;
            tL_inputEncryptedFileLocation.volume_id = j2;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = imageLocation.access_hash;
            byte[] bArr = new byte[32];
            this.iv = bArr;
            System.arraycopy(imageLocation.iv, 0, bArr, 0, 32);
            this.key = imageLocation.key;
        } else if (imageLocation.photoPeer != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
            long j3 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j3;
            tL_inputPeerPhotoFileLocation.volume_id = j3;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = imageLocation.photoId;
            tL_inputPeerPhotoFileLocation.big = imageLocation.photoPeerType == 0;
            tL_inputPeerPhotoFileLocation.peer = imageLocation.photoPeer;
            this.location = tL_inputPeerPhotoFileLocation;
        } else if (imageLocation.stickerSet != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
            long j4 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j4;
            tL_inputStickerSetThumb.volume_id = j4;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = imageLocation.thumbVersion;
            tL_inputStickerSetThumb.stickerset = imageLocation.stickerSet;
            this.location = tL_inputStickerSetThumb;
        } else if (imageLocation.thumbSize != null) {
            if (imageLocation.photoId != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.location = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.id = imageLocation.photoId;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = imageLocation.location;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = imageLocation.access_hash;
                tL_inputPhotoFileLocation.file_reference = imageLocation.file_reference;
                tL_inputPhotoFileLocation.thumb_size = imageLocation.thumbSize;
                if (imageLocation.imageType == 2) {
                    this.allowDisordererFileSave = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j5 = imageLocation.documentId;
                tL_inputDocumentFileLocation.id = j5;
                this.documentId = j5;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = imageLocation.location;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = imageLocation.access_hash;
                tL_inputDocumentFileLocation.file_reference = imageLocation.file_reference;
                tL_inputDocumentFileLocation.thumb_size = imageLocation.thumbSize;
            }
            TLRPC.InputFileLocation inputFileLocation = this.location;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.location = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = imageLocation.location;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = imageLocation.access_hash;
            byte[] bArr2 = imageLocation.file_reference;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.allowDisordererFileSave = true;
        }
        int i = imageLocation.imageType;
        this.ungzip = i == 1 || i == 3;
        int i2 = imageLocation.dc_id;
        this.datacenterId = i2;
        this.initialDatacenterId = i2;
        this.currentType = 16777216;
        this.totalBytesCount = j;
        this.ext = str == null ? "jpg" : str;
    }

    private void addPart(ArrayList<Range> arrayList, long j, long j2, boolean z) {
        long j3;
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i < size) {
                Range range = arrayList.get(i);
                if (j <= range.start) {
                    if (j2 >= range.end) {
                        arrayList.remove(i);
                    } else if (j2 > range.start) {
                        range.start = j2;
                    } else {
                        i++;
                    }
                    j3 = j;
                    z2 = true;
                } else {
                    if (j2 < range.end) {
                        j3 = j;
                        arrayList.add(0, new Range(range.start, j3));
                        range.start = j2;
                    } else {
                        j3 = j;
                        if (j3 < range.end) {
                            range.end = j3;
                        } else {
                            i++;
                        }
                    }
                    z2 = true;
                }
            } else {
                j3 = j;
            }
            if (z) {
                if (!z2) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j3 + " - " + j2);
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (this.fileWriteRunnable != null) {
                    filesQueue.cancelRunnable(this.fileWriteRunnable);
                }
                synchronized (this) {
                    this.writingToFilePartsStream = true;
                }
                DispatchQueue dispatchQueue = filesQueue;
                FileLog$$ExternalSyntheticLambda3 fileLog$$ExternalSyntheticLambda3 = new FileLog$$ExternalSyntheticLambda3(5, this, arrayList2);
                this.fileWriteRunnable = fileLog$$ExternalSyntheticLambda3;
                dispatchQueue.postRunnable(fileLog$$ExternalSyntheticLambda3);
                notifyStreamListeners();
                return;
            }
            return;
        }
    }

    private boolean canFinishPreload() {
        return this.isStory && this.priority < 3;
    }

    public void lambda$cancel$13(boolean z) {
        if (this.state != 3 && this.state != 2) {
            this.state = 5;
            cancelRequests(new FileLoadOperation$$ExternalSyntheticLambda4(this, 0));
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
                    if (file5.delete()) {
                        return;
                    }
                    this.cacheFilePreload.deleteOnExit();
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
            }
        }
    }

    private void cancelRequests(Runnable runnable) {
        FileLog.d("cancelRequests".concat(runnable != null ? " with callback" : ""));
        if (this.requestInfos != null) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[2];
            int i = 0;
            for (int i2 = 0; i2 < this.requestInfos.size(); i2++) {
                RequestInfo requestInfo = this.requestInfos.get(i2);
                if (requestInfo.requestToken != 0) {
                    requestInfo.cancelling = true;
                    if (runnable == null) {
                        requestInfo.cancelled = true;
                        ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("cancelRequests cancel "), requestInfo.requestToken);
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true);
                    } else {
                        requestInfo.whenCancelled = new FileLoader$$ExternalSyntheticLambda0(requestInfo, iArr, runnable, 21);
                        iArr[0] = iArr[0] + 1;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken + " with callback");
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true, new FileLoadOperation$$ExternalSyntheticLambda8(requestInfo, 0));
                    }
                    char c = requestInfo.connectionType == 2 ? (char) 0 : (char) 1;
                    iArr2[c] = iArr2[c] + requestInfo.chunkSize;
                }
            }
            while (i < 2) {
                int i3 = i == 0 ? 2 : 65538;
                if (iArr2[i] > 1048576) {
                    ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i3);
                }
                i++;
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
            if (this.filePartsStream != null) {
                synchronized (this) {
                    try {
                        if (this.writingToFilePartsStream) {
                            this.closeFilePartsStreamOnWriteEnd = true;
                        } else {
                            try {
                                this.filePartsStream.getChannel().close();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            this.filePartsStream.close();
                            this.filePartsStream = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Exception e8) {
            FileLog.e(e8);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.fiv;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
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

    private void clearOperation(RequestInfo requestInfo, boolean z, boolean z2) {
        int[] iArr = new int[2];
        long j = Long.MAX_VALUE;
        int i = 0;
        while (i < this.requestInfos.size()) {
            RequestInfo requestInfo2 = this.requestInfos.get(i);
            long jMin = Math.min(requestInfo2.offset, j);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo2.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo2.offset, requestInfo2.offset + ((long) requestInfo2.chunkSize));
            }
            if (requestInfo != requestInfo2 && requestInfo2.requestToken != 0) {
                requestInfo2.cancelling = true;
                if (z2) {
                    this.cancelledRequestInfos.add(requestInfo2);
                    requestInfo2.whenCancelled = new FileLoadOperation$$ExternalSyntheticLambda1(this, requestInfo2, 1);
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true, new FileLoadOperation$$ExternalSyntheticLambda8(requestInfo2, 1));
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true);
                    requestInfo2.cancelled = true;
                }
            }
            i++;
            j = jMin;
        }
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 == 0 ? 2 : 65538;
            if (iArr[i2] > 1048576) {
                ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i3);
            }
            i2++;
        }
        this.requestInfos.clear();
        AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda4(this, 1));
        long jMin2 = j;
        for (int i4 = 0; i4 < this.delayedRequestInfos.size(); i4++) {
            RequestInfo requestInfo3 = this.delayedRequestInfos.get(i4);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo3.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo3.offset, requestInfo3.offset + ((long) requestInfo3.chunkSize));
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
            jMin2 = Math.min(requestInfo3.offset, jMin2);
        }
        this.delayedRequestInfos.clear();
        this.requestsCount = 0;
        if (!z && this.isPreloadVideoOperation) {
            this.requestedBytesCount = this.totalPreloadedBytes;
        } else if (this.notLoadedBytesRanges == null) {
            this.downloadedBytes = jMin2;
            this.requestedBytesCount = jMin2;
        }
    }

    private void copyNotLoadedRanges() {
        if (this.notLoadedBytesRanges == null) {
            return;
        }
        this.notLoadedBytesRangesCopy = new ArrayList<>(this.notLoadedBytesRanges);
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
        int iLimit = nativeByteBuffer.limit();
        long j4 = j;
        do {
            if (j4 >= j2 - ((long) (this.preloadTempBuffer != null ? 16 : 0))) {
                j3 = j2 + ((long) iLimit);
                if (j4 < j3) {
                    if (j4 >= j3 - 16) {
                        long j5 = j3 - j4;
                        if (j5 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        this.preloadTempBufferCount = (int) j5;
                        nativeByteBuffer.position(nativeByteBuffer.limit() - this.preloadTempBufferCount);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, this.preloadTempBufferCount, false);
                        return j3;
                    }
                    if (this.preloadTempBufferCount != 0) {
                        nativeByteBuffer.position(0);
                        byte[] bArr = this.preloadTempBuffer;
                        int i = this.preloadTempBufferCount;
                        nativeByteBuffer.readBytes(bArr, i, 16 - i, false);
                        this.preloadTempBufferCount = 0;
                    } else {
                        long j6 = j4 - j2;
                        if (j6 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        nativeByteBuffer.position((int) j6);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, 16, false);
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
                    j4 += (long) i2;
                }
            }
            return 0L;
        } while (j4 < j3);
        return j4;
    }

    public static long floorDiv(long j, long j2) {
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    private long getDownloadedLengthFromOffsetInternal(ArrayList<Range> arrayList, long j, long j2) {
        long j3;
        if (arrayList == null || this.state == 3 || arrayList.isEmpty()) {
            if (this.state == 3) {
                return j2;
            }
            long j4 = this.downloadedBytes;
            if (j4 == 0) {
                return 0L;
            }
            return Math.min(j2, Math.max(j4 - j, 0L));
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
        return range != null ? Math.min(j2, range.start - j) : Math.min(j2, Math.max(this.totalBytesCount - j, 0L));
    }

    public void lambda$addPart$2(ArrayList arrayList) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.filePartsStream == null) {
                return;
            }
            int size = arrayList.size();
            int i = (size * 16) + 4;
            ImmutableByteArrayOutputStream immutableByteArrayOutputStream = filesQueueByteBuffer;
            if (immutableByteArrayOutputStream == null) {
                filesQueueByteBuffer = new ImmutableByteArrayOutputStream(i);
            } else {
                immutableByteArrayOutputStream.reset();
            }
            filesQueueByteBuffer.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) arrayList.get(i2);
                filesQueueByteBuffer.writeLong(range.start);
                filesQueueByteBuffer.writeLong(range.end);
            }
            synchronized (this) {
                try {
                    RandomAccessFile randomAccessFile = this.filePartsStream;
                    if (randomAccessFile == null) {
                        return;
                    }
                    randomAccessFile.seek(0L);
                    this.filePartsStream.write(filesQueueByteBuffer.buf, 0, i);
                    this.writingToFilePartsStream = false;
                    if (this.closeFilePartsStreamOnWriteEnd) {
                        try {
                            this.filePartsStream.getChannel().close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        this.filePartsStream.close();
                        this.filePartsStream = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            FileLog.e((Throwable) e2, false);
            if (AndroidUtilities.isENOSPC(e2)) {
                LaunchActivity launchActivity = LaunchActivity.staticInstanceForAlerts;
                if (launchActivity != null) {
                    launchActivity.checkFreeDiscSpace(1);
                }
            } else if (AndroidUtilities.isEROFS(e2)) {
                SharedConfig.checkSdCard(this.cacheFileFinal);
            }
        }
        this.totalTime = (System.currentTimeMillis() - jCurrentTimeMillis) + this.totalTime;
    }

    public void lambda$cancelOnStage$14() {
        if (this.state == 5) {
            onFail(false, 1);
        }
    }

    public static void lambda$cancelRequests$15(RequestInfo requestInfo, int[] iArr, Runnable runnable) {
        requestInfo.whenCancelled = null;
        requestInfo.cancelled = true;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            runnable.run();
        }
    }

    public static void lambda$cancelRequests$16(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$clearOperation$24(RequestInfo requestInfo) {
        requestInfo.whenCancelled = null;
        this.cancelledRequestInfos.remove(requestInfo);
        requestInfo.cancelled = true;
    }

    public static void lambda$clearOperation$25(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$clearOperation$26() {
        this.uiRequestTokens.clear();
    }

    public void lambda$getCurrentFile$3(File[] fileArr, CountDownLatch countDownLatch) {
        if (this.state != 3 || this.preloadFinished) {
            fileArr[0] = this.cacheFileTemp;
        } else {
            fileArr[0] = this.cacheFileFinal;
        }
        countDownLatch.countDown();
    }

    public void lambda$getDownloadedLengthFromOffset$4(long[] jArr, long j, long j2, CountDownLatch countDownLatch) {
        FileLoadOperation fileLoadOperation;
        try {
            fileLoadOperation = this;
            try {
                jArr[0] = fileLoadOperation.getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j, j2);
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
                jArr[0] = 0;
            }
        } catch (Throwable th2) {
            th = th2;
            fileLoadOperation = this;
        }
        if (fileLoadOperation.state == 3) {
            jArr[1] = 1;
        }
        countDownLatch.countDown();
    }

    public void lambda$new$6() {
        pause();
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(getFileName());
    }

    public void lambda$onFail$23(int i) {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i);
        }
        notifyStreamListeners();
    }

    public void lambda$onFinishLoadingFile$17(boolean z) {
        try {
            onFinishLoadingFile(z, 0, false);
        } catch (Exception unused) {
            onFail(false, 0);
        }
    }

    public void lambda$onFinishLoadingFile$18() {
        onFail(false, 0);
    }

    public void lambda$onFinishLoadingFile$19(boolean z) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("finished downloading file to " + this.cacheFileFinal + " time = " + (System.currentTimeMillis() - this.startTime) + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
        }
        if (z) {
            int i = this.currentType;
            if (i == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            } else if (i == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            } else if (i == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            } else if (i == 67108864) {
                String str = this.ext;
                if (str == null || !(str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                }
            }
        }
        this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
    }

    public void lambda$onFinishLoadingFile$20(File file, File file2, File file3, File file4, boolean z) {
        Throwable th;
        File file5;
        boolean zCopyFile;
        int i;
        int i2;
        int iLastIndexOf;
        String str;
        if (file != null) {
            file.delete();
        }
        if (file2 != null) {
            file2.delete();
        }
        if (file3 != null) {
            file3.delete();
        }
        if (file4 != null) {
            if (this.ungzip) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file4));
                    FileLoader.copyFile(gZIPInputStream, this.cacheFileGzipTemp, 2097152);
                    gZIPInputStream.close();
                    file4.delete();
                    file5 = this.cacheFileGzipTemp;
                    try {
                        this.ungzip = false;
                    } catch (ZipException unused) {
                        file4 = file5;
                        this.ungzip = false;
                        if (!this.ungzip) {
                            Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda4(this, 4));
                            return;
                        }
                        if (this.parentObject instanceof TLRPC.TL_theme) {
                            try {
                                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                            } catch (Exception e) {
                                FileLog.e(e);
                                zCopyFile = false;
                            }
                        } else {
                            try {
                                if (this.pathSaveData != null) {
                                    synchronized (lockObject) {
                                        try {
                                            this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                                            i2 = 1;
                                            while (this.cacheFileFinal.exists()) {
                                                iLastIndexOf = this.storeFileName.lastIndexOf(46);
                                                if (iLastIndexOf > 0) {
                                                    str = this.storeFileName.substring(0, iLastIndexOf) + " (" + i2 + ")" + this.storeFileName.substring(iLastIndexOf);
                                                } else {
                                                    str = this.storeFileName + " (" + i2 + ")";
                                                }
                                                this.cacheFileFinal = new File(this.storePath, str);
                                                i2++;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                zCopyFile = file4.renameTo(this.cacheFileFinal);
                            } catch (Exception e2) {
                                FileLog.e(e2);
                                zCopyFile = false;
                            }
                        }
                        if (!zCopyFile) {
                            try {
                                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                                if (zCopyFile) {
                                    this.cacheFileFinal.delete();
                                }
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                            }
                        }
                        if (zCopyFile) {
                            this.cacheFileFinalReady = true;
                            if (this.pathSaveData != null) {
                                this.delegate.saveFilePath(this.pathSaveData, this.cacheFileFinal);
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("unable to rename temp = " + file4 + " to final = " + this.cacheFileFinal + " retry = " + this.renameRetryCount);
                            }
                            i = this.renameRetryCount + 1;
                            this.renameRetryCount = i;
                            if (i < 3) {
                                this.state = 1;
                                Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda13(this, z, 2), 200L);
                                return;
                            } else {
                                this.cacheFileFinal = file4;
                                this.cacheFileFinalReady = false;
                            }
                        }
                        Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda13(this, z, 3));
                    } catch (Throwable th4) {
                        th = th4;
                        FileLog.e(th, !AndroidUtilities.isFilNotFoundException(th));
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("unable to ungzip temp = " + file4 + " to final = " + this.cacheFileFinal);
                        }
                    }
                } catch (ZipException unused2) {
                } catch (Throwable th5) {
                    th = th5;
                    file5 = file4;
                }
                file4 = file5;
            }
            if (!this.ungzip) {
                Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda4(this, 4));
                return;
            }
            if (this.parentObject instanceof TLRPC.TL_theme) {
                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
            } else {
                if (this.pathSaveData != null) {
                    synchronized (lockObject) {
                        this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                        i2 = 1;
                        while (this.cacheFileFinal.exists()) {
                            iLastIndexOf = this.storeFileName.lastIndexOf(46);
                            if (iLastIndexOf > 0) {
                                str = this.storeFileName.substring(0, iLastIndexOf) + " (" + i2 + ")" + this.storeFileName.substring(iLastIndexOf);
                            } else {
                                str = this.storeFileName + " (" + i2 + ")";
                            }
                            this.cacheFileFinal = new File(this.storePath, str);
                            i2++;
                        }
                    }
                }
                zCopyFile = file4.renameTo(this.cacheFileFinal);
            }
            if (!zCopyFile && this.renameRetryCount == 3) {
                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                if (zCopyFile) {
                    this.cacheFileFinal.delete();
                }
            }
            if (zCopyFile) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("unable to rename temp = " + file4 + " to final = " + this.cacheFileFinal + " retry = " + this.renameRetryCount);
                }
                i = this.renameRetryCount + 1;
                this.renameRetryCount = i;
                if (i < 3) {
                    this.state = 1;
                    Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda13(this, z, 2), 200L);
                    return;
                } else {
                    this.cacheFileFinal = file4;
                    this.cacheFileFinalReady = false;
                }
            } else {
                this.cacheFileFinalReady = true;
                if (this.pathSaveData != null && this.cacheFileFinal.exists()) {
                    this.delegate.saveFilePath(this.pathSaveData, this.cacheFileFinal);
                }
            }
        }
        Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda13(this, z, 3));
    }

    public void lambda$pause$7() {
        if (!this.isStory) {
            for (int i = 0; i < this.requestInfos.size(); i++) {
                ConnectionsManager.getInstance(this.currentAccount).failNotRunningRequest(this.requestInfos.get(i).requestToken);
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " pause operation, clear requests");
            }
            clearOperation(null, false, true);
        }
    }

    public void lambda$processRequestResult$22(int i) {
        this.uiRequestTokens.remove(Integer.valueOf(i));
    }

    public static int lambda$removePart$1(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        return range.start < range2.start ? -1 : 0;
    }

    public void lambda$removeStreamListener$5(FileLoadOperationStream fileLoadOperationStream) {
        if (this.streamListeners == null) {
            return;
        }
        FileLog.e("FileLoadOperation " + getFileName() + " removing stream listener " + fileLoadOperationStream);
        this.streamListeners.remove(fileLoadOperationStream);
    }

    public void lambda$requestFileOffsets$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            onFail(false, 0);
            return;
        }
        if (tLObject instanceof Vector) {
            this.requestingCdnOffsets = false;
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i = 0; i < vector.objects.size(); i++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
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
                    } else {
                        if (requestInfo.responseCdn != null) {
                            requestInfo.responseCdn.disableFree = false;
                            requestInfo.responseCdn.freeResources();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void lambda$setIsPreloadVideoOperation$12(boolean z) {
        this.requestedBytesCount = 0L;
        clearOperation(null, true, true);
        this.isPreloadVideoOperation = z;
        startDownloadRequest(-1);
    }

    public void lambda$setStream$0(FileLoadOperationStream fileLoadOperationStream) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (fileLoadOperationStream != null && !this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (fileLoadOperationStream == null || this.state == 1 || this.state == 0) {
            return;
        }
        fileLoadOperationStream.newDataAvailable();
    }

    public void lambda$start$10() {
        startDownloadRequest(-1);
    }

    public void lambda$start$11(boolean[] zArr) {
        boolean z = this.isPreloadVideoOperation && zArr[0];
        int i = this.preloadPrefixSize;
        boolean z2 = i > 0 && this.downloadedBytes >= ((long) i) && canFinishPreload();
        long j = this.totalBytesCount;
        if (j == 0 || !(z || this.downloadedBytes == j || z2)) {
            startDownloadRequest(-1);
            return;
        }
        try {
            onFinishLoadingFile(false, 1, true);
        } catch (Exception unused) {
            onFail(true, 0);
        }
    }

    public void lambda$start$8(int i) {
        this.uiRequestTokens.remove(Integer.valueOf(i));
    }

    public void lambda$start$9(boolean z, long j, FileLoadOperationStream fileLoadOperationStream, boolean z2) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (z) {
            long j2 = this.currentDownloadChunkSize;
            long j3 = (j / j2) * j2;
            RequestInfo requestInfo = this.priorityRequestInfo;
            if (requestInfo != null && requestInfo.offset != j3) {
                RequestInfo requestInfo2 = this.priorityRequestInfo;
                int i = requestInfo2.requestToken;
                this.requestInfos.remove(requestInfo2);
                AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda0(this, i, 2));
                this.requestedBytesCount -= (long) this.currentDownloadChunkSize;
                removePart(this.notRequestedBytesRanges, this.priorityRequestInfo.offset, this.priorityRequestInfo.offset + ((long) this.currentDownloadChunkSize));
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
                this.streamPriorityStartOffset = j3;
            }
        } else {
            long j4 = this.currentDownloadChunkSize;
            this.streamStartOffset = (j / j4) * j4;
        }
        if (!this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
            FileLog.e("FileLoadOperation " + getFileName() + " start, adding stream " + fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (z2) {
            if (this.preloadedBytesRanges != null && getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, this.streamStartOffset, 1L) == 0 && this.preloadedBytesRanges.get(Long.valueOf(this.streamStartOffset)) != null) {
                this.nextPartWasPreloaded = true;
            }
            startDownloadRequest(-1);
            this.nextPartWasPreloaded = false;
        }
        if (this.notLoadedBytesRanges != null) {
            notifyStreamListeners();
        }
    }

    public void lambda$startDownloadRequest$27(RequestInfo requestInfo) {
        processRequestResult(requestInfo, null);
        requestInfo.response.freeResources();
    }

    public void lambda$startDownloadRequest$28(int i, RequestInfo requestInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.reuploadingCdn = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i2);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            startDownloadRequest(i);
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                onFail(false, 0);
                return;
            }
            this.isCdn = false;
            clearOperation(requestInfo, false, false);
            startDownloadRequest(i);
        }
    }

    public void lambda$startDownloadRequest$29(RequestInfo requestInfo, int i, int i2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        byte[] bArr;
        if (requestInfo.cancelled) {
            FileLog.e("received chunk but definitely cancelled offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
            return;
        }
        if (requestInfo.cancelling) {
            FileLog.e("received cancelled chunk after cancelRequests! offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
        }
        if (!this.requestInfos.contains(requestInfo)) {
            if (!this.cancelledRequestInfos.contains(requestInfo)) {
                return;
            }
            int i3 = 0;
            boolean z = false;
            while (i3 < this.requestInfos.size()) {
                RequestInfo requestInfo2 = this.requestInfos.get(i3);
                if (requestInfo2 != null && requestInfo2 != requestInfo && requestInfo2.offset == requestInfo.offset && requestInfo2.chunkSize == requestInfo.chunkSize) {
                    FileLog.e("received cancelled chunk faster than new one! received=" + requestInfo.requestToken + " new=" + requestInfo2.requestToken);
                    if (z) {
                        this.requestInfos.remove(i3);
                        i3--;
                    } else {
                        this.requestInfos.set(i3, requestInfo);
                        z = true;
                    }
                }
                i3++;
            }
        }
        int i4 = 0;
        while (i4 < this.cancelledRequestInfos.size()) {
            RequestInfo requestInfo3 = this.cancelledRequestInfos.get(i4);
            if (requestInfo3 != null && requestInfo3 != requestInfo && requestInfo3.offset == requestInfo.offset && requestInfo3.chunkSize == requestInfo.chunkSize) {
                FileLog.e("received new chunk faster than cancelled one! received=" + requestInfo.requestToken + " cancelled=" + requestInfo3.requestToken);
                this.cancelledRequestInfos.remove(i4);
                i4 += -1;
            }
            i4++;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("debug_loading: ");
            sb.append(this.cacheFileFinal.getName());
            sb.append(" time=");
            sb.append(System.currentTimeMillis() - requestInfo.requestStartTime);
            sb.append(" dcId=");
            sb.append(i);
            sb.append(" cdn=");
            sb.append(this.isCdn);
            sb.append(" conType=");
            sb.append(i2);
            sb.append(" reqId");
            ChatObject$Call$$ExternalSyntheticOutline0.m(sb, requestInfo.requestToken);
        }
        if (requestInfo == this.priorityRequestInfo) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("frame get request completed " + this.priorityRequestInfo.offset);
            }
            this.priorityRequestInfo = null;
        }
        if (tL_error != null) {
            Runnable runnable = requestInfo.whenCancelled;
            if (runnable != null) {
                runnable.run();
            }
            if (tL_error.code == -2000) {
                this.requestInfos.remove(requestInfo);
                this.requestedBytesCount -= (long) requestInfo.chunkSize;
                removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + ((long) requestInfo.chunkSize));
                return;
            } else if (FileRefController.isFileRefError(tL_error.text)) {
                requestReference(requestInfo);
                return;
            } else if ((tLObject instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                this.isCdn = false;
                clearOperation(requestInfo, false, false);
                startDownloadRequest(i2);
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_upload_fileCdnRedirect) {
            TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject2;
            if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i5 = 0; i5 < tL_upload_fileCdnRedirect.file_hashes.size(); i5++) {
                    TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i5);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
            if (bArr2 == null || (bArr = tL_upload_fileCdnRedirect.encryption_key) == null || bArr2.length != 16 || bArr.length != 32) {
                Runnable runnable2 = requestInfo.whenCancelled;
                if (runnable2 != null) {
                    runnable2.run();
                }
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "bad redirect response";
                tL_error2.code = 400;
                processRequestResult(requestInfo, tL_error2);
                return;
            }
            this.isCdn = true;
            if (this.notCheckedCdnRanges == null) {
                ArrayList<Range> arrayList = new ArrayList<>();
                this.notCheckedCdnRanges = arrayList;
                arrayList.add(new Range(0L, this.maxCdnParts));
            }
            this.cdnDatacenterId = tL_upload_fileCdnRedirect.dc_id;
            this.cdnIv = tL_upload_fileCdnRedirect.encryption_iv;
            this.cdnKey = tL_upload_fileCdnRedirect.encryption_key;
            this.cdnToken = tL_upload_fileCdnRedirect.file_token;
            clearOperation(requestInfo, false, false);
            startDownloadRequest(i2);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
            if (this.reuploadingCdn) {
                return;
            }
            clearOperation(requestInfo, false, false);
            this.reuploadingCdn = true;
            TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
            tL_upload_reuploadCdnFile.file_token = this.cdnToken;
            tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject2).request_token;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_reuploadCdnFile, new FileLoadOperation$$ExternalSyntheticLambda5(this, i2, requestInfo, 0), null, null, 0, this.datacenterId, 1, true);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_file) {
            requestInfo.response = (TLRPC.TL_upload_file) tLObject2;
        } else if (tLObject2 instanceof TLRPC.TL_upload_webFile) {
            requestInfo.responseWeb = (TLRPC.TL_upload_webFile) tLObject2;
            if (this.totalBytesCount == 0 && requestInfo.responseWeb.size != 0) {
                this.totalBytesCount = requestInfo.responseWeb.size;
            }
        } else {
            requestInfo.responseCdn = (TLRPC.TL_upload_cdnFile) tLObject2;
        }
        if (tLObject2 != null) {
            int i6 = this.currentType;
            if (i6 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
            } else if (i6 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
            } else if (i6 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
            } else if (i6 == 67108864) {
                String str = this.ext;
                if (str == null || !(str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 7, tLObject2.getObjectSize() + 4);
                }
            }
        }
        processRequestResult(requestInfo, tL_error);
        Runnable runnable3 = requestInfo.whenCancelled;
        if (runnable3 != null) {
            runnable3.run();
        }
    }

    public void lambda$startDownloadRequest$30(int i) {
        this.uiRequestTokens.add(Integer.valueOf(i));
    }

    private void notifyStreamListeners() {
        ArrayList<FileLoadOperationStream> arrayList = this.streamListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.streamListeners.get(i).newDataAvailable();
            }
        }
    }

    private void onFinishLoadingFile(boolean z, int i, boolean z2) {
        if (this.state == 1 || this.state == 5) {
            this.state = 3;
            notifyStreamListeners();
            cleanup();
            if (!this.isPreloadVideoOperation && !z2) {
                filesQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda482(this, this.cacheIvTemp, this.cacheFileParts, this.cacheFilePreload, this.cacheFileTemp, z, 4));
                this.cacheIvTemp = null;
                this.cacheFileParts = null;
                this.cacheFilePreload = null;
                this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
                return;
            }
            this.preloadFinished = true;
            if (BuildVars.DEBUG_VERSION) {
                if (i == 1) {
                    FileLog.d("file already exist " + this.cacheFileTemp);
                } else {
                    StringBuilder sb = new StringBuilder("finished preloading file to ");
                    sb.append(this.cacheFileTemp);
                    sb.append(" loaded ");
                    sb.append(this.downloadedBytes);
                    sb.append(" of ");
                    sb.append(this.totalBytesCount);
                    sb.append(" prefSize=");
                    ChatObject$Call$$ExternalSyntheticOutline0.m(sb, this.preloadPrefixSize);
                }
            }
            if (this.fileMetadata != null) {
                if (this.cacheFileTemp != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new CacheModel.FileInfo(this.cacheFileTemp)));
                }
                if (this.cacheFileParts != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new CacheModel.FileInfo(this.cacheFileParts)));
                }
            }
            this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
            this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
        }
    }

    private void removePart(ArrayList<Range> arrayList, long j, long j2) {
        boolean z;
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            Range range = arrayList.get(i2);
            if (j == range.end) {
                range.end = j2;
            } else if (j2 == range.start) {
                range.start = j;
            } else {
                i2++;
            }
            z = true;
            break;
        }
        Collections.sort(arrayList, new Emoji$$ExternalSyntheticLambda0(5));
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
        if (z) {
            return;
        }
        arrayList.add(new Range(j, j2));
    }

    private void requestFileOffsets(long j) {
        if (this.requestingCdnOffsets) {
            return;
        }
        this.requestingCdnOffsets = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.cdnToken;
        tL_upload_getCdnFileHashes.offset = j;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_getCdnFileHashes, new UserConfig$$ExternalSyntheticLambda0(this, 4), null, null, 0, this.datacenterId, 1, true);
    }

    private void requestReference(RequestInfo requestInfo) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.requestingReference) {
            return;
        }
        clearOperation(null, false, false);
        this.requestingReference = true;
        this.requestedReference = true;
        Object obj = this.parentObject;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.getId() < 0 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.parentObject = webPage;
                this.isStory = false;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " file reference expired ");
        }
        FileRefController.getInstance(this.currentAccount).requestReference(this.parentObject, this.location, this, requestInfo);
    }

    private void updateParams() {
        if ((this.preloadPrefixSize > 0 || MessagesController.getInstance(this.currentAccount).getfileExperimentalParams) && !this.forceSmallChunk) {
            this.downloadChunkSizeBig = 524288;
            this.maxDownloadRequests = 8;
            this.maxDownloadRequestsBig = 8;
        } else {
            this.downloadChunkSizeBig = 131072;
            this.maxDownloadRequests = 4;
            this.maxDownloadRequestsBig = 4;
        }
        this.maxCdnParts = (int) (2097152000 / ((long) this.downloadChunkSizeBig));
    }

    public void cancel() {
        cancel(false);
    }

    public boolean checkPrefixPreloadFinished() {
        int i = this.preloadPrefixSize;
        if (i > 0 && this.downloadedBytes > i) {
            ArrayList<Range> arrayList = this.notLoadedBytesRanges;
            if (arrayList == null) {
                return true;
            }
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    jMin = Math.min(jMin, arrayList.get(i2).start);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return true;
                }
            }
            if (jMin > this.preloadPrefixSize) {
                return true;
            }
        }
        return false;
    }

    public File getCacheFileFinal() {
        return this.cacheFileFinal;
    }

    public File getCurrentFile() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.stageQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda0(this, fileArr, countDownLatch, 20));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return fileArr[0];
    }

    public File getCurrentFileFast() {
        return (this.state == 3 && !this.preloadFinished && this.cacheFileFinalReady) ? this.cacheFileFinal : this.cacheFileTemp;
    }

    public int getCurrentType() {
        return this.currentType;
    }

    public int getDatacenterId() {
        return this.initialDatacenterId;
    }

    public long getDocumentId() {
        return this.documentId;
    }

    public float getDownloadedLengthFromOffset(float f) {
        ArrayList<Range> arrayList = this.notLoadedBytesRangesCopy;
        long j = this.totalBytesCount;
        if (j == 0 || arrayList == null) {
            return 0.0f;
        }
        return (getDownloadedLengthFromOffsetInternal(arrayList, (int) (j * f), j) / this.totalBytesCount) + f;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getPositionInQueue() {
        return getQueue().getPosition(this);
    }

    public int getPriority() {
        return this.priority;
    }

    public FileLoaderPriorityQueue getQueue() {
        return this.priorityQueue;
    }

    public boolean isFinished() {
        return this.state == 3;
    }

    public boolean isForceRequest() {
        return this.isForceRequest;
    }

    public boolean isPaused() {
        return this.paused;
    }

    public boolean isPreloadFinished() {
        return this.preloadFinished;
    }

    public boolean isPreloadVideoOperation() {
        return this.isPreloadVideoOperation;
    }

    public void onFail(boolean z, int i) {
        cleanup();
        this.state = i == 1 ? 4 : 2;
        if (this.delegate != null && BuildVars.LOGS_ENABLED) {
            long jCurrentTimeMillis = this.startTime != 0 ? System.currentTimeMillis() - this.startTime : 0L;
            if (i == 1) {
                FileLog.d("cancel downloading file to " + this.cacheFileFinal + " time = " + jCurrentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            } else {
                FileLog.d("failed downloading file to " + this.cacheFileFinal + " reason = " + i + " time = " + jCurrentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            }
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda0(this, i, 0));
            return;
        }
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i);
        }
        notifyStreamListeners();
    }

    public void pause() {
        if (this.state != 1) {
            return;
        }
        this.paused = true;
        Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda4(this, 3));
    }

    public boolean processRequestResult(RequestInfo requestInfo, TLRPC.TL_error tL_error) {
        long j;
        NativeByteBuffer nativeByteBuffer;
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        byte[] bArr;
        long j2;
        long j3;
        String str;
        long j4;
        long j5;
        RandomAccessFile randomAccessFile;
        boolean z3;
        long j6;
        int size;
        int i;
        Range range;
        TLRPC.TL_fileHash tL_fileHash;
        long j7;
        String str2;
        long jLimit;
        int i2;
        int i3;
        Integer numValueOf;
        int i4 = 1;
        if (this.state != 1 && this.state != 5) {
            if (!BuildVars.DEBUG_VERSION || this.state != 3) {
                return false;
            }
            StringBuilder sb = new StringBuilder("trying to write to finished file ");
            sb.append(this.fileName);
            sb.append(" offset ");
            sb.append(requestInfo.offset);
            sb.append(" ");
            sb.append(this.totalBytesCount);
            sb.append(" reqToken=");
            sb.append(requestInfo.requestToken);
            sb.append(" (state=");
            FileLog.e(new FileLog.IgnoreSentException(SurfaceContainer$$ExternalSyntheticOutline0.m(this.state, ")", sb)));
            return false;
        }
        int i5 = requestInfo.requestToken;
        this.requestInfos.remove(requestInfo);
        AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda0(this, i5, i4));
        String str3 = " id = ";
        if (tL_error == null) {
            try {
                if (this.notLoadedBytesRanges == null) {
                    j = 0;
                    if (this.downloadedBytes != requestInfo.offset) {
                        delayRequestInfo(requestInfo);
                        return false;
                    }
                } else {
                    j = 0;
                }
                if (requestInfo.response != null) {
                    nativeByteBuffer = requestInfo.response.bytes;
                } else if (requestInfo.responseWeb != null) {
                    nativeByteBuffer = requestInfo.responseWeb.bytes;
                } else {
                    nativeByteBuffer = requestInfo.responseCdn != null ? requestInfo.responseCdn.bytes : null;
                }
                if (nativeByteBuffer == null || nativeByteBuffer.limit() == 0) {
                    onFinishLoadingFile(true, 0, false);
                    return false;
                }
                int iLimit = nativeByteBuffer.limit();
                if (this.isCdn) {
                    try {
                        long j8 = requestInfo.offset;
                        long j9 = this.cdnChunkCheckSize;
                        long j10 = j9 * (j8 / j9);
                        HashMap<Long, TLRPC.TL_fileHash> map = this.cdnHashes;
                        if ((map != null ? map.get(Long.valueOf(j10)) : null) == null) {
                            delayRequestInfo(requestInfo);
                            requestFileOffsets(j10);
                            return true;
                        }
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e, (AndroidUtilities.isFilNotFoundException(e) || AndroidUtilities.isENOSPC(e)) ? false : true);
                        if (AndroidUtilities.isENOSPC(e)) {
                            onFail(false, -1);
                            return false;
                        }
                        if (!AndroidUtilities.isEROFS(e)) {
                            onFail(false, 0);
                            return false;
                        }
                        SharedConfig.checkSdCard(this.cacheFileFinal);
                        onFail(true, -1);
                        return false;
                    }
                }
                if (requestInfo.responseCdn != null) {
                    long j11 = requestInfo.offset / 16;
                    byte[] bArr2 = this.cdnIv;
                    c = '\r';
                    c3 = 14;
                    bArr2[15] = (byte) (j11 & 255);
                    bArr2[14] = (byte) ((j11 >> 8) & 255);
                    bArr2[13] = (byte) ((j11 >> 16) & 255);
                    bArr2[12] = (byte) ((j11 >> 24) & 255);
                    c2 = '\f';
                    Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.cdnKey, bArr2, 0, nativeByteBuffer.limit());
                } else {
                    c = '\r';
                    c2 = '\f';
                    c3 = 14;
                }
                if (this.isPreloadVideoOperation) {
                    this.preloadStream.writeLong(requestInfo.offset);
                    long j12 = iLimit;
                    this.preloadStream.writeLong(j12);
                    this.preloadStreamFileOffset += 16;
                    this.preloadStream.getChannel().write(nativeByteBuffer.buffer);
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("save preload file part " + this.cacheFilePreload + " offset " + requestInfo.offset + " size " + iLimit);
                    }
                    if (this.preloadedBytesRanges == null) {
                        this.preloadedBytesRanges = new HashMap<>();
                    }
                    this.preloadedBytesRanges.put(Long.valueOf(requestInfo.offset), new PreloadRange(this.preloadStreamFileOffset, j12));
                    this.totalPreloadedBytes += iLimit;
                    this.preloadStreamFileOffset += iLimit;
                    if (this.moovFound == 0) {
                        long jFindNextPreloadDownloadOffset = findNextPreloadDownloadOffset(this.nextAtomOffset, requestInfo.offset, nativeByteBuffer);
                        if (jFindNextPreloadDownloadOffset < j) {
                            jFindNextPreloadDownloadOffset *= -1;
                            long j13 = this.nextPreloadDownloadOffset + ((long) this.currentDownloadChunkSize);
                            this.nextPreloadDownloadOffset = j13;
                            if (j13 < this.totalBytesCount / 2) {
                                long j14 = 1048576 + jFindNextPreloadDownloadOffset;
                                this.foundMoovSize = j14;
                                this.preloadNotRequestedBytesCount = j14;
                                this.moovFound = 1;
                            } else {
                                this.foundMoovSize = 2097152L;
                                this.preloadNotRequestedBytesCount = 2097152L;
                                this.moovFound = 2;
                            }
                            this.nextPreloadDownloadOffset = -1L;
                        } else {
                            this.nextPreloadDownloadOffset += (long) this.currentDownloadChunkSize;
                        }
                        this.nextAtomOffset = jFindNextPreloadDownloadOffset;
                    }
                    this.preloadStream.writeLong(this.foundMoovSize);
                    this.preloadStream.writeLong(this.nextPreloadDownloadOffset);
                    this.preloadStream.writeLong(this.nextAtomOffset);
                    this.preloadStreamFileOffset += 24;
                    long j15 = this.nextPreloadDownloadOffset;
                    z3 = j15 == j || (this.moovFound != 0 && this.foundMoovSize < j) || this.totalPreloadedBytes > 2097152 || j15 >= this.totalBytesCount;
                    if (z3) {
                        this.preloadStream.seek(j);
                        this.preloadStream.write(1);
                    } else if (this.moovFound != 0) {
                        this.foundMoovSize -= (long) this.currentDownloadChunkSize;
                    }
                    z2 = false;
                } else {
                    NativeByteBuffer nativeByteBuffer2 = nativeByteBuffer;
                    long j16 = iLimit;
                    long j17 = this.downloadedBytes + j16;
                    this.downloadedBytes = j17;
                    long j18 = this.totalBytesCount;
                    if (j18 > 0) {
                        z = j17 >= j18 || ((i2 = this.preloadPrefixSize) > 0 && j17 >= ((long) i2) && canFinishPreload() && this.requestInfos.isEmpty());
                        z2 = this.downloadedBytes < this.totalBytesCount;
                        boolean z4 = BuildVars.DEBUG_VERSION;
                        bArr = this.key;
                        if (bArr != null) {
                            Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, bArr, this.iv, false, true, 0, nativeByteBuffer2.limit());
                            if (z) {
                                j3 = 2147483647L;
                                j2 = 0;
                                if (this.bytesCountPadding != 0) {
                                    jLimit = ((long) nativeByteBuffer2.limit()) - this.bytesCountPadding;
                                    if (BuildVars.DEBUG_VERSION && jLimit > 2147483647L) {
                                        throw new RuntimeException("Out of limit" + jLimit);
                                    }
                                    nativeByteBuffer2.limit((int) jLimit);
                                }
                            } else {
                                j2 = 0;
                                j3 = 2147483647L;
                            }
                        } else {
                            j2 = 0;
                            j3 = 2147483647L;
                        }
                        if (this.encryptFile) {
                            long j19 = requestInfo.offset / 16;
                            byte[] bArr3 = this.encryptIv;
                            bArr3[15] = (byte) (j19 & 255);
                            bArr3[c3] = (byte) ((j19 >> 8) & 255);
                            bArr3[c] = (byte) ((j19 >> 16) & 255);
                            bArr3[c2] = (byte) ((j19 >> 24) & 255);
                            Utilities.aesCtrDecryption(nativeByteBuffer2.buffer, this.encryptKey, bArr3, 0, nativeByteBuffer2.limit());
                        }
                        if (this.notLoadedBytesRanges != null) {
                            this.fileOutputStream.seek(requestInfo.offset);
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                            }
                        }
                        this.fileOutputStream.getChannel().write(nativeByteBuffer2.buffer);
                        str = " local_id = ";
                        j4 = j2;
                        addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j16, true);
                        if (this.isCdn) {
                            j5 = j4;
                            break;
                        }
                        j6 = requestInfo.offset / ((long) this.cdnChunkCheckSize);
                        size = this.notCheckedCdnRanges.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                                range = this.notCheckedCdnRanges.get(i);
                                if (range.start > j6 && j6 <= range.end) {
                                    long j20 = this.cdnChunkCheckSize;
                                    long j21 = j6 * j20;
                                    long downloadedLengthFromOffsetInternal = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j21, j20);
                                    if (downloadedLengthFromOffsetInternal != j4) {
                                        j5 = j4;
                                        if (downloadedLengthFromOffsetInternal == this.cdnChunkCheckSize) {
                                            tL_fileHash = this.cdnHashes.get(Long.valueOf(j21));
                                            if (this.fileReadStream == null) {
                                                this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                                this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                            }
                                            this.fileReadStream.seek(j21);
                                            if (BuildVars.DEBUG_VERSION) {
                                                throw new RuntimeException("!!!");
                                            }
                                            this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                            if (this.encryptFile) {
                                                long j22 = j21 / 16;
                                                byte[] bArr4 = this.encryptIv;
                                                bArr4[15] = (byte) (j22 & 255);
                                                bArr4[c3] = (byte) ((j22 >> 8) & 255);
                                                bArr4[c] = (byte) ((j22 >> 16) & 255);
                                                bArr4[c2] = (byte) ((j22 >> 24) & 255);
                                                Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr4, 0, downloadedLengthFromOffsetInternal, 0);
                                                j7 = downloadedLengthFromOffsetInternal;
                                            } else {
                                                j7 = downloadedLengthFromOffsetInternal;
                                            }
                                            if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, j7), tL_fileHash.hash)) {
                                                this.cdnHashes.remove(Long.valueOf(j21));
                                                addPart(this.notCheckedCdnRanges, j6, j6 + 1, false);
                                                break;
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                if (this.location != null) {
                                                    FileLog.e("invalid cdn hash " + this.location + str3 + this.location.id + str + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                                                } else {
                                                    str2 = str3;
                                                    if (this.webLocation != null) {
                                                        FileLog.e("invalid cdn hash  " + this.webLocation + str2 + this.fileName);
                                                    }
                                                }
                                            }
                                            onFail(false, 0);
                                            this.cacheFileTemp.delete();
                                            return false;
                                        }
                                        long j23 = this.totalBytesCount;
                                        if ((j23 <= j5 || downloadedLengthFromOffsetInternal != j23 - j21) && (j23 > j5 || !z)) {
                                            break;
                                            break;
                                        }
                                        tL_fileHash = this.cdnHashes.get(Long.valueOf(j21));
                                        if (this.fileReadStream == null) {
                                            this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                            this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                        }
                                        this.fileReadStream.seek(j21);
                                        if (BuildVars.DEBUG_VERSION && downloadedLengthFromOffsetInternal > j3) {
                                            throw new RuntimeException("!!!");
                                        }
                                        this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                        if (this.encryptFile) {
                                            long j24 = j21 / 16;
                                            byte[] bArr5 = this.encryptIv;
                                            bArr5[15] = (byte) (j24 & 255);
                                            bArr5[c3] = (byte) ((j24 >> 8) & 255);
                                            bArr5[c] = (byte) ((j24 >> 16) & 255);
                                            bArr5[c2] = (byte) ((j24 >> 24) & 255);
                                            Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr5, 0, downloadedLengthFromOffsetInternal, 0);
                                            j7 = downloadedLengthFromOffsetInternal;
                                        } else {
                                            j7 = downloadedLengthFromOffsetInternal;
                                        }
                                        if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, j7), tL_fileHash.hash)) {
                                            this.cdnHashes.remove(Long.valueOf(j21));
                                            addPart(this.notCheckedCdnRanges, j6, j6 + 1, false);
                                            break;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            if (this.location != null) {
                                                FileLog.e("invalid cdn hash " + this.location + str3 + this.location.id + str + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                                            } else {
                                                str2 = str3;
                                                if (this.webLocation != null) {
                                                    FileLog.e("invalid cdn hash  " + this.webLocation + str2 + this.fileName);
                                                }
                                            }
                                        }
                                        onFail(false, 0);
                                        this.cacheFileTemp.delete();
                                        return false;
                                    }
                                } else {
                                    i++;
                                    str3 = str3;
                                    j6 = j6;
                                    str = str;
                                    j4 = j4;
                                }
                            }
                            j5 = j4;
                            break;
                        }
                        randomAccessFile = this.fiv;
                        if (randomAccessFile != null) {
                            randomAccessFile.seek(j5);
                            this.fiv.write(this.iv);
                        }
                        if (this.totalBytesCount > 0 && this.state == 1) {
                            copyNotLoadedRanges();
                            this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                        }
                        z3 = z;
                    } else {
                        int i6 = this.currentDownloadChunkSize;
                        z = iLimit != i6 || ((j18 == j17 || j17 % ((long) i6) != 0) && (j18 <= 0 || j18 <= j17));
                    }
                    boolean z5 = BuildVars.DEBUG_VERSION;
                    bArr = this.key;
                    if (bArr != null) {
                        Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, bArr, this.iv, false, true, 0, nativeByteBuffer2.limit());
                        if (z) {
                            j3 = 2147483647L;
                            j2 = 0;
                            if (this.bytesCountPadding != 0) {
                                jLimit = ((long) nativeByteBuffer2.limit()) - this.bytesCountPadding;
                                if (BuildVars.DEBUG_VERSION) {
                                    throw new RuntimeException("Out of limit" + jLimit);
                                }
                                nativeByteBuffer2.limit((int) jLimit);
                            }
                        } else {
                            j2 = 0;
                            j3 = 2147483647L;
                        }
                    } else {
                        j2 = 0;
                        j3 = 2147483647L;
                    }
                    if (this.encryptFile) {
                        long j110 = requestInfo.offset / 16;
                        byte[] bArr6 = this.encryptIv;
                        bArr6[15] = (byte) (j110 & 255);
                        bArr6[c3] = (byte) ((j110 >> 8) & 255);
                        bArr6[c] = (byte) ((j110 >> 16) & 255);
                        bArr6[c2] = (byte) ((j110 >> 24) & 255);
                        Utilities.aesCtrDecryption(nativeByteBuffer2.buffer, this.encryptKey, bArr6, 0, nativeByteBuffer2.limit());
                    }
                    if (this.notLoadedBytesRanges != null) {
                        this.fileOutputStream.seek(requestInfo.offset);
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                        }
                    }
                    this.fileOutputStream.getChannel().write(nativeByteBuffer2.buffer);
                    str = " local_id = ";
                    j4 = j2;
                    addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j16, true);
                    if (this.isCdn) {
                        j5 = j4;
                        break;
                    }
                    j6 = requestInfo.offset / ((long) this.cdnChunkCheckSize);
                    size = this.notCheckedCdnRanges.size();
                    i = 0;
                    while (true) {
                        if (i < size) {
                            range = this.notCheckedCdnRanges.get(i);
                            if (range.start > j6) {
                            }
                            i++;
                            str3 = str3;
                            j6 = j6;
                            str = str;
                            j4 = j4;
                        }
                        j5 = j4;
                        break;
                    }
                    randomAccessFile = this.fiv;
                    if (randomAccessFile != null) {
                        randomAccessFile.seek(j5);
                        this.fiv.write(this.iv);
                    }
                    if (this.totalBytesCount > 0) {
                        copyNotLoadedRanges();
                        this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                    }
                    z3 = z;
                }
                while (i3 < this.delayedRequestInfos.size()) {
                    RequestInfo requestInfo2 = this.delayedRequestInfos.get(i3);
                    i3 = (this.notLoadedBytesRanges == null && this.downloadedBytes != requestInfo2.offset) ? i3 + 1 : 0;
                    this.delayedRequestInfos.remove(i3);
                    if (!processRequestResult(requestInfo2, null)) {
                        if (requestInfo2.response == null) {
                            if (requestInfo2.responseWeb == null) {
                                if (requestInfo2.responseCdn == null) {
                                    break;
                                }
                                requestInfo2.responseCdn.disableFree = false;
                                requestInfo2.responseCdn.freeResources();
                                break;
                            }
                            requestInfo2.responseWeb.disableFree = false;
                            requestInfo2.responseWeb.freeResources();
                            break;
                        }
                        requestInfo2.response.disableFree = false;
                        requestInfo2.response.freeResources();
                        break;
                    }
                    break;
                }
                if (z3) {
                    onFinishLoadingFile(true, 0, z2);
                    return false;
                }
                if (this.state != 4 && this.state != 5) {
                    startDownloadRequest(requestInfo.connectionType);
                    return false;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            if (tL_error.text.contains("LIMIT_INVALID") && !requestInfo.forceSmallChunk) {
                Runnable runnable = requestInfo.whenCancelled;
                if (runnable != null) {
                    runnable.run();
                }
                removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + ((long) requestInfo.chunkSize));
                if (!this.forceSmallChunk) {
                    this.forceSmallChunk = true;
                    this.currentDownloadChunkSize = 32768;
                    this.currentMaxDownloadRequests = 4;
                }
                startDownloadRequest(requestInfo.connectionType);
                return false;
            }
            if (!tL_error.text.contains("FILE_MIGRATE_")) {
                if (tL_error.text.contains("OFFSET_INVALID")) {
                    if (this.downloadedBytes % ((long) this.currentDownloadChunkSize) != 0) {
                        onFail(false, 0);
                        return false;
                    }
                    try {
                        onFinishLoadingFile(true, 0, false);
                        return false;
                    } catch (Exception e3) {
                        FileLog.e(e3);
                        onFail(false, 0);
                        return false;
                    }
                }
                if (tL_error.text.contains("RETRY_LIMIT")) {
                    onFail(false, 2);
                    return false;
                }
                if (BuildVars.LOGS_ENABLED) {
                    TLRPC.InputFileLocation inputFileLocation = this.location;
                    if (inputFileLocation != null) {
                        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            FileLog.e(tL_error.text + " " + this.location + " peer_did = " + DialogObject.getPeerDialogId(((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).big);
                        } else {
                            FileLog.e(tL_error.text + " " + this.location + " id = " + this.location.id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                        }
                    } else if (this.webLocation != null) {
                        FileLog.e(tL_error.text + " " + this.webLocation + " id = " + this.fileName);
                    }
                }
                onFail(false, 0);
                return false;
            }
            Scanner scanner = new Scanner(tL_error.text.replace("FILE_MIGRATE_", ""));
            scanner.useDelimiter("");
            try {
                numValueOf = Integer.valueOf(scanner.nextInt());
            } catch (Exception unused) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                onFail(false, 0);
                return false;
            }
            this.datacenterId = numValueOf.intValue();
            this.downloadedBytes = 0L;
            this.requestedBytesCount = 0L;
            startDownloadRequest(requestInfo.connectionType);
        }
        return false;
    }

    public void removeStreamListener(FileLoadOperationStream fileLoadOperationStream) {
        Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda14(this, fileLoadOperationStream, 0));
    }

    public void setDelegate(FileLoadOperationDelegate fileLoadOperationDelegate) {
        this.delegate = fileLoadOperationDelegate;
    }

    public void setEncryptFile(boolean z) {
        this.encryptFile = z;
        if (z) {
            this.allowDisordererFileSave = false;
        }
    }

    public void setForceRequest(boolean z) {
        this.isForceRequest = z;
    }

    public void setIsPreloadVideoOperation(boolean z) {
        if (this.isPreloadVideoOperation != z) {
            if (!z || this.totalBytesCount > 2097152) {
                FileLog.e("setIsPreloadVideoOperation " + z + " file=" + this.fileName);
                if (z || !this.isPreloadVideoOperation) {
                    this.isPreloadVideoOperation = z;
                    return;
                }
                if (this.state == 3) {
                    this.isPreloadVideoOperation = z;
                    this.state = 0;
                    this.preloadFinished = false;
                    start();
                    return;
                }
                if (this.state == 1) {
                    Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda13(this, z, 0));
                } else {
                    this.isPreloadVideoOperation = z;
                }
            }
        }
    }

    public void setPaths(int i, String str, FileLoaderPriorityQueue fileLoaderPriorityQueue, File file, File file2, String str2) {
        this.storePath = file;
        this.tempPath = file2;
        this.currentAccount = i;
        this.fileName = str;
        this.storeFileName = str2;
        this.priorityQueue = fileLoaderPriorityQueue;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setStream(FileLoadOperationStream fileLoadOperationStream, boolean z, long j) {
        this.stream = fileLoadOperationStream;
        this.streamOffset = j;
        this.streamPriority = z;
        Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda14(this, fileLoadOperationStream, 1));
    }

    public boolean start() {
        return start(this.stream, this.streamOffset, this.streamPriority);
    }

    public void startDownloadRequest(int i) {
        int i2;
        int iMax;
        int i3;
        ?? r0;
        long j;
        ?? r15;
        ArrayList<Range> arrayList;
        long j2;
        long j3;
        long j4;
        int size;
        long jMin;
        int i4;
        long j5;
        Range range;
        int i5;
        long j6;
        long j7;
        boolean z;
        int i6;
        int i7;
        TLObject tLObject;
        int i8;
        RequestInfo requestInfo;
        boolean z2;
        long j8;
        TLRPC.InputFileLocation inputFileLocation;
        int i9;
        int i10;
        int i11;
        HashMap<Long, PreloadRange> map;
        PreloadRange preloadRange;
        boolean z3;
        ArrayList<Range> arrayList2;
        long j9;
        boolean z4;
        int i12;
        long j10;
        long j11;
        long j12;
        long j13;
        FileLoadOperation fileLoadOperation = this;
        int i13 = 2;
        ?? r9 = 0;
        boolean z5 = true;
        if (BuildVars.DEBUG_PRIVATE_VERSION && Utilities.stageQueue != null && Utilities.stageQueue.getHandler() != null && Thread.currentThread() != Utilities.stageQueue.getHandler().getLooper().getThread()) {
            throw new RuntimeException("Wrong thread!!!");
        }
        if (fileLoadOperation.state == 5) {
            fileLoadOperation.state = 1;
        }
        if (fileLoadOperation.paused || fileLoadOperation.reuploadingCdn || fileLoadOperation.state != 1 || fileLoadOperation.requestingReference) {
            return;
        }
        long j14 = 0;
        if (fileLoadOperation.isStory || fileLoadOperation.streamPriorityStartOffset != 0 || fileLoadOperation.nextPartWasPreloaded || fileLoadOperation.delayedRequestInfos.size() + fileLoadOperation.requestInfos.size() < fileLoadOperation.currentMaxDownloadRequests) {
            if (fileLoadOperation.isPreloadVideoOperation) {
                if (fileLoadOperation.requestedBytesCount > 2097152) {
                    return;
                }
                if (fileLoadOperation.moovFound != 0 && fileLoadOperation.requestInfos.size() > 0) {
                    return;
                }
            }
            if (!fileLoadOperation.isStory) {
                if (fileLoadOperation.streamPriorityStartOffset != 0 || fileLoadOperation.nextPartWasPreloaded || ((fileLoadOperation.isPreloadVideoOperation && fileLoadOperation.moovFound == 0) || fileLoadOperation.totalBytesCount <= 0)) {
                    i2 = 1;
                } else {
                    iMax = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
                }
                if (!fileLoadOperation.requestedReference && FileRefController.getInstance(fileLoadOperation.currentAccount).applyCachedFileReference(fileLoadOperation.parentObject, fileLoadOperation.location, fileLoadOperation)) {
                    FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
                }
                i3 = 0;
                r0 = fileLoadOperation;
                while (i3 < i2) {
                    if (!r0.isPreloadVideoOperation) {
                        j = j14;
                        r15 = 1;
                        r15 = 1;
                        arrayList = r0.notRequestedBytesRanges;
                        if (arrayList != null) {
                            j4 = r0.streamPriorityStartOffset;
                            if (j4 == j) {
                                j4 = r0.streamStartOffset;
                            }
                            size = arrayList.size();
                            jMin = Long.MAX_VALUE;
                            i4 = 0;
                            j5 = Long.MAX_VALUE;
                            while (true) {
                                if (i4 < size) {
                                    j2 = j5;
                                    break;
                                }
                                range = r0.notRequestedBytesRanges.get(i4);
                                if (j4 == j) {
                                    if (range.start > j4 && range.end > j4) {
                                        j2 = j4;
                                        jMin = Long.MAX_VALUE;
                                        break;
                                    } else if (j4 >= range.start && range.start < j5) {
                                        j5 = range.start;
                                    }
                                }
                                jMin = Math.min(jMin, range.start);
                                i4++;
                            }
                            if (j2 != Long.MAX_VALUE) {
                                if (jMin != Long.MAX_VALUE) {
                                    boolean z6 = BuildVars.DEBUG_VERSION;
                                    return;
                                }
                                j3 = jMin;
                            }
                        } else {
                            j2 = r0.requestedBytesCount;
                        }
                        j3 = j2;
                    } else {
                        if (r0.moovFound == 0 && r0.preloadNotRequestedBytesCount <= j14) {
                            boolean z7 = BuildVars.DEBUG_VERSION;
                            return;
                        }
                        j9 = r0.nextPreloadDownloadOffset;
                        if (j9 == -1) {
                            i12 = (2097152 / r0.currentDownloadChunkSize) + i13;
                            j10 = j14;
                            while (true) {
                                if (i12 != 0) {
                                    j = j14;
                                    z4 = true;
                                    j9 = j10;
                                    z5 = false;
                                    break;
                                }
                                if (r0.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j10))) {
                                    int i14 = r0.currentDownloadChunkSize;
                                    j11 = i14;
                                    j10 += j11;
                                    j12 = j14;
                                    j13 = r0.totalBytesCount;
                                    if (j10 > j13) {
                                        j9 = j10;
                                        j = j12;
                                        z5 = false;
                                    } else {
                                        if (r0.moovFound == i13 && j10 == i14 * 8) {
                                            j10 = ((j13 - 1048576) / j11) * j11;
                                        }
                                        i12--;
                                        j14 = j12;
                                        z5 = true;
                                    }
                                } else {
                                    j9 = j10;
                                    j = j14;
                                }
                                z4 = true;
                                break;
                            }
                            if (!z5 && r0.requestInfos.isEmpty()) {
                                r0.onFinishLoadingFile(r9, r9, r9);
                            }
                        } else {
                            j = j14;
                            z4 = true;
                        }
                        if (r0.requestedPreloadedBytesRanges == null) {
                            r0.requestedPreloadedBytesRanges = new HashMap<>();
                        }
                        r0.requestedPreloadedBytesRanges.put(Long.valueOf(j9), Integer.valueOf(z4 ? 1 : 0));
                        if (BuildVars.DEBUG_VERSION) {
                            StringBuilder sbM = AacUtil.m(j9, "start next preload from ", " size ");
                            sbM.append(r0.totalBytesCount);
                            sbM.append(" for ");
                            sbM.append(r0.cacheFilePreload);
                            FileLog.d(sbM.toString());
                        }
                        r0.preloadNotRequestedBytesCount -= (long) r0.currentDownloadChunkSize;
                        j3 = j9;
                        r15 = z4;
                    }
                    i5 = r0.preloadPrefixSize;
                    if (i5 <= 0 && j3 >= i5 && r0.canFinishPreload()) {
                        boolean z8 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    j6 = r0.totalBytesCount;
                    if (j6 <= j && j3 > j && j3 >= j6) {
                        boolean z9 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    if (!r0.isPreloadVideoOperation && (arrayList2 = r0.notRequestedBytesRanges) != null) {
                        r0.addPart(arrayList2, j3, ((long) r0.currentDownloadChunkSize) + j3, false);
                        boolean z10 = BuildVars.DEBUG_VERSION;
                    }
                    j7 = r0.totalBytesCount;
                    if (j7 > j || i3 == i2 - 1 || (j7 > j && ((long) r0.currentDownloadChunkSize) + j3 >= j7)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i == -1) {
                        i6 = i;
                    } else if (r0.requestsCount % 2 == 0) {
                        i6 = 2;
                    } else {
                        i6 = 65538;
                    }
                    if (r0.isForceRequest) {
                        i7 = 32;
                    } else {
                        i7 = 0;
                    }
                    if (r0.isCdn) {
                        TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                        tL_upload_getCdnFile.file_token = r0.cdnToken;
                        tL_upload_getCdnFile.offset = j3;
                        tL_upload_getCdnFile.limit = r0.currentDownloadChunkSize;
                        i8 = i7 | r15;
                        tLObject = tL_upload_getCdnFile;
                    } else if (r0.webLocation != null) {
                        TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                        tL_upload_getWebFile.location = r0.webLocation;
                        tL_upload_getWebFile.offset = (int) j3;
                        tL_upload_getWebFile.limit = r0.currentDownloadChunkSize;
                        i8 = i7;
                        tLObject = tL_upload_getWebFile;
                    } else {
                        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                        tL_upload_getFile.location = r0.location;
                        tL_upload_getFile.offset = j3;
                        tL_upload_getFile.limit = r0.currentDownloadChunkSize;
                        tL_upload_getFile.cdn_supported = r15;
                        i8 = i7;
                        tLObject = tL_upload_getFile;
                    }
                    r0.requestedBytesCount += (long) r0.currentDownloadChunkSize;
                    requestInfo = new RequestInfo();
                    r0.requestInfos.add(requestInfo);
                    requestInfo.offset = j3;
                    requestInfo.chunkSize = r0.currentDownloadChunkSize;
                    requestInfo.forceSmallChunk = r0.forceSmallChunk;
                    requestInfo.connectionType = i6;
                    if (!r0.isPreloadVideoOperation || !r0.supportsPreloading || r0.preloadStream == null || (map = r0.preloadedBytesRanges) == null || (preloadRange = map.get(Long.valueOf(requestInfo.offset))) == null) {
                        z2 = false;
                        if (r0.streamPriorityStartOffset != j) {
                            if (BuildVars.DEBUG_VERSION) {
                                zzjj.m(new StringBuilder("frame get offset = "), r0.streamPriorityStartOffset);
                            }
                            j8 = j;
                            r0.streamPriorityStartOffset = j8;
                            r0.priorityRequestInfo = requestInfo;
                        } else {
                            j8 = j;
                        }
                        inputFileLocation = r0.location;
                        if ((inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) || ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation).photo_id != j8) {
                            requestInfo.forceSmallChunk = r0.forceSmallChunk;
                            if (BuildVars.LOGS_ENABLED) {
                                requestInfo.requestStartTime = System.currentTimeMillis();
                            }
                            int i15 = i8 | 2048;
                            if (r0.isCdn) {
                                i9 = r0.cdnDatacenterId;
                            } else {
                                i9 = r0.datacenterId;
                            }
                            i10 = i9;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(r0.currentAccount);
                            ?? r1 = r0;
                            r0 = r1;
                            int iSendRequestSync = connectionsManager.sendRequestSync(tLObject, new FileLoadOperation$$ExternalSyntheticLambda2(r1, requestInfo, i10, i6, tLObject, 0), null, null, i15, i10, i6, z);
                            requestInfo.requestToken = iSendRequestSync;
                            if (BuildVars.LOGS_ENABLED) {
                                StringBuilder sb = new StringBuilder("debug_loading: ");
                                sb.append(r0.cacheFileFinal.getName());
                                sb.append(" dc=");
                                sb.append(i10);
                                sb.append(" send reqId ");
                                sb.append(requestInfo.requestToken);
                                sb.append(" offset=");
                                sb.append(requestInfo.offset);
                                sb.append(" conType=");
                                sb.append(i6);
                                sb.append(" priority=");
                                ChatObject$Call$$ExternalSyntheticOutline0.m(sb, r0.priority);
                            }
                            AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda0(r0, iSendRequestSync, 3));
                            i11 = 1;
                            r0.requestsCount++;
                        } else {
                            r0.requestReference(requestInfo);
                            z2 = z2;
                        }
                        i3 += i11;
                        j14 = j8;
                        i13 = 2;
                        z5 = true;
                        r0 = r0;
                        r9 = z2;
                    } else {
                        requestInfo.response = new TLRPC.TL_upload_file();
                        try {
                            if (BuildVars.DEBUG_VERSION) {
                                try {
                                    if (preloadRange.length > 2147483647L) {
                                        throw new RuntimeException("cast long to integer");
                                    }
                                } catch (Exception unused) {
                                    z2 = false;
                                    if (r0.streamPriorityStartOffset != j) {
                                        if (BuildVars.DEBUG_VERSION) {
                                            zzjj.m(new StringBuilder("frame get offset = "), r0.streamPriorityStartOffset);
                                        }
                                        j8 = j;
                                        r0.streamPriorityStartOffset = j8;
                                        r0.priorityRequestInfo = requestInfo;
                                    } else {
                                        j8 = j;
                                    }
                                    inputFileLocation = r0.location;
                                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                    }
                                    requestInfo.forceSmallChunk = r0.forceSmallChunk;
                                    if (BuildVars.LOGS_ENABLED) {
                                        requestInfo.requestStartTime = System.currentTimeMillis();
                                    }
                                    int i16 = i8 | 2048;
                                    if (r0.isCdn) {
                                        i9 = r0.cdnDatacenterId;
                                    } else {
                                        i9 = r0.datacenterId;
                                    }
                                    i10 = i9;
                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(r0.currentAccount);
                                    ?? r2 = r0;
                                    r0 = r2;
                                    int iSendRequestSync2 = connectionsManager2.sendRequestSync(tLObject, new FileLoadOperation$$ExternalSyntheticLambda2(r2, requestInfo, i10, i6, tLObject, 0), null, null, i16, i10, i6, z);
                                    requestInfo.requestToken = iSendRequestSync2;
                                    if (BuildVars.LOGS_ENABLED) {
                                        StringBuilder sb2 = new StringBuilder("debug_loading: ");
                                        sb2.append(r0.cacheFileFinal.getName());
                                        sb2.append(" dc=");
                                        sb2.append(i10);
                                        sb2.append(" send reqId ");
                                        sb2.append(requestInfo.requestToken);
                                        sb2.append(" offset=");
                                        sb2.append(requestInfo.offset);
                                        sb2.append(" conType=");
                                        sb2.append(i6);
                                        sb2.append(" priority=");
                                        ChatObject$Call$$ExternalSyntheticOutline0.m(sb2, r0.priority);
                                    }
                                    AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda0(r0, iSendRequestSync2, 3));
                                    i11 = 1;
                                    r0.requestsCount++;
                                    i3 += i11;
                                    j14 = j8;
                                    i13 = 2;
                                    z5 = true;
                                    r0 = r0;
                                    r9 = z2;
                                }
                            }
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) preloadRange.length);
                            r0.preloadStream.seek(preloadRange.fileOffset);
                            r0.preloadStream.getChannel().read(nativeByteBuffer.buffer);
                            z3 = false;
                            z2 = false;
                            try {
                                nativeByteBuffer.buffer.position(0);
                                requestInfo.response.bytes = nativeByteBuffer;
                                Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda1(r0, requestInfo, z3 ? 1 : 0));
                                j8 = j;
                            } catch (Exception unused2) {
                                z2 = z3;
                                if (r0.streamPriorityStartOffset != j) {
                                    if (BuildVars.DEBUG_VERSION) {
                                        zzjj.m(new StringBuilder("frame get offset = "), r0.streamPriorityStartOffset);
                                    }
                                    j8 = j;
                                    r0.streamPriorityStartOffset = j8;
                                    r0.priorityRequestInfo = requestInfo;
                                } else {
                                    j8 = j;
                                }
                                inputFileLocation = r0.location;
                                if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                }
                                requestInfo.forceSmallChunk = r0.forceSmallChunk;
                                if (BuildVars.LOGS_ENABLED) {
                                    requestInfo.requestStartTime = System.currentTimeMillis();
                                }
                                int i17 = i8 | 2048;
                                if (r0.isCdn) {
                                    i9 = r0.cdnDatacenterId;
                                } else {
                                    i9 = r0.datacenterId;
                                }
                                i10 = i9;
                                ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(r0.currentAccount);
                                ?? r3 = r0;
                                r0 = r3;
                                int iSendRequestSync3 = connectionsManager3.sendRequestSync(tLObject, new FileLoadOperation$$ExternalSyntheticLambda2(r3, requestInfo, i10, i6, tLObject, 0), null, null, i17, i10, i6, z);
                                requestInfo.requestToken = iSendRequestSync3;
                                if (BuildVars.LOGS_ENABLED) {
                                    StringBuilder sb3 = new StringBuilder("debug_loading: ");
                                    sb3.append(r0.cacheFileFinal.getName());
                                    sb3.append(" dc=");
                                    sb3.append(i10);
                                    sb3.append(" send reqId ");
                                    sb3.append(requestInfo.requestToken);
                                    sb3.append(" offset=");
                                    sb3.append(requestInfo.offset);
                                    sb3.append(" conType=");
                                    sb3.append(i6);
                                    sb3.append(" priority=");
                                    ChatObject$Call$$ExternalSyntheticOutline0.m(sb3, r0.priority);
                                }
                                AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda0(r0, iSendRequestSync3, 3));
                                i11 = 1;
                                r0.requestsCount++;
                                i3 += i11;
                                j14 = j8;
                                i13 = 2;
                                z5 = true;
                                r0 = r0;
                                r9 = z2;
                            }
                        } catch (Exception unused3) {
                            z3 = false;
                        }
                    }
                    i11 = 1;
                    i3 += i11;
                    j14 = j8;
                    i13 = 2;
                    z5 = true;
                    r0 = r0;
                    r9 = z2;
                }
            }
            iMax = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
            i2 = iMax;
            if (!fileLoadOperation.requestedReference) {
                FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
            }
            i3 = 0;
            r0 = fileLoadOperation;
            while (i3 < i2) {
                if (!r0.isPreloadVideoOperation) {
                    if (r0.moovFound == 0) {
                    }
                    j9 = r0.nextPreloadDownloadOffset;
                    if (j9 == -1) {
                        i12 = (2097152 / r0.currentDownloadChunkSize) + i13;
                        j10 = j14;
                        while (true) {
                            if (i12 != 0) {
                                j = j14;
                                z4 = true;
                                j9 = j10;
                                z5 = false;
                                break;
                            }
                            if (r0.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j10))) {
                                j9 = j10;
                                j = j14;
                            } else {
                                int i18 = r0.currentDownloadChunkSize;
                                j11 = i18;
                                j10 += j11;
                                j12 = j14;
                                j13 = r0.totalBytesCount;
                                if (j10 > j13) {
                                    j9 = j10;
                                    j = j12;
                                    z5 = false;
                                } else {
                                    if (r0.moovFound == i13) {
                                        j10 = ((j13 - 1048576) / j11) * j11;
                                    }
                                    i12--;
                                    j14 = j12;
                                    z5 = true;
                                }
                            }
                            z4 = true;
                            break;
                        }
                        if (!z5) {
                            r0.onFinishLoadingFile(r9, r9, r9);
                        }
                    } else {
                        j = j14;
                        z4 = true;
                    }
                    if (r0.requestedPreloadedBytesRanges == null) {
                        r0.requestedPreloadedBytesRanges = new HashMap<>();
                    }
                    r0.requestedPreloadedBytesRanges.put(Long.valueOf(j9), Integer.valueOf(z4 ? 1 : 0));
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder sbM2 = AacUtil.m(j9, "start next preload from ", " size ");
                        sbM2.append(r0.totalBytesCount);
                        sbM2.append(" for ");
                        sbM2.append(r0.cacheFilePreload);
                        FileLog.d(sbM2.toString());
                    }
                    r0.preloadNotRequestedBytesCount -= (long) r0.currentDownloadChunkSize;
                    j3 = j9;
                    r15 = z4;
                } else {
                    j = j14;
                    r15 = 1;
                    r15 = 1;
                    arrayList = r0.notRequestedBytesRanges;
                    if (arrayList != null) {
                        j4 = r0.streamPriorityStartOffset;
                        if (j4 == j) {
                            j4 = r0.streamStartOffset;
                        }
                        size = arrayList.size();
                        jMin = Long.MAX_VALUE;
                        i4 = 0;
                        j5 = Long.MAX_VALUE;
                        while (true) {
                            if (i4 < size) {
                                j2 = j5;
                                break;
                            }
                            range = r0.notRequestedBytesRanges.get(i4);
                            if (j4 == j) {
                                if (range.start > j4) {
                                }
                                if (j4 >= range.start) {
                                }
                            }
                            jMin = Math.min(jMin, range.start);
                            i4++;
                        }
                        if (j2 != Long.MAX_VALUE) {
                            if (jMin != Long.MAX_VALUE) {
                                boolean z11 = BuildVars.DEBUG_VERSION;
                                return;
                            }
                            j3 = jMin;
                        }
                    } else {
                        j2 = r0.requestedBytesCount;
                    }
                    j3 = j2;
                }
                i5 = r0.preloadPrefixSize;
                if (i5 <= 0) {
                }
                j6 = r0.totalBytesCount;
                if (j6 <= j) {
                }
                if (!r0.isPreloadVideoOperation) {
                    r0.addPart(arrayList2, j3, ((long) r0.currentDownloadChunkSize) + j3, false);
                    boolean z12 = BuildVars.DEBUG_VERSION;
                }
                j7 = r0.totalBytesCount;
                if (j7 > j) {
                    z = true;
                } else {
                    z = true;
                }
                if (i == -1) {
                    i6 = i;
                } else if (r0.requestsCount % 2 == 0) {
                    i6 = 2;
                } else {
                    i6 = 65538;
                }
                if (r0.isForceRequest) {
                    i7 = 32;
                } else {
                    i7 = 0;
                }
                if (r0.isCdn) {
                    TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile2 = new TLRPC.TL_upload_getCdnFile();
                    tL_upload_getCdnFile2.file_token = r0.cdnToken;
                    tL_upload_getCdnFile2.offset = j3;
                    tL_upload_getCdnFile2.limit = r0.currentDownloadChunkSize;
                    i8 = i7 | r15;
                    tLObject = tL_upload_getCdnFile2;
                } else if (r0.webLocation != null) {
                    TLRPC.TL_upload_getWebFile tL_upload_getWebFile2 = new TLRPC.TL_upload_getWebFile();
                    tL_upload_getWebFile2.location = r0.webLocation;
                    tL_upload_getWebFile2.offset = (int) j3;
                    tL_upload_getWebFile2.limit = r0.currentDownloadChunkSize;
                    i8 = i7;
                    tLObject = tL_upload_getWebFile2;
                } else {
                    TLRPC.TL_upload_getFile tL_upload_getFile2 = new TLRPC.TL_upload_getFile();
                    tL_upload_getFile2.location = r0.location;
                    tL_upload_getFile2.offset = j3;
                    tL_upload_getFile2.limit = r0.currentDownloadChunkSize;
                    tL_upload_getFile2.cdn_supported = r15;
                    i8 = i7;
                    tLObject = tL_upload_getFile2;
                }
                r0.requestedBytesCount += (long) r0.currentDownloadChunkSize;
                requestInfo = new RequestInfo();
                r0.requestInfos.add(requestInfo);
                requestInfo.offset = j3;
                requestInfo.chunkSize = r0.currentDownloadChunkSize;
                requestInfo.forceSmallChunk = r0.forceSmallChunk;
                requestInfo.connectionType = i6;
                if (r0.isPreloadVideoOperation) {
                    z2 = false;
                    if (r0.streamPriorityStartOffset != j) {
                        if (BuildVars.DEBUG_VERSION) {
                            zzjj.m(new StringBuilder("frame get offset = "), r0.streamPriorityStartOffset);
                        }
                        j8 = j;
                        r0.streamPriorityStartOffset = j8;
                        r0.priorityRequestInfo = requestInfo;
                    } else {
                        j8 = j;
                    }
                    inputFileLocation = r0.location;
                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                    }
                    requestInfo.forceSmallChunk = r0.forceSmallChunk;
                    if (BuildVars.LOGS_ENABLED) {
                        requestInfo.requestStartTime = System.currentTimeMillis();
                    }
                    int i19 = i8 | 2048;
                    if (r0.isCdn) {
                        i9 = r0.cdnDatacenterId;
                    } else {
                        i9 = r0.datacenterId;
                    }
                    i10 = i9;
                    ConnectionsManager connectionsManager4 = ConnectionsManager.getInstance(r0.currentAccount);
                    ?? r4 = r0;
                    r0 = r4;
                    int iSendRequestSync4 = connectionsManager4.sendRequestSync(tLObject, new FileLoadOperation$$ExternalSyntheticLambda2(r4, requestInfo, i10, i6, tLObject, 0), null, null, i19, i10, i6, z);
                    requestInfo.requestToken = iSendRequestSync4;
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb4 = new StringBuilder("debug_loading: ");
                        sb4.append(r0.cacheFileFinal.getName());
                        sb4.append(" dc=");
                        sb4.append(i10);
                        sb4.append(" send reqId ");
                        sb4.append(requestInfo.requestToken);
                        sb4.append(" offset=");
                        sb4.append(requestInfo.offset);
                        sb4.append(" conType=");
                        sb4.append(i6);
                        sb4.append(" priority=");
                        ChatObject$Call$$ExternalSyntheticOutline0.m(sb4, r0.priority);
                    }
                    AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda0(r0, iSendRequestSync4, 3));
                    i11 = 1;
                    r0.requestsCount++;
                    i3 += i11;
                    j14 = j8;
                    i13 = 2;
                    z5 = true;
                    r0 = r0;
                    r9 = z2;
                } else {
                    z2 = false;
                    if (r0.streamPriorityStartOffset != j) {
                        if (BuildVars.DEBUG_VERSION) {
                            zzjj.m(new StringBuilder("frame get offset = "), r0.streamPriorityStartOffset);
                        }
                        j8 = j;
                        r0.streamPriorityStartOffset = j8;
                        r0.priorityRequestInfo = requestInfo;
                    } else {
                        j8 = j;
                    }
                    inputFileLocation = r0.location;
                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                    }
                    requestInfo.forceSmallChunk = r0.forceSmallChunk;
                    if (BuildVars.LOGS_ENABLED) {
                        requestInfo.requestStartTime = System.currentTimeMillis();
                    }
                    int i110 = i8 | 2048;
                    if (r0.isCdn) {
                        i9 = r0.cdnDatacenterId;
                    } else {
                        i9 = r0.datacenterId;
                    }
                    i10 = i9;
                    ConnectionsManager connectionsManager5 = ConnectionsManager.getInstance(r0.currentAccount);
                    ?? r5 = r0;
                    r0 = r5;
                    int iSendRequestSync5 = connectionsManager5.sendRequestSync(tLObject, new FileLoadOperation$$ExternalSyntheticLambda2(r5, requestInfo, i10, i6, tLObject, 0), null, null, i110, i10, i6, z);
                    requestInfo.requestToken = iSendRequestSync5;
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb5 = new StringBuilder("debug_loading: ");
                        sb5.append(r0.cacheFileFinal.getName());
                        sb5.append(" dc=");
                        sb5.append(i10);
                        sb5.append(" send reqId ");
                        sb5.append(requestInfo.requestToken);
                        sb5.append(" offset=");
                        sb5.append(requestInfo.offset);
                        sb5.append(" conType=");
                        sb5.append(i6);
                        sb5.append(" priority=");
                        ChatObject$Call$$ExternalSyntheticOutline0.m(sb5, r0.priority);
                    }
                    AndroidUtilities.runOnUIThread(new FileLoadOperation$$ExternalSyntheticLambda0(r0, iSendRequestSync5, 3));
                    i11 = 1;
                    r0.requestsCount++;
                    i3 += i11;
                    j14 = j8;
                    i13 = 2;
                    z5 = true;
                    r0 = r0;
                    r9 = z2;
                }
                i11 = 1;
                i3 += i11;
                j14 = j8;
                i13 = 2;
                z5 = true;
                r0 = r0;
                r9 = z2;
            }
        }
    }

    public void updateProgress() {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            long j = this.downloadedBytes;
            long j2 = this.totalBytesCount;
            if (j == j2 || j2 <= 0) {
                return;
            }
            fileLoadOperationDelegate.didChangedLoadProgress(this, j, j2);
        }
    }

    public boolean wasStarted() {
        return this.started && !this.paused;
    }

    private void cancel(boolean z) {
        Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda13(this, z, 1));
    }

    public boolean start(final FileLoadOperationStream fileLoadOperationStream, final long j, final boolean z) {
        long j2;
        String strM;
        String strM2;
        String strM3;
        String strM4;
        String strM5;
        String strM6;
        String strM7;
        String str;
        int i;
        boolean z2;
        boolean z3;
        long j3;
        int i2;
        long j4;
        ?? r6;
        boolean z4;
        long j5;
        RandomAccessFile randomAccessFile;
        this.startTime = System.currentTimeMillis();
        updateParams();
        if (this.currentDownloadChunkSize == 0) {
            if (this.forceSmallChunk) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: restart with small chunk");
                }
                this.currentDownloadChunkSize = 32768;
                this.currentMaxDownloadRequests = 4;
            } else if (this.isStory) {
                this.currentDownloadChunkSize = this.downloadChunkSizeBig;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsBig;
            } else if (this.isStream) {
                this.currentDownloadChunkSize = this.downloadChunkSizeAnimation;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsAnimation;
            } else {
                boolean z5 = this.totalBytesCount >= ((long) this.bigFileSizeFrom);
                this.currentDownloadChunkSize = z5 ? this.downloadChunkSizeBig : this.downloadChunkSize;
                this.currentMaxDownloadRequests = z5 ? this.maxDownloadRequestsBig : this.maxDownloadRequests;
            }
        }
        final boolean z6 = this.state != 0;
        boolean z7 = this.paused;
        this.paused = false;
        if (fileLoadOperationStream != null) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$start$9(z, j, fileLoadOperationStream, z6);
                }
            });
        } else if (z6) {
            Utilities.stageQueue.postRunnable(new FileLoadOperation$$ExternalSyntheticLambda4(this, 2));
        }
        if (z6) {
            return z7;
        }
        if (this.location == null && this.webLocation == null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("loadOperation: no location, failing");
            }
            onFail(true, 0);
            return false;
        }
        long j6 = this.currentDownloadChunkSize;
        this.streamStartOffset = (j / j6) * j6;
        if (this.allowDisordererFileSave) {
            long j7 = this.totalBytesCount;
            if (j7 > 0 && j7 > j6) {
                this.notLoadedBytesRanges = new ArrayList<>();
                this.notRequestedBytesRanges = new ArrayList<>();
            }
        }
        if (this.webLocation != null) {
            String strMD5 = Utilities.MD5(this.webFile.url);
            if (this.encryptFile) {
                String strM8 = zzhr.m(strMD5, ".temp.enc");
                strM2 = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(Log.m(strMD5, "."), this.ext, ".enc");
                if (this.key != null) {
                    strM3 = zzhr.m(strMD5, "_64.iv.enc");
                    strM = strM8;
                    j2 = 0;
                } else {
                    strM = strM8;
                    j2 = 0;
                    strM3 = null;
                }
            } else {
                String strM9 = zzhr.m(strMD5, ".temp");
                StringBuilder sbM = Log.m(strMD5, ".");
                sbM.append(this.ext);
                String string = sbM.toString();
                if (this.key != null) {
                    strM3 = zzhr.m(strMD5, "_64.iv");
                    strM = strM9;
                    j2 = 0;
                    strM2 = string;
                } else {
                    strM = strM9;
                    j2 = 0;
                    strM2 = string;
                    strM3 = null;
                }
            }
            strM4 = null;
            str = null;
        } else {
            TLRPC.InputFileLocation inputFileLocation = this.location;
            long j8 = inputFileLocation.volume_id;
            j2 = 0;
            if (j8 == 0 || inputFileLocation.local_id == 0) {
                if (this.datacenterId == 0 || inputFileLocation.id == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.datacenterId);
                    sb.append("_");
                    strM6 = SurfaceContainer$$ExternalSyntheticOutline0.m(sb, this.location.id, ".temp.enc");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.datacenterId);
                    sb2.append("_");
                    sb2.append(this.location.id);
                    strM2 = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb2, this.ext, ".enc");
                    if (this.key != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.datacenterId);
                        sb3.append("_");
                        strM7 = SurfaceContainer$$ExternalSyntheticOutline0.m(sb3, this.location.id, "_64.iv.enc");
                        String str2 = strM6;
                        strM3 = strM7;
                        strM = str2;
                        strM4 = null;
                        str = null;
                    }
                    strM = strM6;
                    strM3 = null;
                    strM4 = null;
                    str = null;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.datacenterId);
                    sb4.append("_");
                    strM = SurfaceContainer$$ExternalSyntheticOutline0.m(sb4, this.location.id, ".temp");
                    strM2 = this.datacenterId + "_" + this.location.id + this.ext;
                    if (this.key != null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(this.datacenterId);
                        sb5.append("_");
                        strM3 = SurfaceContainer$$ExternalSyntheticOutline0.m(sb5, this.location.id, "_64.iv");
                    } else {
                        strM3 = null;
                    }
                    if (this.notLoadedBytesRanges != null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(this.datacenterId);
                        sb6.append("_");
                        strM4 = SurfaceContainer$$ExternalSyntheticOutline0.m(sb6, this.location.id, "_64.pt");
                    } else {
                        strM4 = null;
                    }
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(this.datacenterId);
                    sb7.append("_");
                    strM5 = SurfaceContainer$$ExternalSyntheticOutline0.m(sb7, this.location.id, "_64.preload");
                    str = strM5;
                }
            } else {
                int i3 = this.datacenterId;
                if (i3 == Integer.MIN_VALUE || j8 == -2147483648L || i3 == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(this.location.volume_id);
                    sb8.append("_");
                    strM6 = SurfaceContainer$$ExternalSyntheticOutline0.m(this.location.local_id, ".temp.enc", sb8);
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(this.location.volume_id);
                    sb9.append("_");
                    sb9.append(this.location.local_id);
                    sb9.append(".");
                    strM2 = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb9, this.ext, ".enc");
                    if (this.key != null) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(this.location.volume_id);
                        sb10.append("_");
                        strM7 = SurfaceContainer$$ExternalSyntheticOutline0.m(this.location.local_id, "_64.iv.enc", sb10);
                        String str3 = strM6;
                        strM3 = strM7;
                        strM = str3;
                        strM4 = null;
                        str = null;
                    }
                    strM = strM6;
                    strM3 = null;
                    strM4 = null;
                    str = null;
                } else {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(this.location.volume_id);
                    sb11.append("_");
                    strM = SurfaceContainer$$ExternalSyntheticOutline0.m(this.location.local_id, ".temp", sb11);
                    strM2 = this.location.volume_id + "_" + this.location.local_id + "." + this.ext;
                    if (this.key != null) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append(this.location.volume_id);
                        sb12.append("_");
                        strM3 = SurfaceContainer$$ExternalSyntheticOutline0.m(this.location.local_id, "_64.iv", sb12);
                    } else {
                        strM3 = null;
                    }
                    if (this.notLoadedBytesRanges != null) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(this.location.volume_id);
                        sb13.append("_");
                        strM4 = SurfaceContainer$$ExternalSyntheticOutline0.m(this.location.local_id, "_64.pt", sb13);
                    } else {
                        strM4 = null;
                    }
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(this.location.volume_id);
                    sb14.append("_");
                    strM5 = SurfaceContainer$$ExternalSyntheticOutline0.m(this.location.local_id, "_64.preload", sb14);
                    str = strM5;
                }
            }
        }
        this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
        this.cancelledRequestInfos = new ArrayList<>();
        this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
        this.state = 1;
        Object obj = this.parentObject;
        if (obj instanceof TLRPC.TL_theme) {
            this.cacheFileFinal = new File(ApplicationLoader.getFilesDirFixed(), SurfaceContainer$$ExternalSyntheticOutline0.m(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).id, ".attheme"));
        } else if (this.encryptFile) {
            this.cacheFileFinal = new File(this.storePath, strM2);
        } else {
            this.cacheFileFinal = new File(this.storePath, this.storeFileName);
        }
        boolean zExists = this.cacheFileFinal.exists();
        this.cacheFileFinalReady = zExists;
        if (zExists) {
            if (!(this.parentObject instanceof TLRPC.TL_theme)) {
                long j9 = this.totalBytesCount;
                if (j9 != j2 && !this.ungzip && j9 != this.cacheFileFinal.length()) {
                    if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                        }
                        if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                            this.cacheFileFinal.delete();
                        }
                        zExists = false;
                    }
                }
            } else if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                }
                if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                    this.cacheFileFinal.delete();
                }
                zExists = false;
            }
        }
        if (zExists) {
            this.started = true;
            try {
                onFinishLoadingFile(false, 1, false);
                FilePathDatabase.PathData pathData = this.pathSaveData;
                if (pathData == null) {
                    return true;
                }
                this.delegate.saveFilePath(pathData, this.cacheFileFinal);
                return true;
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
                if (AndroidUtilities.isENOSPC(e)) {
                    LaunchActivity launchActivity = LaunchActivity.staticInstanceForAlerts;
                    z2 = true;
                    if (launchActivity != null) {
                        launchActivity.checkFreeDiscSpace(1);
                    }
                    i = -1;
                    onFail(true, -1);
                } else {
                    i = -1;
                    z2 = true;
                }
                if (!AndroidUtilities.isEROFS(e)) {
                    onFail(z2, 0);
                    return z2;
                }
                SharedConfig.checkSdCard(this.cacheFileFinal);
                onFail(z2, i);
                return false;
            }
        }
        this.cacheFileTemp = new File(this.tempPath, strM);
        if (this.ungzip) {
            this.cacheFileGzipTemp = new File(this.tempPath, zzhr.m(strM, ".gz"));
        }
        if (this.encryptFile) {
            File file = new File(FileLoader.getInternalCacheDir(), zzhr.m(strM2, ".key"));
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rws");
                long length = file.length();
                byte[] bArr = new byte[32];
                this.encryptKey = bArr;
                this.encryptIv = new byte[16];
                if (length <= j2 || length % 48 != j2) {
                    Utilities.random.nextBytes(bArr);
                    Utilities.random.nextBytes(this.encryptIv);
                    randomAccessFile2.write(this.encryptKey);
                    randomAccessFile2.write(this.encryptIv);
                    z3 = true;
                } else {
                    randomAccessFile2.read(bArr, 0, 32);
                    randomAccessFile2.read(this.encryptIv, 0, 16);
                    z3 = false;
                }
                try {
                    try {
                        randomAccessFile2.getChannel().close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    randomAccessFile2.close();
                } catch (Exception e3) {
                    e = e3;
                    if (AndroidUtilities.isENOSPC(e)) {
                        LaunchActivity launchActivity2 = LaunchActivity.staticInstanceForAlerts;
                        if (launchActivity2 != null) {
                            launchActivity2.checkFreeDiscSpace(1);
                        }
                        FileLog.e((Throwable) e, false);
                    } else if (AndroidUtilities.isEROFS(e)) {
                        SharedConfig.checkSdCard(this.cacheFileFinal);
                        FileLog.e((Throwable) e, false);
                    } else {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e4) {
                e = e4;
                z3 = false;
            }
        } else {
            z3 = false;
        }
        boolean[] zArr = {false};
        long j10 = 8;
        if (!this.supportsPreloading || str == null) {
            z3 = z3;
            j3 = 8;
            i2 = 1;
            j4 = 2;
        } else {
            this.cacheFilePreload = new File(this.tempPath, str);
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.cacheFilePreload, "rws");
                this.preloadStream = randomAccessFile3;
                long length2 = randomAccessFile3.length();
                this.preloadStreamFileOffset = 1;
                long j11 = 1;
                if (length2 <= 1) {
                    z3 = z3;
                    j3 = j10;
                    i2 = 1;
                    j4 = 2;
                    this.preloadStream.seek(this.preloadStreamFileOffset);
                    if (!this.isPreloadVideoOperation && this.preloadedBytesRanges == null) {
                        this.cacheFilePreload = null;
                        try {
                            randomAccessFile = this.preloadStream;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.getChannel().close();
                                } catch (Exception e5) {
                                    FileLog.e(e5);
                                }
                                this.preloadStream.close();
                                this.preloadStream = null;
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                } else {
                    zArr[0] = this.preloadStream.readByte() != 0;
                    while (true) {
                        if (j11 < length2 && length2 - j11 >= j10) {
                            long j12 = this.preloadStream.readLong();
                            if (length2 - (j11 + j10) >= j10 && j12 >= j2) {
                                j4 = 2;
                                try {
                                    if (j12 <= this.totalBytesCount) {
                                        long j13 = this.preloadStream.readLong();
                                        long j14 = j11 + 16;
                                        if (length2 - j14 >= j13 && j13 <= this.currentDownloadChunkSize) {
                                            PreloadRange preloadRange = new PreloadRange(j14, j13);
                                            long j15 = j14 + j13;
                                            this.preloadStream.seek(j15);
                                            if (length2 - j15 >= 24) {
                                                j3 = j10;
                                                try {
                                                    long j16 = this.preloadStream.readLong();
                                                    this.foundMoovSize = j16;
                                                    if (j16 != j2) {
                                                        i2 = 1;
                                                        try {
                                                            z3 = z3;
                                                            try {
                                                                this.moovFound = this.nextPreloadDownloadOffset > this.totalBytesCount / 2 ? 2 : 1;
                                                                this.preloadNotRequestedBytesCount = j16;
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                            }
                                                        } catch (Exception e8) {
                                                            e = e8;
                                                            z3 = z3;
                                                        }
                                                    } else {
                                                        z3 = z3;
                                                        i2 = 1;
                                                    }
                                                    this.nextPreloadDownloadOffset = this.preloadStream.readLong();
                                                    this.nextAtomOffset = this.preloadStream.readLong();
                                                    long j17 = j15 + 24;
                                                    if (this.preloadedBytesRanges == null) {
                                                        this.preloadedBytesRanges = new HashMap<>();
                                                    }
                                                    if (this.requestedPreloadedBytesRanges == null) {
                                                        this.requestedPreloadedBytesRanges = new HashMap<>();
                                                    }
                                                    this.preloadedBytesRanges.put(Long.valueOf(j12), preloadRange);
                                                    this.requestedPreloadedBytesRanges.put(Long.valueOf(j12), Integer.valueOf(i2));
                                                    this.totalPreloadedBytes = (int) (((long) this.totalPreloadedBytes) + j13);
                                                    this.preloadStreamFileOffset = (int) (j13 + 36 + ((long) this.preloadStreamFileOffset));
                                                    j10 = j3;
                                                    z3 = z3;
                                                    j11 = j17;
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    i2 = 1;
                                                }
                                            }
                                            e = e7;
                                            FileLog.e((Throwable) e, false);
                                            if (!this.isPreloadVideoOperation) {
                                                this.cacheFilePreload = null;
                                                randomAccessFile = this.preloadStream;
                                                if (randomAccessFile != null) {
                                                    randomAccessFile.getChannel().close();
                                                    this.preloadStream.close();
                                                    this.preloadStream = null;
                                                }
                                            }
                                        }
                                    }
                                    z3 = z3;
                                    j3 = j10;
                                    i2 = 1;
                                    this.preloadStream.seek(this.preloadStreamFileOffset);
                                } catch (Exception e10) {
                                    e = e10;
                                    j3 = j10;
                                }
                                if (!this.isPreloadVideoOperation) {
                                    this.cacheFilePreload = null;
                                    randomAccessFile = this.preloadStream;
                                    if (randomAccessFile != null) {
                                        randomAccessFile.getChannel().close();
                                        this.preloadStream.close();
                                        this.preloadStream = null;
                                    }
                                }
                            }
                        }
                        z3 = z3;
                        j3 = j10;
                        i2 = 1;
                        j4 = 2;
                        this.preloadStream.seek(this.preloadStreamFileOffset);
                        if (!this.isPreloadVideoOperation) {
                            this.cacheFilePreload = null;
                            randomAccessFile = this.preloadStream;
                            if (randomAccessFile != null) {
                                randomAccessFile.getChannel().close();
                                this.preloadStream.close();
                                this.preloadStream = null;
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e = e11;
                z3 = z3;
                j3 = j10;
                i2 = 1;
                j4 = 2;
            }
        }
        if (strM4 != null) {
            this.cacheFileParts = new File(this.tempPath, strM4);
            if (!this.cacheFileTemp.exists()) {
                this.cacheFileParts.delete();
            }
            try {
                RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.cacheFileParts, "rws");
                this.filePartsStream = randomAccessFile4;
                long length3 = randomAccessFile4.length();
                if (length3 % j3 == 4) {
                    int i4 = this.filePartsStream.readInt();
                    if (i4 <= (length3 - 4) / j4) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            long j18 = this.filePartsStream.readLong();
                            long j19 = this.filePartsStream.readLong();
                            this.notLoadedBytesRanges.add(new Range(j18, j19));
                            this.notRequestedBytesRanges.add(new Range(j18, j19));
                        }
                    }
                }
            } catch (Exception e12) {
                FileLog.e(e12, (AndroidUtilities.isFilNotFoundException(e12) ? 1 : 0) ^ i2);
            }
        }
        if (this.fileMetadata != null) {
            FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
            FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
        }
        if (!this.cacheFileTemp.exists()) {
            ArrayList<Range> arrayList = this.notLoadedBytesRanges;
            if (arrayList != null && arrayList.isEmpty()) {
                long j20 = 0;
                this.notLoadedBytesRanges.add(new Range(j20, this.totalBytesCount));
                this.notRequestedBytesRanges.add(new Range(j20, this.totalBytesCount));
            }
        } else if (z3) {
            this.cacheFileTemp.delete();
        } else {
            long length4 = this.cacheFileTemp.length();
            if (strM3 == null || length4 % ((long) this.currentDownloadChunkSize) == j2) {
                long jFloorDiv = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * ((long) this.currentDownloadChunkSize);
                this.downloadedBytes = jFloorDiv;
                this.requestedBytesCount = jFloorDiv;
            } else {
                this.requestedBytesCount = j2;
            }
            ArrayList<Range> arrayList2 = this.notLoadedBytesRanges;
            if (arrayList2 != null && arrayList2.isEmpty()) {
                this.notLoadedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                this.notRequestedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
            }
        }
        ArrayList<Range> arrayList3 = this.notLoadedBytesRanges;
        if (arrayList3 != null) {
            this.downloadedBytes = this.totalBytesCount;
            int size = arrayList3.size();
            for (int i6 = 0; i6 < size; i6++) {
                Range range = this.notLoadedBytesRanges.get(i6);
                this.downloadedBytes -= range.end - range.start;
            }
            this.requestedBytesCount = this.downloadedBytes;
        }
        if (BuildVars.LOGS_ENABLED) {
            if (this.isPreloadVideoOperation) {
                FileLog.d("start preloading file to temp = " + this.cacheFileTemp);
            } else {
                StringBuilder sb15 = new StringBuilder("start loading file to temp = ");
                sb15.append(this.cacheFileTemp);
                sb15.append(" final = ");
                sb15.append(this.cacheFileFinal);
                sb15.append(" priority");
                ChatObject$Call$$ExternalSyntheticOutline0.m(sb15, this.priority);
            }
        }
        if (strM3 != null) {
            this.cacheIvTemp = new File(this.tempPath, strM3);
            try {
                this.fiv = new RandomAccessFile(this.cacheIvTemp, "rws");
                if (this.downloadedBytes != 0 && !z3) {
                    long length5 = this.cacheIvTemp.length();
                    if (length5 <= 0) {
                        j5 = 0;
                    } else if (length5 % 64 == 0) {
                        this.fiv.read(this.iv, 0, 64);
                    } else {
                        j5 = 0;
                    }
                    this.downloadedBytes = j5;
                    this.requestedBytesCount = j5;
                }
            } catch (Exception e13) {
                this.downloadedBytes = 0L;
                this.requestedBytesCount = 0L;
                if (AndroidUtilities.isENOSPC(e13)) {
                    LaunchActivity launchActivity3 = LaunchActivity.staticInstanceForAlerts;
                    if (launchActivity3 != null) {
                        launchActivity3.checkFreeDiscSpace(i2);
                    }
                    FileLog.e((Throwable) e13, false);
                } else if (AndroidUtilities.isEROFS(e13)) {
                    SharedConfig.checkSdCard(this.cacheFileFinal);
                    FileLog.e((Throwable) e13, false);
                } else {
                    FileLog.e(e13);
                }
            }
        }
        if (!this.isPreloadVideoOperation && this.downloadedBytes != 0 && this.totalBytesCount > 0) {
            copyNotLoadedRanges();
        }
        updateProgress();
        try {
            RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.cacheFileTemp, "rws");
            this.fileOutputStream = randomAccessFile5;
            long j21 = this.downloadedBytes;
            if (j21 != 0) {
                randomAccessFile5.seek(j21);
            }
            r6 = 0;
            z4 = true;
        } catch (Exception e14) {
            r6 = 0;
            FileLog.e((Throwable) e14, false);
            if (AndroidUtilities.isENOSPC(e14)) {
                LaunchActivity launchActivity4 = LaunchActivity.staticInstanceForAlerts;
                if (launchActivity4 != null) {
                    launchActivity4.checkFreeDiscSpace(1);
                }
                onFail(true, -1);
                return false;
            }
            z4 = true;
            if (AndroidUtilities.isEROFS(e14)) {
                SharedConfig.checkSdCard(this.cacheFileFinal);
                FileLog.e((Throwable) e14, false);
                onFail(true, -1);
                return false;
            }
        }
        if (this.fileOutputStream == null) {
            onFail(z4, r6);
            return r6;
        }
        this.started = z4;
        Utilities.stageQueue.postRunnable(new FileLog$$ExternalSyntheticLambda3(4, this, zArr));
        return z4;
    }

    public long[] getDownloadedLengthFromOffset(long j, long j2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? r2 = new long[2];
        Utilities.stageQueue.postRunnable(new MediaController$$ExternalSyntheticLambda8(this, (Serializable) r2, j, j2, countDownLatch, 1));
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return r2;
    }

    public FileLoadOperation(SecureDocument secureDocument) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new FileLoadOperation$$ExternalSyntheticLambda4(this, 5);
        updateParams();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.location = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.datacenterId = tL_secureFile.dc_id;
        this.totalBytesCount = tL_secureFile.size;
        this.allowDisordererFileSave = true;
        this.currentType = 67108864;
        this.ext = ".jpg";
    }

    public FileLoadOperation(int i, WebFile webFile) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new FileLoadOperation$$ExternalSyntheticLambda4(this, 5);
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
            this.currentType = 16777216;
        } else if (webFile.mime_type.equals("audio/ogg")) {
            this.currentType = 50331648;
        } else if (webFile.mime_type.startsWith("video/")) {
            this.currentType = 33554432;
        } else {
            this.currentType = 67108864;
        }
        this.allowDisordererFileSave = true;
        this.ext = ImageLoader.getHttpUrlExtension(webFile.url, mimeTypePart);
    }

    public FileLoadOperation(TLRPC.Document document, Object obj) {
        int iLastIndexOf;
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new FileLoadOperation$$ExternalSyntheticLambda4(this, 5);
        updateParams();
        try {
            this.parentObject = obj;
            this.isStory = obj instanceof TL_stories.TL_storyItem;
            this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.location = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.id = document.id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i = document.dc_id;
                this.datacenterId = i;
                this.initialDatacenterId = i;
                byte[] bArr = new byte[32];
                this.iv = bArr;
                System.arraycopy(document.iv, 0, bArr, 0, 32);
                this.key = document.key;
            } else if (document instanceof TLRPC.TL_document) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j = document.id;
                tL_inputDocumentFileLocation.id = j;
                this.documentId = j;
                tL_inputDocumentFileLocation.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocumentFileLocation.file_reference = bArr2;
                tL_inputDocumentFileLocation.thumb_size = "";
                if (bArr2 == null) {
                    tL_inputDocumentFileLocation.file_reference = new byte[0];
                }
                int i2 = document.dc_id;
                this.datacenterId = i2;
                this.initialDatacenterId = i2;
                this.allowDisordererFileSave = true;
                int size = document.attributes.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.supportsPreloading = true;
                        this.preloadPrefixSize = document.attributes.get(i3).preload_prefix_size;
                        break;
                    }
                }
            }
            this.ungzip = "application/x-tgsticker".equals(document.mime_type) || "application/x-tgwallpattern".equals(document.mime_type);
            long j2 = document.size;
            this.totalBytesCount = j2;
            if (this.key != null && j2 % 16 != 0) {
                long j3 = 16 - (j2 % 16);
                this.bytesCountPadding = j3;
                this.totalBytesCount = j2 + j3;
            }
            String documentFileName = FileLoader.getDocumentFileName(document);
            this.ext = documentFileName;
            if (documentFileName != null && (iLastIndexOf = documentFileName.lastIndexOf(46)) != -1) {
                this.ext = this.ext.substring(iLastIndexOf);
            } else {
                this.ext = "";
            }
            if ("audio/ogg".equals(document.mime_type)) {
                this.currentType = 50331648;
            } else if (FileLoader.isVideoMimeType(document.mime_type)) {
                this.currentType = 33554432;
            } else {
                this.currentType = 67108864;
            }
            if (this.ext.length() <= 1) {
                this.ext = FileLoader.getExtensionByMimeType(document.mime_type);
            }
        } catch (Exception e) {
            FileLog.e(e);
            onFail(true, 0);
        }
    }
}
