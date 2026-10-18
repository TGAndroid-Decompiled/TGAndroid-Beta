package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18705a;
    public final MessagesStorage f18706b;
    public final long f18707c;

    public jf(MessagesStorage messagesStorage, long j10, int i10) {
        this.f18705a = i10;
        this.f18706b = messagesStorage;
        this.f18707c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18705a) {
            case 0:
                this.f18706b.lambda$deleteStoryPushMessage$39(this.f18707c);
                return;
            case 1:
                this.f18706b.lambda$clearUserPhotos$92(this.f18707c);
                return;
            case 2:
                this.f18706b.lambda$removeAllTopics$56(this.f18707c);
                return;
            case 3:
                this.f18706b.lambda$deleteWallpaper$79(this.f18707c);
                return;
            case 4:
                this.f18706b.lambda$deleteSavedDialog$55(this.f18707c);
                return;
            case 5:
                this.f18706b.lambda$onDeleteQueryComplete$91(this.f18707c);
                return;
            case 6:
                this.f18706b.lambda$removePendingTask$11(this.f18707c);
                return;
            default:
                this.f18706b.lambda$loadChannelAdmins$123(this.f18707c);
                return;
        }
    }
}
