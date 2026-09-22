package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f15775a;
    public final NotificationsController f15776b;

    public bh(NotificationsController notificationsController, int i10) {
        this.f15775a = i10;
        this.f15776b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f15775a) {
            case 0:
                NotificationsController.Q(this.f15776b);
                return;
            case 1:
                NotificationsController.f(this.f15776b);
                return;
            case 2:
                NotificationsController.D(this.f15776b);
                return;
            case 3:
                NotificationsController.U(this.f15776b);
                return;
            case 4:
                NotificationsController.m(this.f15776b);
                return;
            case 5:
                NotificationsController.p(this.f15776b);
                return;
            case 6:
                NotificationsController.o(this.f15776b);
                return;
            case 7:
                NotificationsController.Z(this.f15776b);
                return;
            case 8:
                NotificationsController.z(this.f15776b);
                return;
            case 9:
                NotificationsController.c(this.f15776b);
                return;
            case 10:
                NotificationsController.A(this.f15776b);
                return;
            case 11:
                NotificationsController.d(this.f15776b);
                return;
            case 12:
                NotificationsController.s(this.f15776b);
                return;
            default:
                NotificationsController.O(this.f15776b);
                return;
        }
    }
}
