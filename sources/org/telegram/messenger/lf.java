package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18308a;
    public final MessagesStorage f18309b;
    public final long f18310c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f18308a = i10;
        this.f18309b = messagesStorage;
        this.f18310c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18308a) {
            case 0:
                this.f18309b.lambda$deleteStoryPushMessage$39(this.f18310c);
                return;
            case 1:
                this.f18309b.lambda$clearUserPhotos$92(this.f18310c);
                return;
            case 2:
                this.f18309b.lambda$removeAllTopics$56(this.f18310c);
                return;
            case 3:
                this.f18309b.lambda$deleteWallpaper$79(this.f18310c);
                return;
            case 4:
                this.f18309b.lambda$deleteSavedDialog$55(this.f18310c);
                return;
            case 5:
                this.f18309b.lambda$onDeleteQueryComplete$91(this.f18310c);
                return;
            case 6:
                this.f18309b.lambda$removePendingTask$11(this.f18310c);
                return;
            default:
                this.f18309b.lambda$loadChannelAdmins$123(this.f18310c);
                return;
        }
    }
}
