package defpackage;

import java.util.List;
import java.util.Map;
public final class df5 extends if5 {
    public final byte d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final qq3 q;
    public final mm5 r;
    public final mm5 s;
    public final qm5 t;
    public final long u;
    public final cf5 v;
    public final mm5 w;
    public final af5 x;

    public df5(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, qq3 qq3Var, List list2, List list3, cf5 cf5Var, Map map, List list4, af5 af5Var) {
        super(str, list, z3);
        long j6;
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = qq3Var;
        this.r = mm5.q(list2);
        this.s = mm5.q(list3);
        this.t = qm5.b(map);
        this.w = mm5.q(list4);
        this.x = af5Var;
        if (!list3.isEmpty()) {
            ye5 ye5Var = (ye5) jle.b(list3);
            j6 = ye5Var.e + ye5Var.c;
            this.u = j6;
        } else if (!list2.isEmpty()) {
            af5 af5Var2 = (af5) jle.b(list2);
            j6 = af5Var2.e + af5Var2.c;
            this.u = j6;
        } else {
            this.u = 0L;
            j6 = 0;
        }
        long j7 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j7 = Math.min(j6, j);
            } else {
                j7 = Math.max(0L, j6 + j);
            }
        }
        this.e = j7;
        this.f = j >= 0;
        this.v = cf5Var;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
