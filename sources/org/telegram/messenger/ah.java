package org.telegram.messenger;
public final class ah implements Runnable {
    public final int f17199a;
    public final NotificationsController f17200b;
    public final int f17201c;

    public ah(NotificationsController notificationsController, int i10, int i11) {
        this.f17199a = i11;
        this.f17200b = notificationsController;
        this.f17201c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17199a) {
            case 0:
                NotificationsController.R(this.f17200b, this.f17201c);
                return;
            case 1:
                NotificationsController.W(this.f17200b, this.f17201c);
                return;
            case 2:
                NotificationsController.b0(this.f17200b, this.f17201c);
                return;
            case 3:
                NotificationsController.Y(this.f17200b, this.f17201c);
                return;
            case 4:
                NotificationsController.i(this.f17200b, this.f17201c);
                return;
            case 5:
                NotificationsController.w(this.f17200b, this.f17201c);
                return;
            case 6:
                NotificationsController.q(this.f17200b, this.f17201c);
                return;
            default:
                NotificationsController.B(this.f17200b, this.f17201c);
                return;
        }
    }
}
