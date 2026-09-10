package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f15194a;
    public final NotificationCenter f15195b;

    public fh(NotificationCenter notificationCenter, int i10) {
        this.f15194a = i10;
        this.f15195b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f15194a) {
            case 0:
                NotificationCenter.g(this.f15195b);
                return;
            default:
                NotificationCenter.b(this.f15195b);
                return;
        }
    }
}
