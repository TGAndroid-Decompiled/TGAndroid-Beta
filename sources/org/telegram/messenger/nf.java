package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18389a;
    public final MessagesStorage f18390b;
    public final long f18391c;

    public nf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18389a = i10;
        this.f18390b = messagesStorage;
        this.f18391c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18389a) {
            case 0:
                this.f18390b.lambda$deleteStoryPushMessage$39(this.f18391c);
                return;
            case 1:
                this.f18390b.lambda$clearUserPhotos$92(this.f18391c);
                return;
            case 2:
                this.f18390b.lambda$removeAllTopics$56(this.f18391c);
                return;
            case 3:
                this.f18390b.lambda$deleteWallpaper$79(this.f18391c);
                return;
            case 4:
                this.f18390b.lambda$deleteSavedDialog$55(this.f18391c);
                return;
            case 5:
                this.f18390b.lambda$onDeleteQueryComplete$91(this.f18391c);
                return;
            case 6:
                this.f18390b.lambda$removePendingTask$11(this.f18391c);
                return;
            default:
                this.f18390b.lambda$loadChannelAdmins$123(this.f18391c);
                return;
        }
    }
}
