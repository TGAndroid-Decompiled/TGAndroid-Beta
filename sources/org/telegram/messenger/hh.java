package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f17814a;
    public final NotificationsController f17815b;
    public final int f17816c;

    public hh(NotificationsController notificationsController, int i10, int i11) {
        this.f17814a = i11;
        this.f17815b = notificationsController;
        this.f17816c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17814a) {
            case 0:
                this.f17815b.lambda$processSeenStoryReactions$15(this.f17816c);
                return;
            case 1:
                this.f17815b.lambda$setLastOnlineFromOtherDevice$6(this.f17816c);
                return;
            case 2:
                this.f17815b.lambda$processDialogsUpdateRead$30(this.f17816c);
                return;
            case 3:
                this.f17815b.lambda$processNewMessages$25(this.f17816c);
                return;
            case 4:
                this.f17815b.lambda$processNewMessages$27(this.f17816c);
                return;
            case 5:
                this.f17815b.lambda$removeDeletedMessagesFromNotifications$10(this.f17816c);
                return;
            case 6:
                this.f17815b.lambda$removeDeletedHisoryFromNotifications$13(this.f17816c);
                return;
            default:
                this.f17815b.lambda$processLoadedUnreadMessages$33(this.f17816c);
                return;
        }
    }
}
