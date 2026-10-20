package org.telegram.messenger;
public final class sg implements Runnable {
    public final int f19536a;
    public final NotificationCenter f19537b;

    public sg(NotificationCenter notificationCenter, int i10) {
        this.f19536a = i10;
        this.f19537b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19536a) {
            case 0:
                NotificationCenter.g(this.f19537b);
                return;
            default:
                NotificationCenter.b(this.f19537b);
                return;
        }
    }
}
