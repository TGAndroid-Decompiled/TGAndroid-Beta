package org.telegram.messenger;
public final class rg implements Runnable {
    public final int f19440a;
    public final NotificationCenter f19441b;

    public rg(NotificationCenter notificationCenter, int i10) {
        this.f19440a = i10;
        this.f19441b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19440a) {
            case 0:
                NotificationCenter.g(this.f19441b);
                return;
            default:
                NotificationCenter.b(this.f19441b);
                return;
        }
    }
}
