package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f19608a;
    public final NotificationCenter f19609b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f19608a = i10;
        this.f19609b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19608a) {
            case 0:
                NotificationCenter.g(this.f19609b);
                return;
            default:
                NotificationCenter.b(this.f19609b);
                return;
        }
    }
}
