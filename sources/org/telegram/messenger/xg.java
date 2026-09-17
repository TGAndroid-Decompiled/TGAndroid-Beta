package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f17889a;
    public final NotificationCenter f17890b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f17889a = i10;
        this.f17890b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f17889a) {
            case 0:
                NotificationCenter.g(this.f17890b);
                return;
            default:
                NotificationCenter.b(this.f17890b);
                return;
        }
    }
}
