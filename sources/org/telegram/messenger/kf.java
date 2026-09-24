package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16823a;
    public final MessagesStorage f16824b;
    public final long f16825c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f16823a = i10;
        this.f16824b = messagesStorage;
        this.f16825c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16823a) {
            case 0:
                this.f16824b.lambda$deleteStoryPushMessage$39(this.f16825c);
                return;
            case 1:
                this.f16824b.lambda$clearUserPhotos$92(this.f16825c);
                return;
            case 2:
                this.f16824b.lambda$removeAllTopics$56(this.f16825c);
                return;
            case 3:
                this.f16824b.lambda$deleteWallpaper$79(this.f16825c);
                return;
            case 4:
                this.f16824b.lambda$deleteSavedDialog$55(this.f16825c);
                return;
            case 5:
                this.f16824b.lambda$onDeleteQueryComplete$91(this.f16825c);
                return;
            case 6:
                this.f16824b.lambda$removePendingTask$11(this.f16825c);
                return;
            default:
                this.f16824b.lambda$loadChannelAdmins$123(this.f16825c);
                return;
        }
    }
}
