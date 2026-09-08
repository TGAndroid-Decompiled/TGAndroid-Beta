package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f17300a;
    public final NotificationsController f17301b;

    public bh(NotificationsController notificationsController, int i10) {
        this.f17300a = i10;
        this.f17301b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f17300a) {
            case 0:
                NotificationsController.Q(this.f17301b);
                return;
            case 1:
                NotificationsController.f(this.f17301b);
                return;
            case 2:
                NotificationsController.D(this.f17301b);
                return;
            case 3:
                NotificationsController.U(this.f17301b);
                return;
            case 4:
                NotificationsController.m(this.f17301b);
                return;
            case 5:
                NotificationsController.p(this.f17301b);
                return;
            case 6:
                NotificationsController.o(this.f17301b);
                return;
            case 7:
                NotificationsController.Z(this.f17301b);
                return;
            case 8:
                NotificationsController.z(this.f17301b);
                return;
            case 9:
                NotificationsController.c(this.f17301b);
                return;
            case 10:
                NotificationsController.A(this.f17301b);
                return;
            case 11:
                NotificationsController.d(this.f17301b);
                return;
            case 12:
                NotificationsController.s(this.f17301b);
                return;
            default:
                NotificationsController.O(this.f17301b);
                return;
        }
    }
}
