package defpackage;

import android.os.SystemClock;
import android.os.Trace;
public final class ddc {
    public final hi2 a;
    public final xcc b;
    public final qz0 c = new qz0();
    public final ir d = new ir();
    public final ir e = new ir();
    public final rh6 f;
    public final ycc g;
    public final zj4 h;
    public long i;
    public long j;
    public long k;
    public jec l;
    public long m;

    public ddc(hi2 hi2Var, xcc xccVar, ycc yccVar, zj4 zj4Var) {
        this.a = hi2Var;
        this.b = xccVar;
        this.g = yccVar;
        this.h = zj4Var;
        ?? obj = new Object();
        obj.a = 0;
        obj.b = -1;
        obj.c = 0;
        obj.e = new long[16];
        obj.d = 15;
        this.f = obj;
        this.i = -9223372036854775807L;
        this.l = jec.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        boolean z;
        long j3;
        go4 go4Var;
        final hi2 hi2Var = this.a;
        je3 je3Var = (je3) hi2Var.c;
        while (true) {
            rh6 rh6Var = this.f;
            int i = rh6Var.c;
            if (i == 0) {
                return;
            }
            if (i != 0) {
                long j4 = ((long[]) rh6Var.e)[rh6Var.a];
                Long l = (Long) this.e.j(j4);
                xcc xccVar = this.b;
                if (l != null && l.longValue() != this.m) {
                    this.m = l.longValue();
                    xccVar.e(2);
                }
                zj4 zj4Var = this.h;
                zj4Var.b(1000 * j4);
                long j5 = this.m;
                long a = zj4Var.a();
                long j6 = zj4Var.h;
                xcc xccVar2 = this.b;
                qz0 qz0Var = this.c;
                int a2 = xccVar2.a(j4, j, j2, j5, false, false, a, j6, qz0Var);
                if (a2 != 5 && a2 != 4) {
                    this.g.a(j4, qz0Var.a);
                }
                boolean z2 = true;
                if (a2 != 0 && a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                        if (a2 != 4) {
                            if (a2 == 5) {
                                return;
                            }
                            dq9.m(String.valueOf(a2));
                            return;
                        }
                        this.j = j4;
                    } else {
                        this.j = j4;
                        rh6Var.h();
                        je3Var.j.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                hi2 hi2Var2 = hi2Var;
                                switch (b) {
                                    case 0:
                                        ((je3) hi2Var2.c).i.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((je3) hi2Var2.c).i.w();
                                        return;
                                }
                            }
                        });
                        vm6 vm6Var = (vm6) je3Var.d.remove();
                        ym6 ym6Var = vm6Var.c;
                        hm6 hm6Var = vm6Var.a;
                        int i2 = vm6Var.b;
                        Trace.beginSection("dropVideoBuffer");
                        hm6Var.c(i2);
                        Trace.endSection();
                        ym6Var.Y0(0, 1);
                    }
                } else {
                    this.j = j4;
                    if (a2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long h = rh6Var.h();
                    jec jecVar = (jec) this.d.j(h);
                    if (jecVar != null && !jecVar.equals(jec.d) && !jecVar.equals(this.l)) {
                        this.l = jecVar;
                        fo4 fo4Var = new fo4();
                        fo4Var.z = jecVar.a;
                        fo4Var.A = jecVar.b;
                        fo4Var.s = wf7.n("video/raw");
                        hi2Var.b = new go4(fo4Var);
                        je3Var.j.execute(new rd3(hi2Var, jecVar, (byte) 1));
                    }
                    if (z) {
                        j3 = System.nanoTime();
                    } else {
                        j3 = qz0Var.b;
                    }
                    long j7 = j3;
                    if (xccVar.e == 3) {
                        z2 = false;
                    }
                    xccVar.e = 3;
                    xccVar.k.getClass();
                    xccVar.g = hac.T(SystemClock.elapsedRealtime());
                    if (z2 && je3Var.f != null) {
                        je3Var.j.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                hi2 hi2Var2 = hi2Var;
                                switch (b) {
                                    case 0:
                                        ((je3) hi2Var2.c).i.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((je3) hi2Var2.c).i.w();
                                        return;
                                }
                            }
                        });
                    }
                    go4 go4Var2 = (go4) hi2Var.b;
                    if (go4Var2 == null) {
                        go4Var = new go4(new fo4());
                    } else {
                        go4Var = go4Var2;
                    }
                    je3Var.k.c(h, j7, go4Var, null);
                    vm6 vm6Var2 = (vm6) je3Var.d.remove();
                    vm6Var2.c.S0(vm6Var2.a, vm6Var2.b, j7);
                }
            } else {
                u36.g();
                return;
            }
        }
    }
}
