package org.telegram.messenger;

import java.util.ArrayList;
public final class ww implements Runnable {
    public final kj E;
    public final sh.g F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f27771a;
    public final ArrayList f27772b;
    public final c f27773c;
    public final ArrayList d;
    public final long f27774e;
    public final fj f27775f;
    public final fj h;
    public final org.telegram.ui.rm f27776n;
    public final boolean f27777r;
    public final int f27778s;
    public final bw f27779w;
    public final long f27780x;
    public final long f27781y;

    public ww(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, fj fjVar, fj fjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, bw bwVar, long j10, long j11, kj kjVar, sh.g gVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f27771a = arrayList;
        this.f27772b = arrayList2;
        this.f27773c = cVar;
        this.d = arrayList3;
        this.f27774e = j3;
        this.f27775f = fjVar;
        this.h = fjVar2;
        this.f27776n = rmVar;
        this.f27777r = z10;
        this.f27778s = i7;
        this.f27779w = bwVar;
        this.f27780x = j10;
        this.f27781y = j11;
        this.E = kjVar;
        this.F = gVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f27771a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f27772b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        zy.V(this.f27778s, this.f27774e, 0L, this.f27780x, this.f27781y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f27773c, this.f27775f, this.h, null, this.E, this.f27779w, null, this.f27776n, null, this.F, this.f27777r, false);
    }
}
