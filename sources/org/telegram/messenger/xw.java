package org.telegram.messenger;

import java.util.ArrayList;
public final class xw implements Runnable {
    public final lj E;
    public final sh.f F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f27933a;
    public final ArrayList f27934b;
    public final c f27935c;
    public final ArrayList d;
    public final long f27936e;
    public final gj f27937f;
    public final gj h;
    public final org.telegram.ui.rm f27938n;
    public final boolean f27939r;
    public final int f27940s;
    public final cw f27941w;
    public final long f27942x;
    public final long f27943y;

    public xw(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, gj gjVar, gj gjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, cw cwVar, long j10, long j11, lj ljVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f27933a = arrayList;
        this.f27934b = arrayList2;
        this.f27935c = cVar;
        this.d = arrayList3;
        this.f27936e = j3;
        this.f27937f = gjVar;
        this.h = gjVar2;
        this.f27938n = rmVar;
        this.f27939r = z10;
        this.f27940s = i7;
        this.f27941w = cwVar;
        this.f27942x = j10;
        this.f27943y = j11;
        this.E = ljVar;
        this.F = fVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f27933a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f27934b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        az.V(this.f27940s, this.f27936e, 0L, this.f27942x, this.f27943y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f27935c, this.f27937f, this.h, null, this.E, this.f27941w, null, this.f27938n, null, this.F, this.f27939r, false);
    }
}
