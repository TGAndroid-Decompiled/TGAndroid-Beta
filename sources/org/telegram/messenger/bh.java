package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17458a;
    public final NotificationsController f17459b;
    public final ArrayList f17460c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17458a = i10;
        this.f17459b = notificationsController;
        this.f17460c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17458a) {
            case 0:
                NotificationsController.F(this.f17459b, this.f17460c);
                return;
            case 1:
                NotificationsController.S(this.f17459b, this.f17460c);
                return;
            case 2:
                NotificationsController.M(this.f17459b, this.f17460c);
                return;
            case 3:
                NotificationsController.I(this.f17459b, this.f17460c);
                return;
            default:
                NotificationsController.a0(this.f17459b, this.f17460c);
                return;
        }
    }
}
