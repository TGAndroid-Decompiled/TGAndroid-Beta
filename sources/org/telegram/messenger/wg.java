package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f22100a;
    public final NotificationCenter f22101b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f22100a = i10;
        this.f22101b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f22100a) {
            case 0:
                NotificationCenter.g(this.f22101b);
                return;
            default:
                NotificationCenter.b(this.f22101b);
                return;
        }
    }
}
