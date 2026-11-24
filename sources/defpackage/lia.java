package defpackage;

import android.net.Uri;
public final class lia extends aob {
    public static final Object r = new Object();
    public final long e;
    public final long f;
    public final long g = -9223372036854775807L;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final i2f o;
    public final br6 p;
    public final wq6 q;

    static {
        pq6 pq6Var = new pq6();
        pq6Var.a = "SinglePeriodTimeline";
        pq6Var.b = Uri.EMPTY;
        pq6Var.a();
    }

    public lia(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, i2f i2fVar, br6 br6Var, wq6 wq6Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = i2fVar;
        br6Var.getClass();
        this.p = br6Var;
        this.q = wq6Var;
    }

    @Override
    public final int b(Object obj) {
        if (r != obj) {
            return -1;
        }
        return 0;
    }

    @Override
    public final xnb f(int i, xnb xnbVar, boolean z) {
        Object obj;
        gre.j(i, 1);
        if (z) {
            obj = r;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        da daVar = da.c;
        xnbVar.h(null, obj2, 0, this.h, -this.j, false);
        return xnbVar;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i) {
        gre.j(i, 1);
        return r;
    }

    @Override
    public final defpackage.znb m(int r25, defpackage.znb r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lia.m(int, znb, long):znb");
    }

    @Override
    public final int o() {
        return 1;
    }
}
