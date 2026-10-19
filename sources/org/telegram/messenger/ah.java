package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f17883a;
    public final NotificationsController f17884b;
    public final int f17885c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f17883a = i11;
        this.f17884b = notificationsController;
        this.f17885c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17883a) {
            case 0:
                NotificationsController.q(this.f17884b, this.f17885c);
                return;
            case 1:
                NotificationsController.V(this.f17884b, this.f17885c);
                return;
            case 2:
                NotificationsController.a(this.f17884b, this.f17885c);
                return;
            case 3:
                NotificationsController.g(this.f17884b, this.f17885c);
                return;
            case 4:
                NotificationsController.M(this.f17884b, this.f17885c);
                return;
            case 5:
                NotificationsController.n(this.f17884b, this.f17885c);
                return;
            case 6:
                NotificationsController.e0(this.f17884b, this.f17885c);
                return;
            default:
                NotificationsController.t(this.f17884b, this.f17885c);
                return;
        }
    }
}
