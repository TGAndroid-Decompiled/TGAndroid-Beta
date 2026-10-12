package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f17193a;
    public final NotificationsController f17194b;

    public bh(NotificationsController notificationsController, int i10) {
        this.f17193a = i10;
        this.f17194b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f17193a) {
            case 0:
                NotificationsController.f(this.f17194b);
                return;
            case 1:
                NotificationsController.H(this.f17194b);
                return;
            case 2:
                NotificationsController.p(this.f17194b);
                return;
            case 3:
                NotificationsController.A(this.f17194b);
                return;
            case 4:
                NotificationsController.J(this.f17194b);
                return;
            case 5:
                NotificationsController.P(this.f17194b);
                return;
            case 6:
                NotificationsController.G(this.f17194b);
                return;
            case 7:
                NotificationsController.T(this.f17194b);
                return;
            case 8:
                NotificationsController.W(this.f17194b);
                return;
            case 9:
                NotificationsController.K(this.f17194b);
                return;
            case 10:
                NotificationsController.c(this.f17194b);
                return;
            case 11:
                NotificationsController.Y(this.f17194b);
                return;
            case 12:
                NotificationsController.b(this.f17194b);
                return;
            default:
                NotificationsController.y(this.f17194b);
                return;
        }
    }
}
