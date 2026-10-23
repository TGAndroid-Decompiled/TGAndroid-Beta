package org.telegram.messenger;

import java.util.ArrayList;
public final class ah implements Runnable {
    public final int f17892a;
    public final NotificationsController f17893b;
    public final ArrayList f17894c;

    public ah(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17892a = i10;
        this.f17893b = notificationsController;
        this.f17894c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17892a) {
            case 0:
                NotificationsController.d0(this.f17893b, this.f17894c);
                return;
            case 1:
                NotificationsController.l(this.f17893b, this.f17894c);
                return;
            case 2:
                NotificationsController.i(this.f17893b, this.f17894c);
                return;
            case 3:
                NotificationsController.X(this.f17893b, this.f17894c);
                return;
            default:
                NotificationsController.B(this.f17893b, this.f17894c);
                return;
        }
    }
}
