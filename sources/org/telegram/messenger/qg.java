package org.telegram.messenger;
public final class qg implements Runnable {
    public final int f19363a;
    public final NotificationCenter f19364b;

    public qg(NotificationCenter notificationCenter, int i10) {
        this.f19363a = i10;
        this.f19364b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19363a) {
            case 0:
                NotificationCenter.g(this.f19364b);
                return;
            default:
                NotificationCenter.b(this.f19364b);
                return;
        }
    }
}
