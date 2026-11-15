package org.telegram.messenger;

import java.util.ArrayList;
public final class bx implements Runnable {
    public final lj E;
    public final sh.f F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f22767a;
    public final ArrayList f22768b;
    public final c f22769c;
    public final ArrayList d;
    public final long f22770e;
    public final gj f22771f;
    public final gj h;
    public final org.telegram.ui.qm f22772n;
    public final boolean f22773r;
    public final int f22774s;
    public final fw f22775w;
    public final long f22776x;
    public final long f22777y;

    public bx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, gj gjVar, gj gjVar2, org.telegram.ui.qm qmVar, boolean z10, int i7, fw fwVar, long j10, long j11, lj ljVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f22767a = arrayList;
        this.f22768b = arrayList2;
        this.f22769c = cVar;
        this.d = arrayList3;
        this.f22770e = j3;
        this.f22771f = gjVar;
        this.h = gjVar2;
        this.f22772n = qmVar;
        this.f22773r = z10;
        this.f22774s = i7;
        this.f22775w = fwVar;
        this.f22776x = j10;
        this.f22777y = j11;
        this.E = ljVar;
        this.F = fVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f22767a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f22768b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        ez.V(this.f22774s, this.f22770e, 0L, this.f22776x, this.f22777y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f22769c, this.f22771f, this.h, null, this.E, this.f22775w, null, this.f22772n, null, this.F, this.f22773r, false);
    }
}
