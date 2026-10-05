package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f17468a;
    public final NotificationsController f17469b;
    public final ArrayList f17470c;

    public bh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f17468a = i10;
        this.f17469b = notificationsController;
        this.f17470c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17468a) {
            case 0:
                NotificationsController.F(this.f17469b, this.f17470c);
                return;
            case 1:
                NotificationsController.S(this.f17469b, this.f17470c);
                return;
            case 2:
                NotificationsController.M(this.f17469b, this.f17470c);
                return;
            case 3:
                NotificationsController.I(this.f17469b, this.f17470c);
                return;
            default:
                NotificationsController.a0(this.f17469b, this.f17470c);
                return;
        }
    }
}
