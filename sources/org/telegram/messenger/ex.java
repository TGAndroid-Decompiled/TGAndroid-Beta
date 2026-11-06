package org.telegram.messenger;

import java.util.ArrayList;
public final class ex implements Runnable {
    public final nj D;
    public final sh.f E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList f22271a;
    public final ArrayList f22272b;
    public final c f22273c;
    public final ArrayList d;
    public final long f22274e;
    public final ij f22275f;
    public final ij h;
    public final org.telegram.ui.qm f22276n;
    public final boolean f22277r;
    public final int f22278s;
    public final hw f22279w;
    public final long f22280x;
    public final long f22281y;

    public ex(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, ij ijVar, ij ijVar2, org.telegram.ui.qm qmVar, boolean z9, int i7, hw hwVar, long j10, long j11, nj njVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f22271a = arrayList;
        this.f22272b = arrayList2;
        this.f22273c = cVar;
        this.d = arrayList3;
        this.f22274e = j3;
        this.f22275f = ijVar;
        this.h = ijVar2;
        this.f22276n = qmVar;
        this.f22277r = z9;
        this.f22278s = i7;
        this.f22279w = hwVar;
        this.f22280x = j10;
        this.f22281y = j11;
        this.D = njVar;
        this.E = fVar;
        this.F = arrayList4;
        this.G = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f22271a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f22272b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        gz.V(this.f22278s, this.f22274e, 0L, this.f22280x, this.f22281y, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, this.f22273c, this.f22275f, this.h, null, this.D, this.f22279w, null, this.f22276n, null, this.E, this.f22277r, false);
    }
}
