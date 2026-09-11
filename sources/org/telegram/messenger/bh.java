package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17284a;
    public final NotificationsController f17285b;
    public final ArrayList f17286c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17284a = i10;
        this.f17285b = notificationsController;
        this.f17286c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17284a) {
            case 0:
                NotificationsController.F(this.f17285b, this.f17286c);
                return;
            case 1:
                NotificationsController.S(this.f17285b, this.f17286c);
                return;
            case 2:
                NotificationsController.M(this.f17285b, this.f17286c);
                return;
            case 3:
                NotificationsController.I(this.f17285b, this.f17286c);
                return;
            default:
                NotificationsController.a0(this.f17285b, this.f17286c);
                return;
        }
    }
}
