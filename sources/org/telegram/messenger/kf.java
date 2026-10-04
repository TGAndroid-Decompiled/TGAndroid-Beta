package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18377a;
    public final MessagesStorage f18378b;
    public final long f18379c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18377a = i10;
        this.f18378b = messagesStorage;
        this.f18379c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18377a) {
            case 0:
                this.f18378b.lambda$deleteStoryPushMessage$39(this.f18379c);
                return;
            case 1:
                this.f18378b.lambda$clearUserPhotos$92(this.f18379c);
                return;
            case 2:
                this.f18378b.lambda$removeAllTopics$56(this.f18379c);
                return;
            case 3:
                this.f18378b.lambda$deleteWallpaper$79(this.f18379c);
                return;
            case 4:
                this.f18378b.lambda$deleteSavedDialog$55(this.f18379c);
                return;
            case 5:
                this.f18378b.lambda$onDeleteQueryComplete$91(this.f18379c);
                return;
            case 6:
                this.f18378b.lambda$removePendingTask$11(this.f18379c);
                return;
            default:
                this.f18378b.lambda$loadChannelAdmins$123(this.f18379c);
                return;
        }
    }
}
