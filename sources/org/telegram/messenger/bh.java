package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f18027a;
    public final NotificationsController f18028b;
    public final ArrayList f18029c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f18027a = i10;
        this.f18028b = notificationsController;
        this.f18029c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18027a) {
            case 0:
                NotificationsController.d0(this.f18028b, this.f18029c);
                return;
            case 1:
                NotificationsController.l(this.f18028b, this.f18029c);
                return;
            case 2:
                NotificationsController.i(this.f18028b, this.f18029c);
                return;
            case 3:
                NotificationsController.X(this.f18028b, this.f18029c);
                return;
            default:
                NotificationsController.B(this.f18028b, this.f18029c);
                return;
        }
    }
}
