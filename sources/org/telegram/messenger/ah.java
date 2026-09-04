package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f17172a;
    public final NotificationsController f17173b;
    public final int f17174c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f17172a = i11;
        this.f17173b = notificationsController;
        this.f17174c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17172a) {
            case 0:
                NotificationsController.R(this.f17173b, this.f17174c);
                return;
            case 1:
                NotificationsController.W(this.f17173b, this.f17174c);
                return;
            case 2:
                NotificationsController.b0(this.f17173b, this.f17174c);
                return;
            case 3:
                NotificationsController.Y(this.f17173b, this.f17174c);
                return;
            case 4:
                NotificationsController.i(this.f17173b, this.f17174c);
                return;
            case 5:
                NotificationsController.w(this.f17173b, this.f17174c);
                return;
            case 6:
                NotificationsController.q(this.f17173b, this.f17174c);
                return;
            default:
                NotificationsController.B(this.f17173b, this.f17174c);
                return;
        }
    }
}
