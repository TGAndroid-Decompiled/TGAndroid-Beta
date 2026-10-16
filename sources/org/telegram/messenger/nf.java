package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17656a;
    public final MessagesStorage f17657b;
    public final long f17658c;

    public nf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f17656a = i10;
        this.f17657b = messagesStorage;
        this.f17658c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17656a) {
            case 0:
                this.f17657b.lambda$deleteStoryPushMessage$39(this.f17658c);
                return;
            case 1:
                this.f17657b.lambda$clearUserPhotos$92(this.f17658c);
                return;
            case 2:
                this.f17657b.lambda$removeAllTopics$56(this.f17658c);
                return;
            case 3:
                this.f17657b.lambda$deleteWallpaper$79(this.f17658c);
                return;
            case 4:
                this.f17657b.lambda$deleteSavedDialog$55(this.f17658c);
                return;
            case 5:
                this.f17657b.lambda$onDeleteQueryComplete$91(this.f17658c);
                return;
            case 6:
                this.f17657b.lambda$removePendingTask$11(this.f17658c);
                return;
            default:
                this.f17657b.lambda$loadChannelAdmins$123(this.f17658c);
                return;
        }
    }
}
