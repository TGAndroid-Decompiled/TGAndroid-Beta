package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17807a;
    public final NotificationsController f17808b;
    public final int f17809c;

    public eh(NotificationsController notificationsController, int i10, int i11) {
        this.f17807a = i11;
        this.f17808b = notificationsController;
        this.f17809c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17807a) {
            case 0:
                this.f17808b.lambda$processSeenStoryReactions$15(this.f17809c);
                return;
            case 1:
                this.f17808b.lambda$setLastOnlineFromOtherDevice$6(this.f17809c);
                return;
            case 2:
                this.f17808b.lambda$processDialogsUpdateRead$30(this.f17809c);
                return;
            case 3:
                this.f17808b.lambda$processNewMessages$25(this.f17809c);
                return;
            case 4:
                this.f17808b.lambda$processNewMessages$27(this.f17809c);
                return;
            case 5:
                this.f17808b.lambda$removeDeletedMessagesFromNotifications$10(this.f17809c);
                return;
            case 6:
                this.f17808b.lambda$removeDeletedHisoryFromNotifications$13(this.f17809c);
                return;
            default:
                this.f17808b.lambda$processLoadedUnreadMessages$33(this.f17809c);
                return;
        }
    }
}
