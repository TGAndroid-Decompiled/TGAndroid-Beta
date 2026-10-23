package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f18984a;
    public final MessagesStorage f18985b;
    public final long f18986c;

    public mf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f18984a = i10;
        this.f18985b = messagesStorage;
        this.f18986c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18984a) {
            case 0:
                this.f18985b.lambda$deleteStoryPushMessage$39(this.f18986c);
                return;
            case 1:
                this.f18985b.lambda$clearUserPhotos$92(this.f18986c);
                return;
            case 2:
                this.f18985b.lambda$removeAllTopics$56(this.f18986c);
                return;
            case 3:
                this.f18985b.lambda$deleteWallpaper$79(this.f18986c);
                return;
            case 4:
                this.f18985b.lambda$deleteSavedDialog$55(this.f18986c);
                return;
            case 5:
                this.f18985b.lambda$onDeleteQueryComplete$91(this.f18986c);
                return;
            case 6:
                this.f18985b.lambda$removePendingTask$11(this.f18986c);
                return;
            default:
                this.f18985b.lambda$loadChannelAdmins$123(this.f18986c);
                return;
        }
    }
}
