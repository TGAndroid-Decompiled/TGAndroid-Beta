package org.telegram.messenger;
public final class ug implements Runnable {
    public final int f19770a;
    public final NotificationCenter f19771b;

    public ug(NotificationCenter notificationCenter, int i10) {
        this.f19770a = i10;
        this.f19771b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19770a) {
            case 0:
                NotificationCenter.g(this.f19771b);
                return;
            default:
                NotificationCenter.b(this.f19771b);
                return;
        }
    }
}
