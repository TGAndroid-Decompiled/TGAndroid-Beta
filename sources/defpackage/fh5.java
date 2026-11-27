package defpackage;

import java.util.List;
import java.util.Map;
public final class fh5 extends kh5 {
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
    public final hr3 q;
    public final po5 r;
    public final po5 s;
    public final to5 t;
    public final long u;
    public final eh5 v;
    public final po5 w;
    public final ch5 x;

    public fh5(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, hr3 hr3Var, List list2, List list3, eh5 eh5Var, Map map, List list4, ch5 ch5Var) {
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
        this.q = hr3Var;
        this.r = po5.q(list2);
        this.s = po5.q(list3);
        this.t = to5.b(map);
        this.w = po5.q(list4);
        this.x = ch5Var;
        if (!list3.isEmpty()) {
            ah5 ah5Var = (ah5) dqe.b(list3);
            j6 = ah5Var.e + ah5Var.c;
            this.u = j6;
        } else if (!list2.isEmpty()) {
            ch5 ch5Var2 = (ch5) dqe.b(list2);
            j6 = ch5Var2.e + ch5Var2.c;
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
        this.v = eh5Var;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
