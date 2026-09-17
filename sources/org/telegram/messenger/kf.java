package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18228a;
    public final MessagesStorage f18229b;
    public final long f18230c;

    public kf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f18228a = i10;
        this.f18229b = messagesStorage;
        this.f18230c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18228a) {
            case 0:
                this.f18229b.lambda$deleteStoryPushMessage$39(this.f18230c);
                return;
            case 1:
                this.f18229b.lambda$clearUserPhotos$92(this.f18230c);
                return;
            case 2:
                this.f18229b.lambda$removeAllTopics$56(this.f18230c);
                return;
            case 3:
                this.f18229b.lambda$deleteWallpaper$79(this.f18230c);
                return;
            case 4:
                this.f18229b.lambda$deleteSavedDialog$55(this.f18230c);
                return;
            case 5:
                this.f18229b.lambda$onDeleteQueryComplete$91(this.f18230c);
                return;
            case 6:
                this.f18229b.lambda$removePendingTask$11(this.f18230c);
                return;
            default:
                this.f18229b.lambda$loadChannelAdmins$123(this.f18230c);
                return;
        }
    }
}
