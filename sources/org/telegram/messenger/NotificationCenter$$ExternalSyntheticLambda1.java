package org.telegram.messenger;

public final class NotificationCenter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final NotificationCenter f$0;

    public NotificationCenter$$ExternalSyntheticLambda1(NotificationCenter notificationCenter, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkForExpiredNotifications$0();
                break;
            default:
                this.f$0.checkForExpiredNotifications();
                break;
        }
    }
}
