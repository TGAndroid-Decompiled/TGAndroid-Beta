package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f18281a;
    public final MessagesStorage f18282b;
    public final long f18283c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f18281a = i10;
        this.f18282b = messagesStorage;
        this.f18283c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18281a) {
            case 0:
                this.f18282b.lambda$deleteStoryPushMessage$39(this.f18283c);
                return;
            case 1:
                this.f18282b.lambda$clearUserPhotos$92(this.f18283c);
                return;
            case 2:
                this.f18282b.lambda$removeAllTopics$56(this.f18283c);
                return;
            case 3:
                this.f18282b.lambda$deleteWallpaper$79(this.f18283c);
                return;
            case 4:
                this.f18282b.lambda$deleteSavedDialog$55(this.f18283c);
                return;
            case 5:
                this.f18282b.lambda$onDeleteQueryComplete$91(this.f18283c);
                return;
            case 6:
                this.f18282b.lambda$removePendingTask$11(this.f18283c);
                return;
            default:
                this.f18282b.lambda$loadChannelAdmins$123(this.f18283c);
                return;
        }
    }
}
