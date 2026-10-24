package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f18348a;
    public final NotificationsController f18349b;
    public final int f18350c;

    public eh(NotificationsController notificationsController, int i10, int i11) {
        this.f18348a = i11;
        this.f18349b = notificationsController;
        this.f18350c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18348a) {
            case 0:
                this.f18349b.lambda$processSeenStoryReactions$15(this.f18350c);
                return;
            case 1:
                this.f18349b.lambda$setLastOnlineFromOtherDevice$6(this.f18350c);
                return;
            case 2:
                this.f18349b.lambda$processDialogsUpdateRead$30(this.f18350c);
                return;
            case 3:
                this.f18349b.lambda$processNewMessages$25(this.f18350c);
                return;
            case 4:
                this.f18349b.lambda$processNewMessages$27(this.f18350c);
                return;
            case 5:
                this.f18349b.lambda$removeDeletedMessagesFromNotifications$10(this.f18350c);
                return;
            case 6:
                this.f18349b.lambda$removeDeletedHisoryFromNotifications$13(this.f18350c);
                return;
            default:
                this.f18349b.lambda$processLoadedUnreadMessages$33(this.f18350c);
                return;
        }
    }
}
