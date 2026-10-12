package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17959a;
    public final MessagesStorage f17960b;
    public final long f17961c;

    public nf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f17959a = i10;
        this.f17960b = messagesStorage;
        this.f17961c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17959a) {
            case 0:
                this.f17960b.lambda$deleteStoryPushMessage$39(this.f17961c);
                return;
            case 1:
                this.f17960b.lambda$clearUserPhotos$92(this.f17961c);
                return;
            case 2:
                this.f17960b.lambda$removeAllTopics$56(this.f17961c);
                return;
            case 3:
                this.f17960b.lambda$deleteWallpaper$79(this.f17961c);
                return;
            case 4:
                this.f17960b.lambda$deleteSavedDialog$55(this.f17961c);
                return;
            case 5:
                this.f17960b.lambda$onDeleteQueryComplete$91(this.f17961c);
                return;
            case 6:
                this.f17960b.lambda$removePendingTask$11(this.f17961c);
                return;
            default:
                this.f17960b.lambda$loadChannelAdmins$123(this.f17961c);
                return;
        }
    }
}
