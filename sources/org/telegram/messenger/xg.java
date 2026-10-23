package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f20088a;
    public final NotificationsController f20089b;

    public xg(NotificationsController notificationsController, int i10) {
        this.f20088a = i10;
        this.f20089b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f20088a) {
            case 0:
                this.f20089b.lambda$playInChatSound$41();
                return;
            case 1:
                this.f20089b.lambda$cleanup$3();
                return;
            case 2:
                this.f20089b.lambda$hideNotifications$37();
                return;
            case 3:
                this.f20089b.lambda$repeatNotificationMaybe$42();
                return;
            case 4:
                this.f20089b.lambda$processIgnoreStories$18();
                return;
            case 5:
                this.f20089b.lambda$updateBadge$35();
                return;
            case 6:
                this.f20089b.lambda$deleteAllNotificationChannels$45();
                return;
            case 7:
                this.f20089b.lambda$playOutChatSound$50();
                return;
            case 8:
                this.f20089b.checkStoryPushes();
                return;
            case 9:
                this.f20089b.lambda$new$0();
                return;
            case 10:
                this.f20089b.lambda$new$1();
                return;
            case 11:
                this.f20089b.lambda$showNotifications$36();
                return;
            case 12:
                this.f20089b.lambda$forceShowPopupForReply$8();
                return;
            default:
                this.f20089b.lambda$processIgnoreStoryReactions$19();
                return;
        }
    }
}
