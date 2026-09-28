package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f18047a;
    public final NotificationCenter f18048b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f18047a = i10;
        this.f18048b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18047a) {
            case 0:
                NotificationCenter.g(this.f18048b);
                return;
            default:
                NotificationCenter.b(this.f18048b);
                return;
        }
    }
}
