package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f19048a;
    public final MessagesStorage f19049b;
    public final long f19050c;

    public mf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f19048a = i10;
        this.f19049b = messagesStorage;
        this.f19050c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19048a) {
            case 0:
                this.f19049b.lambda$deleteStoryPushMessage$39(this.f19050c);
                return;
            case 1:
                this.f19049b.lambda$clearUserPhotos$92(this.f19050c);
                return;
            case 2:
                this.f19049b.lambda$removeAllTopics$56(this.f19050c);
                return;
            case 3:
                this.f19049b.lambda$deleteWallpaper$79(this.f19050c);
                return;
            case 4:
                this.f19049b.lambda$deleteSavedDialog$55(this.f19050c);
                return;
            case 5:
                this.f19049b.lambda$onDeleteQueryComplete$91(this.f19050c);
                return;
            case 6:
                this.f19049b.lambda$removePendingTask$11(this.f19050c);
                return;
            default:
                this.f19049b.lambda$loadChannelAdmins$123(this.f19050c);
                return;
        }
    }
}
