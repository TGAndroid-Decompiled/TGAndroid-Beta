package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17457a;
    public final NotificationsController f17458b;
    public final ArrayList f17459c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17457a = i10;
        this.f17458b = notificationsController;
        this.f17459c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17457a) {
            case 0:
                NotificationsController.F(this.f17458b, this.f17459c);
                return;
            case 1:
                NotificationsController.S(this.f17458b, this.f17459c);
                return;
            case 2:
                NotificationsController.M(this.f17458b, this.f17459c);
                return;
            case 3:
                NotificationsController.I(this.f17458b, this.f17459c);
                return;
            default:
                NotificationsController.a0(this.f17458b, this.f17459c);
                return;
        }
    }
}
