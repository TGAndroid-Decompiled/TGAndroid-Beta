package org.telegram.messenger;
public final class pg implements Runnable {
    public final int f21245a;
    public final NotificationCenter f21246b;

    public pg(NotificationCenter notificationCenter, int i9) {
        this.f21245a = i9;
        this.f21246b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f21245a) {
            case 0:
                NotificationCenter.g(this.f21246b);
                return;
            default:
                NotificationCenter.b(this.f21246b);
                return;
        }
    }
}
