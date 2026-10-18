package org.telegram.messenger;
public final class qg implements Runnable {
    public final int f19366a;
    public final NotificationCenter f19367b;

    public qg(NotificationCenter notificationCenter, int i10) {
        this.f19366a = i10;
        this.f19367b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19366a) {
            case 0:
                NotificationCenter.g(this.f19367b);
                return;
            default:
                NotificationCenter.b(this.f19367b);
                return;
        }
    }
}
