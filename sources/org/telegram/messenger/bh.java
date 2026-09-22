package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f16015a;
    public final NotificationsController f16016b;

    public bh(NotificationsController notificationsController, int i10) {
        this.f16015a = i10;
        this.f16016b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f16015a) {
            case 0:
                NotificationsController.Q(this.f16016b);
                return;
            case 1:
                NotificationsController.f(this.f16016b);
                return;
            case 2:
                NotificationsController.D(this.f16016b);
                return;
            case 3:
                NotificationsController.U(this.f16016b);
                return;
            case 4:
                NotificationsController.m(this.f16016b);
                return;
            case 5:
                NotificationsController.p(this.f16016b);
                return;
            case 6:
                NotificationsController.o(this.f16016b);
                return;
            case 7:
                NotificationsController.Z(this.f16016b);
                return;
            case 8:
                NotificationsController.z(this.f16016b);
                return;
            case 9:
                NotificationsController.c(this.f16016b);
                return;
            case 10:
                NotificationsController.A(this.f16016b);
                return;
            case 11:
                NotificationsController.d(this.f16016b);
                return;
            case 12:
                NotificationsController.s(this.f16016b);
                return;
            default:
                NotificationsController.O(this.f16016b);
                return;
        }
    }
}
