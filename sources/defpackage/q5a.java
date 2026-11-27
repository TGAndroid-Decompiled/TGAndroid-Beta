package defpackage;

import java.util.ArrayList;
public final class q5a implements Runnable {
    public final b77 E;
    public final ki8 F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList a;
    public final ArrayList b;
    public final k5 c;
    public final ArrayList d;
    public final long e;
    public final r47 f;
    public final r47 h;
    public final ou1 n;
    public final boolean r;
    public final int s;
    public final c5a w;
    public final long x;
    public final long y;

    public q5a(ArrayList arrayList, ArrayList arrayList2, k5 k5Var, ArrayList arrayList3, long j, r47 r47Var, r47 r47Var2, ou1 ou1Var, boolean z, int i, c5a c5aVar, long j2, long j3, b77 b77Var, ki8 ki8Var, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = k5Var;
        this.d = arrayList3;
        this.e = j;
        this.f = r47Var;
        this.h = r47Var2;
        this.n = ou1Var;
        this.r = z;
        this.s = i;
        this.w = c5aVar;
        this.x = j2;
        this.y = j3;
        this.E = b77Var;
        this.F = ki8Var;
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
        r7a.U(this.s, this.e, 0L, this.x, this.y, this.c, this.n, null, this.f, this.h, null, this.E, this.F, this.w, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, null, this.r, false);
    }
}
