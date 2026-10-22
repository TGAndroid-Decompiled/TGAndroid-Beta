package org.telegram.messenger;
public final class vg implements Runnable {
    public final int f19778a;
    public final NotificationCenter f19779b;

    public vg(NotificationCenter notificationCenter, int i10) {
        this.f19778a = i10;
        this.f19779b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19778a) {
            case 0:
                NotificationCenter.g(this.f19779b);
                return;
            default:
                NotificationCenter.b(this.f19779b);
                return;
        }
    }
}
