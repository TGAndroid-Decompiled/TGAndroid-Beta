package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19726a;
    public final NotificationCenter f19727b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19726a = i10;
        this.f19727b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19726a) {
            case 0:
                NotificationCenter.g(this.f19727b);
                return;
            default:
                NotificationCenter.b(this.f19727b);
                return;
        }
    }
}
