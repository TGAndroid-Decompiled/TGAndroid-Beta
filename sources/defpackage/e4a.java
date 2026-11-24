package defpackage;

import java.util.ArrayList;
public final class e4a implements Runnable {
    public final v67 E;
    public final yg8 F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList a;
    public final ArrayList b;
    public final j5 c;
    public final ArrayList d;
    public final long e;
    public final k47 f;
    public final k47 h;
    public final nv1 n;
    public final boolean r;
    public final int s;
    public final l3a w;
    public final long x;
    public final long y;

    public e4a(ArrayList arrayList, ArrayList arrayList2, j5 j5Var, ArrayList arrayList3, long j, k47 k47Var, k47 k47Var2, nv1 nv1Var, boolean z, int i, l3a l3aVar, long j2, long j3, v67 v67Var, yg8 yg8Var, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = j5Var;
        this.d = arrayList3;
        this.e = j;
        this.f = k47Var;
        this.h = k47Var2;
        this.n = nv1Var;
        this.r = z;
        this.s = i;
        this.w = l3aVar;
        this.x = j2;
        this.y = j3;
        this.E = v67Var;
        this.F = yg8Var;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        a6a.U(this.s, this.e, 0L, this.x, this.y, this.c, this.n, null, this.f, this.h, null, this.E, this.F, this.w, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, null, this.r, false);
    }
}
