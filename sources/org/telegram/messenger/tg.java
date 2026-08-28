package org.telegram.messenger;
public final class tg implements Runnable {
    public final int f21591a;
    public final NotificationsController f21592b;

    public tg(NotificationsController notificationsController, int i9) {
        this.f21591a = i9;
        this.f21592b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f21591a) {
            case 0:
                this.f21592b.lambda$cleanup$2();
                return;
            case 1:
                this.f21592b.lambda$hideNotifications$36();
                return;
            case 2:
                this.f21592b.lambda$repeatNotificationMaybe$41();
                return;
            case 3:
                this.f21592b.lambda$processIgnoreStories$17();
                return;
            case 4:
                this.f21592b.lambda$updateBadge$34();
                return;
            case 5:
                this.f21592b.lambda$deleteAllNotificationChannels$44();
                return;
            case 6:
                this.f21592b.lambda$playOutChatSound$49();
                return;
            case 7:
                this.f21592b.checkStoryPushes();
                return;
            case 8:
                this.f21592b.lambda$new$0();
                return;
            case 9:
                this.f21592b.lambda$new$1();
                return;
            case 10:
                this.f21592b.lambda$showNotifications$35();
                return;
            case 11:
                this.f21592b.lambda$forceShowPopupForReply$7();
                return;
            case 12:
                this.f21592b.lambda$processIgnoreStoryReactions$18();
                return;
            default:
                this.f21592b.lambda$playInChatSound$40();
                return;
        }
    }
}
