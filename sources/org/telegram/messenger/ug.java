package org.telegram.messenger;
public final class ug implements Runnable {
    public final int f19664a;
    public final NotificationsController f19665b;

    public ug(NotificationsController notificationsController, int i10) {
        this.f19664a = i10;
        this.f19665b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f19664a) {
            case 0:
                this.f19665b.lambda$playInChatSound$41();
                return;
            case 1:
                this.f19665b.lambda$cleanup$3();
                return;
            case 2:
                this.f19665b.lambda$hideNotifications$37();
                return;
            case 3:
                this.f19665b.lambda$repeatNotificationMaybe$42();
                return;
            case 4:
                this.f19665b.lambda$processIgnoreStories$18();
                return;
            case 5:
                this.f19665b.lambda$updateBadge$35();
                return;
            case 6:
                this.f19665b.lambda$deleteAllNotificationChannels$45();
                return;
            case 7:
                this.f19665b.lambda$playOutChatSound$50();
                return;
            case 8:
                this.f19665b.checkStoryPushes();
                return;
            case 9:
                this.f19665b.lambda$new$0();
                return;
            case 10:
                this.f19665b.lambda$new$1();
                return;
            case 11:
                this.f19665b.lambda$showNotifications$36();
                return;
            case 12:
                this.f19665b.lambda$forceShowPopupForReply$8();
                return;
            default:
                this.f19665b.lambda$processIgnoreStoryReactions$19();
                return;
        }
    }
}
