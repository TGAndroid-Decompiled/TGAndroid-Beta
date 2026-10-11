package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17483a;
    public final NotificationsController f17484b;
    public final ArrayList f17485c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17483a = i10;
        this.f17484b = notificationsController;
        this.f17485c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17483a) {
            case 0:
                NotificationsController.d0(this.f17484b, this.f17485c);
                return;
            case 1:
                NotificationsController.l(this.f17484b, this.f17485c);
                return;
            case 2:
                NotificationsController.i(this.f17484b, this.f17485c);
                return;
            case 3:
                NotificationsController.X(this.f17484b, this.f17485c);
                return;
            default:
                NotificationsController.B(this.f17484b, this.f17485c);
                return;
        }
    }
}
