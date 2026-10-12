package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f18390a;
    public final MessagesStorage f18391b;
    public final long f18392c;

    public nf(MessagesStorage messagesStorage, long j3, int i10) {
        this.f18390a = i10;
        this.f18391b = messagesStorage;
        this.f18392c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18390a) {
            case 0:
                this.f18391b.lambda$deleteStoryPushMessage$39(this.f18392c);
                return;
            case 1:
                this.f18391b.lambda$clearUserPhotos$92(this.f18392c);
                return;
            case 2:
                this.f18391b.lambda$removeAllTopics$56(this.f18392c);
                return;
            case 3:
                this.f18391b.lambda$deleteWallpaper$79(this.f18392c);
                return;
            case 4:
                this.f18391b.lambda$deleteSavedDialog$55(this.f18392c);
                return;
            case 5:
                this.f18391b.lambda$onDeleteQueryComplete$91(this.f18392c);
                return;
            case 6:
                this.f18391b.lambda$removePendingTask$11(this.f18392c);
                return;
            default:
                this.f18391b.lambda$loadChannelAdmins$123(this.f18392c);
                return;
        }
    }
}
