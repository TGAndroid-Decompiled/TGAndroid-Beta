package org.telegram.messenger;
public final class ff implements Runnable {
    public final int f20290a;
    public final MessagesStorage f20291b;
    public final long f20292c;

    public ff(int i9, long j10, MessagesStorage messagesStorage) {
        this.f20290a = i9;
        this.f20291b = messagesStorage;
        this.f20292c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20290a) {
            case 0:
                this.f20291b.lambda$deleteStoryPushMessage$39(this.f20292c);
                return;
            case 1:
                this.f20291b.lambda$clearUserPhotos$92(this.f20292c);
                return;
            case 2:
                this.f20291b.lambda$removeAllTopics$56(this.f20292c);
                return;
            case 3:
                this.f20291b.lambda$deleteWallpaper$79(this.f20292c);
                return;
            case 4:
                this.f20291b.lambda$deleteSavedDialog$55(this.f20292c);
                return;
            case 5:
                this.f20291b.lambda$onDeleteQueryComplete$91(this.f20292c);
                return;
            case 6:
                this.f20291b.lambda$removePendingTask$11(this.f20292c);
                return;
            default:
                this.f20291b.lambda$loadChannelAdmins$123(this.f20292c);
                return;
        }
    }
}
