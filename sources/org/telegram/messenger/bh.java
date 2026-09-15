package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f15777a;
    public final NotificationsController f15778b;

    public bh(NotificationsController notificationsController, int i10) {
        this.f15777a = i10;
        this.f15778b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f15777a) {
            case 0:
                NotificationsController.Q(this.f15778b);
                return;
            case 1:
                NotificationsController.f(this.f15778b);
                return;
            case 2:
                NotificationsController.D(this.f15778b);
                return;
            case 3:
                NotificationsController.U(this.f15778b);
                return;
            case 4:
                NotificationsController.m(this.f15778b);
                return;
            case 5:
                NotificationsController.p(this.f15778b);
                return;
            case 6:
                NotificationsController.o(this.f15778b);
                return;
            case 7:
                NotificationsController.Z(this.f15778b);
                return;
            case 8:
                NotificationsController.z(this.f15778b);
                return;
            case 9:
                NotificationsController.c(this.f15778b);
                return;
            case 10:
                NotificationsController.A(this.f15778b);
                return;
            case 11:
                NotificationsController.d(this.f15778b);
                return;
            case 12:
                NotificationsController.s(this.f15778b);
                return;
            default:
                NotificationsController.O(this.f15778b);
                return;
        }
    }
}
