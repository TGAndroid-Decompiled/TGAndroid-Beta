package org.telegram.messenger;

import java.util.ArrayList;
public final class bx implements Runnable {
    public final lj E;
    public final sh.f F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f22763a;
    public final ArrayList f22764b;
    public final c f22765c;
    public final ArrayList d;
    public final long f22766e;
    public final gj f22767f;
    public final gj h;
    public final org.telegram.ui.qm f22768n;
    public final boolean f22769r;
    public final int f22770s;
    public final fw f22771w;
    public final long f22772x;
    public final long f22773y;

    public bx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, gj gjVar, gj gjVar2, org.telegram.ui.qm qmVar, boolean z10, int i7, fw fwVar, long j10, long j11, lj ljVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f22763a = arrayList;
        this.f22764b = arrayList2;
        this.f22765c = cVar;
        this.d = arrayList3;
        this.f22766e = j3;
        this.f22767f = gjVar;
        this.h = gjVar2;
        this.f22768n = qmVar;
        this.f22769r = z10;
        this.f22770s = i7;
        this.f22771w = fwVar;
        this.f22772x = j10;
        this.f22773y = j11;
        this.E = ljVar;
        this.F = fVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f22763a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f22764b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        ez.V(this.f22770s, this.f22766e, 0L, this.f22772x, this.f22773y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f22765c, this.f22767f, this.h, null, this.E, this.f22771w, null, this.f22768n, null, this.F, this.f22769r, false);
    }
}
