package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19533a;
    public final NotificationCenter f19534b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19533a = i10;
        this.f19534b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19533a) {
            case 0:
                NotificationCenter.g(this.f19534b);
                return;
            default:
                NotificationCenter.b(this.f19534b);
                return;
        }
    }
}
