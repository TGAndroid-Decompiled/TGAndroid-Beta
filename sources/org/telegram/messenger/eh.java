package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17771a;
    public final NotificationsController f17772b;
    public final int f17773c;

    public eh(NotificationsController notificationsController, int i10, int i11) {
        this.f17771a = i11;
        this.f17772b = notificationsController;
        this.f17773c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17771a) {
            case 0:
                this.f17772b.lambda$processSeenStoryReactions$15(this.f17773c);
                return;
            case 1:
                this.f17772b.lambda$setLastOnlineFromOtherDevice$6(this.f17773c);
                return;
            case 2:
                this.f17772b.lambda$processDialogsUpdateRead$30(this.f17773c);
                return;
            case 3:
                this.f17772b.lambda$processNewMessages$25(this.f17773c);
                return;
            case 4:
                this.f17772b.lambda$processNewMessages$27(this.f17773c);
                return;
            case 5:
                this.f17772b.lambda$removeDeletedMessagesFromNotifications$10(this.f17773c);
                return;
            case 6:
                this.f17772b.lambda$removeDeletedHisoryFromNotifications$13(this.f17773c);
                return;
            default:
                this.f17772b.lambda$processLoadedUnreadMessages$33(this.f17773c);
                return;
        }
    }
}
