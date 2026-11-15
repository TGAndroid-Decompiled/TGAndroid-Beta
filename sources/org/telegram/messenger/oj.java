package org.telegram.messenger;

import java.util.ArrayList;
public final class oj implements Runnable {
    public final int f25767a;
    public final np f25768b;
    public final ArrayList f25769c;

    public oj(np npVar, ArrayList arrayList, int i7) {
        this.f25767a = i7;
        this.f25768b = npVar;
        this.f25769c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25767a) {
            case 0:
                this.f25768b.getNotificationsController().K(this.f25769c, true, false, null);
                return;
            case 1:
                g0.h3(new oj(this.f25768b, this.f25769c, 3));
                return;
            case 2:
                g0.h3(new oj(this.f25768b, this.f25769c, 4));
                return;
            case 3:
                this.f25768b.getNotificationsController().K(this.f25769c, true, false, null);
                return;
            case 4:
                this.f25768b.getNotificationsController().K(this.f25769c, true, false, null);
                return;
            case 5:
                np npVar = this.f25768b;
                npVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f25769c;
                    if (i7 < arrayList.size()) {
                        npVar.b4(npVar.j1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f25768b.getNotificationsController().K(this.f25769c, true, false, null);
                return;
            default:
                g0.h3(new oj(this.f25768b, this.f25769c, 0));
                return;
        }
    }
}
