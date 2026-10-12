package org.telegram.messenger;
public final class bh implements Runnable {
    public final int f17192a;
    public final NotificationsController f17193b;

    public bh(NotificationsController notificationsController, int i10) {
        this.f17192a = i10;
        this.f17193b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f17192a) {
            case 0:
                NotificationsController.f(this.f17193b);
                return;
            case 1:
                NotificationsController.H(this.f17193b);
                return;
            case 2:
                NotificationsController.p(this.f17193b);
                return;
            case 3:
                NotificationsController.A(this.f17193b);
                return;
            case 4:
                NotificationsController.J(this.f17193b);
                return;
            case 5:
                NotificationsController.P(this.f17193b);
                return;
            case 6:
                NotificationsController.G(this.f17193b);
                return;
            case 7:
                NotificationsController.T(this.f17193b);
                return;
            case 8:
                NotificationsController.W(this.f17193b);
                return;
            case 9:
                NotificationsController.K(this.f17193b);
                return;
            case 10:
                NotificationsController.c(this.f17193b);
                return;
            case 11:
                NotificationsController.Y(this.f17193b);
                return;
            case 12:
                NotificationsController.b(this.f17193b);
                return;
            default:
                NotificationsController.y(this.f17193b);
                return;
        }
    }
}
