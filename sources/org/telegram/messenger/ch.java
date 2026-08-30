package org.telegram.messenger;
public final class ch implements Runnable {
    public final int f16996a;
    public final NotificationsController f16997b;
    public final int f16998c;

    public ch(NotificationsController notificationsController, int i10, int i11) {
        this.f16996a = i11;
        this.f16997b = notificationsController;
        this.f16998c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16996a) {
            case 0:
                NotificationsController.R(this.f16997b, this.f16998c);
                return;
            case 1:
                NotificationsController.W(this.f16997b, this.f16998c);
                return;
            case 2:
                NotificationsController.b0(this.f16997b, this.f16998c);
                return;
            case 3:
                NotificationsController.Y(this.f16997b, this.f16998c);
                return;
            case 4:
                NotificationsController.i(this.f16997b, this.f16998c);
                return;
            case 5:
                NotificationsController.w(this.f16997b, this.f16998c);
                return;
            case 6:
                NotificationsController.q(this.f16997b, this.f16998c);
                return;
            default:
                NotificationsController.B(this.f16997b, this.f16998c);
                return;
        }
    }
}
