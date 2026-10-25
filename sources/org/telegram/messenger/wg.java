package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f21766a;
    public final NotificationCenter f21767b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f21766a = i10;
        this.f21767b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f21766a) {
            case 0:
                NotificationCenter.g(this.f21767b);
                return;
            default:
                NotificationCenter.b(this.f21767b);
                return;
        }
    }
}
