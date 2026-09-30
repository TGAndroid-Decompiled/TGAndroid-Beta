package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f18049a;
    public final NotificationCenter f18050b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f18049a = i10;
        this.f18050b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18049a) {
            case 0:
                NotificationCenter.g(this.f18050b);
                return;
            default:
                NotificationCenter.b(this.f18050b);
                return;
        }
    }
}
