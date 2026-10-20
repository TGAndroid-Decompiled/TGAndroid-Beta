package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18803a;
    public final MessagesStorage f18804b;
    public final long f18805c;

    public kf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f18803a = i10;
        this.f18804b = messagesStorage;
        this.f18805c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18803a) {
            case 0:
                this.f18804b.lambda$deleteStoryPushMessage$39(this.f18805c);
                return;
            case 1:
                this.f18804b.lambda$clearUserPhotos$92(this.f18805c);
                return;
            case 2:
                this.f18804b.lambda$removeAllTopics$56(this.f18805c);
                return;
            case 3:
                this.f18804b.lambda$deleteWallpaper$79(this.f18805c);
                return;
            case 4:
                this.f18804b.lambda$deleteSavedDialog$55(this.f18805c);
                return;
            case 5:
                this.f18804b.lambda$onDeleteQueryComplete$91(this.f18805c);
                return;
            case 6:
                this.f18804b.lambda$removePendingTask$11(this.f18805c);
                return;
            default:
                this.f18804b.lambda$loadChannelAdmins$123(this.f18805c);
                return;
        }
    }
}
