package org.telegram.messenger;

import java.util.ArrayList;
public final class qj implements Runnable {
    public final int f24707a;
    public final qp f24708b;
    public final ArrayList f24709c;

    public qj(qp qpVar, ArrayList arrayList, int i7) {
        this.f24707a = i7;
        this.f24708b = qpVar;
        this.f24709c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24707a) {
            case 0:
                this.f24708b.getNotificationsController().K(this.f24709c, true, false, null);
                return;
            case 1:
                g0.h3(new qj(this.f24708b, this.f24709c, 3));
                return;
            case 2:
                g0.h3(new qj(this.f24708b, this.f24709c, 4));
                return;
            case 3:
                this.f24708b.getNotificationsController().K(this.f24709c, true, false, null);
                return;
            case 4:
                this.f24708b.getNotificationsController().K(this.f24709c, true, false, null);
                return;
            case 5:
                qp qpVar = this.f24708b;
                qpVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f24709c;
                    if (i7 < arrayList.size()) {
                        qpVar.b4(qpVar.j1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f24708b.getNotificationsController().K(this.f24709c, true, false, null);
                return;
            default:
                g0.h3(new qj(this.f24708b, this.f24709c, 0));
                return;
        }
    }
}
