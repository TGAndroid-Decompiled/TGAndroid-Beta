package defpackage;

import android.os.SystemClock;
import android.os.Trace;
public final class afc {
    public final qx6 a;
    public final uec b;
    public final ry0 c = new ry0();
    public final jq d = new jq();
    public final jq e = new jq();
    public final vh6 f;
    public final vec g;
    public final zj4 h;
    public long i;
    public long j;
    public long k;
    public ggc l;
    public long m;

    public afc(qx6 qx6Var, uec uecVar, vec vecVar, zj4 zj4Var) {
        this.a = qx6Var;
        this.b = uecVar;
        this.g = vecVar;
        this.h = zj4Var;
        ?? obj = new Object();
        obj.a = 0;
        obj.b = -1;
        obj.c = 0;
        obj.e = new long[16];
        obj.d = 15;
        this.f = obj;
        this.i = -9223372036854775807L;
        this.l = ggc.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        boolean z;
        long j3;
        ko4 ko4Var;
        final qx6 qx6Var = this.a;
        pd3 pd3Var = (pd3) qx6Var.c;
        while (true) {
            vh6 vh6Var = this.f;
            int i = vh6Var.c;
            if (i == 0) {
                return;
            }
            if (i != 0) {
                long j4 = ((long[]) vh6Var.e)[vh6Var.a];
                Long l = (Long) this.e.j(j4);
                uec uecVar = this.b;
                if (l != null && l.longValue() != this.m) {
                    this.m = l.longValue();
                    uecVar.e(2);
                }
                zj4 zj4Var = this.h;
                zj4Var.b(1000 * j4);
                long j5 = this.m;
                long a = zj4Var.a();
                long j6 = zj4Var.h;
                uec uecVar2 = this.b;
                ry0 ry0Var = this.c;
                int a2 = uecVar2.a(j4, j, j2, j5, false, false, a, j6, ry0Var);
                if (a2 != 5 && a2 != 4) {
                    this.g.a(j4, ry0Var.a);
                }
                boolean z2 = true;
                if (a2 != 0 && a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                        if (a2 != 4) {
                            if (a2 == 5) {
                                return;
                            }
                            grb.i(String.valueOf(a2));
                            return;
                        }
                        this.j = j4;
                    } else {
                        this.j = j4;
                        vh6Var.h();
                        pd3Var.j.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                qx6 qx6Var2 = qx6Var;
                                switch (b) {
                                    case 0:
                                        ((pd3) qx6Var2.c).i.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((pd3) qx6Var2.c).i.p();
                                        return;
                                }
                            }
                        });
                        ym6 ym6Var = (ym6) pd3Var.d.remove();
                        bn6 bn6Var = ym6Var.c;
                        jm6 jm6Var = ym6Var.a;
                        int i2 = ym6Var.b;
                        Trace.beginSection("dropVideoBuffer");
                        jm6Var.c(i2);
                        Trace.endSection();
                        bn6Var.Y0(0, 1);
                    }
                } else {
                    this.j = j4;
                    if (a2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long h = vh6Var.h();
                    ggc ggcVar = (ggc) this.d.j(h);
                    if (ggcVar != null && !ggcVar.equals(ggc.d) && !ggcVar.equals(this.l)) {
                        this.l = ggcVar;
                        jo4 jo4Var = new jo4();
                        jo4Var.z = ggcVar.a;
                        jo4Var.A = ggcVar.b;
                        jo4Var.s = eg7.n("video/raw");
                        qx6Var.b = new ko4(jo4Var);
                        pd3Var.j.execute(new bv2(qx6Var, ggcVar, (byte) 29));
                    }
                    if (z) {
                        j3 = System.nanoTime();
                    } else {
                        j3 = ry0Var.b;
                    }
                    long j7 = j3;
                    if (uecVar.e == 3) {
                        z2 = false;
                    }
                    uecVar.e = 3;
                    uecVar.k.getClass();
                    uecVar.g = gcc.T(SystemClock.elapsedRealtime());
                    if (z2 && pd3Var.f != null) {
                        pd3Var.j.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                qx6 qx6Var2 = qx6Var;
                                switch (b) {
                                    case 0:
                                        ((pd3) qx6Var2.c).i.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((pd3) qx6Var2.c).i.p();
                                        return;
                                }
                            }
                        });
                    }
                    ko4 ko4Var2 = (ko4) qx6Var.b;
                    if (ko4Var2 == null) {
                        ko4Var = new ko4(new jo4());
                    } else {
                        ko4Var = ko4Var2;
                    }
                    pd3Var.k.b(h, j7, ko4Var, null);
                    ym6 ym6Var2 = (ym6) pd3Var.d.remove();
                    ym6Var2.c.S0(ym6Var2.a, ym6Var2.b, j7);
                }
            } else {
                lq5.n();
                return;
            }
        }
    }
}
