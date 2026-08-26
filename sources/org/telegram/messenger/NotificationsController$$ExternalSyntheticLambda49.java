package org.telegram.messenger;

public final class NotificationsController$$ExternalSyntheticLambda49 implements Runnable {
    public final int $r8$classId;
    public final NotificationsController f$0;
    public final long f$1;
    public final int f$2;

    public NotificationsController$$ExternalSyntheticLambda49(NotificationsController notificationsController, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationsController;
        this.f$1 = j;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processDeleteStory$15(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processReadStories$16(this.f$1, this.f$2);
                break;
        }
    }
}
