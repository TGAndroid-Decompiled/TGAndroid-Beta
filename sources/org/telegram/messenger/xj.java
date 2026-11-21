package org.telegram.messenger;

import java.util.ArrayList;
public final class xj implements Runnable {
    public final int f27927a;
    public final mp f27928b;
    public final ArrayList f27929c;

    public xj(mp mpVar, ArrayList arrayList, int i7) {
        this.f27927a = i7;
        this.f27928b = mpVar;
        this.f27929c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f27927a) {
            case 0:
                g0.g3(new xj(this.f27928b, this.f27929c, 2));
                return;
            case 1:
                this.f27928b.getNotificationsController().K(this.f27929c, true, false, null);
                return;
            case 2:
                this.f27928b.getNotificationsController().K(this.f27929c, true, false, null);
                return;
            case 3:
                g0.g3(new xj(this.f27928b, this.f27929c, 5));
                return;
            case 4:
                mp mpVar = this.f27928b;
                mpVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f27929c;
                    if (i7 < arrayList.size()) {
                        mpVar.j4(mpVar.l1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 5:
                this.f27928b.getNotificationsController().K(this.f27929c, true, false, null);
                return;
            case 6:
                this.f27928b.getNotificationsController().K(this.f27929c, true, false, null);
                return;
            default:
                g0.g3(new xj(this.f27928b, this.f27929c, 1));
                return;
        }
    }
}
