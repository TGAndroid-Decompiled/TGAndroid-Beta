package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18397a;
    public final MessagesStorage f18398b;
    public final long f18399c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18397a = i10;
        this.f18398b = messagesStorage;
        this.f18399c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18397a) {
            case 0:
                this.f18398b.lambda$deleteStoryPushMessage$39(this.f18399c);
                return;
            case 1:
                this.f18398b.lambda$clearUserPhotos$92(this.f18399c);
                return;
            case 2:
                this.f18398b.lambda$removeAllTopics$56(this.f18399c);
                return;
            case 3:
                this.f18398b.lambda$deleteWallpaper$79(this.f18399c);
                return;
            case 4:
                this.f18398b.lambda$deleteSavedDialog$55(this.f18399c);
                return;
            case 5:
                this.f18398b.lambda$onDeleteQueryComplete$91(this.f18399c);
                return;
            case 6:
                this.f18398b.lambda$removePendingTask$11(this.f18399c);
                return;
            default:
                this.f18398b.lambda$loadChannelAdmins$123(this.f18399c);
                return;
        }
    }
}
