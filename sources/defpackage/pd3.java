package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class pd3 implements fgc {
    public final uec a;
    public final vec b;
    public final afc c;
    public final ArrayDeque d;
    public final zj4 e;
    public Surface f;
    public ko4 g;
    public long h;
    public dgc i;
    public Executor j;
    public sec k;

    public pd3(uec uecVar, vec vecVar, vgb vgbVar) {
        this.a = uecVar;
        this.b = vecVar;
        uecVar.k = vgbVar;
        zj4 zj4Var = new zj4(new ht2(uecVar, (byte) 21));
        this.e = zj4Var;
        this.c = new afc(new qx6(this), uecVar, vecVar, zj4Var);
        this.d = new ArrayDeque();
        this.g = new ko4(new jo4());
        this.h = -9223372036854775807L;
        this.i = dgc.C;
        this.j = new ic((byte) 2);
        this.k = new Object();
    }

    @Override
    public final boolean a() {
        afc afcVar = this.c;
        long j = afcVar.k;
        if (j != -9223372036854775807L && afcVar.j == j) {
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
    public final void c(Surface surface, rma rmaVar) {
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
        uec uecVar = this.a;
        uecVar.d = false;
        uecVar.h = -9223372036854775807L;
        zec zecVar = uecVar.b;
        zecVar.d = false;
        wec wecVar = zecVar.c;
        if (wecVar != null) {
            wecVar.b();
        }
        zecVar.a();
    }

    @Override
    public final void f() {
        this.b.b();
        this.a.d();
    }

    @Override
    public final void g(ko4 ko4Var, long j, int i, List list) {
        long j2;
        long j3;
        yve.p(list.isEmpty());
        int i2 = ko4Var.A;
        int i3 = ko4Var.B;
        ko4 ko4Var2 = this.g;
        int i4 = ko4Var2.A;
        afc afcVar = this.c;
        if (i2 != i4 || i3 != ko4Var2.B) {
            jq jqVar = afcVar.d;
            long j4 = afcVar.i;
            if (j4 == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j4 + 1;
            }
            jqVar.a(j2, new ggc(i2, i3));
        }
        float f = ko4Var.F;
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
        this.g = ko4Var;
        if (j != this.h) {
            if (afcVar.f.c == 0) {
                afcVar.b.e(i);
                afcVar.m = j;
            } else {
                jq jqVar2 = afcVar.e;
                long j5 = afcVar.i;
                if (j5 == -9223372036854775807L) {
                    j3 = -4611686018427387904L;
                } else {
                    j3 = j5 + 1;
                }
                jqVar2.a(j3, Long.valueOf(j));
            }
            this.h = j;
        }
    }

    @Override
    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i(v34 v34Var) {
        this.i = v34Var;
        this.j = mo3.a;
    }

    @Override
    public final void j() {
        afc afcVar = this.c;
        long j = afcVar.i;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            afcVar.i = Long.MIN_VALUE;
            afcVar.j = Long.MIN_VALUE;
        }
        afcVar.k = j;
    }

    @Override
    public final void k(int i) {
        zec zecVar = this.a.b;
        if (zecVar.i == i) {
            return;
        }
        zecVar.i = i;
        zecVar.c(true);
    }

    @Override
    public final void l() {
        this.f = null;
        this.a.f(null);
    }

    @Override
    public final boolean m(long j, ym6 ym6Var) {
        this.d.add(ym6Var);
        afc afcVar = this.c;
        vh6 vh6Var = afcVar.f;
        int i = vh6Var.c;
        long[] jArr = (long[]) vh6Var.e;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                ?? r5 = new long[length];
                int length2 = jArr.length;
                int i2 = vh6Var.a;
                int i3 = length2 - i2;
                System.arraycopy(jArr, i2, r5, 0, i3);
                System.arraycopy((long[]) vh6Var.e, 0, r5, i3, i2);
                vh6Var.a = 0;
                int i4 = vh6Var.c;
                vh6Var.b = i4 - 1;
                vh6Var.e = r5;
                vh6Var.d = length - 1;
                i = i4;
                jArr = r5;
            } else {
                grb.g();
                return false;
            }
        }
        int i5 = (vh6Var.b + 1) & vh6Var.d;
        vh6Var.b = i5;
        jArr[i5] = j;
        vh6Var.c = i + 1;
        afcVar.i = j;
        afcVar.k = -9223372036854775807L;
        this.j.execute(new vd2(this, (byte) 29));
        return true;
    }

    @Override
    public final boolean n(ko4 ko4Var) {
        return true;
    }

    @Override
    public final void o(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            uec uecVar = this.a;
            uecVar.b.b();
            uecVar.f = -9223372036854775807L;
            uecVar.e = Math.min(uecVar.e, 1);
            uecVar.h = -9223372036854775807L;
            uecVar.m = false;
        }
        this.b.b();
        afc afcVar = this.c;
        jq jqVar = afcVar.d;
        vh6 vh6Var = afcVar.f;
        vh6Var.a = 0;
        vh6Var.b = -1;
        vh6Var.c = 0;
        afcVar.i = -9223372036854775807L;
        afcVar.j = -9223372036854775807L;
        afcVar.k = -9223372036854775807L;
        jq jqVar2 = afcVar.e;
        if (jqVar2.p() > 0) {
            if (jqVar2.p() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            yve.f(z2);
            while (jqVar2.p() > 1) {
                jqVar2.i();
            }
            Object i = jqVar2.i();
            i.getClass();
            afcVar.m = ((Long) i).longValue();
        }
        if (jqVar.p() > 0) {
            if (jqVar.p() > 0) {
                z3 = true;
            }
            yve.f(z3);
            while (jqVar.p() > 1) {
                jqVar.i();
            }
            Object i2 = jqVar.i();
            i2.getClass();
            jqVar.a(0L, (ggc) i2);
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
        } catch (e64 e) {
            throw new egc(e, this.g);
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
    public final void t(sec secVar) {
        this.k = secVar;
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
        uec uecVar = this.a;
        if (uecVar.e == 0) {
            uecVar.e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
