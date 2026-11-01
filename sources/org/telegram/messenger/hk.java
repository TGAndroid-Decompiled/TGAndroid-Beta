package org.telegram.messenger;

import java.util.ArrayList;
public final class hk implements Runnable {
    public final int f16073a;
    public final wp f16074b;
    public final ArrayList f16075c;

    public hk(wp wpVar, ArrayList arrayList, int i10) {
        this.f16073a = i10;
        this.f16074b = wpVar;
        this.f16075c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16073a) {
            case 0:
                this.f16074b.getNotificationsController().K(this.f16075c, true, false, null);
                return;
            case 1:
                i0.g3(new hk(this.f16074b, this.f16075c, 3));
                return;
            case 2:
                i0.g3(new hk(this.f16074b, this.f16075c, 5));
                return;
            case 3:
                this.f16074b.getNotificationsController().K(this.f16075c, true, false, null);
                return;
            case 4:
                wp wpVar = this.f16074b;
                wpVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f16075c;
                    if (i10 < arrayList.size()) {
                        wpVar.Y3(wpVar.i1(-((Long) arrayList.get(i10)).longValue()), 0L);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 5:
                this.f16074b.getNotificationsController().K(this.f16075c, true, false, null);
                return;
            case 6:
                this.f16074b.getNotificationsController().K(this.f16075c, true, false, null);
                return;
            default:
                i0.g3(new hk(this.f16074b, this.f16075c, 0));
                return;
        }
    }
}
