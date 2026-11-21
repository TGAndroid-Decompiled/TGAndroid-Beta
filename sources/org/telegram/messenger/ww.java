package org.telegram.messenger;

import java.util.ArrayList;
public final class ww implements Runnable {
    public final kj E;
    public final sh.f F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f27797a;
    public final ArrayList f27798b;
    public final c f27799c;
    public final ArrayList d;
    public final long f27800e;
    public final fj f27801f;
    public final fj h;
    public final org.telegram.ui.rm f27802n;
    public final boolean f27803r;
    public final int f27804s;
    public final bw f27805w;
    public final long f27806x;
    public final long f27807y;

    public ww(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, fj fjVar, fj fjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, bw bwVar, long j10, long j11, kj kjVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f27797a = arrayList;
        this.f27798b = arrayList2;
        this.f27799c = cVar;
        this.d = arrayList3;
        this.f27800e = j3;
        this.f27801f = fjVar;
        this.h = fjVar2;
        this.f27802n = rmVar;
        this.f27803r = z10;
        this.f27804s = i7;
        this.f27805w = bwVar;
        this.f27806x = j10;
        this.f27807y = j11;
        this.E = kjVar;
        this.F = fVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f27797a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f27798b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        zy.V(this.f27804s, this.f27800e, 0L, this.f27806x, this.f27807y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f27799c, this.f27801f, this.h, null, this.E, this.f27805w, null, this.f27802n, null, this.F, this.f27803r, false);
    }
}
