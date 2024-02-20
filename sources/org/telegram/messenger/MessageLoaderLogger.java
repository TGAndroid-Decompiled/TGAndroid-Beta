package org.telegram.messenger;
public class MessageLoaderLogger {
    final int count;
    final long dialogId;
    long getFromDatabaseTime;
    final int loadIndex;
    long moveToStageQueueTime;
    long moveToStorageQueueTime;
    boolean reload;
    long stageQueueProccessing;
    final long startTime = System.currentTimeMillis();

    public MessageLoaderLogger(long j, int i, int i2) {
        this.dialogId = j;
        this.count = i2;
        this.loadIndex = i;
    }

    public void logStorageQueuePost() {
        this.moveToStorageQueueTime = System.currentTimeMillis() - this.startTime;
    }

    public void logStorageProccessing() {
        this.getFromDatabaseTime = System.currentTimeMillis() - this.startTime;
    }

    public void logStageQueuePost() {
        this.moveToStageQueueTime = System.currentTimeMillis() - this.startTime;
    }

    public void reload() {
        this.reload = true;
    }

    public void logStageQueueProcessing() {
        this.stageQueueProccessing = System.currentTimeMillis() - this.startTime;
    }

    public void finish() {
        long currentTimeMillis = System.currentTimeMillis() - this.startTime;
        FileLog.d("MessageLoaderLogger dialogId=" + this.dialogId + " index=" + this.loadIndex + " count=" + this.count + "  moveToStorageQueueTime=" + this.moveToStorageQueueTime + " getFromDatabaseTime=" + this.getFromDatabaseTime + " moveToStageQueueTime=" + this.moveToStageQueueTime + " stageQueueProccessing=" + this.stageQueueProccessing + " wasReload=" + this.reload + " totalTime=" + currentTimeMillis);
    }
}
