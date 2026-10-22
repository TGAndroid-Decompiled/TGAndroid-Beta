package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f18284a;
    public final NotificationsController f18285b;
    public final int f18286c;

    public eh(NotificationsController notificationsController, int i10, int i11) {
        this.f18284a = i11;
        this.f18285b = notificationsController;
        this.f18286c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18284a) {
            case 0:
                this.f18285b.lambda$processSeenStoryReactions$15(this.f18286c);
                return;
            case 1:
                this.f18285b.lambda$setLastOnlineFromOtherDevice$6(this.f18286c);
                return;
            case 2:
                this.f18285b.lambda$processDialogsUpdateRead$30(this.f18286c);
                return;
            case 3:
                this.f18285b.lambda$processNewMessages$25(this.f18286c);
                return;
            case 4:
                this.f18285b.lambda$processNewMessages$27(this.f18286c);
                return;
            case 5:
                this.f18285b.lambda$removeDeletedMessagesFromNotifications$10(this.f18286c);
                return;
            case 6:
                this.f18285b.lambda$removeDeletedHisoryFromNotifications$13(this.f18286c);
                return;
            default:
                this.f18285b.lambda$processLoadedUnreadMessages$33(this.f18286c);
                return;
        }
    }
}
