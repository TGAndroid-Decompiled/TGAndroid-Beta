package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class xc3 implements hcc {
    public final uac a;
    public final vac b;
    public final abc c;
    public final ArrayDeque d;
    public final vh4 e;
    public Surface f;
    public fm4 g;
    public long h;
    public fcc i;
    public Executor j;
    public sac k;

    public xc3(uac uacVar, vac vacVar, adb adbVar) {
        this.a = uacVar;
        this.b = vacVar;
        uacVar.k = adbVar;
        vh4 vh4Var = new vh4(new vu2(uacVar, (byte) 19));
        this.e = vh4Var;
        this.c = new abc(new lv6(this), uacVar, vacVar, vh4Var);
        this.d = new ArrayDeque();
        this.g = new fm4(new em4());
        this.h = -9223372036854775807L;
        this.i = fcc.C;
        this.j = new hc((byte) 2);
        this.k = new Object();
    }

    @Override
    public final boolean a() {
        abc abcVar = this.c;
        long j = abcVar.k;
        if (j != -9223372036854775807L && abcVar.j == j) {
            return true;
        }
        return false;
    }

    @Override
    public final Surface b() {
        Surface surface = this.f;
        surface.getClass();
        return surface;
    }

    @Override
    public final void c(float f) {
        this.a.g(f);
    }

    @Override
    public final void d(Surface surface, wia wiaVar) {
        this.f = surface;
        this.a.f(surface);
    }

    @Override
    public final void e() {
        this.b.b();
        uac uacVar = this.a;
        uacVar.d = false;
        uacVar.h = -9223372036854775807L;
        zac zacVar = uacVar.b;
        zacVar.d = false;
        wac wacVar = zacVar.c;
        if (wacVar != null) {
            wacVar.b();
        }
        zacVar.a();
    }

    @Override
    public final void f() {
        this.b.b();
        this.a.d();
    }

    @Override
    public final void g(fm4 fm4Var, long j, int i, List list) {
        long j2;
        long j3;
        gre.p(list.isEmpty());
        int i2 = fm4Var.A;
        int i3 = fm4Var.B;
        fm4 fm4Var2 = this.g;
        int i4 = fm4Var2.A;
        abc abcVar = this.c;
        if (i2 != i4 || i3 != fm4Var2.B) {
            iq iqVar = abcVar.d;
            long j4 = abcVar.i;
            if (j4 == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j4 + 1;
            }
            iqVar.a(new icc(i2, i3), j2);
        }
        float f = fm4Var.F;
        if (f != this.g.F) {
            vh4 vh4Var = this.e;
            vh4Var.f = f;
            vh4Var.a.c();
            vh4Var.b.c();
            vh4Var.c = false;
            vh4Var.d = -9223372036854775807L;
            vh4Var.e = 0;
            vh4Var.c();
        }
        this.g = fm4Var;
        if (j != this.h) {
            if (abcVar.f.c == 0) {
                abcVar.b.e(i);
                abcVar.m = j;
            } else {
                iq iqVar2 = abcVar.e;
                long j5 = abcVar.i;
                if (j5 == -9223372036854775807L) {
                    j3 = -4611686018427387904L;
                } else {
                    j3 = j5 + 1;
                }
                iqVar2.a(Long.valueOf(j), j3);
            }
            this.h = j;
        }
    }

    @Override
    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i() {
        abc abcVar = this.c;
        long j = abcVar.i;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            abcVar.i = Long.MIN_VALUE;
            abcVar.j = Long.MIN_VALUE;
        }
        abcVar.k = j;
    }

    @Override
    public final void j(int i) {
        zac zacVar = this.a.b;
        if (zacVar.i == i) {
            return;
        }
        zacVar.i = i;
        zacVar.c(true);
    }

    @Override
    public final void k() {
        this.f = null;
        this.a.f(null);
    }

    @Override
    public final boolean l(long j, sk6 sk6Var) {
        this.d.add(sk6Var);
        abc abcVar = this.c;
        rf6 rf6Var = abcVar.f;
        int i = rf6Var.c;
        long[] jArr = (long[]) rf6Var.e;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                ?? r5 = new long[length];
                int length2 = jArr.length;
                int i2 = rf6Var.a;
                int i3 = length2 - i2;
                System.arraycopy(jArr, i2, r5, 0, i3);
                System.arraycopy((long[]) rf6Var.e, 0, r5, i3, i2);
                rf6Var.a = 0;
                int i4 = rf6Var.c;
                rf6Var.b = i4 - 1;
                rf6Var.e = r5;
                rf6Var.d = length - 1;
                i = i4;
                jArr = r5;
            } else {
                sdb.a();
                return false;
            }
        }
        int i5 = (rf6Var.b + 1) & rf6Var.d;
        rf6Var.b = i5;
        jArr[i5] = j;
        rf6Var.c = i + 1;
        abcVar.i = j;
        abcVar.k = -9223372036854775807L;
        this.j.execute(new mk2(this, (byte) 23));
        return true;
    }

    @Override
    public final boolean m(fm4 fm4Var) {
        return true;
    }

    @Override
    public final void n(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            uac uacVar = this.a;
            uacVar.b.b();
            uacVar.f = -9223372036854775807L;
            uacVar.e = Math.min(uacVar.e, 1);
            uacVar.h = -9223372036854775807L;
            uacVar.m = false;
        }
        this.b.b();
        abc abcVar = this.c;
        iq iqVar = abcVar.d;
        rf6 rf6Var = abcVar.f;
        rf6Var.a = 0;
        rf6Var.b = -1;
        rf6Var.c = 0;
        abcVar.i = -9223372036854775807L;
        abcVar.j = -9223372036854775807L;
        abcVar.k = -9223372036854775807L;
        iq iqVar2 = abcVar.e;
        if (iqVar2.p() > 0) {
            if (iqVar2.p() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            gre.f(z2);
            while (iqVar2.p() > 1) {
                iqVar2.i();
            }
            Object i = iqVar2.i();
            i.getClass();
            abcVar.m = ((Long) i).longValue();
        }
        if (iqVar.p() > 0) {
            if (iqVar.p() > 0) {
                z3 = true;
            }
            gre.f(z3);
            while (iqVar.p() > 1) {
                iqVar.i();
            }
            Object i2 = iqVar.i();
            i2.getClass();
            iqVar.a((icc) i2, 0L);
        }
        this.d.clear();
    }

    @Override
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void p(long j, long j2) {
        try {
            this.c.a(j, j2);
        } catch (j54 e) {
            throw new gcc(e, this.g);
        }
    }

    @Override
    public final void q(boolean z) {
        this.a.c(z);
    }

    @Override
    public final boolean r(boolean z) {
        return this.a.b(z);
    }

    @Override
    public final void s(sac sacVar) {
        this.k = sacVar;
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final void v() {
        uac uacVar = this.a;
        if (uacVar.e == 0) {
            uacVar.e = 1;
        }
    }

    @Override
    public final void w(pj4 pj4Var) {
        this.i = pj4Var;
        this.j = vn3.a;
    }

    @Override
    public final void release() {
    }
}
