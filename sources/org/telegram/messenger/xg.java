package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f17879a;
    public final NotificationCenter f17880b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f17879a = i10;
        this.f17880b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f17879a) {
            case 0:
                NotificationCenter.g(this.f17880b);
                return;
            default:
                NotificationCenter.b(this.f17880b);
                return;
        }
    }
}
