package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f18034a;
    public final NotificationCenter f18035b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f18034a = i10;
        this.f18035b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18034a) {
            case 0:
                NotificationCenter.g(this.f18035b);
                return;
            default:
                NotificationCenter.b(this.f18035b);
                return;
        }
    }
}
