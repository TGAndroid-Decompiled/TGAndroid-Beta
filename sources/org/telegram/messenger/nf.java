package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f20776a;
    public final MessagesStorage f20777b;
    public final long f20778c;

    public nf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f20776a = i10;
        this.f20777b = messagesStorage;
        this.f20778c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20776a) {
            case 0:
                this.f20777b.lambda$deleteStoryPushMessage$39(this.f20778c);
                return;
            case 1:
                this.f20777b.lambda$clearUserPhotos$95(this.f20778c);
                return;
            case 2:
                this.f20777b.lambda$removeAllTopics$59(this.f20778c);
                return;
            case 3:
                this.f20777b.lambda$deleteWallpaper$82(this.f20778c);
                return;
            case 4:
                this.f20777b.lambda$deleteSavedDialog$58(this.f20778c);
                return;
            case 5:
                this.f20777b.lambda$onDeleteQueryComplete$94(this.f20778c);
                return;
            case 6:
                this.f20777b.lambda$removePendingTask$11(this.f20778c);
                return;
            default:
                this.f20777b.lambda$loadChannelAdmins$126(this.f20778c);
                return;
        }
    }
}
