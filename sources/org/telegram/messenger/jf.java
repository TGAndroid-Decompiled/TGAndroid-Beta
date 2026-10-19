package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18708a;
    public final MessagesStorage f18709b;
    public final long f18710c;

    public jf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f18708a = i10;
        this.f18709b = messagesStorage;
        this.f18710c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18708a) {
            case 0:
                this.f18709b.lambda$deleteStoryPushMessage$39(this.f18710c);
                return;
            case 1:
                this.f18709b.lambda$clearUserPhotos$92(this.f18710c);
                return;
            case 2:
                this.f18709b.lambda$removeAllTopics$56(this.f18710c);
                return;
            case 3:
                this.f18709b.lambda$deleteWallpaper$79(this.f18710c);
                return;
            case 4:
                this.f18709b.lambda$deleteSavedDialog$55(this.f18710c);
                return;
            case 5:
                this.f18709b.lambda$onDeleteQueryComplete$91(this.f18710c);
                return;
            case 6:
                this.f18709b.lambda$removePendingTask$11(this.f18710c);
                return;
            default:
                this.f18709b.lambda$loadChannelAdmins$123(this.f18710c);
                return;
        }
    }
}
