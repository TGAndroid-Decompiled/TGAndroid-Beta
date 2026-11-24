package defpackage;

import android.net.Uri;
public final class nka extends bqb {
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
    public final k4f o;
    public final bt6 p;
    public final ws6 q;

    static {
        ps6 ps6Var = new ps6();
        ps6Var.a = "SinglePeriodTimeline";
        ps6Var.b = Uri.EMPTY;
        ps6Var.a();
    }

    public nka(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, k4f k4fVar, bt6 bt6Var, ws6 ws6Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = k4fVar;
        bt6Var.getClass();
        this.p = bt6Var;
        this.q = ws6Var;
    }

    @Override
    public final int b(Object obj) {
        if (r != obj) {
            return -1;
        }
        return 0;
    }

    @Override
    public final ypb f(int i, ypb ypbVar, boolean z) {
        Object obj;
        jte.j(i, 1);
        if (z) {
            obj = r;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        da daVar = da.c;
        ypbVar.h(null, obj2, 0, this.h, -this.j, false);
        return ypbVar;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i) {
        jte.j(i, 1);
        return r;
    }

    @Override
    public final defpackage.aqb m(int r25, defpackage.aqb r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nka.m(int, aqb, long):aqb");
    }

    @Override
    public final int o() {
        return 1;
    }
}
