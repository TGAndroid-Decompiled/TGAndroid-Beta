package org.telegram.messenger;
public final class sg implements Runnable {
    public final int f21501a;
    public final NotificationsController f21502b;
    public final int f21503c;

    public sg(NotificationsController notificationsController, int i9, int i10) {
        this.f21501a = i10;
        this.f21502b = notificationsController;
        this.f21503c = i9;
    }

    @Override
    public final void run() {
        switch (this.f21501a) {
            case 0:
                this.f21502b.lambda$processDialogsUpdateRead$29(this.f21503c);
                return;
            case 1:
                this.f21502b.lambda$removeDeletedHisoryFromNotifications$12(this.f21503c);
                return;
            case 2:
                this.f21502b.lambda$processSeenStoryReactions$14(this.f21503c);
                return;
            case 3:
                this.f21502b.lambda$processNewMessages$24(this.f21503c);
                return;
            case 4:
                this.f21502b.lambda$processNewMessages$26(this.f21503c);
                return;
            case 5:
                this.f21502b.lambda$setLastOnlineFromOtherDevice$5(this.f21503c);
                return;
            case 6:
                this.f21502b.lambda$processLoadedUnreadMessages$32(this.f21503c);
                return;
            default:
                this.f21502b.lambda$removeDeletedMessagesFromNotifications$9(this.f21503c);
                return;
        }
    }
}
