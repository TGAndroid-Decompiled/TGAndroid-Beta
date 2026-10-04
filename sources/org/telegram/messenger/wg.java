package org.telegram.messenger;
public final class wg implements Runnable {
    public final int f19704a;
    public final NotificationCenter f19705b;

    public wg(NotificationCenter notificationCenter, int i10) {
        this.f19704a = i10;
        this.f19705b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19704a) {
            case 0:
                NotificationCenter.g(this.f19705b);
                return;
            default:
                NotificationCenter.b(this.f19705b);
                return;
        }
    }
}
