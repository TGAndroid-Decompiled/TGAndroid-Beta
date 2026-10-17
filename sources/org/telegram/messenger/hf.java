package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18529a;
    public final MessagesStorage f18530b;
    public final long f18531c;

    public hf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f18529a = i10;
        this.f18530b = messagesStorage;
        this.f18531c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18529a) {
            case 0:
                this.f18530b.lambda$deleteStoryPushMessage$39(this.f18531c);
                return;
            case 1:
                this.f18530b.lambda$clearUserPhotos$92(this.f18531c);
                return;
            case 2:
                this.f18530b.lambda$removeAllTopics$56(this.f18531c);
                return;
            case 3:
                this.f18530b.lambda$deleteWallpaper$79(this.f18531c);
                return;
            case 4:
                this.f18530b.lambda$deleteSavedDialog$55(this.f18531c);
                return;
            case 5:
                this.f18530b.lambda$onDeleteQueryComplete$91(this.f18531c);
                return;
            case 6:
                this.f18530b.lambda$removePendingTask$11(this.f18531c);
                return;
            default:
                this.f18530b.lambda$loadChannelAdmins$123(this.f18531c);
                return;
        }
    }
}
