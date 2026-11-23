package org.telegram.messenger;

import java.util.ArrayList;
public final class xw implements Runnable {
    public final lj E;
    public final sh.f F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f27969a;
    public final ArrayList f27970b;
    public final c f27971c;
    public final ArrayList d;
    public final long f27972e;
    public final gj f27973f;
    public final gj h;
    public final org.telegram.ui.rm f27974n;
    public final boolean f27975r;
    public final int f27976s;
    public final cw f27977w;
    public final long f27978x;
    public final long f27979y;

    public xw(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, gj gjVar, gj gjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, cw cwVar, long j10, long j11, lj ljVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f27969a = arrayList;
        this.f27970b = arrayList2;
        this.f27971c = cVar;
        this.d = arrayList3;
        this.f27972e = j3;
        this.f27973f = gjVar;
        this.h = gjVar2;
        this.f27974n = rmVar;
        this.f27975r = z10;
        this.f27976s = i7;
        this.f27977w = cwVar;
        this.f27978x = j10;
        this.f27979y = j11;
        this.E = ljVar;
        this.F = fVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f27969a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f27970b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        az.V(this.f27976s, this.f27972e, 0L, this.f27978x, this.f27979y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f27971c, this.f27973f, this.h, null, this.E, this.f27977w, null, this.f27974n, null, this.F, this.f27975r, false);
    }
}
