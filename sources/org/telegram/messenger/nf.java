package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f20792a;
    public final MessagesStorage f20793b;
    public final long f20794c;

    public nf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f20792a = i10;
        this.f20793b = messagesStorage;
        this.f20794c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20792a) {
            case 0:
                this.f20793b.lambda$deleteStoryPushMessage$39(this.f20794c);
                return;
            case 1:
                this.f20793b.lambda$clearUserPhotos$95(this.f20794c);
                return;
            case 2:
                this.f20793b.lambda$removeAllTopics$59(this.f20794c);
                return;
            case 3:
                this.f20793b.lambda$deleteWallpaper$82(this.f20794c);
                return;
            case 4:
                this.f20793b.lambda$deleteSavedDialog$58(this.f20794c);
                return;
            case 5:
                this.f20793b.lambda$onDeleteQueryComplete$94(this.f20794c);
                return;
            case 6:
                this.f20793b.lambda$removePendingTask$11(this.f20794c);
                return;
            default:
                this.f20793b.lambda$loadChannelAdmins$127(this.f20794c);
                return;
        }
    }
}
