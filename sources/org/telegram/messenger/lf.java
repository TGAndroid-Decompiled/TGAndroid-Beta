package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f16691a;
    public final MessagesStorage f16692b;
    public final long f16693c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f16691a = i10;
        this.f16692b = messagesStorage;
        this.f16693c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16691a) {
            case 0:
                this.f16692b.lambda$deleteStoryPushMessage$39(this.f16693c);
                return;
            case 1:
                this.f16692b.lambda$clearUserPhotos$92(this.f16693c);
                return;
            case 2:
                this.f16692b.lambda$removeAllTopics$56(this.f16693c);
                return;
            case 3:
                this.f16692b.lambda$deleteWallpaper$79(this.f16693c);
                return;
            case 4:
                this.f16692b.lambda$deleteSavedDialog$55(this.f16693c);
                return;
            case 5:
                this.f16692b.lambda$onDeleteQueryComplete$91(this.f16693c);
                return;
            case 6:
                this.f16692b.lambda$removePendingTask$11(this.f16693c);
                return;
            default:
                this.f16692b.lambda$loadChannelAdmins$123(this.f16693c);
                return;
        }
    }
}
