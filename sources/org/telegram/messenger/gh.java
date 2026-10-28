package org.telegram.messenger;
public final class gh implements Runnable {
    public final int f20176a;
    public final NotificationsController f20177b;
    public final int f20178c;

    public gh(NotificationsController notificationsController, int i10, int i11) {
        this.f20176a = i11;
        this.f20177b = notificationsController;
        this.f20178c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20176a) {
            case 0:
                this.f20177b.lambda$processSeenStoryReactions$15(this.f20178c);
                return;
            case 1:
                this.f20177b.lambda$setLastOnlineFromOtherDevice$6(this.f20178c);
                return;
            case 2:
                this.f20177b.lambda$processDialogsUpdateRead$30(this.f20178c);
                return;
            case 3:
                this.f20177b.lambda$processNewMessages$25(this.f20178c);
                return;
            case 4:
                this.f20177b.lambda$processNewMessages$27(this.f20178c);
                return;
            case 5:
                this.f20177b.lambda$removeDeletedMessagesFromNotifications$10(this.f20178c);
                return;
            case 6:
                this.f20177b.lambda$removeDeletedHisoryFromNotifications$13(this.f20178c);
                return;
            default:
                this.f20177b.lambda$processLoadedUnreadMessages$33(this.f20178c);
                return;
        }
    }
}
