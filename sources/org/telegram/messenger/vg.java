package org.telegram.messenger;
public final class vg implements Runnable {
    public final int f19475a;
    public final NotificationCenter f19476b;

    public vg(NotificationCenter notificationCenter, int i10) {
        this.f19475a = i10;
        this.f19476b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19475a) {
            case 0:
                NotificationCenter.g(this.f19476b);
                return;
            default:
                NotificationCenter.b(this.f19476b);
                return;
        }
    }
}
