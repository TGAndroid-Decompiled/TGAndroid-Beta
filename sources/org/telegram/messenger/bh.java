package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f16008a;
    public final NotificationsController f16009b;
    public final ArrayList f16010c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16008a = i10;
        this.f16009b = notificationsController;
        this.f16010c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16008a) {
            case 0:
                NotificationsController.F(this.f16009b, this.f16010c);
                return;
            case 1:
                NotificationsController.S(this.f16009b, this.f16010c);
                return;
            case 2:
                NotificationsController.M(this.f16009b, this.f16010c);
                return;
            case 3:
                NotificationsController.I(this.f16009b, this.f16010c);
                return;
            default:
                NotificationsController.a0(this.f16009b, this.f16010c);
                return;
        }
    }
}
