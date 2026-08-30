package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f17076a;
    public final NotificationsController f17077b;

    public dh(NotificationsController notificationsController, int i10) {
        this.f17076a = i10;
        this.f17077b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f17076a) {
            case 0:
                NotificationsController.Q(this.f17077b);
                return;
            case 1:
                NotificationsController.f(this.f17077b);
                return;
            case 2:
                NotificationsController.D(this.f17077b);
                return;
            case 3:
                NotificationsController.U(this.f17077b);
                return;
            case 4:
                NotificationsController.m(this.f17077b);
                return;
            case 5:
                NotificationsController.p(this.f17077b);
                return;
            case 6:
                NotificationsController.o(this.f17077b);
                return;
            case 7:
                NotificationsController.Z(this.f17077b);
                return;
            case 8:
                NotificationsController.z(this.f17077b);
                return;
            case 9:
                NotificationsController.c(this.f17077b);
                return;
            case 10:
                NotificationsController.A(this.f17077b);
                return;
            case 11:
                NotificationsController.d(this.f17077b);
                return;
            case 12:
                NotificationsController.s(this.f17077b);
                return;
            default:
                NotificationsController.O(this.f17077b);
                return;
        }
    }
}
