package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17463a;
    public final NotificationsController f17464b;
    public final ArrayList f17465c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17463a = i10;
        this.f17464b = notificationsController;
        this.f17465c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17463a) {
            case 0:
                NotificationsController.F(this.f17464b, this.f17465c);
                return;
            case 1:
                NotificationsController.S(this.f17464b, this.f17465c);
                return;
            case 2:
                NotificationsController.M(this.f17464b, this.f17465c);
                return;
            case 3:
                NotificationsController.I(this.f17464b, this.f17465c);
                return;
            default:
                NotificationsController.a0(this.f17464b, this.f17465c);
                return;
        }
    }
}
