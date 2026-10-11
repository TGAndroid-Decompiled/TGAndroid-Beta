package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17447a;
    public final NotificationsController f17448b;
    public final ArrayList f17449c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17447a = i10;
        this.f17448b = notificationsController;
        this.f17449c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17447a) {
            case 0:
                NotificationsController.d0(this.f17448b, this.f17449c);
                return;
            case 1:
                NotificationsController.l(this.f17448b, this.f17449c);
                return;
            case 2:
                NotificationsController.i(this.f17448b, this.f17449c);
                return;
            case 3:
                NotificationsController.X(this.f17448b, this.f17449c);
                return;
            default:
                NotificationsController.B(this.f17448b, this.f17449c);
                return;
        }
    }
}
