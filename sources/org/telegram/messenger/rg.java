package org.telegram.messenger;
public final class rg implements Runnable {
    public final int f19443a;
    public final NotificationCenter f19444b;

    public rg(NotificationCenter notificationCenter, int i10) {
        this.f19443a = i10;
        this.f19444b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19443a) {
            case 0:
                NotificationCenter.g(this.f19444b);
                return;
            default:
                NotificationCenter.b(this.f19444b);
                return;
        }
    }
}
