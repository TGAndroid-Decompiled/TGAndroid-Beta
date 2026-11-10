package org.telegram.messenger;

import java.util.ArrayList;
public final class dx implements Runnable {
    public final nj D;
    public final sh.g E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList f22133a;
    public final ArrayList f22134b;
    public final c f22135c;
    public final ArrayList d;
    public final long f22136e;
    public final ij f22137f;
    public final ij h;
    public final org.telegram.ui.sm f22138n;
    public final boolean f22139r;
    public final int f22140s;
    public final hw f22141w;
    public final long f22142x;
    public final long f22143y;

    public dx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, ij ijVar, ij ijVar2, org.telegram.ui.sm smVar, boolean z9, int i7, hw hwVar, long j10, long j11, nj njVar, sh.g gVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f22133a = arrayList;
        this.f22134b = arrayList2;
        this.f22135c = cVar;
        this.d = arrayList3;
        this.f22136e = j3;
        this.f22137f = ijVar;
        this.h = ijVar2;
        this.f22138n = smVar;
        this.f22139r = z9;
        this.f22140s = i7;
        this.f22141w = hwVar;
        this.f22142x = j10;
        this.f22143y = j11;
        this.D = njVar;
        this.E = gVar;
        this.F = arrayList4;
        this.G = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f22133a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f22134b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        gz.V(this.f22140s, this.f22136e, 0L, this.f22142x, this.f22143y, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, this.f22135c, this.f22137f, this.h, null, this.D, this.f22141w, null, this.f22138n, null, this.E, this.f22139r, false);
    }
}
