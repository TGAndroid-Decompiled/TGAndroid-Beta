package org.telegram.messenger;

import java.util.ArrayList;
public final class ww implements Runnable {
    public final ej E;
    public final th.f F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList f26268a;
    public final ArrayList f26269b;
    public final c f26270c;
    public final ArrayList d;
    public final long f26271e;
    public final zi f26272f;
    public final zi h;
    public final org.telegram.ui.mm f26273n;
    public final boolean f26274r;
    public final int f26275s;
    public final zv f26276w;
    public final long f26277x;
    public final long f26278y;

    public ww(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j10, zi ziVar, zi ziVar2, org.telegram.ui.mm mmVar, boolean z10, int i3, zv zvVar, long j11, long j12, ej ejVar, th.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.f26268a = arrayList;
        this.f26269b = arrayList2;
        this.f26270c = cVar;
        this.d = arrayList3;
        this.f26271e = j10;
        this.f26272f = ziVar;
        this.h = ziVar2;
        this.f26273n = mmVar;
        this.f26274r = z10;
        this.f26275s = i3;
        this.f26276w = zvVar;
        this.f26277x = j11;
        this.f26278y = j12;
        this.E = ejVar;
        this.F = fVar;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f26268a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f26269b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        yy.V(this.f26275s, this.f26271e, 0L, this.f26277x, this.f26278y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.f26270c, this.f26272f, this.h, null, this.E, this.f26276w, null, this.f26273n, null, this.F, this.f26274r, false);
    }
}
