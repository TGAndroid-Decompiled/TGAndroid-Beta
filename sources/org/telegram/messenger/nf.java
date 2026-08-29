package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f21072a;
    public final MessagesStorage f21073b;
    public final long f21074c;

    public nf(int i10, long j10, MessagesStorage messagesStorage) {
        this.f21072a = i10;
        this.f21073b = messagesStorage;
        this.f21074c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21072a) {
            case 0:
                this.f21073b.lambda$deleteStoryPushMessage$39(this.f21074c);
                return;
            case 1:
                this.f21073b.lambda$clearUserPhotos$92(this.f21074c);
                return;
            case 2:
                this.f21073b.lambda$removeAllTopics$56(this.f21074c);
                return;
            case 3:
                this.f21073b.lambda$deleteWallpaper$79(this.f21074c);
                return;
            case 4:
                this.f21073b.lambda$deleteSavedDialog$55(this.f21074c);
                return;
            case 5:
                this.f21073b.lambda$onDeleteQueryComplete$91(this.f21074c);
                return;
            case 6:
                this.f21073b.lambda$removePendingTask$11(this.f21074c);
                return;
            default:
                this.f21073b.lambda$loadChannelAdmins$123(this.f21074c);
                return;
        }
    }
}
