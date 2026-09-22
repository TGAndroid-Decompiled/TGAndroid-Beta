package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f18125a;
    public final NotificationCenter f18126b;

    public xg(NotificationCenter notificationCenter, int i10) {
        this.f18125a = i10;
        this.f18126b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18125a) {
            case 0:
                NotificationCenter.g(this.f18126b);
                return;
            default:
                NotificationCenter.b(this.f18126b);
                return;
        }
    }
}
