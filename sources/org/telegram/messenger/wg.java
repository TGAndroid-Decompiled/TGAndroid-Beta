package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19716a;
    public final NotificationCenter f19717b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19716a = i10;
        this.f19717b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19716a) {
            case 0:
                NotificationCenter.g(this.f19717b);
                return;
            default:
                NotificationCenter.b(this.f19717b);
                return;
        }
    }
}
