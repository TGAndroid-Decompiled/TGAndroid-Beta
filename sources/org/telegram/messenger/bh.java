package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f16031a;
    public final NotificationsController f16032b;
    public final ArrayList f16033c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16031a = i10;
        this.f16032b = notificationsController;
        this.f16033c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16031a) {
            case 0:
                NotificationsController.F(this.f16032b, this.f16033c);
                return;
            case 1:
                NotificationsController.S(this.f16032b, this.f16033c);
                return;
            case 2:
                NotificationsController.M(this.f16032b, this.f16033c);
                return;
            case 3:
                NotificationsController.I(this.f16032b, this.f16033c);
                return;
            default:
                NotificationsController.a0(this.f16032b, this.f16033c);
                return;
        }
    }
}
