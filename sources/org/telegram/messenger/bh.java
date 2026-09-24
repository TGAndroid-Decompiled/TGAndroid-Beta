package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f15999a;
    public final NotificationsController f16000b;
    public final ArrayList f16001c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f15999a = i10;
        this.f16000b = notificationsController;
        this.f16001c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15999a) {
            case 0:
                NotificationsController.F(this.f16000b, this.f16001c);
                return;
            case 1:
                NotificationsController.S(this.f16000b, this.f16001c);
                return;
            case 2:
                NotificationsController.M(this.f16000b, this.f16001c);
                return;
            case 3:
                NotificationsController.I(this.f16000b, this.f16001c);
                return;
            default:
                NotificationsController.a0(this.f16000b, this.f16001c);
                return;
        }
    }
}
