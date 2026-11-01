package org.telegram.messenger;

import java.util.ArrayList;
public final class qx implements Runnable {
    public final pj D;
    public final ih.i E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList f17828a;
    public final ArrayList f17829b;
    public final c f17830c;
    public final ArrayList d;
    public final long e;
    public final kj f17831f;
    public final kj h;
    public final org.telegram.ui.kn f17832n;
    public final boolean f17833r;
    public final int f17834s;
    public final tw f17835w;
    public final long f17836x;
    public final long f17837y;

    public qx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j10, kj kjVar, kj kjVar2, org.telegram.ui.kn knVar, boolean z10, int i10, tw twVar, long j11, long j12, pj pjVar, ih.i iVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f17828a = arrayList;
        this.f17829b = arrayList2;
        this.f17830c = cVar;
        this.d = arrayList3;
        this.e = j10;
        this.f17831f = kjVar;
        this.h = kjVar2;
        this.f17832n = knVar;
        this.f17833r = z10;
        this.f17834s = i10;
        this.f17835w = twVar;
        this.f17836x = j11;
        this.f17837y = j12;
        this.D = pjVar;
        this.E = iVar;
        this.F = arrayList4;
        this.G = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f17828a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f17829b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        rz.V(this.f17834s, this.e, 0L, this.f17836x, this.f17837y, this.E, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, null, this.f17830c, this.f17831f, this.h, null, this.D, this.f17835w, null, this.f17832n, this.f17833r, false);
    }
}
