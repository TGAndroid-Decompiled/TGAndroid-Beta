package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16839a;
    public final MessagesStorage f16840b;
    public final long f16841c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f16839a = i10;
        this.f16840b = messagesStorage;
        this.f16841c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16839a) {
            case 0:
                this.f16840b.lambda$deleteStoryPushMessage$39(this.f16841c);
                return;
            case 1:
                this.f16840b.lambda$clearUserPhotos$92(this.f16841c);
                return;
            case 2:
                this.f16840b.lambda$removeAllTopics$56(this.f16841c);
                return;
            case 3:
                this.f16840b.lambda$deleteWallpaper$79(this.f16841c);
                return;
            case 4:
                this.f16840b.lambda$deleteSavedDialog$55(this.f16841c);
                return;
            case 5:
                this.f16840b.lambda$onDeleteQueryComplete$91(this.f16841c);
                return;
            case 6:
                this.f16840b.lambda$removePendingTask$11(this.f16841c);
                return;
            default:
                this.f16840b.lambda$loadChannelAdmins$123(this.f16841c);
                return;
        }
    }
}
