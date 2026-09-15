package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f15688a;
    public final NotificationsController f15689b;
    public final int f15690c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f15688a = i11;
        this.f15689b = notificationsController;
        this.f15690c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15688a) {
            case 0:
                NotificationsController.R(this.f15689b, this.f15690c);
                return;
            case 1:
                NotificationsController.W(this.f15689b, this.f15690c);
                return;
            case 2:
                NotificationsController.b0(this.f15689b, this.f15690c);
                return;
            case 3:
                NotificationsController.Y(this.f15689b, this.f15690c);
                return;
            case 4:
                NotificationsController.i(this.f15689b, this.f15690c);
                return;
            case 5:
                NotificationsController.w(this.f15689b, this.f15690c);
                return;
            case 6:
                NotificationsController.q(this.f15689b, this.f15690c);
                return;
            default:
                NotificationsController.B(this.f15689b, this.f15690c);
                return;
        }
    }
}
