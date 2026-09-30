package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16856a;
    public final MessagesStorage f16857b;
    public final long f16858c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f16856a = i10;
        this.f16857b = messagesStorage;
        this.f16858c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16856a) {
            case 0:
                this.f16857b.lambda$deleteStoryPushMessage$39(this.f16858c);
                return;
            case 1:
                this.f16857b.lambda$clearUserPhotos$92(this.f16858c);
                return;
            case 2:
                this.f16857b.lambda$removeAllTopics$56(this.f16858c);
                return;
            case 3:
                this.f16857b.lambda$deleteWallpaper$79(this.f16858c);
                return;
            case 4:
                this.f16857b.lambda$deleteSavedDialog$55(this.f16858c);
                return;
            case 5:
                this.f16857b.lambda$onDeleteQueryComplete$91(this.f16858c);
                return;
            case 6:
                this.f16857b.lambda$removePendingTask$11(this.f16858c);
                return;
            default:
                this.f16857b.lambda$loadChannelAdmins$123(this.f16858c);
                return;
        }
    }
}
