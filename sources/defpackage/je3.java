package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class je3 implements iec {
    public final xcc a;
    public final ycc b;
    public final ddc c;
    public final ArrayDeque d;
    public final zj4 e;
    public Surface f;
    public go4 g;
    public long h;
    public gec i;
    public Executor j;
    public vcc k;

    public je3(xcc xccVar, ycc yccVar, bfb bfbVar) {
        this.a = xccVar;
        this.b = yccVar;
        xccVar.k = bfbVar;
        zj4 zj4Var = new zj4(new wm2(xccVar, (byte) 22));
        this.e = zj4Var;
        this.c = new ddc(new hi2(this), xccVar, yccVar, zj4Var);
        this.d = new ArrayDeque();
        this.g = new go4(new fo4());
        this.h = -9223372036854775807L;
        this.i = gec.C;
        this.j = new kc((byte) 2);
        this.k = new Object();
    }

    @Override
    public final boolean a() {
        ddc ddcVar = this.c;
        long j = ddcVar.k;
        if (j != -9223372036854775807L && ddcVar.j == j) {
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
    public final void c(Surface surface, yka ykaVar) {
        this.f = surface;
        this.a.f(surface);
    }

    @Override
    public final void d(float f) {
        this.a.g(f);
    }

    @Override
    public final void e() {
        this.b.b();
        xcc xccVar = this.a;
        xccVar.d = false;
        xccVar.h = -9223372036854775807L;
        cdc cdcVar = xccVar.b;
        cdcVar.d = false;
        zcc zccVar = cdcVar.c;
        if (zccVar != null) {
            zccVar.b();
        }
        cdcVar.a();
    }

    @Override
    public final void f() {
        this.b.b();
        this.a.d();
    }

    @Override
    public final void g(go4 go4Var, long j, int i, List list) {
        long j2;
        long j3;
        jte.p(list.isEmpty());
        int i2 = go4Var.A;
        int i3 = go4Var.B;
        go4 go4Var2 = this.g;
        int i4 = go4Var2.A;
        ddc ddcVar = this.c;
        if (i2 != i4 || i3 != go4Var2.B) {
            ir irVar = ddcVar.d;
            long j4 = ddcVar.i;
            if (j4 == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j4 + 1;
            }
            irVar.a(new jec(i2, i3), j2);
        }
        float f = go4Var.F;
        if (f != this.g.F) {
            zj4 zj4Var = this.e;
            zj4Var.f = f;
            zj4Var.a.c();
            zj4Var.b.c();
            zj4Var.c = false;
            zj4Var.d = -9223372036854775807L;
            zj4Var.e = 0;
            zj4Var.c();
        }
        this.g = go4Var;
        if (j != this.h) {
            if (ddcVar.f.c == 0) {
                ddcVar.b.e(i);
                ddcVar.m = j;
            } else {
                ir irVar2 = ddcVar.e;
                long j5 = ddcVar.i;
                if (j5 == -9223372036854775807L) {
                    j3 = -4611686018427387904L;
                } else {
                    j3 = j5 + 1;
                }
                irVar2.a(Long.valueOf(j), j3);
            }
            this.h = j;
        }
    }

    @Override
    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i(k44 k44Var) {
        this.i = k44Var;
        this.j = fp3.a;
    }

    @Override
    public final void j() {
        ddc ddcVar = this.c;
        long j = ddcVar.i;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            ddcVar.i = Long.MIN_VALUE;
            ddcVar.j = Long.MIN_VALUE;
        }
        ddcVar.k = j;
    }

    @Override
    public final void k(int i) {
        cdc cdcVar = this.a.b;
        if (cdcVar.i == i) {
            return;
        }
        cdcVar.i = i;
        cdcVar.c(true);
    }

    @Override
    public final void l() {
        this.f = null;
        this.a.f(null);
    }

    @Override
    public final boolean m(long j, vm6 vm6Var) {
        this.d.add(vm6Var);
        ddc ddcVar = this.c;
        rh6 rh6Var = ddcVar.f;
        int i = rh6Var.c;
        long[] jArr = (long[]) rh6Var.e;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                ?? r5 = new long[length];
                int length2 = jArr.length;
                int i2 = rh6Var.a;
                int i3 = length2 - i2;
                System.arraycopy(jArr, i2, r5, 0, i3);
                System.arraycopy((long[]) rh6Var.e, 0, r5, i3, i2);
                rh6Var.a = 0;
                int i4 = rh6Var.c;
                rh6Var.b = i4 - 1;
                rh6Var.e = r5;
                rh6Var.d = length - 1;
                i = i4;
                jArr = r5;
            } else {
                rjb.h();
                return false;
            }
        }
        int i5 = (rh6Var.b + 1) & rh6Var.d;
        rh6Var.b = i5;
        jArr[i5] = j;
        rh6Var.c = i + 1;
        ddcVar.i = j;
        ddcVar.k = -9223372036854775807L;
        this.j.execute(new xf2(this, (byte) 28));
        return true;
    }

    @Override
    public final boolean n(go4 go4Var) {
        return true;
    }

    @Override
    public final void o(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            xcc xccVar = this.a;
            xccVar.b.b();
            xccVar.f = -9223372036854775807L;
            xccVar.e = Math.min(xccVar.e, 1);
            xccVar.h = -9223372036854775807L;
            xccVar.m = false;
        }
        this.b.b();
        ddc ddcVar = this.c;
        ir irVar = ddcVar.d;
        rh6 rh6Var = ddcVar.f;
        rh6Var.a = 0;
        rh6Var.b = -1;
        rh6Var.c = 0;
        ddcVar.i = -9223372036854775807L;
        ddcVar.j = -9223372036854775807L;
        ddcVar.k = -9223372036854775807L;
        ir irVar2 = ddcVar.e;
        if (irVar2.p() > 0) {
            if (irVar2.p() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            jte.f(z2);
            while (irVar2.p() > 1) {
                irVar2.i();
            }
            Object i = irVar2.i();
            i.getClass();
            ddcVar.m = ((Long) i).longValue();
        }
        if (irVar.p() > 0) {
            if (irVar.p() > 0) {
                z3 = true;
            }
            jte.f(z3);
            while (irVar.p() > 1) {
                irVar.i();
            }
            Object i2 = irVar.i();
            i2.getClass();
            irVar.a((jec) i2, 0L);
        }
        this.d.clear();
    }

    @Override
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void q(long j, long j2) {
        try {
            this.c.a(j, j2);
        } catch (u64 e) {
            throw new hec(e, this.g);
        }
    }

    @Override
    public final void r(boolean z) {
        this.a.c(z);
    }

    @Override
    public final boolean s(boolean z) {
        return this.a.b(z);
    }

    @Override
    public final void t(vcc vccVar) {
        this.k = vccVar;
    }

    @Override
    public final void u() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        xcc xccVar = this.a;
        if (xccVar.e == 0) {
            xccVar.e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
