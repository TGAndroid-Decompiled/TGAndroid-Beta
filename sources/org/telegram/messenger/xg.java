package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f18110a;
    public final NotificationCenter f18111b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f18110a = i10;
        this.f18111b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18110a) {
            case 0:
                NotificationCenter.g(this.f18111b);
                return;
            default:
                NotificationCenter.b(this.f18111b);
                return;
        }
    }
}
