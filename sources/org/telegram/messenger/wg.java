package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19730a;
    public final NotificationCenter f19731b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19730a = i10;
        this.f19731b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19730a) {
            case 0:
                NotificationCenter.g(this.f19731b);
                return;
            default:
                NotificationCenter.b(this.f19731b);
                return;
        }
    }
}
