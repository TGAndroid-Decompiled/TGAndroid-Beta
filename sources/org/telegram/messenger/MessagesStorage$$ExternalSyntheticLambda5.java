package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;

    public MessagesStorage$$ExternalSyntheticLambda5(int i, long j, MessagesStorage messagesStorage) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadChannelAdmins$123(this.f$1);
                break;
            case 1:
                this.f$0.lambda$deleteStoryPushMessage$39(this.f$1);
                break;
            case 2:
                this.f$0.lambda$clearUserPhotos$92(this.f$1);
                break;
            case 3:
                this.f$0.lambda$removeAllTopics$56(this.f$1);
                break;
            case 4:
                this.f$0.lambda$deleteWallpaper$79(this.f$1);
                break;
            case 5:
                this.f$0.lambda$deleteSavedDialog$55(this.f$1);
                break;
            case 6:
                this.f$0.lambda$onDeleteQueryComplete$91(this.f$1);
                break;
            default:
                this.f$0.lambda$removePendingTask$11(this.f$1);
                break;
        }
    }
}
