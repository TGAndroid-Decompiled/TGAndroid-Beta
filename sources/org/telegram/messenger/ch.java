package org.telegram.messenger;
public final class ch implements Runnable {
    public final int f18424a;
    public final NotificationsController f18425b;
    public final int f18426c;

    public ch(NotificationsController notificationsController, int i10, int i11) {
        this.f18424a = i11;
        this.f18425b = notificationsController;
        this.f18426c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18424a) {
            case 0:
                NotificationsController.R(this.f18425b, this.f18426c);
                return;
            case 1:
                NotificationsController.W(this.f18425b, this.f18426c);
                return;
            case 2:
                NotificationsController.b0(this.f18425b, this.f18426c);
                return;
            case 3:
                NotificationsController.Y(this.f18425b, this.f18426c);
                return;
            case 4:
                NotificationsController.i(this.f18425b, this.f18426c);
                return;
            case 5:
                NotificationsController.w(this.f18425b, this.f18426c);
                return;
            case 6:
                NotificationsController.q(this.f18425b, this.f18426c);
                return;
            default:
                NotificationsController.B(this.f18425b, this.f18426c);
                return;
        }
    }
}
