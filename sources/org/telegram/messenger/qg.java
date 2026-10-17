package org.telegram.messenger;
public final class qg implements Runnable {
    public final int f19361a;
    public final NotificationCenter f19362b;

    public qg(NotificationCenter notificationCenter, int i10) {
        this.f19361a = i10;
        this.f19362b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19361a) {
            case 0:
                NotificationCenter.g(this.f19362b);
                return;
            default:
                NotificationCenter.b(this.f19362b);
                return;
        }
    }
}
