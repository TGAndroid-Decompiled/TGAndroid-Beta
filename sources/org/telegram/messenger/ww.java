package org.telegram.messenger;

import java.util.ArrayList;
public final class ww implements Runnable {
    public final kj E;
    public final sh.f F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f27863a;
    public final ArrayList f27864b;
    public final c f27865c;
    public final ArrayList d;
    public final long f27866e;
    public final fj f27867f;
    public final fj h;
    public final org.telegram.ui.rm f27868n;
    public final boolean f27869r;
    public final int f27870s;
    public final bw f27871w;
    public final long f27872x;
    public final long f27873y;

    public ww(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, fj fjVar, fj fjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, bw bwVar, long j10, long j11, kj kjVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f27863a = arrayList;
        this.f27864b = arrayList2;
        this.f27865c = cVar;
        this.d = arrayList3;
        this.f27866e = j3;
        this.f27867f = fjVar;
        this.h = fjVar2;
        this.f27868n = rmVar;
        this.f27869r = z10;
        this.f27870s = i7;
        this.f27871w = bwVar;
        this.f27872x = j10;
        this.f27873y = j11;
        this.E = kjVar;
        this.F = fVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f27863a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f27864b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        zy.V(this.f27870s, this.f27866e, 0L, this.f27872x, this.f27873y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f27865c, this.f27867f, this.h, null, this.E, this.f27871w, null, null, this.f27868n, this.F, this.f27869r, false);
    }
}
