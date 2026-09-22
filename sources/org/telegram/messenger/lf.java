package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f16678a;
    public final MessagesStorage f16679b;
    public final long f16680c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f16678a = i10;
        this.f16679b = messagesStorage;
        this.f16680c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16678a) {
            case 0:
                this.f16679b.lambda$deleteStoryPushMessage$39(this.f16680c);
                return;
            case 1:
                this.f16679b.lambda$clearUserPhotos$92(this.f16680c);
                return;
            case 2:
                this.f16679b.lambda$removeAllTopics$56(this.f16680c);
                return;
            case 3:
                this.f16679b.lambda$deleteWallpaper$79(this.f16680c);
                return;
            case 4:
                this.f16679b.lambda$deleteSavedDialog$55(this.f16680c);
                return;
            case 5:
                this.f16679b.lambda$onDeleteQueryComplete$91(this.f16680c);
                return;
            case 6:
                this.f16679b.lambda$removePendingTask$11(this.f16680c);
                return;
            default:
                this.f16679b.lambda$loadChannelAdmins$123(this.f16680c);
                return;
        }
    }
}
