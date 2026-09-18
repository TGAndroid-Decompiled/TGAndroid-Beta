package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f18061a;
    public final NotificationCenter f18062b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f18061a = i10;
        this.f18062b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18061a) {
            case 0:
                NotificationCenter.g(this.f18062b);
                return;
            default:
                NotificationCenter.b(this.f18062b);
                return;
        }
    }
}
