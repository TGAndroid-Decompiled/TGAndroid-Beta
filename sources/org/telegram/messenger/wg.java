package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f18025a;
    public final NotificationCenter f18026b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f18025a = i10;
        this.f18026b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18025a) {
            case 0:
                NotificationCenter.g(this.f18026b);
                return;
            default:
                NotificationCenter.b(this.f18026b);
                return;
        }
    }
}
