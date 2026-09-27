package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16833a;
    public final MessagesStorage f16834b;
    public final long f16835c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f16833a = i10;
        this.f16834b = messagesStorage;
        this.f16835c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16833a) {
            case 0:
                this.f16834b.lambda$deleteStoryPushMessage$39(this.f16835c);
                return;
            case 1:
                this.f16834b.lambda$clearUserPhotos$92(this.f16835c);
                return;
            case 2:
                this.f16834b.lambda$removeAllTopics$56(this.f16835c);
                return;
            case 3:
                this.f16834b.lambda$deleteWallpaper$79(this.f16835c);
                return;
            case 4:
                this.f16834b.lambda$deleteSavedDialog$55(this.f16835c);
                return;
            case 5:
                this.f16834b.lambda$onDeleteQueryComplete$91(this.f16835c);
                return;
            case 6:
                this.f16834b.lambda$removePendingTask$11(this.f16835c);
                return;
            default:
                this.f16834b.lambda$loadChannelAdmins$123(this.f16835c);
                return;
        }
    }
}
