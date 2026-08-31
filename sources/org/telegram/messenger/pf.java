package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f19693a;
    public final MessagesStorage f19694b;
    public final long f19695c;

    public pf(int i10, long j10, MessagesStorage messagesStorage) {
        this.f19693a = i10;
        this.f19694b = messagesStorage;
        this.f19695c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19693a) {
            case 0:
                this.f19694b.lambda$deleteStoryPushMessage$39(this.f19695c);
                return;
            case 1:
                this.f19694b.lambda$clearUserPhotos$92(this.f19695c);
                return;
            case 2:
                this.f19694b.lambda$removeAllTopics$56(this.f19695c);
                return;
            case 3:
                this.f19694b.lambda$deleteWallpaper$79(this.f19695c);
                return;
            case 4:
                this.f19694b.lambda$deleteSavedDialog$55(this.f19695c);
                return;
            case 5:
                this.f19694b.lambda$onDeleteQueryComplete$91(this.f19695c);
                return;
            case 6:
                this.f19694b.lambda$removePendingTask$11(this.f19695c);
                return;
            default:
                this.f19694b.lambda$loadChannelAdmins$123(this.f19695c);
                return;
        }
    }
}
