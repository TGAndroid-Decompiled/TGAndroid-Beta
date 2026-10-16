package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f17126a;
    public final NotificationsController f17127b;
    public final int f17128c;

    public hh(NotificationsController notificationsController, int i10, int i11) {
        this.f17126a = i11;
        this.f17127b = notificationsController;
        this.f17128c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17126a) {
            case 0:
                this.f17127b.lambda$processSeenStoryReactions$15(this.f17128c);
                return;
            case 1:
                this.f17127b.lambda$setLastOnlineFromOtherDevice$6(this.f17128c);
                return;
            case 2:
                this.f17127b.lambda$processDialogsUpdateRead$30(this.f17128c);
                return;
            case 3:
                this.f17127b.lambda$processNewMessages$25(this.f17128c);
                return;
            case 4:
                this.f17127b.lambda$processNewMessages$27(this.f17128c);
                return;
            case 5:
                this.f17127b.lambda$removeDeletedMessagesFromNotifications$10(this.f17128c);
                return;
            case 6:
                this.f17127b.lambda$removeDeletedHisoryFromNotifications$13(this.f17128c);
                return;
            default:
                this.f17127b.lambda$processLoadedUnreadMessages$33(this.f17128c);
                return;
        }
    }
}
