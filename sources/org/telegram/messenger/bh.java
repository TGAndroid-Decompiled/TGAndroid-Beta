package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f16886a;
    public final NotificationsController f16887b;

    public bh(NotificationsController notificationsController, int i10) {
        this.f16886a = i10;
        this.f16887b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f16886a) {
            case 0:
                NotificationsController.f(this.f16887b);
                return;
            case 1:
                NotificationsController.H(this.f16887b);
                return;
            case 2:
                NotificationsController.p(this.f16887b);
                return;
            case 3:
                NotificationsController.A(this.f16887b);
                return;
            case 4:
                NotificationsController.J(this.f16887b);
                return;
            case 5:
                NotificationsController.P(this.f16887b);
                return;
            case 6:
                NotificationsController.G(this.f16887b);
                return;
            case 7:
                NotificationsController.T(this.f16887b);
                return;
            case 8:
                NotificationsController.W(this.f16887b);
                return;
            case 9:
                NotificationsController.K(this.f16887b);
                return;
            case 10:
                NotificationsController.c(this.f16887b);
                return;
            case 11:
                NotificationsController.Y(this.f16887b);
                return;
            case 12:
                NotificationsController.b(this.f16887b);
                return;
            default:
                NotificationsController.y(this.f16887b);
                return;
        }
    }
}
