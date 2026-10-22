package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f19056a;
    public final MessagesStorage f19057b;
    public final long f19058c;

    public nf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f19056a = i10;
        this.f19057b = messagesStorage;
        this.f19058c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19056a) {
            case 0:
                this.f19057b.lambda$deleteStoryPushMessage$39(this.f19058c);
                return;
            case 1:
                this.f19057b.lambda$clearUserPhotos$92(this.f19058c);
                return;
            case 2:
                this.f19057b.lambda$removeAllTopics$56(this.f19058c);
                return;
            case 3:
                this.f19057b.lambda$deleteWallpaper$79(this.f19058c);
                return;
            case 4:
                this.f19057b.lambda$deleteSavedDialog$55(this.f19058c);
                return;
            case 5:
                this.f19057b.lambda$onDeleteQueryComplete$91(this.f19058c);
                return;
            case 6:
                this.f19057b.lambda$removePendingTask$11(this.f19058c);
                return;
            default:
                this.f19057b.lambda$loadChannelAdmins$123(this.f19058c);
                return;
        }
    }
}
