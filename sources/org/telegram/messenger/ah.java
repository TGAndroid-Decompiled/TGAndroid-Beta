package org.telegram.messenger;

import java.util.ArrayList;
public final class ah implements Runnable {
    public final int f17955a;
    public final NotificationsController f17956b;
    public final ArrayList f17957c;

    public ah(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17955a = i10;
        this.f17956b = notificationsController;
        this.f17957c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17955a) {
            case 0:
                NotificationsController.d0(this.f17956b, this.f17957c);
                return;
            case 1:
                NotificationsController.l(this.f17956b, this.f17957c);
                return;
            case 2:
                NotificationsController.i(this.f17956b, this.f17957c);
                return;
            case 3:
                NotificationsController.X(this.f17956b, this.f17957c);
                return;
            default:
                NotificationsController.B(this.f17956b, this.f17957c);
                return;
        }
    }
}
