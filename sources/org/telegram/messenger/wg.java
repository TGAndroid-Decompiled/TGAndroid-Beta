package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f18040a;
    public final NotificationCenter f18041b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f18040a = i10;
        this.f18041b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18040a) {
            case 0:
                NotificationCenter.g(this.f18041b);
                return;
            default:
                NotificationCenter.b(this.f18041b);
                return;
        }
    }
}
