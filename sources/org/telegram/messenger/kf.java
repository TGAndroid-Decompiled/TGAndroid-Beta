package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18373a;
    public final MessagesStorage f18374b;
    public final long f18375c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18373a = i10;
        this.f18374b = messagesStorage;
        this.f18375c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18373a) {
            case 0:
                this.f18374b.lambda$deleteStoryPushMessage$39(this.f18375c);
                return;
            case 1:
                this.f18374b.lambda$clearUserPhotos$92(this.f18375c);
                return;
            case 2:
                this.f18374b.lambda$removeAllTopics$56(this.f18375c);
                return;
            case 3:
                this.f18374b.lambda$deleteWallpaper$79(this.f18375c);
                return;
            case 4:
                this.f18374b.lambda$deleteSavedDialog$55(this.f18375c);
                return;
            case 5:
                this.f18374b.lambda$onDeleteQueryComplete$91(this.f18375c);
                return;
            case 6:
                this.f18374b.lambda$removePendingTask$11(this.f18375c);
                return;
            default:
                this.f18374b.lambda$loadChannelAdmins$123(this.f18375c);
                return;
        }
    }
}
