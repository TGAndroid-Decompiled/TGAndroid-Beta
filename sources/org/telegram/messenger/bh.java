package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f17970a;
    public final NotificationsController f17971b;
    public final int f17972c;

    public bh(NotificationsController notificationsController, int i10, int i11) {
        this.f17970a = i11;
        this.f17971b = notificationsController;
        this.f17972c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17970a) {
            case 0:
                NotificationsController.q(this.f17971b, this.f17972c);
                return;
            case 1:
                NotificationsController.V(this.f17971b, this.f17972c);
                return;
            case 2:
                NotificationsController.a(this.f17971b, this.f17972c);
                return;
            case 3:
                NotificationsController.g(this.f17971b, this.f17972c);
                return;
            case 4:
                NotificationsController.M(this.f17971b, this.f17972c);
                return;
            case 5:
                NotificationsController.n(this.f17971b, this.f17972c);
                return;
            case 6:
                NotificationsController.e0(this.f17971b, this.f17972c);
                return;
            default:
                NotificationsController.t(this.f17971b, this.f17972c);
                return;
        }
    }
}
