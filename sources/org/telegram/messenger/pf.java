package org.telegram.messenger;
public final class pf implements Runnable {
    public final int f19695a;
    public final MessagesStorage f19696b;
    public final long f19697c;

    public pf(int i10, long j10, MessagesStorage messagesStorage) {
        this.f19695a = i10;
        this.f19696b = messagesStorage;
        this.f19697c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19695a) {
            case 0:
                this.f19696b.lambda$deleteStoryPushMessage$39(this.f19697c);
                return;
            case 1:
                this.f19696b.lambda$clearUserPhotos$92(this.f19697c);
                return;
            case 2:
                this.f19696b.lambda$removeAllTopics$56(this.f19697c);
                return;
            case 3:
                this.f19696b.lambda$deleteWallpaper$79(this.f19697c);
                return;
            case 4:
                this.f19696b.lambda$deleteSavedDialog$55(this.f19697c);
                return;
            case 5:
                this.f19696b.lambda$onDeleteQueryComplete$91(this.f19697c);
                return;
            case 6:
                this.f19696b.lambda$removePendingTask$11(this.f19697c);
                return;
            default:
                this.f19696b.lambda$loadChannelAdmins$123(this.f19697c);
                return;
        }
    }
}
