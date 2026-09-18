package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f16859a;
    public final MessagesStorage f16860b;
    public final long f16861c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f16859a = i10;
        this.f16860b = messagesStorage;
        this.f16861c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16859a) {
            case 0:
                this.f16860b.lambda$deleteStoryPushMessage$39(this.f16861c);
                return;
            case 1:
                this.f16860b.lambda$clearUserPhotos$92(this.f16861c);
                return;
            case 2:
                this.f16860b.lambda$removeAllTopics$56(this.f16861c);
                return;
            case 3:
                this.f16860b.lambda$deleteWallpaper$79(this.f16861c);
                return;
            case 4:
                this.f16860b.lambda$deleteSavedDialog$55(this.f16861c);
                return;
            case 5:
                this.f16860b.lambda$onDeleteQueryComplete$91(this.f16861c);
                return;
            case 6:
                this.f16860b.lambda$removePendingTask$11(this.f16861c);
                return;
            default:
                this.f16860b.lambda$loadChannelAdmins$123(this.f16861c);
                return;
        }
    }
}
