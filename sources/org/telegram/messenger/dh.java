package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f18275a;
    public final NotificationsController f18276b;
    public final int f18277c;

    public dh(NotificationsController notificationsController, int i10, int i11) {
        this.f18275a = i11;
        this.f18276b = notificationsController;
        this.f18277c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18275a) {
            case 0:
                this.f18276b.lambda$processSeenStoryReactions$15(this.f18277c);
                return;
            case 1:
                this.f18276b.lambda$setLastOnlineFromOtherDevice$6(this.f18277c);
                return;
            case 2:
                this.f18276b.lambda$processDialogsUpdateRead$30(this.f18277c);
                return;
            case 3:
                this.f18276b.lambda$processNewMessages$25(this.f18277c);
                return;
            case 4:
                this.f18276b.lambda$processNewMessages$27(this.f18277c);
                return;
            case 5:
                this.f18276b.lambda$removeDeletedMessagesFromNotifications$10(this.f18277c);
                return;
            case 6:
                this.f18276b.lambda$removeDeletedHisoryFromNotifications$13(this.f18277c);
                return;
            default:
                this.f18276b.lambda$processLoadedUnreadMessages$33(this.f18277c);
                return;
        }
    }
}
