package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17311a;
    public final NotificationsController f17312b;
    public final ArrayList f17313c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17311a = i10;
        this.f17312b = notificationsController;
        this.f17313c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17311a) {
            case 0:
                NotificationsController.F(this.f17312b, this.f17313c);
                return;
            case 1:
                NotificationsController.S(this.f17312b, this.f17313c);
                return;
            case 2:
                NotificationsController.M(this.f17312b, this.f17313c);
                return;
            case 3:
                NotificationsController.I(this.f17312b, this.f17313c);
                return;
            default:
                NotificationsController.a0(this.f17312b, this.f17313c);
                return;
        }
    }
}
