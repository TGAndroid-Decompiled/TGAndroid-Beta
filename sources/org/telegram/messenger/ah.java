package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f17890a;
    public final NotificationsController f17891b;
    public final long f17892c;
    public final int d;

    public ah(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f17890a = i11;
        this.f17891b = notificationsController;
        this.f17892c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17890a) {
            case 0:
                NotificationsController.h(this.f17891b, this.f17892c, this.d);
                return;
            default:
                NotificationsController.E(this.f17891b, this.f17892c, this.d);
                return;
        }
    }
}
