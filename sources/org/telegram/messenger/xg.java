package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f21848a;
    public final NotificationCenter f21849b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f21848a = i10;
        this.f21849b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f21848a) {
            case 0:
                NotificationCenter.g(this.f21849b);
                return;
            default:
                NotificationCenter.b(this.f21849b);
                return;
        }
    }
}
