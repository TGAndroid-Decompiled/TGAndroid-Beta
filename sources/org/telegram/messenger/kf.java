package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18796a;
    public final MessagesStorage f18797b;
    public final long f18798c;

    public kf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f18796a = i10;
        this.f18797b = messagesStorage;
        this.f18798c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18796a) {
            case 0:
                this.f18797b.lambda$deleteStoryPushMessage$39(this.f18798c);
                return;
            case 1:
                this.f18797b.lambda$clearUserPhotos$92(this.f18798c);
                return;
            case 2:
                this.f18797b.lambda$removeAllTopics$56(this.f18798c);
                return;
            case 3:
                this.f18797b.lambda$deleteWallpaper$79(this.f18798c);
                return;
            case 4:
                this.f18797b.lambda$deleteSavedDialog$55(this.f18798c);
                return;
            case 5:
                this.f18797b.lambda$onDeleteQueryComplete$91(this.f18798c);
                return;
            case 6:
                this.f18797b.lambda$removePendingTask$11(this.f18798c);
                return;
            default:
                this.f18797b.lambda$loadChannelAdmins$123(this.f18798c);
                return;
        }
    }
}
