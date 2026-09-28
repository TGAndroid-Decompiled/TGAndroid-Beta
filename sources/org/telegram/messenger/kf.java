package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f16840a;
    public final MessagesStorage f16841b;
    public final long f16842c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f16840a = i10;
        this.f16841b = messagesStorage;
        this.f16842c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16840a) {
            case 0:
                this.f16841b.lambda$deleteStoryPushMessage$39(this.f16842c);
                return;
            case 1:
                this.f16841b.lambda$clearUserPhotos$92(this.f16842c);
                return;
            case 2:
                this.f16841b.lambda$removeAllTopics$56(this.f16842c);
                return;
            case 3:
                this.f16841b.lambda$deleteWallpaper$79(this.f16842c);
                return;
            case 4:
                this.f16841b.lambda$deleteSavedDialog$55(this.f16842c);
                return;
            case 5:
                this.f16841b.lambda$onDeleteQueryComplete$91(this.f16842c);
                return;
            case 6:
                this.f16841b.lambda$removePendingTask$11(this.f16842c);
                return;
            default:
                this.f16841b.lambda$loadChannelAdmins$123(this.f16842c);
                return;
        }
    }
}
