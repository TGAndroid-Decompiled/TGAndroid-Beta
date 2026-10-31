package org.telegram.messenger;

import java.util.ArrayList;
public final class px implements Runnable {
    public final oj D;
    public final ih.i E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList f17493a;
    public final ArrayList f17494b;
    public final c f17495c;
    public final ArrayList d;
    public final long e;
    public final jj f17496f;
    public final jj h;
    public final org.telegram.ui.kn f17497n;
    public final boolean f17498r;
    public final int f17499s;
    public final sw f17500w;
    public final long f17501x;
    public final long f17502y;

    public px(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j10, jj jjVar, jj jjVar2, org.telegram.ui.kn knVar, boolean z10, int i10, sw swVar, long j11, long j12, oj ojVar, ih.i iVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f17493a = arrayList;
        this.f17494b = arrayList2;
        this.f17495c = cVar;
        this.d = arrayList3;
        this.e = j10;
        this.f17496f = jjVar;
        this.h = jjVar2;
        this.f17497n = knVar;
        this.f17498r = z10;
        this.f17499s = i10;
        this.f17500w = swVar;
        this.f17501x = j11;
        this.f17502y = j12;
        this.D = ojVar;
        this.E = iVar;
        this.F = arrayList4;
        this.G = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f17493a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f17494b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        qz.V(this.f17499s, this.e, 0L, this.f17501x, this.f17502y, this.E, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, null, this.f17495c, this.f17496f, this.h, null, this.D, this.f17500w, null, this.f17497n, this.f17498r, false);
    }
}
