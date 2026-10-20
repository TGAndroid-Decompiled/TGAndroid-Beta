package org.telegram.messenger;
public final class vg implements Runnable {
    public final int f19754a;
    public final NotificationsController f19755b;

    public vg(NotificationsController notificationsController, int i10) {
        this.f19754a = i10;
        this.f19755b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f19754a) {
            case 0:
                this.f19755b.lambda$playInChatSound$41();
                return;
            case 1:
                this.f19755b.lambda$cleanup$3();
                return;
            case 2:
                this.f19755b.lambda$hideNotifications$37();
                return;
            case 3:
                this.f19755b.lambda$repeatNotificationMaybe$42();
                return;
            case 4:
                this.f19755b.lambda$processIgnoreStories$18();
                return;
            case 5:
                this.f19755b.lambda$updateBadge$35();
                return;
            case 6:
                this.f19755b.lambda$deleteAllNotificationChannels$45();
                return;
            case 7:
                this.f19755b.lambda$playOutChatSound$50();
                return;
            case 8:
                this.f19755b.checkStoryPushes();
                return;
            case 9:
                this.f19755b.lambda$new$0();
                return;
            case 10:
                this.f19755b.lambda$new$1();
                return;
            case 11:
                this.f19755b.lambda$showNotifications$36();
                return;
            case 12:
                this.f19755b.lambda$forceShowPopupForReply$8();
                return;
            default:
                this.f19755b.lambda$processIgnoreStoryReactions$19();
                return;
        }
    }
}
