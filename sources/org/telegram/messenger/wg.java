package org.telegram.messenger;

public final class wg implements Runnable {

    public final int f22068a;

    public final NotificationsController f22069b;

    public final int f22070c;

    public wg(NotificationsController notificationsController, int i10, int i11) {
        this.f22068a = i11;
        this.f22069b = notificationsController;
        this.f22070c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22068a) {
            case 0:
                this.f22069b.lambda$processDialogsUpdateRead$29(this.f22070c);
                break;
            case 1:
                this.f22069b.lambda$removeDeletedHisoryFromNotifications$12(this.f22070c);
                break;
            case 2:
                this.f22069b.lambda$processSeenStoryReactions$14(this.f22070c);
                break;
            case 3:
                this.f22069b.lambda$processNewMessages$24(this.f22070c);
                break;
            case 4:
                this.f22069b.lambda$processNewMessages$26(this.f22070c);
                break;
            case 5:
                this.f22069b.lambda$setLastOnlineFromOtherDevice$5(this.f22070c);
                break;
            case 6:
                this.f22069b.lambda$processLoadedUnreadMessages$32(this.f22070c);
                break;
            default:
                this.f22069b.lambda$removeDeletedMessagesFromNotifications$9(this.f22070c);
                break;
        }
    }
}
