package c3;

import android.view.Surface;
import b8.zb;
import d2.a2;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class e implements l0 {
    public final y f4007a;
    public final z f4008b;
    public final e0 f4009c;
    public final ArrayDeque d;
    public Surface f4010e;
    public d2.v f4011f;
    public long f4012g;
    public j0 h;
    public Executor f4013i;
    public w f4014j;

    public e(y yVar, z zVar, g2.h0 h0Var) {
        this.f4007a = yVar;
        this.f4008b = zVar;
        yVar.f4130l = h0Var;
        ?? obj = new Object();
        obj.f53182b = this;
        this.f4009c = new e0(obj, yVar, zVar);
        this.d = new ArrayDeque();
        this.f4011f = new d2.v(new d2.u());
        this.f4012g = -9223372036854775807L;
        this.h = j0.f4054i;
        this.f4013i = new b(0);
        this.f4014j = new Object();
    }

    @Override
    public final boolean a() {
        e0 e0Var = this.f4009c;
        long j10 = e0Var.f4022j;
        if (j10 != -9223372036854775807L && e0Var.f4021i == j10) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(float f10) {
        this.f4007a.h(f10);
    }

    @Override
    public final Surface c() {
        Surface surface = this.f4010e;
        surface.getClass();
        return surface;
    }

    @Override
    public final void d() {
        this.f4008b.b();
        y yVar = this.f4007a;
        yVar.d = false;
        yVar.f4127i = -9223372036854775807L;
        d0 d0Var = yVar.f4122b;
        d0Var.d = false;
        a0 a0Var = d0Var.f3992c;
        if (a0Var != null) {
            a0Var.b();
        }
        d0Var.a();
    }

    @Override
    public final boolean e(d2.v vVar) {
        return true;
    }

    @Override
    public final void f(d2.v vVar, long j10, int i3, List list) {
        long j11;
        long j12;
        zb.p(list.isEmpty());
        int i10 = vVar.f8495z;
        int i11 = vVar.A;
        d2.v vVar2 = this.f4011f;
        int i12 = vVar2.f8495z;
        e0 e0Var = this.f4009c;
        if (i10 != i12 || i11 != vVar2.A) {
            g2.k0 k0Var = e0Var.d;
            long j13 = e0Var.h;
            if (j13 == -9223372036854775807L) {
                j11 = 0;
            } else {
                j11 = j13 + 1;
            }
            k0Var.a(new a2(i10, i11), j11);
        }
        float f10 = vVar.D;
        if (f10 != this.f4011f.D) {
            this.f4007a.f(f10);
        }
        this.f4011f = vVar;
        if (j10 != this.f4012g) {
            if (e0Var.f4019f.f11909c == 0) {
                e0Var.f4016b.e(i3);
                e0Var.f4024l = j10;
            } else {
                g2.k0 k0Var2 = e0Var.f4018e;
                long j14 = e0Var.h;
                if (j14 == -9223372036854775807L) {
                    j12 = -4611686018427387904L;
                } else {
                    j12 = j14 + 1;
                }
                k0Var2.a(Long.valueOf(j10), j12);
            }
            this.f4012g = j10;
        }
    }

    @Override
    public final void g() {
        this.f4008b.b();
        this.f4007a.d();
    }

    @Override
    public final void h(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i() {
        e0 e0Var = this.f4009c;
        if (e0Var.h == -9223372036854775807L) {
            e0Var.h = Long.MIN_VALUE;
            e0Var.f4021i = Long.MIN_VALUE;
        }
        e0Var.f4022j = e0Var.h;
    }

    @Override
    public final void j(int i3) {
        d0 d0Var = this.f4007a.f4122b;
        if (d0Var.f3997j == i3) {
            return;
        }
        d0Var.f3997j = i3;
        d0Var.d(true);
    }

    @Override
    public final void k() {
        this.f4010e = null;
        this.f4007a.g(null);
    }

    @Override
    public final void l(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            y yVar = this.f4007a;
            yVar.f4122b.b();
            yVar.h = -9223372036854775807L;
            yVar.f4125f = -9223372036854775807L;
            yVar.f4124e = Math.min(yVar.f4124e, 1);
            yVar.f4127i = -9223372036854775807L;
            yVar.f4132n = false;
        }
        this.f4008b.b();
        e0 e0Var = this.f4009c;
        g2.k0 k0Var = e0Var.d;
        g2.t tVar = e0Var.f4019f;
        tVar.f11907a = 0;
        tVar.f11908b = -1;
        tVar.f11909c = 0;
        e0Var.h = -9223372036854775807L;
        e0Var.f4021i = -9223372036854775807L;
        e0Var.f4022j = -9223372036854775807L;
        g2.k0 k0Var2 = e0Var.f4018e;
        if (k0Var2.p() > 0) {
            if (k0Var2.p() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zb.f(z11);
            while (k0Var2.p() > 1) {
                k0Var2.i();
            }
            Object i3 = k0Var2.i();
            i3.getClass();
            e0Var.f4024l = ((Long) i3).longValue();
        }
        if (k0Var.p() > 0) {
            if (k0Var.p() > 0) {
                z12 = true;
            }
            zb.f(z12);
            while (k0Var.p() > 1) {
                k0Var.i();
            }
            Object i10 = k0Var.i();
            i10.getClass();
            k0Var.a((a2) i10, 0L);
        }
        this.d.clear();
    }

    @Override
    public final void m(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void n(long j10, long j11) {
        try {
            this.f4009c.a(j10, j11);
        } catch (k2.l e10) {
            throw new k0(e10, this.f4011f);
        }
    }

    @Override
    public final void o(Surface surface, g2.z zVar) {
        this.f4010e = surface;
        this.f4007a.g(surface);
    }

    @Override
    public final void p(w wVar) {
        this.f4014j = wVar;
    }

    @Override
    public final void q(boolean z10) {
        this.f4007a.c(z10);
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f4007a.b(z10);
    }

    @Override
    public final void s() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean t(long j10, i iVar) {
        this.d.add(iVar);
        e0 e0Var = this.f4009c;
        g2.t tVar = e0Var.f4019f;
        int i3 = tVar.f11909c;
        long[] jArr = (long[]) tVar.f11910e;
        if (i3 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i10 = tVar.f11907a;
                int i11 = length2 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i11);
                System.arraycopy((long[]) tVar.f11910e, 0, jArr2, i11, i10);
                tVar.f11907a = 0;
                tVar.f11908b = tVar.f11909c - 1;
                tVar.f11910e = jArr2;
                tVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i12 = (tVar.f11908b + 1) & tVar.d;
        tVar.f11908b = i12;
        ((long[]) tVar.f11910e)[i12] = j10;
        tVar.f11909c++;
        e0Var.h = j10;
        e0Var.f4022j = -9223372036854775807L;
        this.f4013i.execute(new ai.s(this, 19));
        return true;
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final void v() {
        y yVar = this.f4007a;
        if (yVar.f4124e == 0) {
            yVar.f4124e = 1;
        }
    }

    @Override
    public final void w(c6.i iVar) {
        this.h = iVar;
        this.f4013i = l9.r.f18162a;
    }

    @Override
    public final void release() {
    }
}
