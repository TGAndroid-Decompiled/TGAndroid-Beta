package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f16682a;
    public final MessagesStorage f16683b;
    public final long f16684c;

    public lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.f16682a = i10;
        this.f16683b = messagesStorage;
        this.f16684c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16682a) {
            case 0:
                this.f16683b.lambda$deleteStoryPushMessage$39(this.f16684c);
                return;
            case 1:
                this.f16683b.lambda$clearUserPhotos$92(this.f16684c);
                return;
            case 2:
                this.f16683b.lambda$removeAllTopics$56(this.f16684c);
                return;
            case 3:
                this.f16683b.lambda$deleteWallpaper$79(this.f16684c);
                return;
            case 4:
                this.f16683b.lambda$deleteSavedDialog$55(this.f16684c);
                return;
            case 5:
                this.f16683b.lambda$onDeleteQueryComplete$91(this.f16684c);
                return;
            case 6:
                this.f16683b.lambda$removePendingTask$11(this.f16684c);
                return;
            default:
                this.f16683b.lambda$loadChannelAdmins$123(this.f16684c);
                return;
        }
    }
}
