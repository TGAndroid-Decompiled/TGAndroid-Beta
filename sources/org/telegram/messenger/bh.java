package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f19827a;
    public final NotificationsController f19828b;
    public final ArrayList f19829c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f19827a = i10;
        this.f19828b = notificationsController;
        this.f19829c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19827a) {
            case 0:
                NotificationsController.F(this.f19828b, this.f19829c);
                return;
            case 1:
                NotificationsController.S(this.f19828b, this.f19829c);
                return;
            case 2:
                NotificationsController.M(this.f19828b, this.f19829c);
                return;
            case 3:
                NotificationsController.I(this.f19828b, this.f19829c);
                return;
            default:
                NotificationsController.a0(this.f19828b, this.f19829c);
                return;
        }
    }
}
