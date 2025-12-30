package org.telegram.messenger;

public final class NotificationCenter$$ExternalSyntheticLambda11 implements Runnable {
    public final NotificationCenter f$0;

    public NotificationCenter$$ExternalSyntheticLambda11(NotificationCenter notificationCenter) {
        this.f$0 = notificationCenter;
    }

    @Override
    public final void run() {
        this.f$0.checkForExpiredNotifications();
    }
}
