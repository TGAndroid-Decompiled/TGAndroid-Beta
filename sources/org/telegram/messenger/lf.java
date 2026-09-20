package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f16901a;
    public final MessagesStorage f16902b;
    public final long f16903c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f16901a = i10;
        this.f16902b = messagesStorage;
        this.f16903c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16901a) {
            case 0:
                this.f16902b.lambda$deleteStoryPushMessage$39(this.f16903c);
                return;
            case 1:
                this.f16902b.lambda$clearUserPhotos$92(this.f16903c);
                return;
            case 2:
                this.f16902b.lambda$removeAllTopics$56(this.f16903c);
                return;
            case 3:
                this.f16902b.lambda$deleteWallpaper$79(this.f16903c);
                return;
            case 4:
                this.f16902b.lambda$deleteSavedDialog$55(this.f16903c);
                return;
            case 5:
                this.f16902b.lambda$onDeleteQueryComplete$91(this.f16903c);
                return;
            case 6:
                this.f16902b.lambda$removePendingTask$11(this.f16903c);
                return;
            default:
                this.f16902b.lambda$loadChannelAdmins$123(this.f16903c);
                return;
        }
    }
}
