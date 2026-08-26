package org.telegram.messenger;

public final class NotificationsController$$ExternalSyntheticLambda33 implements Runnable {
    public final int $r8$classId;
    public final NotificationsController f$0;
    public final int f$1;

    public NotificationsController$$ExternalSyntheticLambda33(NotificationsController notificationsController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationsController;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeDeletedMessagesFromNotifications$9(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processDialogsUpdateRead$29(this.f$1);
                break;
            case 2:
                this.f$0.lambda$removeDeletedHisoryFromNotifications$12(this.f$1);
                break;
            case 3:
                this.f$0.lambda$processSeenStoryReactions$14(this.f$1);
                break;
            case 4:
                this.f$0.lambda$processNewMessages$24(this.f$1);
                break;
            case 5:
                this.f$0.lambda$processNewMessages$26(this.f$1);
                break;
            case 6:
                this.f$0.lambda$setLastOnlineFromOtherDevice$5(this.f$1);
                break;
            default:
                this.f$0.lambda$processLoadedUnreadMessages$32(this.f$1);
                break;
        }
    }
}
