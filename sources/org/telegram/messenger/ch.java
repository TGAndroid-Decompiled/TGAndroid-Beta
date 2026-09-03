package org.telegram.messenger;
public final class ch implements Runnable {
    public final int f16981a;
    public final NotificationsController f16982b;
    public final int f16983c;

    public ch(NotificationsController notificationsController, int i10, int i11) {
        this.f16981a = i11;
        this.f16982b = notificationsController;
        this.f16983c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16981a) {
            case 0:
                NotificationsController.R(this.f16982b, this.f16983c);
                return;
            case 1:
                NotificationsController.W(this.f16982b, this.f16983c);
                return;
            case 2:
                NotificationsController.b0(this.f16982b, this.f16983c);
                return;
            case 3:
                NotificationsController.Y(this.f16982b, this.f16983c);
                return;
            case 4:
                NotificationsController.i(this.f16982b, this.f16983c);
                return;
            case 5:
                NotificationsController.w(this.f16982b, this.f16983c);
                return;
            case 6:
                NotificationsController.q(this.f16982b, this.f16983c);
                return;
            default:
                NotificationsController.B(this.f16982b, this.f16983c);
                return;
        }
    }
}
