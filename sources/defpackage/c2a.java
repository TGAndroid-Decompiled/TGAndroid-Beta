package defpackage;

import java.util.ArrayList;
public final class c2a implements Runnable {
    public final u47 E;
    public final we8 F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList a;
    public final ArrayList b;
    public final j5 c;
    public final ArrayList d;
    public final long e;
    public final k27 f;
    public final k27 h;
    public final bu1 n;
    public final boolean r;
    public final int s;
    public final j1a w;
    public final long x;
    public final long y;

    public c2a(ArrayList arrayList, ArrayList arrayList2, j5 j5Var, ArrayList arrayList3, long j, k27 k27Var, k27 k27Var2, bu1 bu1Var, boolean z, int i, j1a j1aVar, long j2, long j3, u47 u47Var, we8 we8Var, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = j5Var;
        this.d = arrayList3;
        this.e = j;
        this.f = k27Var;
        this.h = k27Var2;
        this.n = bu1Var;
        this.r = z;
        this.s = i;
        this.w = j1aVar;
        this.x = j2;
        this.y = j3;
        this.E = u47Var;
        this.F = we8Var;
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
        z3a.U(this.s, this.e, 0L, this.x, this.y, this.c, this.n, null, this.f, this.h, null, this.E, this.F, this.w, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, null, this.r, false);
    }
}
