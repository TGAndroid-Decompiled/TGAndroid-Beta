package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18378a;
    public final MessagesStorage f18379b;
    public final long f18380c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18378a = i10;
        this.f18379b = messagesStorage;
        this.f18380c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18378a) {
            case 0:
                this.f18379b.lambda$deleteStoryPushMessage$39(this.f18380c);
                return;
            case 1:
                this.f18379b.lambda$clearUserPhotos$92(this.f18380c);
                return;
            case 2:
                this.f18379b.lambda$removeAllTopics$56(this.f18380c);
                return;
            case 3:
                this.f18379b.lambda$deleteWallpaper$79(this.f18380c);
                return;
            case 4:
                this.f18379b.lambda$deleteSavedDialog$55(this.f18380c);
                return;
            case 5:
                this.f18379b.lambda$onDeleteQueryComplete$91(this.f18380c);
                return;
            case 6:
                this.f18379b.lambda$removePendingTask$11(this.f18380c);
                return;
            default:
                this.f18379b.lambda$loadChannelAdmins$123(this.f18380c);
                return;
        }
    }
}
