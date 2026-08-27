package org.telegram.messenger;

public final class kf implements Runnable {

    public final int f20785a;

    public final MessagesStorage f20786b;

    public final long f20787c;

    public kf(int i10, long j10, MessagesStorage messagesStorage) {
        this.f20785a = i10;
        this.f20786b = messagesStorage;
        this.f20787c = j10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20785a) {
            case 0:
                this.f20786b.lambda$deleteStoryPushMessage$39(this.f20787c);
                break;
            case 1:
                this.f20786b.lambda$clearUserPhotos$92(this.f20787c);
                break;
            case 2:
                this.f20786b.lambda$removeAllTopics$56(this.f20787c);
                break;
            case 3:
                this.f20786b.lambda$deleteWallpaper$79(this.f20787c);
                break;
            case 4:
                this.f20786b.lambda$deleteSavedDialog$55(this.f20787c);
                break;
            case 5:
                this.f20786b.lambda$onDeleteQueryComplete$91(this.f20787c);
                break;
            case 6:
                this.f20786b.lambda$removePendingTask$11(this.f20787c);
                break;
            default:
                this.f20786b.lambda$loadChannelAdmins$123(this.f20787c);
                break;
        }
    }
}
