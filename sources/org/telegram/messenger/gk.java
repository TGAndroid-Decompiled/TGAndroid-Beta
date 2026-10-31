package org.telegram.messenger;

import java.util.ArrayList;
public final class gk implements Runnable {
    public final int f15724a;
    public final vp f15725b;
    public final ArrayList f15726c;

    public gk(vp vpVar, ArrayList arrayList, int i10) {
        this.f15724a = i10;
        this.f15725b = vpVar;
        this.f15726c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15724a) {
            case 0:
                this.f15725b.getNotificationsController().K(this.f15726c, true, false, null);
                return;
            case 1:
                i0.g3(new gk(this.f15725b, this.f15726c, 3));
                return;
            case 2:
                i0.g3(new gk(this.f15725b, this.f15726c, 5));
                return;
            case 3:
                this.f15725b.getNotificationsController().K(this.f15726c, true, false, null);
                return;
            case 4:
                vp vpVar = this.f15725b;
                vpVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f15726c;
                    if (i10 < arrayList.size()) {
                        vpVar.Y3(vpVar.i1(-((Long) arrayList.get(i10)).longValue()), 0L);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 5:
                this.f15725b.getNotificationsController().K(this.f15726c, true, false, null);
                return;
            case 6:
                this.f15725b.getNotificationsController().K(this.f15726c, true, false, null);
                return;
            default:
                i0.g3(new gk(this.f15725b, this.f15726c, 0));
                return;
        }
    }
}
