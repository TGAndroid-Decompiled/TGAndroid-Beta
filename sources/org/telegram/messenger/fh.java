package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f17855a;
    public final NotificationsController f17856b;
    public final int f17857c;

    public fh(NotificationsController notificationsController, int i10, int i11) {
        this.f17855a = i11;
        this.f17856b = notificationsController;
        this.f17857c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17855a) {
            case 0:
                this.f17856b.lambda$processSeenStoryReactions$15(this.f17857c);
                return;
            case 1:
                this.f17856b.lambda$setLastOnlineFromOtherDevice$6(this.f17857c);
                return;
            case 2:
                this.f17856b.lambda$processDialogsUpdateRead$30(this.f17857c);
                return;
            case 3:
                this.f17856b.lambda$processNewMessages$25(this.f17857c);
                return;
            case 4:
                this.f17856b.lambda$processNewMessages$27(this.f17857c);
                return;
            case 5:
                this.f17856b.lambda$removeDeletedMessagesFromNotifications$10(this.f17857c);
                return;
            case 6:
                this.f17856b.lambda$removeDeletedHisoryFromNotifications$13(this.f17857c);
                return;
            default:
                this.f17856b.lambda$processLoadedUnreadMessages$33(this.f17857c);
                return;
        }
    }
}
