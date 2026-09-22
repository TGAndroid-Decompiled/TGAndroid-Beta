package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f16916a;
    public final MessagesStorage f16917b;
    public final long f16918c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f16916a = i10;
        this.f16917b = messagesStorage;
        this.f16918c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16916a) {
            case 0:
                this.f16917b.lambda$deleteStoryPushMessage$39(this.f16918c);
                return;
            case 1:
                this.f16917b.lambda$clearUserPhotos$92(this.f16918c);
                return;
            case 2:
                this.f16917b.lambda$removeAllTopics$56(this.f16918c);
                return;
            case 3:
                this.f16917b.lambda$deleteWallpaper$79(this.f16918c);
                return;
            case 4:
                this.f16917b.lambda$deleteSavedDialog$55(this.f16918c);
                return;
            case 5:
                this.f16917b.lambda$onDeleteQueryComplete$91(this.f16918c);
                return;
            case 6:
                this.f16917b.lambda$removePendingTask$11(this.f16918c);
                return;
            default:
                this.f16917b.lambda$loadChannelAdmins$123(this.f16918c);
                return;
        }
    }
}
