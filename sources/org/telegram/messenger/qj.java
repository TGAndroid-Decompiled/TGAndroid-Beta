package org.telegram.messenger;

import java.util.ArrayList;
public final class qj implements Runnable {
    public final int f24692a;
    public final qp f24693b;
    public final ArrayList f24694c;

    public qj(qp qpVar, ArrayList arrayList, int i7) {
        this.f24692a = i7;
        this.f24693b = qpVar;
        this.f24694c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24692a) {
            case 0:
                this.f24693b.getNotificationsController().K(this.f24694c, true, false, null);
                return;
            case 1:
                g0.h3(new qj(this.f24693b, this.f24694c, 3));
                return;
            case 2:
                g0.h3(new qj(this.f24693b, this.f24694c, 4));
                return;
            case 3:
                this.f24693b.getNotificationsController().K(this.f24694c, true, false, null);
                return;
            case 4:
                this.f24693b.getNotificationsController().K(this.f24694c, true, false, null);
                return;
            case 5:
                qp qpVar = this.f24693b;
                qpVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f24694c;
                    if (i7 < arrayList.size()) {
                        qpVar.b4(qpVar.j1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f24693b.getNotificationsController().K(this.f24694c, true, false, null);
                return;
            default:
                g0.h3(new qj(this.f24693b, this.f24694c, 0));
                return;
        }
    }
}
