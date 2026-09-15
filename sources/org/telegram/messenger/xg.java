package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f17880a;
    public final NotificationCenter f17881b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f17880a = i10;
        this.f17881b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                NotificationCenter.g(this.f17881b);
                return;
            default:
                NotificationCenter.b(this.f17881b);
                return;
        }
    }
}
