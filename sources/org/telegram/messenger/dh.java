package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f18211a;
    public final NotificationsController f18212b;
    public final int f18213c;

    public dh(NotificationsController notificationsController, int i10, int i11) {
        this.f18211a = i11;
        this.f18212b = notificationsController;
        this.f18213c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18211a) {
            case 0:
                this.f18212b.lambda$processSeenStoryReactions$15(this.f18213c);
                return;
            case 1:
                this.f18212b.lambda$setLastOnlineFromOtherDevice$6(this.f18213c);
                return;
            case 2:
                this.f18212b.lambda$processDialogsUpdateRead$30(this.f18213c);
                return;
            case 3:
                this.f18212b.lambda$processNewMessages$25(this.f18213c);
                return;
            case 4:
                this.f18212b.lambda$processNewMessages$27(this.f18213c);
                return;
            case 5:
                this.f18212b.lambda$removeDeletedMessagesFromNotifications$10(this.f18213c);
                return;
            case 6:
                this.f18212b.lambda$removeDeletedHisoryFromNotifications$13(this.f18213c);
                return;
            default:
                this.f18212b.lambda$processLoadedUnreadMessages$33(this.f18213c);
                return;
        }
    }
}
