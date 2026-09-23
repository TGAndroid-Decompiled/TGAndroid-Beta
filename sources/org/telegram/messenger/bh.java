package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f15759a;
    public final NotificationsController f15760b;
    public final ArrayList f15761c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f15759a = i10;
        this.f15760b = notificationsController;
        this.f15761c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15759a) {
            case 0:
                NotificationsController.F(this.f15760b, this.f15761c);
                return;
            case 1:
                NotificationsController.S(this.f15760b, this.f15761c);
                return;
            case 2:
                NotificationsController.M(this.f15760b, this.f15761c);
                return;
            case 3:
                NotificationsController.I(this.f15760b, this.f15761c);
                return;
            default:
                NotificationsController.a0(this.f15760b, this.f15761c);
                return;
        }
    }
}
