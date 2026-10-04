package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f17356a;
    public final NotificationsController f17357b;

    public ah(NotificationsController notificationsController, int i10) {
        this.f17356a = i10;
        this.f17357b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f17356a) {
            case 0:
                NotificationsController.Q(this.f17357b);
                return;
            case 1:
                NotificationsController.f(this.f17357b);
                return;
            case 2:
                NotificationsController.D(this.f17357b);
                return;
            case 3:
                NotificationsController.U(this.f17357b);
                return;
            case 4:
                NotificationsController.m(this.f17357b);
                return;
            case 5:
                NotificationsController.p(this.f17357b);
                return;
            case 6:
                NotificationsController.o(this.f17357b);
                return;
            case 7:
                NotificationsController.Z(this.f17357b);
                return;
            case 8:
                NotificationsController.z(this.f17357b);
                return;
            case 9:
                NotificationsController.c(this.f17357b);
                return;
            case 10:
                NotificationsController.A(this.f17357b);
                return;
            case 11:
                NotificationsController.d(this.f17357b);
                return;
            case 12:
                NotificationsController.s(this.f17357b);
                return;
            default:
                NotificationsController.O(this.f17357b);
                return;
        }
    }
}
