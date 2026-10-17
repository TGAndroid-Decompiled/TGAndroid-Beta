package org.telegram.messenger;
public final class tg implements Runnable {
    public final int f19582a;
    public final NotificationsController f19583b;

    public tg(NotificationsController notificationsController, int i10) {
        this.f19582a = i10;
        this.f19583b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f19582a) {
            case 0:
                NotificationsController.f(this.f19583b);
                return;
            case 1:
                NotificationsController.H(this.f19583b);
                return;
            case 2:
                NotificationsController.p(this.f19583b);
                return;
            case 3:
                NotificationsController.A(this.f19583b);
                return;
            case 4:
                NotificationsController.J(this.f19583b);
                return;
            case 5:
                NotificationsController.P(this.f19583b);
                return;
            case 6:
                NotificationsController.G(this.f19583b);
                return;
            case 7:
                NotificationsController.T(this.f19583b);
                return;
            case 8:
                NotificationsController.W(this.f19583b);
                return;
            case 9:
                NotificationsController.K(this.f19583b);
                return;
            case 10:
                NotificationsController.c(this.f19583b);
                return;
            case 11:
                NotificationsController.Y(this.f19583b);
                return;
            case 12:
                NotificationsController.b(this.f19583b);
                return;
            default:
                NotificationsController.y(this.f19583b);
                return;
        }
    }
}
