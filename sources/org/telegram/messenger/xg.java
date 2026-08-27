package org.telegram.messenger;

public final class xg implements Runnable {

    public final int f22162a;

    public final NotificationsController f22163b;

    public xg(NotificationsController notificationsController, int i10) {
        this.f22162a = i10;
        this.f22163b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f22162a) {
            case 0:
                this.f22163b.lambda$cleanup$2();
                break;
            case 1:
                this.f22163b.lambda$hideNotifications$36();
                break;
            case 2:
                this.f22163b.lambda$repeatNotificationMaybe$41();
                break;
            case 3:
                this.f22163b.lambda$processIgnoreStories$17();
                break;
            case 4:
                this.f22163b.lambda$updateBadge$34();
                break;
            case 5:
                this.f22163b.lambda$deleteAllNotificationChannels$44();
                break;
            case 6:
                this.f22163b.lambda$playOutChatSound$49();
                break;
            case 7:
                this.f22163b.checkStoryPushes();
                break;
            case 8:
                this.f22163b.lambda$new$0();
                break;
            case 9:
                this.f22163b.lambda$new$1();
                break;
            case 10:
                this.f22163b.lambda$showNotifications$35();
                break;
            case 11:
                this.f22163b.lambda$forceShowPopupForReply$7();
                break;
            case 12:
                this.f22163b.lambda$processIgnoreStoryReactions$18();
                break;
            default:
                this.f22163b.lambda$playInChatSound$40();
                break;
        }
    }
}
