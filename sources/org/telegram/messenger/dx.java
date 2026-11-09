package org.telegram.messenger;

import java.util.ArrayList;
public final class dx implements Runnable {
    public final nj D;
    public final sh.g E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList f22129a;
    public final ArrayList f22130b;
    public final c f22131c;
    public final ArrayList d;
    public final long f22132e;
    public final ij f22133f;
    public final ij h;
    public final org.telegram.ui.sm f22134n;
    public final boolean f22135r;
    public final int f22136s;
    public final hw f22137w;
    public final long f22138x;
    public final long f22139y;

    public dx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, ij ijVar, ij ijVar2, org.telegram.ui.sm smVar, boolean z9, int i7, hw hwVar, long j10, long j11, nj njVar, sh.g gVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f22129a = arrayList;
        this.f22130b = arrayList2;
        this.f22131c = cVar;
        this.d = arrayList3;
        this.f22132e = j3;
        this.f22133f = ijVar;
        this.h = ijVar2;
        this.f22134n = smVar;
        this.f22135r = z9;
        this.f22136s = i7;
        this.f22137w = hwVar;
        this.f22138x = j10;
        this.f22139y = j11;
        this.D = njVar;
        this.E = gVar;
        this.F = arrayList4;
        this.G = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f22129a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f22130b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        gz.V(this.f22136s, this.f22132e, 0L, this.f22138x, this.f22139y, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, this.f22131c, this.f22133f, this.h, null, this.D, this.f22137w, null, this.f22134n, null, this.E, this.f22135r, false);
    }
}
