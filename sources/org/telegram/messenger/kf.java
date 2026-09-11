package org.telegram.messenger;
public final class kf implements Runnable {
    public final int f18201a;
    public final MessagesStorage f18202b;
    public final long f18203c;

    public kf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f18201a = i10;
        this.f18202b = messagesStorage;
        this.f18203c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18201a) {
            case 0:
                this.f18202b.lambda$deleteStoryPushMessage$39(this.f18203c);
                return;
            case 1:
                this.f18202b.lambda$clearUserPhotos$92(this.f18203c);
                return;
            case 2:
                this.f18202b.lambda$removeAllTopics$56(this.f18203c);
                return;
            case 3:
                this.f18202b.lambda$deleteWallpaper$79(this.f18203c);
                return;
            case 4:
                this.f18202b.lambda$deleteSavedDialog$55(this.f18203c);
                return;
            case 5:
                this.f18202b.lambda$onDeleteQueryComplete$91(this.f18203c);
                return;
            case 6:
                this.f18202b.lambda$removePendingTask$11(this.f18203c);
                return;
            default:
                this.f18202b.lambda$loadChannelAdmins$123(this.f18203c);
                return;
        }
    }
}
