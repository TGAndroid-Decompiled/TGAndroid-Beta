package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f18064a;
    public final NotificationCenter f18065b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f18064a = i10;
        this.f18065b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18064a) {
            case 0:
                NotificationCenter.g(this.f18065b);
                return;
            default:
                NotificationCenter.b(this.f18065b);
                return;
        }
    }
}
