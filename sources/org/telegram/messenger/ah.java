package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f15927a;
    public final NotificationsController f15928b;

    public ah(NotificationsController notificationsController, int i10) {
        this.f15927a = i10;
        this.f15928b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f15927a) {
            case 0:
                NotificationsController.Q(this.f15928b);
                return;
            case 1:
                NotificationsController.f(this.f15928b);
                return;
            case 2:
                NotificationsController.D(this.f15928b);
                return;
            case 3:
                NotificationsController.U(this.f15928b);
                return;
            case 4:
                NotificationsController.m(this.f15928b);
                return;
            case 5:
                NotificationsController.p(this.f15928b);
                return;
            case 6:
                NotificationsController.o(this.f15928b);
                return;
            case 7:
                NotificationsController.Z(this.f15928b);
                return;
            case 8:
                NotificationsController.z(this.f15928b);
                return;
            case 9:
                NotificationsController.c(this.f15928b);
                return;
            case 10:
                NotificationsController.A(this.f15928b);
                return;
            case 11:
                NotificationsController.d(this.f15928b);
                return;
            case 12:
                NotificationsController.s(this.f15928b);
                return;
            default:
                NotificationsController.O(this.f15928b);
                return;
        }
    }
}
