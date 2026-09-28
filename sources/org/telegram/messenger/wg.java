package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f18048a;
    public final NotificationCenter f18049b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f18048a = i10;
        this.f18049b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18048a) {
            case 0:
                NotificationCenter.g(this.f18049b);
                return;
            default:
                NotificationCenter.b(this.f18049b);
                return;
        }
    }
}
