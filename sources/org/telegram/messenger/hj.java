package org.telegram.messenger;

import java.util.ArrayList;
public final class hj implements Runnable {
    public final int f22933a;
    public final hp f22934b;
    public final ArrayList f22935c;

    public hj(hp hpVar, ArrayList arrayList, int i3) {
        this.f22933a = i3;
        this.f22934b = hpVar;
        this.f22935c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f22933a) {
            case 0:
                this.f22934b.getNotificationsController().K(this.f22935c, true, false, null);
                return;
            case 1:
                g0.h3(new hj(this.f22934b, this.f22935c, 3));
                return;
            case 2:
                g0.h3(new hj(this.f22934b, this.f22935c, 4));
                return;
            case 3:
                this.f22934b.getNotificationsController().K(this.f22935c, true, false, null);
                return;
            case 4:
                this.f22934b.getNotificationsController().K(this.f22935c, true, false, null);
                return;
            case 5:
                hp hpVar = this.f22934b;
                hpVar.getClass();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.f22935c;
                    if (i3 < arrayList.size()) {
                        hpVar.b4(hpVar.j1(-((Long) arrayList.get(i3)).longValue()), 0L);
                        i3++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f22934b.getNotificationsController().K(this.f22935c, true, false, null);
                return;
            default:
                g0.h3(new hj(this.f22934b, this.f22935c, 0));
                return;
        }
    }
}
