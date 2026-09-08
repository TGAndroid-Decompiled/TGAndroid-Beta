package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f19635a;
    public final NotificationCenter f19636b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f19635a = i10;
        this.f19636b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19635a) {
            case 0:
                NotificationCenter.g(this.f19636b);
                return;
            default:
                NotificationCenter.b(this.f19636b);
                return;
        }
    }
}
