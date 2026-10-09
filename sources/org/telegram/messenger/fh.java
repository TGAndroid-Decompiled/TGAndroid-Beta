package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f17851a;
    public final NotificationsController f17852b;
    public final int f17853c;

    public fh(NotificationsController notificationsController, int i10, int i11) {
        this.f17851a = i11;
        this.f17852b = notificationsController;
        this.f17853c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17851a) {
            case 0:
                this.f17852b.lambda$processSeenStoryReactions$15(this.f17853c);
                return;
            case 1:
                this.f17852b.lambda$setLastOnlineFromOtherDevice$6(this.f17853c);
                return;
            case 2:
                this.f17852b.lambda$processDialogsUpdateRead$30(this.f17853c);
                return;
            case 3:
                this.f17852b.lambda$processNewMessages$25(this.f17853c);
                return;
            case 4:
                this.f17852b.lambda$processNewMessages$27(this.f17853c);
                return;
            case 5:
                this.f17852b.lambda$removeDeletedMessagesFromNotifications$10(this.f17853c);
                return;
            case 6:
                this.f17852b.lambda$removeDeletedHisoryFromNotifications$13(this.f17853c);
                return;
            default:
                this.f17852b.lambda$processLoadedUnreadMessages$33(this.f17853c);
                return;
        }
    }
}
