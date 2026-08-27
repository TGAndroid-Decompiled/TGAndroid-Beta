package org.telegram.messenger;

public final class tg implements Runnable {

    public final int f21642a;

    public final NotificationCenter f21643b;

    public tg(NotificationCenter notificationCenter, int i10) {
        this.f21642a = i10;
        this.f21643b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f21642a) {
            case 0:
                this.f21643b.lambda$checkForExpiredNotifications$0();
                break;
            default:
                this.f21643b.checkForExpiredNotifications();
                break;
        }
    }
}
