package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f15684a;
    public final NotificationsController f15685b;
    public final int f15686c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f15684a = i11;
        this.f15685b = notificationsController;
        this.f15686c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15684a) {
            case 0:
                NotificationsController.R(this.f15685b, this.f15686c);
                return;
            case 1:
                NotificationsController.W(this.f15685b, this.f15686c);
                return;
            case 2:
                NotificationsController.b0(this.f15685b, this.f15686c);
                return;
            case 3:
                NotificationsController.Y(this.f15685b, this.f15686c);
                return;
            case 4:
                NotificationsController.i(this.f15685b, this.f15686c);
                return;
            case 5:
                NotificationsController.w(this.f15685b, this.f15686c);
                return;
            case 6:
                NotificationsController.q(this.f15685b, this.f15686c);
                return;
            default:
                NotificationsController.B(this.f15685b, this.f15686c);
                return;
        }
    }
}
