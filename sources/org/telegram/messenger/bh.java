package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f16015a;
    public final NotificationsController f16016b;
    public final ArrayList f16017c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16015a = i10;
        this.f16016b = notificationsController;
        this.f16017c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16015a) {
            case 0:
                NotificationsController.F(this.f16016b, this.f16017c);
                return;
            case 1:
                NotificationsController.S(this.f16016b, this.f16017c);
                return;
            case 2:
                NotificationsController.M(this.f16016b, this.f16017c);
                return;
            case 3:
                NotificationsController.I(this.f16016b, this.f16017c);
                return;
            default:
                NotificationsController.a0(this.f16016b, this.f16017c);
                return;
        }
    }
}
