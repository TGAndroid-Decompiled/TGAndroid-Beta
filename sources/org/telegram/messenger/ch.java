package org.telegram.messenger;
public final class ch implements Runnable {
    public final int f18426a;
    public final NotificationsController f18427b;
    public final int f18428c;

    public ch(NotificationsController notificationsController, int i10, int i11) {
        this.f18426a = i11;
        this.f18427b = notificationsController;
        this.f18428c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18426a) {
            case 0:
                NotificationsController.R(this.f18427b, this.f18428c);
                return;
            case 1:
                NotificationsController.W(this.f18427b, this.f18428c);
                return;
            case 2:
                NotificationsController.b0(this.f18427b, this.f18428c);
                return;
            case 3:
                NotificationsController.Y(this.f18427b, this.f18428c);
                return;
            case 4:
                NotificationsController.i(this.f18427b, this.f18428c);
                return;
            case 5:
                NotificationsController.w(this.f18427b, this.f18428c);
                return;
            case 6:
                NotificationsController.q(this.f18427b, this.f18428c);
                return;
            default:
                NotificationsController.B(this.f18427b, this.f18428c);
                return;
        }
    }
}
