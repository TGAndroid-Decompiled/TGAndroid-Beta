package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f15920a;
    public final NotificationsController f15921b;
    public final int f15922c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f15920a = i11;
        this.f15921b = notificationsController;
        this.f15922c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15920a) {
            case 0:
                NotificationsController.R(this.f15921b, this.f15922c);
                return;
            case 1:
                NotificationsController.W(this.f15921b, this.f15922c);
                return;
            case 2:
                NotificationsController.b0(this.f15921b, this.f15922c);
                return;
            case 3:
                NotificationsController.Y(this.f15921b, this.f15922c);
                return;
            case 4:
                NotificationsController.i(this.f15921b, this.f15922c);
                return;
            case 5:
                NotificationsController.w(this.f15921b, this.f15922c);
                return;
            case 6:
                NotificationsController.q(this.f15921b, this.f15922c);
                return;
            default:
                NotificationsController.B(this.f15921b, this.f15922c);
                return;
        }
    }
}
