package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17964a;
    public final NotificationsController f17965b;
    public final ArrayList f17966c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17964a = i10;
        this.f17965b = notificationsController;
        this.f17966c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17964a) {
            case 0:
                NotificationsController.d0(this.f17965b, this.f17966c);
                return;
            case 1:
                NotificationsController.l(this.f17965b, this.f17966c);
                return;
            case 2:
                NotificationsController.i(this.f17965b, this.f17966c);
                return;
            case 3:
                NotificationsController.X(this.f17965b, this.f17966c);
                return;
            default:
                NotificationsController.B(this.f17965b, this.f17966c);
                return;
        }
    }
}
