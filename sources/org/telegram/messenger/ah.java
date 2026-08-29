package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f19734a;
    public final NotificationsController f19735b;

    public ah(NotificationsController notificationsController, int i10) {
        this.f19734a = i10;
        this.f19735b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f19734a) {
            case 0:
                NotificationsController.Q(this.f19735b);
                return;
            case 1:
                NotificationsController.f(this.f19735b);
                return;
            case 2:
                NotificationsController.D(this.f19735b);
                return;
            case 3:
                NotificationsController.U(this.f19735b);
                return;
            case 4:
                NotificationsController.m(this.f19735b);
                return;
            case 5:
                NotificationsController.p(this.f19735b);
                return;
            case 6:
                NotificationsController.o(this.f19735b);
                return;
            case 7:
                NotificationsController.Z(this.f19735b);
                return;
            case 8:
                NotificationsController.z(this.f19735b);
                return;
            case 9:
                NotificationsController.c(this.f19735b);
                return;
            case 10:
                NotificationsController.A(this.f19735b);
                return;
            case 11:
                NotificationsController.d(this.f19735b);
                return;
            case 12:
                NotificationsController.s(this.f19735b);
                return;
            default:
                NotificationsController.O(this.f19735b);
                return;
        }
    }
}
