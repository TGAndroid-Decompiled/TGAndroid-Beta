package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18525a;
    public final MessagesStorage f18526b;
    public final long f18527c;

    public hf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f18525a = i10;
        this.f18526b = messagesStorage;
        this.f18527c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18525a) {
            case 0:
                this.f18526b.lambda$deleteStoryPushMessage$39(this.f18527c);
                return;
            case 1:
                this.f18526b.lambda$clearUserPhotos$92(this.f18527c);
                return;
            case 2:
                this.f18526b.lambda$removeAllTopics$56(this.f18527c);
                return;
            case 3:
                this.f18526b.lambda$deleteWallpaper$79(this.f18527c);
                return;
            case 4:
                this.f18526b.lambda$deleteSavedDialog$55(this.f18527c);
                return;
            case 5:
                this.f18526b.lambda$onDeleteQueryComplete$91(this.f18527c);
                return;
            case 6:
                this.f18526b.lambda$removePendingTask$11(this.f18527c);
                return;
            default:
                this.f18526b.lambda$loadChannelAdmins$123(this.f18527c);
                return;
        }
    }
}
