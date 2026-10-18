package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f17880a;
    public final NotificationsController f17881b;
    public final int f17882c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f17880a = i11;
        this.f17881b = notificationsController;
        this.f17882c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                NotificationsController.q(this.f17881b, this.f17882c);
                return;
            case 1:
                NotificationsController.V(this.f17881b, this.f17882c);
                return;
            case 2:
                NotificationsController.a(this.f17881b, this.f17882c);
                return;
            case 3:
                NotificationsController.g(this.f17881b, this.f17882c);
                return;
            case 4:
                NotificationsController.M(this.f17881b, this.f17882c);
                return;
            case 5:
                NotificationsController.n(this.f17881b, this.f17882c);
                return;
            case 6:
                NotificationsController.e0(this.f17881b, this.f17882c);
                return;
            default:
                NotificationsController.t(this.f17881b, this.f17882c);
                return;
        }
    }
}
