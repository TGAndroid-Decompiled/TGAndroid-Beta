package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f17815a;
    public final NotificationsController f17816b;
    public final int f17817c;

    public hh(NotificationsController notificationsController, int i10, int i11) {
        this.f17815a = i11;
        this.f17816b = notificationsController;
        this.f17817c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17815a) {
            case 0:
                this.f17816b.lambda$processSeenStoryReactions$15(this.f17817c);
                return;
            case 1:
                this.f17816b.lambda$setLastOnlineFromOtherDevice$6(this.f17817c);
                return;
            case 2:
                this.f17816b.lambda$processDialogsUpdateRead$30(this.f17817c);
                return;
            case 3:
                this.f17816b.lambda$processNewMessages$25(this.f17817c);
                return;
            case 4:
                this.f17816b.lambda$processNewMessages$27(this.f17817c);
                return;
            case 5:
                this.f17816b.lambda$removeDeletedMessagesFromNotifications$10(this.f17817c);
                return;
            case 6:
                this.f17816b.lambda$removeDeletedHisoryFromNotifications$13(this.f17817c);
                return;
            default:
                this.f17816b.lambda$processLoadedUnreadMessages$33(this.f17817c);
                return;
        }
    }
}
