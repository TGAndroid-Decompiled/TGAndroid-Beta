package org.telegram.messenger;

public final class NotificationsController$$ExternalSyntheticLambda31 implements Runnable {
    public final int $r8$classId;
    public final NotificationsController f$0;

    public NotificationsController$$ExternalSyntheticLambda31(NotificationsController notificationsController, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processIgnoreStoryReactions$18();
                break;
            case 1:
                this.f$0.lambda$playInChatSound$40();
                break;
            case 2:
                this.f$0.lambda$cleanup$2();
                break;
            case 3:
                this.f$0.lambda$hideNotifications$36();
                break;
            case 4:
                this.f$0.lambda$repeatNotificationMaybe$41();
                break;
            case 5:
                this.f$0.lambda$processIgnoreStories$17();
                break;
            case 6:
                this.f$0.lambda$updateBadge$34();
                break;
            case 7:
                this.f$0.lambda$deleteAllNotificationChannels$44();
                break;
            case 8:
                this.f$0.lambda$playOutChatSound$49();
                break;
            case 9:
                this.f$0.checkStoryPushes();
                break;
            case 10:
                this.f$0.lambda$new$0();
                break;
            case 11:
                this.f$0.lambda$new$1();
                break;
            case 12:
                this.f$0.lambda$showNotifications$35();
                break;
            default:
                this.f$0.lambda$forceShowPopupForReply$7();
                break;
        }
    }
}
