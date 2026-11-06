package org.telegram.messenger;

import java.util.ArrayList;
public final class ex implements Runnable {
    public final nj D;
    public final sh.f E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList f22264a;
    public final ArrayList f22265b;
    public final c f22266c;
    public final ArrayList d;
    public final long f22267e;
    public final ij f22268f;
    public final ij h;
    public final org.telegram.ui.qm f22269n;
    public final boolean f22270r;
    public final int f22271s;
    public final hw f22272w;
    public final long f22273x;
    public final long f22274y;

    public ex(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, ij ijVar, ij ijVar2, org.telegram.ui.qm qmVar, boolean z9, int i7, hw hwVar, long j10, long j11, nj njVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f22264a = arrayList;
        this.f22265b = arrayList2;
        this.f22266c = cVar;
        this.d = arrayList3;
        this.f22267e = j3;
        this.f22268f = ijVar;
        this.h = ijVar2;
        this.f22269n = qmVar;
        this.f22270r = z9;
        this.f22271s = i7;
        this.f22272w = hwVar;
        this.f22273x = j10;
        this.f22274y = j11;
        this.D = njVar;
        this.E = fVar;
        this.F = arrayList4;
        this.G = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f22264a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f22265b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        gz.V(this.f22271s, this.f22267e, 0L, this.f22273x, this.f22274y, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, this.f22266c, this.f22268f, this.h, null, this.D, this.f22272w, null, this.f22269n, null, this.E, this.f22270r, false);
    }
}
