package defpackage;

import android.net.Uri;
public final class gma extends asb {
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
    public final z6f o;
    public final ft6 p;
    public final at6 q;

    static {
        ts6 ts6Var = new ts6();
        ts6Var.a = "SinglePeriodTimeline";
        ts6Var.b = Uri.EMPTY;
        ts6Var.a();
    }

    public gma(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, z6f z6fVar, ft6 ft6Var, at6 at6Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z6fVar;
        ft6Var.getClass();
        this.p = ft6Var;
        this.q = at6Var;
    }

    @Override
    public final int b(Object obj) {
        if (r != obj) {
            return -1;
        }
        return 0;
    }

    @Override
    public final xrb f(int i, xrb xrbVar, boolean z) {
        Object obj;
        yve.j(i, 1);
        if (z) {
            obj = r;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        ea eaVar = ea.c;
        xrbVar.h(null, obj2, 0, this.h, -this.j, false);
        return xrbVar;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i) {
        yve.j(i, 1);
        return r;
    }

    @Override
    public final defpackage.zrb m(int r25, defpackage.zrb r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gma.m(int, zrb, long):zrb");
    }

    @Override
    public final int o() {
        return 1;
    }
}
