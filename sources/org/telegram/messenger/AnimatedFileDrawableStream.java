package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC$Document;

public class AnimatedFileDrawableStream implements FileLoadOperationStream {
    private volatile boolean canceled;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    private TLRPC$Document document;
    private String finishedFilePath;
    private boolean finishedLoadingFile;
    private boolean ignored;
    private long lastOffset;
    private FileLoadOperation loadOperation;
    private ImageLocation location;
    private Object parentObject;
    private boolean preview;
    private final Object sync = new Object();
    private boolean waitingForLoad;

    public AnimatedFileDrawableStream(TLRPC$Document tLRPC$Document, ImageLocation imageLocation, Object obj, int i, boolean z) {
        this.document = tLRPC$Document;
        this.location = imageLocation;
        this.parentObject = obj;
        this.currentAccount = i;
        this.preview = z;
        this.loadOperation = FileLoader.getInstance(i).loadStreamFile(this, this.document, this.location, this.parentObject, 0, this.preview);
    }

    public boolean isFinishedLoadingFile() {
        return this.finishedLoadingFile;
    }

    public String getFinishedFilePath() {
        return this.finishedFilePath;
    }

    public int read(int i, int i2) {
        synchronized (this.sync) {
            if (this.canceled) {
                return 0;
            }
            if (i2 == 0) {
                return 0;
            }
            long j = 0;
            while (j == 0) {
                try {
                    long[] downloadedLengthFromOffset = this.loadOperation.getDownloadedLengthFromOffset(i, i2);
                    long j2 = downloadedLengthFromOffset[0];
                    try {
                        if (!this.finishedLoadingFile && downloadedLengthFromOffset[1] != 0) {
                            this.finishedLoadingFile = true;
                            this.finishedFilePath = this.loadOperation.getCacheFileFinal().getAbsolutePath();
                        }
                        if (j2 == 0) {
                            if (this.loadOperation.isPaused() || this.lastOffset != i || this.preview) {
                                FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, this.location, this.parentObject, i, this.preview);
                            }
                            synchronized (this.sync) {
                                if (this.canceled) {
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
                        j = j2;
                    } catch (Exception e) {
                        e = e;
                        j = j2;
                        FileLog.e((Throwable) e, false);
                        return (int) j;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            this.lastOffset = i + j;
            return (int) j;
        }
    }

    public void cancel() {
        cancel(true);
    }

    public void cancel(boolean z) {
        synchronized (this.sync) {
            CountDownLatch countDownLatch = this.countDownLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                if (z && !this.canceled && !this.preview) {
                    FileLoader.getInstance(this.currentAccount).removeLoadingVideo(this.document, false, true);
                }
            }
            this.canceled = true;
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
}
