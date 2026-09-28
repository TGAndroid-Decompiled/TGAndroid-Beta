package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f16014a;
    public final NotificationsController f16015b;
    public final ArrayList f16016c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f16014a = i10;
        this.f16015b = notificationsController;
        this.f16016c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16014a) {
            case 0:
                NotificationsController.F(this.f16015b, this.f16016c);
                return;
            case 1:
                NotificationsController.S(this.f16015b, this.f16016c);
                return;
            case 2:
                NotificationsController.M(this.f16015b, this.f16016c);
                return;
            case 3:
                NotificationsController.I(this.f16015b, this.f16016c);
                return;
            default:
                NotificationsController.a0(this.f16015b, this.f16016c);
                return;
        }
    }
}
