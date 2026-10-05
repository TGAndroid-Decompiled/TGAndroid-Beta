package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19709a;
    public final NotificationCenter f19710b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19709a = i10;
        this.f19710b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19709a) {
            case 0:
                NotificationCenter.g(this.f19710b);
                return;
            default:
                NotificationCenter.b(this.f19710b);
                return;
        }
    }
}
