package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f19122a;
    public final MessagesStorage f19123b;
    public final long f19124c;

    public nf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f19122a = i10;
        this.f19123b = messagesStorage;
        this.f19124c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19122a) {
            case 0:
                this.f19123b.lambda$deleteStoryPushMessage$39(this.f19124c);
                return;
            case 1:
                this.f19123b.lambda$clearUserPhotos$92(this.f19124c);
                return;
            case 2:
                this.f19123b.lambda$removeAllTopics$56(this.f19124c);
                return;
            case 3:
                this.f19123b.lambda$deleteWallpaper$79(this.f19124c);
                return;
            case 4:
                this.f19123b.lambda$deleteSavedDialog$55(this.f19124c);
                return;
            case 5:
                this.f19123b.lambda$onDeleteQueryComplete$91(this.f19124c);
                return;
            case 6:
                this.f19123b.lambda$removePendingTask$11(this.f19124c);
                return;
            default:
                this.f19123b.lambda$loadChannelAdmins$123(this.f19124c);
                return;
        }
    }
}
