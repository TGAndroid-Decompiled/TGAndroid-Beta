package org.telegram.messenger;
public final class tf implements Runnable {
    public final int f16413a;
    public final MessagesStorage f16414b;
    public final long f16415c;

    public tf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f16413a = i10;
        this.f16414b = messagesStorage;
        this.f16415c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16413a) {
            case 0:
                this.f16414b.lambda$deleteStoryPushMessage$39(this.f16415c);
                return;
            case 1:
                this.f16414b.lambda$clearUserPhotos$92(this.f16415c);
                return;
            case 2:
                this.f16414b.lambda$removeAllTopics$56(this.f16415c);
                return;
            case 3:
                this.f16414b.lambda$deleteWallpaper$79(this.f16415c);
                return;
            case 4:
                this.f16414b.lambda$deleteSavedDialog$55(this.f16415c);
                return;
            case 5:
                this.f16414b.lambda$onDeleteQueryComplete$91(this.f16415c);
                return;
            case 6:
                this.f16414b.lambda$removePendingTask$11(this.f16415c);
                return;
            default:
                this.f16414b.lambda$loadChannelAdmins$123(this.f16415c);
                return;
        }
    }
}
