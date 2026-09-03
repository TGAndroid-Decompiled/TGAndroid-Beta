package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f18512a;
    public final NotificationsController f18513b;

    public dh(NotificationsController notificationsController, int i10) {
        this.f18512a = i10;
        this.f18513b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f18512a) {
            case 0:
                NotificationsController.Q(this.f18513b);
                return;
            case 1:
                NotificationsController.f(this.f18513b);
                return;
            case 2:
                NotificationsController.D(this.f18513b);
                return;
            case 3:
                NotificationsController.U(this.f18513b);
                return;
            case 4:
                NotificationsController.m(this.f18513b);
                return;
            case 5:
                NotificationsController.p(this.f18513b);
                return;
            case 6:
                NotificationsController.o(this.f18513b);
                return;
            case 7:
                NotificationsController.Z(this.f18513b);
                return;
            case 8:
                NotificationsController.z(this.f18513b);
                return;
            case 9:
                NotificationsController.c(this.f18513b);
                return;
            case 10:
                NotificationsController.A(this.f18513b);
                return;
            case 11:
                NotificationsController.d(this.f18513b);
                return;
            case 12:
                NotificationsController.s(this.f18513b);
                return;
            default:
                NotificationsController.O(this.f18513b);
                return;
        }
    }
}
