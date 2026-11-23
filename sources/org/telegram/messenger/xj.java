package org.telegram.messenger;

import java.util.ArrayList;
public final class xj implements Runnable {
    public final int f28015a;
    public final mp f28016b;
    public final ArrayList f28017c;

    public xj(mp mpVar, ArrayList arrayList, int i7) {
        this.f28015a = i7;
        this.f28016b = mpVar;
        this.f28017c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f28015a) {
            case 0:
                g0.g3(new xj(this.f28016b, this.f28017c, 2));
                return;
            case 1:
                this.f28016b.getNotificationsController().K(this.f28017c, true, false, null);
                return;
            case 2:
                this.f28016b.getNotificationsController().K(this.f28017c, true, false, null);
                return;
            case 3:
                g0.g3(new xj(this.f28016b, this.f28017c, 5));
                return;
            case 4:
                mp mpVar = this.f28016b;
                mpVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f28017c;
                    if (i7 < arrayList.size()) {
                        mpVar.j4(mpVar.l1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 5:
                this.f28016b.getNotificationsController().K(this.f28017c, true, false, null);
                return;
            case 6:
                this.f28016b.getNotificationsController().K(this.f28017c, true, false, null);
                return;
            default:
                g0.g3(new xj(this.f28016b, this.f28017c, 1));
                return;
        }
    }
}
