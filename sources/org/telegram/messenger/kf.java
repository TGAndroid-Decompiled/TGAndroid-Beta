package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16838a;
    public final MessagesStorage f16839b;
    public final long f16840c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f16838a = i10;
        this.f16839b = messagesStorage;
        this.f16840c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16838a) {
            case 0:
                this.f16839b.lambda$deleteStoryPushMessage$39(this.f16840c);
                return;
            case 1:
                this.f16839b.lambda$clearUserPhotos$92(this.f16840c);
                return;
            case 2:
                this.f16839b.lambda$removeAllTopics$56(this.f16840c);
                return;
            case 3:
                this.f16839b.lambda$deleteWallpaper$79(this.f16840c);
                return;
            case 4:
                this.f16839b.lambda$deleteSavedDialog$55(this.f16840c);
                return;
            case 5:
                this.f16839b.lambda$onDeleteQueryComplete$91(this.f16840c);
                return;
            case 6:
                this.f16839b.lambda$removePendingTask$11(this.f16840c);
                return;
            default:
                this.f16839b.lambda$loadChannelAdmins$123(this.f16840c);
                return;
        }
    }
}
