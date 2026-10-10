package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18363a;
    public final MessagesStorage f18364b;
    public final long f18365c;

    public kf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18363a = i10;
        this.f18364b = messagesStorage;
        this.f18365c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18363a) {
            case 0:
                this.f18364b.lambda$deleteStoryPushMessage$39(this.f18365c);
                return;
            case 1:
                this.f18364b.lambda$clearUserPhotos$92(this.f18365c);
                return;
            case 2:
                this.f18364b.lambda$removeAllTopics$56(this.f18365c);
                return;
            case 3:
                this.f18364b.lambda$deleteWallpaper$79(this.f18365c);
                return;
            case 4:
                this.f18364b.lambda$deleteSavedDialog$55(this.f18365c);
                return;
            case 5:
                this.f18364b.lambda$onDeleteQueryComplete$91(this.f18365c);
                return;
            case 6:
                this.f18364b.lambda$removePendingTask$11(this.f18365c);
                return;
            default:
                this.f18364b.lambda$loadChannelAdmins$123(this.f18365c);
                return;
        }
    }
}
