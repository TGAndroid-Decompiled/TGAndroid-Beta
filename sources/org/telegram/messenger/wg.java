package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f17780a;
    public final NotificationCenter f17781b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f17780a = i10;
        this.f17781b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f17780a) {
            case 0:
                NotificationCenter.g(this.f17781b);
                return;
            default:
                NotificationCenter.b(this.f17781b);
                return;
        }
    }
}
