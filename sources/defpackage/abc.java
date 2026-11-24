package defpackage;

import android.os.SystemClock;
import android.os.Trace;
public final class abc {
    public final lv6 a;
    public final uac b;
    public final jy0 c = new jy0();
    public final iq d = new iq();
    public final iq e = new iq();
    public final rf6 f;
    public final vac g;
    public final vh4 h;
    public long i;
    public long j;
    public long k;
    public icc l;
    public long m;

    public abc(lv6 lv6Var, uac uacVar, vac vacVar, vh4 vh4Var) {
        this.a = lv6Var;
        this.b = uacVar;
        this.g = vacVar;
        this.h = vh4Var;
        ?? obj = new Object();
        obj.a = 0;
        obj.b = -1;
        obj.c = 0;
        obj.e = new long[16];
        obj.d = 15;
        this.f = obj;
        this.i = -9223372036854775807L;
        this.l = icc.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        boolean z;
        long j3;
        fm4 fm4Var;
        final lv6 lv6Var = this.a;
        xc3 xc3Var = (xc3) lv6Var.c;
        while (true) {
            rf6 rf6Var = this.f;
            int i = rf6Var.c;
            if (i == 0) {
                return;
            }
            if (i != 0) {
                long j4 = ((long[]) rf6Var.e)[rf6Var.a];
                Long l = (Long) this.e.j(j4);
                uac uacVar = this.b;
                if (l != null && l.longValue() != this.m) {
                    this.m = l.longValue();
                    uacVar.e(2);
                }
                vh4 vh4Var = this.h;
                vh4Var.b(1000 * j4);
                long j5 = this.m;
                long a = vh4Var.a();
                long j6 = vh4Var.h;
                uac uacVar2 = this.b;
                jy0 jy0Var = this.c;
                int a2 = uacVar2.a(j4, j, j2, j5, false, false, a, j6, jy0Var);
                if (a2 != 5 && a2 != 4) {
                    this.g.a(j4, jy0Var.a);
                }
                boolean z2 = true;
                if (a2 != 0 && a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                        if (a2 != 4) {
                            if (a2 == 5) {
                                return;
                            }
                            sc8.j(String.valueOf(a2));
                            return;
                        }
                        this.j = j4;
                    } else {
                        this.j = j4;
                        rf6Var.h();
                        xc3Var.j.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                lv6 lv6Var2 = lv6Var;
                                switch (b) {
                                    case 0:
                                        ((xc3) lv6Var2.c).i.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((xc3) lv6Var2.c).i.q();
                                        return;
                                }
                            }
                        });
                        sk6 sk6Var = (sk6) xc3Var.d.remove();
                        vk6 vk6Var = sk6Var.c;
                        ek6 ek6Var = sk6Var.a;
                        int i2 = sk6Var.b;
                        Trace.beginSection("dropVideoBuffer");
                        ek6Var.c(i2);
                        Trace.endSection();
                        vk6Var.Y0(0, 1);
                    }
                } else {
                    this.j = j4;
                    if (a2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long h = rf6Var.h();
                    icc iccVar = (icc) this.d.j(h);
                    if (iccVar != null && !iccVar.equals(icc.d) && !iccVar.equals(this.l)) {
                        this.l = iccVar;
                        em4 em4Var = new em4();
                        em4Var.z = iccVar.a;
                        em4Var.A = iccVar.b;
                        em4Var.s = ud7.n("video/raw");
                        lv6Var.b = new fm4(em4Var);
                        xc3Var.j.execute(new wc3(lv6Var, iccVar, (byte) 0));
                    }
                    if (z) {
                        j3 = System.nanoTime();
                    } else {
                        j3 = jy0Var.b;
                    }
                    long j7 = j3;
                    if (uacVar.e == 3) {
                        z2 = false;
                    }
                    uacVar.e = 3;
                    uacVar.k.getClass();
                    uacVar.g = g8c.T(SystemClock.elapsedRealtime());
                    if (z2 && xc3Var.f != null) {
                        xc3Var.j.execute(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                lv6 lv6Var2 = lv6Var;
                                switch (b) {
                                    case 0:
                                        ((xc3) lv6Var2.c).i.onFirstFrameRendered();
                                        return;
                                    default:
                                        ((xc3) lv6Var2.c).i.q();
                                        return;
                                }
                            }
                        });
                    }
                    fm4 fm4Var2 = (fm4) lv6Var.b;
                    if (fm4Var2 == null) {
                        fm4Var = new fm4(new em4());
                    } else {
                        fm4Var = fm4Var2;
                    }
                    xc3Var.k.c(h, j7, fm4Var, null);
                    sk6 sk6Var2 = (sk6) xc3Var.d.remove();
                    sk6Var2.c.S0(sk6Var2.a, sk6Var2.b, j7);
                }
            } else {
                w26.g();
                return;
            }
        }
    }
}
