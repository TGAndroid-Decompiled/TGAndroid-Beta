package org.telegram.messenger;
public final class jh implements Runnable {
    public final int f15553a;
    public final NotificationsController f15554b;

    public jh(NotificationsController notificationsController, int i10) {
        this.f15553a = i10;
        this.f15554b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f15553a) {
            case 0:
                NotificationsController.Q(this.f15554b);
                return;
            case 1:
                NotificationsController.f(this.f15554b);
                return;
            case 2:
                NotificationsController.D(this.f15554b);
                return;
            case 3:
                NotificationsController.U(this.f15554b);
                return;
            case 4:
                NotificationsController.m(this.f15554b);
                return;
            case 5:
                NotificationsController.p(this.f15554b);
                return;
            case 6:
                NotificationsController.o(this.f15554b);
                return;
            case 7:
                NotificationsController.Z(this.f15554b);
                return;
            case 8:
                NotificationsController.z(this.f15554b);
                return;
            case 9:
                NotificationsController.c(this.f15554b);
                return;
            case 10:
                NotificationsController.A(this.f15554b);
                return;
            case 11:
                NotificationsController.d(this.f15554b);
                return;
            case 12:
                NotificationsController.s(this.f15554b);
                return;
            default:
                NotificationsController.O(this.f15554b);
                return;
        }
    }
}
