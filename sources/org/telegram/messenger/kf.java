package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18361a;
    public final MessagesStorage f18362b;
    public final long f18363c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18361a = i10;
        this.f18362b = messagesStorage;
        this.f18363c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18361a) {
            case 0:
                this.f18362b.lambda$deleteStoryPushMessage$39(this.f18363c);
                return;
            case 1:
                this.f18362b.lambda$clearUserPhotos$92(this.f18363c);
                return;
            case 2:
                this.f18362b.lambda$removeAllTopics$56(this.f18363c);
                return;
            case 3:
                this.f18362b.lambda$deleteWallpaper$79(this.f18363c);
                return;
            case 4:
                this.f18362b.lambda$deleteSavedDialog$55(this.f18363c);
                return;
            case 5:
                this.f18362b.lambda$onDeleteQueryComplete$91(this.f18363c);
                return;
            case 6:
                this.f18362b.lambda$removePendingTask$11(this.f18363c);
                return;
            default:
                this.f18362b.lambda$loadChannelAdmins$123(this.f18363c);
                return;
        }
    }
}
