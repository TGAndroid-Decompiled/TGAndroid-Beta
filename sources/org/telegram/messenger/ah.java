package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f15873a;
    public final NotificationsController f15874b;
    public final int f15875c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f15873a = i11;
        this.f15874b = notificationsController;
        this.f15875c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15873a) {
            case 0:
                NotificationsController.R(this.f15874b, this.f15875c);
                return;
            case 1:
                NotificationsController.W(this.f15874b, this.f15875c);
                return;
            case 2:
                NotificationsController.b0(this.f15874b, this.f15875c);
                return;
            case 3:
                NotificationsController.Y(this.f15874b, this.f15875c);
                return;
            case 4:
                NotificationsController.i(this.f15874b, this.f15875c);
                return;
            case 5:
                NotificationsController.w(this.f15874b, this.f15875c);
                return;
            case 6:
                NotificationsController.q(this.f15874b, this.f15875c);
                return;
            default:
                NotificationsController.B(this.f15874b, this.f15875c);
                return;
        }
    }
}
