package org.telegram.messenger;
public final class ug implements Runnable {
    public final int f19705a;
    public final NotificationCenter f19706b;

    public ug(NotificationCenter notificationCenter, int i10) {
        this.f19705a = i10;
        this.f19706b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19705a) {
            case 0:
                NotificationCenter.g(this.f19706b);
                return;
            default:
                NotificationCenter.b(this.f19706b);
                return;
        }
    }
}
