package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f15905a;
    public final NotificationsController f15906b;
    public final int f15907c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f15905a = i11;
        this.f15906b = notificationsController;
        this.f15907c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15905a) {
            case 0:
                NotificationsController.R(this.f15906b, this.f15907c);
                return;
            case 1:
                NotificationsController.W(this.f15906b, this.f15907c);
                return;
            case 2:
                NotificationsController.b0(this.f15906b, this.f15907c);
                return;
            case 3:
                NotificationsController.Y(this.f15906b, this.f15907c);
                return;
            case 4:
                NotificationsController.i(this.f15906b, this.f15907c);
                return;
            case 5:
                NotificationsController.w(this.f15906b, this.f15907c);
                return;
            case 6:
                NotificationsController.q(this.f15906b, this.f15907c);
                return;
            default:
                NotificationsController.B(this.f15906b, this.f15907c);
                return;
        }
    }
}
