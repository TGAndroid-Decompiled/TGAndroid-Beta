package org.telegram.messenger;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
public class FileLoadOperation {
    private static final int FINISH_CODE_DEFAULT = 0;
    private static final int FINISH_CODE_FILE_ALREADY_EXIST = 1;
    public static ff.d0 filesQueueByteBuffer = null;
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
        void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j10, long j11);

        void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i9);

        void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file);

        void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file);

        boolean hasAnotherRefOnFile(String str);

        boolean isLocallyCreatedFile(String str);

        void saveFilePath(FilePathDatabase.PathData pathData, File file);
    }

    public static class PreloadRange {
        private long fileOffset;
        private long length;

        private PreloadRange(long j10, long j11) {
            this.fileOffset = j10;
            this.length = j11;
        }
    }

    public static class Range {
        private long end;
        private long start;

        public String toString() {
            return "Range{start=" + this.start + ", end=" + this.end + '}';
        }

        private Range(long j10, long j11) {
            this.start = j10;
            this.end = j11;
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

    public FileLoadOperation(ImageLocation imageLocation, Object obj, String str, long j10) {
        boolean z10 = false;
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / 131072);
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new o2(this, 5);
        updateParams();
        this.parentObject = obj;
        this.isStory = obj instanceof TL_stories.TL_storyItem;
        this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
        this.isStream = imageLocation.imageType == 2;
        if (imageLocation.isEncrypted()) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.location = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
            long j11 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.f22395id = j11;
            tL_inputEncryptedFileLocation.volume_id = j11;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = imageLocation.access_hash;
            byte[] bArr = new byte[32];
            this.iv = bArr;
            System.arraycopy(imageLocation.iv, 0, bArr, 0, 32);
            this.key = imageLocation.key;
        } else if (imageLocation.photoPeer != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
            long j12 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.f22395id = j12;
            tL_inputPeerPhotoFileLocation.volume_id = j12;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = imageLocation.photoId;
            tL_inputPeerPhotoFileLocation.big = imageLocation.photoPeerType == 0;
            tL_inputPeerPhotoFileLocation.peer = imageLocation.photoPeer;
            this.location = tL_inputPeerPhotoFileLocation;
        } else if (imageLocation.stickerSet != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
            long j13 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.f22395id = j13;
            tL_inputStickerSetThumb.volume_id = j13;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = imageLocation.thumbVersion;
            tL_inputStickerSetThumb.stickerset = imageLocation.stickerSet;
            this.location = tL_inputStickerSetThumb;
        } else if (imageLocation.thumbSize != null) {
            if (imageLocation.photoId != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.location = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.f22395id = imageLocation.photoId;
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
                long j14 = imageLocation.documentId;
                tL_inputDocumentFileLocation.f22395id = j14;
                this.documentId = j14;
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
        int i9 = imageLocation.imageType;
        this.ungzip = (i9 == 1 || i9 == 3) ? true : true;
        int i10 = imageLocation.dc_id;
        this.datacenterId = i10;
        this.initialDatacenterId = i10;
        this.currentType = 16777216;
        this.totalBytesCount = j10;
        this.ext = str == null ? "jpg" : str;
    }

    private void addPart(ArrayList<Range> arrayList, long j10, long j11, boolean z10) {
        long j12;
        if (arrayList != null && j11 >= j10) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i9 = 0; i9 < size; i9++) {
                Range range = arrayList.get(i9);
                if (j10 <= range.start) {
                    if (j11 >= range.end) {
                        arrayList.remove(i9);
                    } else if (j11 > range.start) {
                        range.start = j11;
                    }
                    j12 = j10;
                    z11 = true;
                    break;
                }
                if (j11 < range.end) {
                    j12 = j10;
                    arrayList.add(0, new Range(range.start, j12));
                    range.start = j11;
                } else {
                    j12 = j10;
                    if (j12 < range.end) {
                        range.end = j12;
                    }
                }
                z11 = true;
                break;
            }
            j12 = j10;
            if (z10) {
                if (z11) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (this.fileWriteRunnable != null) {
                        filesQueue.cancelRunnable(this.fileWriteRunnable);
                    }
                    synchronized (this) {
                        this.writingToFilePartsStream = true;
                    }
                    DispatchQueue dispatchQueue = filesQueue;
                    c2 c2Var = new c2(4, this, arrayList2);
                    this.fileWriteRunnable = c2Var;
                    dispatchQueue.postRunnable(c2Var);
                    notifyStreamListeners();
                } else if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j12 + " - " + j11);
                }
            }
        }
    }

    private boolean canFinishPreload() {
        if (this.isStory && this.priority < 3) {
            return true;
        }
        return false;
    }

    public void lambda$cancel$13(boolean z10) {
        if (this.state != 3 && this.state != 2) {
            this.state = 5;
            cancelRequests(new o2(this, 4));
        }
        if (z10) {
            File file = this.cacheFileFinal;
            if (file != null) {
                try {
                    if (!file.delete()) {
                        this.cacheFileFinal.deleteOnExit();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            File file2 = this.cacheFileTemp;
            if (file2 != null) {
                try {
                    if (!file2.delete()) {
                        this.cacheFileTemp.deleteOnExit();
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            File file3 = this.cacheFileParts;
            if (file3 != null) {
                try {
                    if (!file3.delete()) {
                        this.cacheFileParts.deleteOnExit();
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            File file4 = this.cacheIvTemp;
            if (file4 != null) {
                try {
                    if (!file4.delete()) {
                        this.cacheIvTemp.deleteOnExit();
                    }
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            File file5 = this.cacheFilePreload;
            if (file5 != null) {
                try {
                    if (!file5.delete()) {
                        this.cacheFilePreload.deleteOnExit();
                    }
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
            }
        }
    }

    private void cancelRequests(Runnable runnable) {
        String str;
        int i9;
        int i10;
        char c10;
        if (runnable != null) {
            str = " with callback";
        } else {
            str = "";
        }
        FileLog.d("cancelRequests".concat(str));
        if (this.requestInfos != null) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[2];
            for (int i11 = 0; i11 < this.requestInfos.size(); i11++) {
                RequestInfo requestInfo = this.requestInfos.get(i11);
                if (requestInfo.requestToken != 0) {
                    requestInfo.cancelling = true;
                    if (runnable == null) {
                        requestInfo.cancelled = true;
                        l0.n(requestInfo.requestToken, new StringBuilder("cancelRequests cancel "));
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true);
                    } else {
                        requestInfo.whenCancelled = new f0(requestInfo, iArr, runnable, 20);
                        iArr[0] = iArr[0] + 1;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken + " with callback");
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true, new n2(requestInfo, 1));
                    }
                    if (requestInfo.connectionType == 2) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    iArr2[c10] = iArr2[c10] + requestInfo.chunkSize;
                }
            }
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    i9 = 2;
                } else {
                    i9 = 65538;
                }
                if (iArr2[i12] > 1048576) {
                    if (this.isCdn) {
                        i10 = this.cdnDatacenterId;
                    } else {
                        i10 = this.datacenterId;
                    }
                    ConnectionsManager.getInstance(this.currentAccount).discardConnection(i10, i9);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.fileOutputStream.close();
                this.fileOutputStream = null;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.preloadStream;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                this.preloadStream.close();
                this.preloadStream = null;
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.fileReadStream;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                this.fileReadStream.close();
                this.fileReadStream = null;
            }
        } catch (Exception e15) {
            FileLog.e(e15);
        }
        try {
            if (this.filePartsStream != null) {
                synchronized (this) {
                    if (!this.writingToFilePartsStream) {
                        try {
                            this.filePartsStream.getChannel().close();
                        } catch (Exception e16) {
                            FileLog.e(e16);
                        }
                        this.filePartsStream.close();
                        this.filePartsStream = null;
                    } else {
                        this.closeFilePartsStreamOnWriteEnd = true;
                    }
                }
            }
        } catch (Exception e17) {
            FileLog.e(e17);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.fiv;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.fiv = null;
            }
        } catch (Exception e18) {
            FileLog.e(e18);
        }
        if (this.delayedRequestInfos != null) {
            for (int i9 = 0; i9 < this.delayedRequestInfos.size(); i9++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i9);
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

    private void clearOperation(RequestInfo requestInfo, boolean z10, boolean z11) {
        int i9;
        int i10;
        int[] iArr = new int[2];
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < this.requestInfos.size()) {
            RequestInfo requestInfo2 = this.requestInfos.get(i11);
            long min = Math.min(requestInfo2.offset, j10);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo2.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo2.offset, requestInfo2.offset + requestInfo2.chunkSize);
            }
            if (requestInfo != requestInfo2 && requestInfo2.requestToken != 0) {
                requestInfo2.cancelling = true;
                if (z11) {
                    this.cancelledRequestInfos.add(requestInfo2);
                    requestInfo2.whenCancelled = new s2(this, requestInfo2, 1);
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true, new n2(requestInfo2, 0));
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true);
                    requestInfo2.cancelled = true;
                }
            }
            i11++;
            j10 = min;
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                i9 = 2;
            } else {
                i9 = 65538;
            }
            if (iArr[i12] > 1048576) {
                if (this.isCdn) {
                    i10 = this.cdnDatacenterId;
                } else {
                    i10 = this.datacenterId;
                }
                ConnectionsManager.getInstance(this.currentAccount).discardConnection(i10, i9);
            }
        }
        this.requestInfos.clear();
        AndroidUtilities.runOnUIThread(new o2(this, 0));
        long j11 = j10;
        for (int i13 = 0; i13 < this.delayedRequestInfos.size(); i13++) {
            RequestInfo requestInfo3 = this.delayedRequestInfos.get(i13);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo3.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo3.offset, requestInfo3.offset + requestInfo3.chunkSize);
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
            j11 = Math.min(requestInfo3.offset, j11);
        }
        this.delayedRequestInfos.clear();
        this.requestsCount = 0;
        if (!z10 && this.isPreloadVideoOperation) {
            this.requestedBytesCount = this.totalPreloadedBytes;
        } else if (this.notLoadedBytesRanges == null) {
            this.downloadedBytes = j11;
            this.requestedBytesCount = j11;
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

    private long findNextPreloadDownloadOffset(long j10, long j11, NativeByteBuffer nativeByteBuffer) {
        int i9;
        long j12;
        int limit = nativeByteBuffer.limit();
        long j13 = j10;
        do {
            if (this.preloadTempBuffer != null) {
                i9 = 16;
            } else {
                i9 = 0;
            }
            if (j13 >= j11 - i9) {
                j12 = j11 + limit;
                if (j13 < j12) {
                    if (j13 >= j12 - 16) {
                        long j14 = j12 - j13;
                        if (j14 <= 2147483647L) {
                            this.preloadTempBufferCount = (int) j14;
                            nativeByteBuffer.position(nativeByteBuffer.limit() - this.preloadTempBufferCount);
                            nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, this.preloadTempBufferCount, false);
                            return j12;
                        }
                        throw new RuntimeException("!!!");
                    }
                    if (this.preloadTempBufferCount != 0) {
                        nativeByteBuffer.position(0);
                        byte[] bArr = this.preloadTempBuffer;
                        int i10 = this.preloadTempBufferCount;
                        nativeByteBuffer.readBytes(bArr, i10, 16 - i10, false);
                        this.preloadTempBufferCount = 0;
                    } else {
                        long j15 = j13 - j11;
                        if (j15 <= 2147483647L) {
                            nativeByteBuffer.position((int) j15);
                            nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, 16, false);
                        } else {
                            throw new RuntimeException("!!!");
                        }
                    }
                    byte[] bArr2 = this.preloadTempBuffer;
                    int i11 = ((bArr2[0] & 255) << 24) + ((bArr2[1] & 255) << 16) + ((bArr2[2] & 255) << 8) + (bArr2[3] & 255);
                    if (i11 == 0) {
                        return 0L;
                    }
                    if (i11 == 1) {
                        i11 = ((bArr2[12] & 255) << 24) + ((bArr2[13] & 255) << 16) + ((bArr2[14] & 255) << 8) + (bArr2[15] & 255);
                    }
                    if (bArr2[4] == 109 && bArr2[5] == 111 && bArr2[6] == 111 && bArr2[7] == 118) {
                        return -i11;
                    }
                    j13 += i11;
                }
            }
            return 0L;
        } while (j13 < j12);
        return j13;
    }

    public static long floorDiv(long j10, long j11) {
        long j12 = j10 / j11;
        if ((j10 ^ j11) < 0 && j11 * j12 != j10) {
            return j12 - 1;
        }
        return j12;
    }

    private long getDownloadedLengthFromOffsetInternal(ArrayList<Range> arrayList, long j10, long j11) {
        long j12;
        if (arrayList != null && this.state != 3 && !arrayList.isEmpty()) {
            int size = arrayList.size();
            Range range = null;
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    Range range2 = arrayList.get(i9);
                    if (j10 <= range2.start && (range == null || range2.start < range.start)) {
                        range = range2;
                    }
                    if (range2.start <= j10 && range2.end > j10) {
                        j12 = 0;
                        break;
                    }
                    i9++;
                } else {
                    j12 = j11;
                    break;
                }
            }
            if (j12 == 0) {
                return 0L;
            }
            if (range != null) {
                return Math.min(j11, range.start - j10);
            }
            return Math.min(j11, Math.max(this.totalBytesCount - j10, 0L));
        } else if (this.state == 3) {
            return j11;
        } else {
            long j13 = this.downloadedBytes;
            if (j13 == 0) {
                return 0L;
            }
            return Math.min(j11, Math.max(j13 - j10, 0L));
        }
    }

    public void lambda$addPart$2(ArrayList arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
            if (AndroidUtilities.isENOSPC(e10)) {
                LaunchActivity.E(1);
            } else if (AndroidUtilities.isEROFS(e10)) {
                SharedConfig.checkSdCard(this.cacheFileFinal);
            }
        }
        if (this.filePartsStream == null) {
            return;
        }
        int size = arrayList.size();
        int i9 = (size * 16) + 4;
        ff.d0 d0Var = filesQueueByteBuffer;
        if (d0Var == null) {
            filesQueueByteBuffer = new ff.d0(i9);
        } else {
            d0Var.b();
        }
        filesQueueByteBuffer.c(size);
        for (int i10 = 0; i10 < size; i10++) {
            Range range = (Range) arrayList.get(i10);
            filesQueueByteBuffer.d(range.start);
            filesQueueByteBuffer.d(range.end);
        }
        synchronized (this) {
            RandomAccessFile randomAccessFile = this.filePartsStream;
            if (randomAccessFile == null) {
                return;
            }
            randomAccessFile.seek(0L);
            this.filePartsStream.write(filesQueueByteBuffer.f6161a, 0, i9);
            this.writingToFilePartsStream = false;
            if (this.closeFilePartsStreamOnWriteEnd) {
                try {
                    this.filePartsStream.getChannel().close();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.filePartsStream.close();
                this.filePartsStream = null;
            }
            this.totalTime = (System.currentTimeMillis() - currentTimeMillis) + this.totalTime;
        }
    }

    public void lambda$cancelOnStage$14() {
        if (this.state == 5) {
            onFail(false, 1);
        }
    }

    public static void lambda$cancelRequests$15(RequestInfo requestInfo, int[] iArr, Runnable runnable) {
        requestInfo.whenCancelled = null;
        requestInfo.cancelled = true;
        int i9 = iArr[0] - 1;
        iArr[0] = i9;
        if (i9 == 0) {
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
        if (this.state == 3 && !this.preloadFinished) {
            fileArr[0] = this.cacheFileFinal;
        } else {
            fileArr[0] = this.cacheFileTemp;
        }
        countDownLatch.countDown();
    }

    public void lambda$getDownloadedLengthFromOffset$4(long[] r9, long r10, long r12, java.util.concurrent.CountDownLatch r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.lambda$getDownloadedLengthFromOffset$4(long[], long, long, java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$new$6() {
        pause();
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(getFileName());
    }

    public void lambda$onFail$23(int i9) {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i9);
        }
        notifyStreamListeners();
    }

    public void lambda$onFinishLoadingFile$17(boolean z10) {
        try {
            onFinishLoadingFile(z10, 0, false);
        } catch (Exception unused) {
            onFail(false, 0);
        }
    }

    public void lambda$onFinishLoadingFile$18() {
        onFail(false, 0);
    }

    public void lambda$onFinishLoadingFile$19(boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("finished downloading file to " + this.cacheFileFinal + " time = " + (System.currentTimeMillis() - this.startTime) + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
        }
        if (z10) {
            int i9 = this.currentType;
            if (i9 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            } else if (i9 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            } else if (i9 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            } else if (i9 == 67108864) {
                String str = this.ext;
                if (str != null && (str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                }
            }
        }
        this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
    }

    public void lambda$onFinishLoadingFile$20(java.io.File r5, java.io.File r6, java.io.File r7, java.io.File r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.lambda$onFinishLoadingFile$20(java.io.File, java.io.File, java.io.File, java.io.File, boolean):void");
    }

    public void lambda$pause$7() {
        if (this.isStory) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " pause operation, clear requests");
            }
            clearOperation(null, false, true);
            return;
        }
        for (int i9 = 0; i9 < this.requestInfos.size(); i9++) {
            ConnectionsManager.getInstance(this.currentAccount).failNotRunningRequest(this.requestInfos.get(i9).requestToken);
        }
    }

    public void lambda$processRequestResult$22(int i9) {
        this.uiRequestTokens.remove(Integer.valueOf(i9));
    }

    public static int lambda$removePart$1(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        if (range.start < range2.start) {
            return -1;
        }
        return 0;
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
        } else if (tLObject instanceof Vector) {
            this.requestingCdnOffsets = false;
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i9 = 0; i9 < vector.objects.size(); i9++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i9);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            for (int i10 = 0; i10 < this.delayedRequestInfos.size(); i10++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i10);
                if (this.notLoadedBytesRanges != null || this.downloadedBytes == requestInfo.offset) {
                    this.delayedRequestInfos.remove(i10);
                    if (!processRequestResult(requestInfo, null)) {
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
                    return;
                }
            }
        }
    }

    public void lambda$setIsPreloadVideoOperation$12(boolean z10) {
        this.requestedBytesCount = 0L;
        clearOperation(null, true, true);
        this.isPreloadVideoOperation = z10;
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
        if (fileLoadOperationStream != null && this.state != 1 && this.state != 0) {
            fileLoadOperationStream.newDataAvailable();
        }
    }

    public void lambda$start$10() {
        startDownloadRequest(-1);
    }

    public void lambda$start$11(boolean[] zArr) {
        boolean z10;
        boolean z11;
        if (this.isPreloadVideoOperation && zArr[0]) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i9 = this.preloadPrefixSize;
        if (i9 > 0 && this.downloadedBytes >= i9 && canFinishPreload()) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = this.totalBytesCount;
        if (j10 != 0 && (z10 || this.downloadedBytes == j10 || z11)) {
            try {
                onFinishLoadingFile(false, 1, true);
                return;
            } catch (Exception unused) {
                onFail(true, 0);
                return;
            }
        }
        startDownloadRequest(-1);
    }

    public void lambda$start$8(int i9) {
        this.uiRequestTokens.remove(Integer.valueOf(i9));
    }

    public void lambda$start$9(boolean z10, long j10, FileLoadOperationStream fileLoadOperationStream, boolean z11) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (z10) {
            long j11 = this.currentDownloadChunkSize;
            long j12 = (j10 / j11) * j11;
            RequestInfo requestInfo = this.priorityRequestInfo;
            if (requestInfo != null && requestInfo.offset != j12) {
                RequestInfo requestInfo2 = this.priorityRequestInfo;
                int i9 = requestInfo2.requestToken;
                this.requestInfos.remove(requestInfo2);
                AndroidUtilities.runOnUIThread(new m2(this, i9, 2));
                this.requestedBytesCount -= this.currentDownloadChunkSize;
                removePart(this.notRequestedBytesRanges, this.priorityRequestInfo.offset, this.priorityRequestInfo.offset + this.currentDownloadChunkSize);
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
                this.streamPriorityStartOffset = j12;
            }
        } else {
            long j13 = this.currentDownloadChunkSize;
            this.streamStartOffset = (j10 / j13) * j13;
        }
        if (!this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
            FileLog.e("FileLoadOperation " + getFileName() + " start, adding stream " + fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (z11) {
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

    public void lambda$startDownloadRequest$28(int i9, RequestInfo requestInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.reuploadingCdn = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i10);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            startDownloadRequest(i9);
        } else if (tL_error != null) {
            if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                onFail(false, 0);
                return;
            }
            this.isCdn = false;
            clearOperation(requestInfo, false, false);
            startDownloadRequest(i9);
        }
    }

    public void lambda$startDownloadRequest$29(RequestInfo requestInfo, int i9, int i10, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        byte[] bArr;
        if (requestInfo.cancelled) {
            FileLog.e("received chunk but definitely cancelled offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
            return;
        }
        if (requestInfo.cancelling) {
            FileLog.e("received cancelled chunk after cancelRequests! offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
        }
        if (!this.requestInfos.contains(requestInfo)) {
            if (this.cancelledRequestInfos.contains(requestInfo)) {
                int i11 = 0;
                boolean z10 = false;
                while (i11 < this.requestInfos.size()) {
                    RequestInfo requestInfo2 = this.requestInfos.get(i11);
                    if (requestInfo2 != null && requestInfo2 != requestInfo && requestInfo2.offset == requestInfo.offset && requestInfo2.chunkSize == requestInfo.chunkSize) {
                        FileLog.e("received cancelled chunk faster than new one! received=" + requestInfo.requestToken + " new=" + requestInfo2.requestToken);
                        if (!z10) {
                            this.requestInfos.set(i11, requestInfo);
                            z10 = true;
                        } else {
                            this.requestInfos.remove(i11);
                            i11--;
                        }
                    }
                    i11++;
                }
            } else {
                return;
            }
        }
        int i12 = 0;
        while (i12 < this.cancelledRequestInfos.size()) {
            RequestInfo requestInfo3 = this.cancelledRequestInfos.get(i12);
            if (requestInfo3 != null && requestInfo3 != requestInfo && requestInfo3.offset == requestInfo.offset && requestInfo3.chunkSize == requestInfo.chunkSize) {
                FileLog.e("received new chunk faster than cancelled one! received=" + requestInfo.requestToken + " cancelled=" + requestInfo3.requestToken);
                this.cancelledRequestInfos.remove(i12);
                i12 += -1;
            }
            i12++;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("debug_loading: ");
            sb2.append(this.cacheFileFinal.getName());
            sb2.append(" time=");
            sb2.append(System.currentTimeMillis() - requestInfo.requestStartTime);
            sb2.append(" dcId=");
            sb2.append(i9);
            sb2.append(" cdn=");
            sb2.append(this.isCdn);
            sb2.append(" conType=");
            sb2.append(i10);
            sb2.append(" reqId");
            l0.n(requestInfo.requestToken, sb2);
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
                this.requestedBytesCount -= requestInfo.chunkSize;
                removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + requestInfo.chunkSize);
                return;
            } else if (FileRefController.isFileRefError(tL_error.text)) {
                requestReference(requestInfo);
                return;
            } else if ((tLObject instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                this.isCdn = false;
                clearOperation(requestInfo, false, false);
                startDownloadRequest(i10);
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_upload_fileCdnRedirect) {
            TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject2;
            if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i13 = 0; i13 < tL_upload_fileCdnRedirect.file_hashes.size(); i13++) {
                    TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i13);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
            if (bArr2 != null && (bArr = tL_upload_fileCdnRedirect.encryption_key) != null && bArr2.length == 16 && bArr.length == 32) {
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
                startDownloadRequest(i10);
                return;
            }
            Runnable runnable2 = requestInfo.whenCancelled;
            if (runnable2 != null) {
                runnable2.run();
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "bad redirect response";
            tL_error2.code = 400;
            processRequestResult(requestInfo, tL_error2);
        } else if (tLObject2 instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
            if (!this.reuploadingCdn) {
                clearOperation(requestInfo, false, false);
                this.reuploadingCdn = true;
                TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
                tL_upload_reuploadCdnFile.file_token = this.cdnToken;
                tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject2).request_token;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_reuploadCdnFile, new sa(this, i10, requestInfo, 1), null, null, 0, this.datacenterId, 1, true);
            }
        } else {
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
                int i14 = this.currentType;
                if (i14 == 50331648) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
                } else if (i14 == 33554432) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
                } else if (i14 == 16777216) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
                } else if (i14 == 67108864) {
                    String str = this.ext;
                    if (str != null && (str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                        StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 7, tLObject2.getObjectSize() + 4);
                    } else {
                        StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                    }
                }
            }
            processRequestResult(requestInfo, tL_error);
            Runnable runnable3 = requestInfo.whenCancelled;
            if (runnable3 != null) {
                runnable3.run();
            }
        }
    }

    public void lambda$startDownloadRequest$30(int i9) {
        this.uiRequestTokens.add(Integer.valueOf(i9));
    }

    private void notifyStreamListeners() {
        ArrayList<FileLoadOperationStream> arrayList = this.streamListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                this.streamListeners.get(i9).newDataAvailable();
            }
        }
    }

    private void onFinishLoadingFile(boolean z10, int i9, boolean z11) {
        if (this.state != 1 && this.state != 5) {
            return;
        }
        this.state = 3;
        notifyStreamListeners();
        cleanup();
        if (!this.isPreloadVideoOperation && !z11) {
            filesQueue.postRunnable(new h3.p1(this, this.cacheIvTemp, this.cacheFileParts, this.cacheFilePreload, this.cacheFileTemp, z10, 3));
            this.cacheIvTemp = null;
            this.cacheFileParts = null;
            this.cacheFilePreload = null;
            this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
            return;
        }
        this.preloadFinished = true;
        if (BuildVars.DEBUG_VERSION) {
            if (i9 == 1) {
                FileLog.d("file already exist " + this.cacheFileTemp);
            } else {
                StringBuilder sb2 = new StringBuilder("finished preloading file to ");
                sb2.append(this.cacheFileTemp);
                sb2.append(" loaded ");
                sb2.append(this.downloadedBytes);
                sb2.append(" of ");
                sb2.append(this.totalBytesCount);
                sb2.append(" prefSize=");
                l0.n(this.preloadPrefixSize, sb2);
            }
        }
        if (this.fileMetadata != null) {
            if (this.cacheFileTemp != null) {
                FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new hh.a(this.cacheFileTemp)));
            }
            if (this.cacheFileParts != null) {
                FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new hh.a(this.cacheFileParts)));
            }
        }
        this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
        this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
    }

    private void removePart(ArrayList<Range> arrayList, long j10, long j11) {
        boolean z10;
        if (arrayList != null && j11 >= j10) {
            int size = arrayList.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Range range = arrayList.get(i10);
                if (j10 == range.end) {
                    range.end = j11;
                } else if (j11 == range.start) {
                    range.start = j10;
                }
                z10 = true;
            }
            z10 = false;
            Collections.sort(arrayList, new q(5));
            while (i9 < arrayList.size() - 1) {
                Range range2 = arrayList.get(i9);
                int i11 = i9 + 1;
                Range range3 = arrayList.get(i11);
                if (range2.end == range3.start) {
                    range2.end = range3.end;
                    arrayList.remove(i11);
                    i9--;
                }
                i9++;
            }
            if (!z10) {
                arrayList.add(new Range(j10, j11));
            }
        }
    }

    private void requestFileOffsets(long j10) {
        if (this.requestingCdnOffsets) {
            return;
        }
        this.requestingCdnOffsets = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.cdnToken;
        tL_upload_getCdnFileHashes.offset = j10;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_getCdnFileHashes, new g0(this, 3), null, null, 0, this.datacenterId, 1, true);
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
        this.maxCdnParts = (int) (2097152000 / this.downloadChunkSizeBig);
    }

    public void cancel() {
        cancel(false);
    }

    public boolean checkPrefixPreloadFinished() {
        int i9 = this.preloadPrefixSize;
        if (i9 > 0 && this.downloadedBytes > i9) {
            ArrayList<Range> arrayList = this.notLoadedBytesRanges;
            if (arrayList == null) {
                return true;
            }
            long j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    j10 = Math.min(j10, arrayList.get(i10).start);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return true;
                }
            }
            if (j10 > this.preloadPrefixSize) {
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
        Utilities.stageQueue.postRunnable(new f0(this, fileArr, countDownLatch, 19));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return fileArr[0];
    }

    public File getCurrentFileFast() {
        if (this.state == 3 && !this.preloadFinished && this.cacheFileFinalReady) {
            return this.cacheFileFinal;
        }
        return this.cacheFileTemp;
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

    public float getDownloadedLengthFromOffset(float f10) {
        ArrayList<Range> arrayList = this.notLoadedBytesRangesCopy;
        long j10 = this.totalBytesCount;
        if (j10 == 0 || arrayList == null) {
            return 0.0f;
        }
        return (((float) getDownloadedLengthFromOffsetInternal(arrayList, (int) (((float) j10) * f10), j10)) / ((float) this.totalBytesCount)) + f10;
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
        if (this.state == 3) {
            return true;
        }
        return false;
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

    public void onFail(boolean z10, int i9) {
        int i10;
        cleanup();
        if (i9 == 1) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        this.state = i10;
        if (this.delegate != null && BuildVars.LOGS_ENABLED) {
            long j10 = 0;
            if (this.startTime != 0) {
                j10 = System.currentTimeMillis() - this.startTime;
            }
            if (i9 == 1) {
                FileLog.d("cancel downloading file to " + this.cacheFileFinal + " time = " + j10 + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            } else {
                FileLog.d("failed downloading file to " + this.cacheFileFinal + " reason = " + i9 + " time = " + j10 + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            }
        }
        if (z10) {
            Utilities.stageQueue.postRunnable(new m2(this, i9, 0));
            return;
        }
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i9);
        }
        notifyStreamListeners();
    }

    public void pause() {
        if (this.state != 1) {
            return;
        }
        this.paused = true;
        Utilities.stageQueue.postRunnable(new o2(this, 2));
    }

    public boolean processRequestResult(org.telegram.messenger.FileLoadOperation.RequestInfo r46, org.telegram.tgnet.TLRPC.TL_error r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.processRequestResult(org.telegram.messenger.FileLoadOperation$RequestInfo, org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public void removeStreamListener(FileLoadOperationStream fileLoadOperationStream) {
        Utilities.stageQueue.postRunnable(new q2(this, fileLoadOperationStream, 0));
    }

    public void setDelegate(FileLoadOperationDelegate fileLoadOperationDelegate) {
        this.delegate = fileLoadOperationDelegate;
    }

    public void setEncryptFile(boolean z10) {
        this.encryptFile = z10;
        if (z10) {
            this.allowDisordererFileSave = false;
        }
    }

    public void setForceRequest(boolean z10) {
        this.isForceRequest = z10;
    }

    public void setIsPreloadVideoOperation(boolean z10) {
        if (this.isPreloadVideoOperation != z10) {
            if (!z10 || this.totalBytesCount > 2097152) {
                FileLog.e("setIsPreloadVideoOperation " + z10 + " file=" + this.fileName);
                if (!z10 && this.isPreloadVideoOperation) {
                    if (this.state == 3) {
                        this.isPreloadVideoOperation = z10;
                        this.state = 0;
                        this.preloadFinished = false;
                        start();
                        return;
                    } else if (this.state == 1) {
                        Utilities.stageQueue.postRunnable(new p2(this, z10, 0));
                        return;
                    } else {
                        this.isPreloadVideoOperation = z10;
                        return;
                    }
                }
                this.isPreloadVideoOperation = z10;
            }
        }
    }

    public void setPaths(int i9, String str, FileLoaderPriorityQueue fileLoaderPriorityQueue, File file, File file2, String str2) {
        this.storePath = file;
        this.tempPath = file2;
        this.currentAccount = i9;
        this.fileName = str;
        this.storeFileName = str2;
        this.priorityQueue = fileLoaderPriorityQueue;
    }

    public void setPriority(int i9) {
        this.priority = i9;
    }

    public void setStream(FileLoadOperationStream fileLoadOperationStream, boolean z10, long j10) {
        this.stream = fileLoadOperationStream;
        this.streamOffset = j10;
        this.streamPriority = z10;
        Utilities.stageQueue.postRunnable(new q2(this, fileLoadOperationStream, 1));
    }

    public boolean start() {
        return start(this.stream, this.streamOffset, this.streamPriority);
    }

    public void startDownloadRequest(int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.startDownloadRequest(int):void");
    }

    public void updateProgress() {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            long j10 = this.downloadedBytes;
            long j11 = this.totalBytesCount;
            if (j10 != j11 && j11 > 0) {
                fileLoadOperationDelegate.didChangedLoadProgress(this, j10, j11);
            }
        }
    }

    public boolean wasStarted() {
        if (this.started && !this.paused) {
            return true;
        }
        return false;
    }

    private void cancel(boolean z10) {
        Utilities.stageQueue.postRunnable(new p2(this, z10, 1));
    }

    public boolean start(final org.telegram.messenger.FileLoadOperationStream r31, final long r32, final boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.start(org.telegram.messenger.FileLoadOperationStream, long, boolean):boolean");
    }

    public long[] getDownloadedLengthFromOffset(long j10, long j11) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? r22 = new long[2];
        Utilities.stageQueue.postRunnable(new bg.x0(this, (Serializable) r22, j10, j11, countDownLatch, 1));
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return r22;
    }

    public FileLoadOperation(SecureDocument secureDocument) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / 131072);
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new o2(this, 5);
        updateParams();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.location = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        tL_inputSecureFileLocation.f22395id = tL_secureFile.f22515id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.datacenterId = tL_secureFile.dc_id;
        this.totalBytesCount = tL_secureFile.size;
        this.allowDisordererFileSave = true;
        this.currentType = 67108864;
        this.ext = ".jpg";
    }

    public FileLoadOperation(int i9, WebFile webFile) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / 131072);
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new o2(this, 5);
        updateParams();
        this.currentAccount = i9;
        this.webFile = webFile;
        this.webLocation = webFile.location;
        this.totalBytesCount = webFile.size;
        int i10 = MessagesController.getInstance(i9).webFileDatacenterId;
        this.datacenterId = i10;
        this.initialDatacenterId = i10;
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

    public FileLoadOperation(org.telegram.tgnet.TLRPC.Document r12, java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoadOperation.<init>(org.telegram.tgnet.TLRPC$Document, java.lang.Object):void");
    }
}
