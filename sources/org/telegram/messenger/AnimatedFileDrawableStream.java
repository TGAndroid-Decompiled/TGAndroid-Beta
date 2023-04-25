package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC$Document;
public class AnimatedFileDrawableStream implements FileLoadOperationStream {
    private volatile boolean canceled;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    private int debugCanceledCount;
    private boolean debugReportSend;
    private TLRPC$Document document;
    private String finishedFilePath;
    private boolean finishedLoadingFile;
    private long lastOffset;
    private final FileLoadOperation loadOperation;
    private int loadingPriority;
    private ImageLocation location;
    private Object parentObject;
    private boolean preview;
    private final Object sync = new Object();
    private boolean waitingForLoad;

    public AnimatedFileDrawableStream(TLRPC$Document tLRPC$Document, ImageLocation imageLocation, Object obj, int i, boolean z, int i2) {
        this.document = tLRPC$Document;
        this.location = imageLocation;
        this.parentObject = obj;
        this.currentAccount = i;
        this.preview = z;
        this.loadingPriority = i2;
        this.loadOperation = FileLoader.getInstance(i).loadStreamFile(this, this.document, this.location, this.parentObject, 0L, this.preview, i2);
    }

    public boolean isFinishedLoadingFile() {
        return this.finishedLoadingFile;
    }

    public String getFinishedFilePath() {
        return this.finishedFilePath;
    }

    public int read(int i, int i2) {
        long j;
        long[] downloadedLengthFromOffset;
        long j2;
        synchronized (this.sync) {
            if (this.canceled) {
                int i3 = this.debugCanceledCount + 1;
                this.debugCanceledCount = i3;
                if (!this.debugReportSend && i3 > 200) {
                    this.debugReportSend = true;
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        throw new RuntimeException("infinity stream reading!!!");
                    }
                    FileLog.e(new RuntimeException("infinity stream reading!!!"));
                }
                return 0;
            } else if (i2 == 0) {
                return 0;
            } else {
                long j3 = 0;
                while (j3 == 0) {
                    try {
                        j = i;
                        downloadedLengthFromOffset = this.loadOperation.getDownloadedLengthFromOffset(j, i2);
                        j2 = downloadedLengthFromOffset[0];
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        if (!this.finishedLoadingFile && downloadedLengthFromOffset[1] != 0) {
                            this.finishedLoadingFile = true;
                            this.finishedFilePath = this.loadOperation.getCacheFileFinal().getAbsolutePath();
                        }
                        if (j2 == 0) {
                            synchronized (this.sync) {
                                if (this.canceled) {
                                    cancelLoadingInternal();
                                    return 0;
                                }
                                if (this.loadOperation.isPaused() || this.lastOffset != j || this.preview) {
                                    FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, this.location, this.parentObject, j, this.preview, this.loadingPriority);
                                }
                                synchronized (this.sync) {
                                    if (this.canceled) {
                                        cancelLoadingInternal();
                                        return 0;
                                    }
                                    this.countDownLatch = new CountDownLatch(1);
                                }
                                if (!this.preview) {
                                    FileLoader.getInstance(this.currentAccount).setLoadingVideo(this.document, false, true);
                                }
                                this.waitingForLoad = true;
                                this.countDownLatch.await();
                                this.waitingForLoad = false;
                            }
                        }
                        j3 = j2;
                    } catch (Exception e2) {
                        e = e2;
                        j3 = j2;
                        FileLog.e((Throwable) e, false);
                        return (int) j3;
                    }
                }
                this.lastOffset = i + j3;
                return (int) j3;
            }
        }
    }

    public void cancel() {
        cancel(true);
    }

    public void cancel(boolean z) {
        if (this.canceled) {
            return;
        }
        synchronized (this.sync) {
            CountDownLatch countDownLatch = this.countDownLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                if (z && !this.canceled && !this.preview) {
                    FileLoader.getInstance(this.currentAccount).removeLoadingVideo(this.document, false, true);
                }
            }
            if (z) {
                cancelLoadingInternal();
            }
            this.canceled = true;
        }
    }

    private void cancelLoadingInternal() {
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.document);
        if (this.location != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.location.location, "mp4");
        }
    }

    public void reset() {
        synchronized (this.sync) {
            this.canceled = false;
        }
    }

    public TLRPC$Document getDocument() {
        return this.document;
    }

    public ImageLocation getLocation() {
        return this.location;
    }

    public Object getParentObject() {
        return this.document;
    }

    public boolean isPreview() {
        return this.preview;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public boolean isWaitingForLoad() {
        return this.waitingForLoad;
    }

    @Override
    public void newDataAvailable() {
        CountDownLatch countDownLatch = this.countDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public boolean isCanceled() {
        return this.canceled;
    }
}
