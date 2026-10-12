package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f17429a;
    public final NotificationsController f17430b;
    public final int f17431c;

    public hh(NotificationsController notificationsController, int i10, int i11) {
        this.f17429a = i11;
        this.f17430b = notificationsController;
        this.f17431c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17429a) {
            case 0:
                this.f17430b.lambda$processSeenStoryReactions$15(this.f17431c);
                return;
            case 1:
                this.f17430b.lambda$setLastOnlineFromOtherDevice$6(this.f17431c);
                return;
            case 2:
                this.f17430b.lambda$processDialogsUpdateRead$30(this.f17431c);
                return;
            case 3:
                this.f17430b.lambda$processNewMessages$25(this.f17431c);
                return;
            case 4:
                this.f17430b.lambda$processNewMessages$27(this.f17431c);
                return;
            case 5:
                this.f17430b.lambda$removeDeletedMessagesFromNotifications$10(this.f17431c);
                return;
            case 6:
                this.f17430b.lambda$removeDeletedHisoryFromNotifications$13(this.f17431c);
                return;
            default:
                this.f17430b.lambda$processLoadedUnreadMessages$33(this.f17431c);
                return;
        }
    }
}
