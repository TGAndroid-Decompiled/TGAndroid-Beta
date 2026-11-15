package org.telegram.messenger;

import java.util.ArrayList;
public final class oj implements Runnable {
    public final int f25766a;
    public final np f25767b;
    public final ArrayList f25768c;

    public oj(np npVar, ArrayList arrayList, int i7) {
        this.f25766a = i7;
        this.f25767b = npVar;
        this.f25768c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25766a) {
            case 0:
                this.f25767b.getNotificationsController().K(this.f25768c, true, false, null);
                return;
            case 1:
                g0.h3(new oj(this.f25767b, this.f25768c, 3));
                return;
            case 2:
                g0.h3(new oj(this.f25767b, this.f25768c, 4));
                return;
            case 3:
                this.f25767b.getNotificationsController().K(this.f25768c, true, false, null);
                return;
            case 4:
                this.f25767b.getNotificationsController().K(this.f25768c, true, false, null);
                return;
            case 5:
                np npVar = this.f25767b;
                npVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f25768c;
                    if (i7 < arrayList.size()) {
                        npVar.b4(npVar.j1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f25767b.getNotificationsController().K(this.f25768c, true, false, null);
                return;
            default:
                g0.h3(new oj(this.f25767b, this.f25768c, 0));
                return;
        }
    }
}
