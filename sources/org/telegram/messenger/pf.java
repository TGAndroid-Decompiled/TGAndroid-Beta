package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f18114a;
    public final MessagesStorage f18115b;
    public final long f18116c;

    public pf(int i10, long j10, MessagesStorage messagesStorage) {
        this.f18114a = i10;
        this.f18115b = messagesStorage;
        this.f18116c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18114a) {
            case 0:
                this.f18115b.lambda$deleteStoryPushMessage$39(this.f18116c);
                return;
            case 1:
                this.f18115b.lambda$clearUserPhotos$92(this.f18116c);
                return;
            case 2:
                this.f18115b.lambda$removeAllTopics$56(this.f18116c);
                return;
            case 3:
                this.f18115b.lambda$deleteWallpaper$79(this.f18116c);
                return;
            case 4:
                this.f18115b.lambda$deleteSavedDialog$55(this.f18116c);
                return;
            case 5:
                this.f18115b.lambda$onDeleteQueryComplete$91(this.f18116c);
                return;
            case 6:
                this.f18115b.lambda$removePendingTask$11(this.f18116c);
                return;
            default:
                this.f18115b.lambda$loadChannelAdmins$123(this.f18116c);
                return;
        }
    }
}
