package org.telegram.messenger;
public final class sg implements Runnable {
    public final int f21501a;
    public final NotificationsController f21502b;
    public final int f21503c;

    public sg(NotificationsController notificationsController, int i9, int i10) {
        this.f21501a = i10;
        this.f21502b = notificationsController;
        this.f21503c = i9;
    }

    @Override
    public final void run() {
        switch (this.f21501a) {
            case 0:
                NotificationsController.R(this.f21502b, this.f21503c);
                return;
            case 1:
                NotificationsController.W(this.f21502b, this.f21503c);
                return;
            case 2:
                NotificationsController.b0(this.f21502b, this.f21503c);
                return;
            case 3:
                NotificationsController.Y(this.f21502b, this.f21503c);
                return;
            case 4:
                NotificationsController.i(this.f21502b, this.f21503c);
                return;
            case 5:
                NotificationsController.w(this.f21502b, this.f21503c);
                return;
            case 6:
                NotificationsController.q(this.f21502b, this.f21503c);
                return;
            default:
                NotificationsController.B(this.f21502b, this.f21503c);
                return;
        }
    }
}
