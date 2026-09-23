package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16583a;
    public final MessagesStorage f16584b;
    public final long f16585c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f16583a = i10;
        this.f16584b = messagesStorage;
        this.f16585c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16583a) {
            case 0:
                this.f16584b.lambda$deleteStoryPushMessage$39(this.f16585c);
                return;
            case 1:
                this.f16584b.lambda$clearUserPhotos$92(this.f16585c);
                return;
            case 2:
                this.f16584b.lambda$removeAllTopics$56(this.f16585c);
                return;
            case 3:
                this.f16584b.lambda$deleteWallpaper$79(this.f16585c);
                return;
            case 4:
                this.f16584b.lambda$deleteSavedDialog$55(this.f16585c);
                return;
            case 5:
                this.f16584b.lambda$onDeleteQueryComplete$91(this.f16585c);
                return;
            case 6:
                this.f16584b.lambda$removePendingTask$11(this.f16585c);
                return;
            default:
                this.f16584b.lambda$loadChannelAdmins$123(this.f16585c);
                return;
        }
    }
}
