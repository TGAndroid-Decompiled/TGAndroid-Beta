package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19715a;
    public final NotificationCenter f19716b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19715a = i10;
        this.f19716b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19715a) {
            case 0:
                NotificationCenter.g(this.f19716b);
                return;
            default:
                NotificationCenter.b(this.f19716b);
                return;
        }
    }
}
