package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f18510a;
    public final NotificationsController f18511b;

    public dh(NotificationsController notificationsController, int i10) {
        this.f18510a = i10;
        this.f18511b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f18510a) {
            case 0:
                NotificationsController.Q(this.f18511b);
                return;
            case 1:
                NotificationsController.f(this.f18511b);
                return;
            case 2:
                NotificationsController.D(this.f18511b);
                return;
            case 3:
                NotificationsController.U(this.f18511b);
                return;
            case 4:
                NotificationsController.m(this.f18511b);
                return;
            case 5:
                NotificationsController.p(this.f18511b);
                return;
            case 6:
                NotificationsController.o(this.f18511b);
                return;
            case 7:
                NotificationsController.Z(this.f18511b);
                return;
            case 8:
                NotificationsController.z(this.f18511b);
                return;
            case 9:
                NotificationsController.c(this.f18511b);
                return;
            case 10:
                NotificationsController.A(this.f18511b);
                return;
            case 11:
                NotificationsController.d(this.f18511b);
                return;
            case 12:
                NotificationsController.s(this.f18511b);
                return;
            default:
                NotificationsController.O(this.f18511b);
                return;
        }
    }
}
