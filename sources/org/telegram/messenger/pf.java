package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f18136a;
    public final MessagesStorage f18137b;
    public final long f18138c;

    public pf(int i10, long j10, MessagesStorage messagesStorage) {
        this.f18136a = i10;
        this.f18137b = messagesStorage;
        this.f18138c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18136a) {
            case 0:
                this.f18137b.lambda$deleteStoryPushMessage$39(this.f18138c);
                return;
            case 1:
                this.f18137b.lambda$clearUserPhotos$92(this.f18138c);
                return;
            case 2:
                this.f18137b.lambda$removeAllTopics$56(this.f18138c);
                return;
            case 3:
                this.f18137b.lambda$deleteWallpaper$79(this.f18138c);
                return;
            case 4:
                this.f18137b.lambda$deleteSavedDialog$55(this.f18138c);
                return;
            case 5:
                this.f18137b.lambda$onDeleteQueryComplete$91(this.f18138c);
                return;
            case 6:
                this.f18137b.lambda$removePendingTask$11(this.f18138c);
                return;
            default:
                this.f18137b.lambda$loadChannelAdmins$123(this.f18138c);
                return;
        }
    }
}
