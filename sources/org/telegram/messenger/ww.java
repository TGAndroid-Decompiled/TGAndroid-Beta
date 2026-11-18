package org.telegram.messenger;

import java.util.ArrayList;
public final class ww implements Runnable {
    public final kj E;
    public final sh.g F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f27769a;
    public final ArrayList f27770b;
    public final c f27771c;
    public final ArrayList d;
    public final long f27772e;
    public final fj f27773f;
    public final fj h;
    public final org.telegram.ui.rm f27774n;
    public final boolean f27775r;
    public final int f27776s;
    public final bw f27777w;
    public final long f27778x;
    public final long f27779y;

    public ww(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, fj fjVar, fj fjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, bw bwVar, long j10, long j11, kj kjVar, sh.g gVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f27769a = arrayList;
        this.f27770b = arrayList2;
        this.f27771c = cVar;
        this.d = arrayList3;
        this.f27772e = j3;
        this.f27773f = fjVar;
        this.h = fjVar2;
        this.f27774n = rmVar;
        this.f27775r = z10;
        this.f27776s = i7;
        this.f27777w = bwVar;
        this.f27778x = j10;
        this.f27779y = j11;
        this.E = kjVar;
        this.F = gVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f27769a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f27770b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        zy.V(this.f27776s, this.f27772e, 0L, this.f27778x, this.f27779y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f27771c, this.f27773f, this.h, null, this.E, this.f27777w, null, this.f27774n, null, this.F, this.f27775r, false);
    }
}
