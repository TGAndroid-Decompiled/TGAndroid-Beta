package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f20097a;
    public final NotificationsController f20098b;
    public final int f20099c;

    public fh(NotificationsController notificationsController, int i10, int i11) {
        this.f20097a = i11;
        this.f20098b = notificationsController;
        this.f20099c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20097a) {
            case 0:
                this.f20098b.lambda$processSeenStoryReactions$15(this.f20099c);
                return;
            case 1:
                this.f20098b.lambda$setLastOnlineFromOtherDevice$6(this.f20099c);
                return;
            case 2:
                this.f20098b.lambda$processDialogsUpdateRead$30(this.f20099c);
                return;
            case 3:
                this.f20098b.lambda$processNewMessages$25(this.f20099c);
                return;
            case 4:
                this.f20098b.lambda$processNewMessages$27(this.f20099c);
                return;
            case 5:
                this.f20098b.lambda$removeDeletedMessagesFromNotifications$10(this.f20099c);
                return;
            case 6:
                this.f20098b.lambda$removeDeletedHisoryFromNotifications$13(this.f20099c);
                return;
            default:
                this.f20098b.lambda$processLoadedUnreadMessages$33(this.f20099c);
                return;
        }
    }
}
