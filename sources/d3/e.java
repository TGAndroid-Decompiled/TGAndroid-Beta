package d3;

import a8.ia;
import android.view.Surface;
import bi.ab;
import e2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class e implements k0 {
    public final y f7988a;
    public final z f7989b;
    public final e0 f7990c;
    public final ArrayDeque d;
    public Surface f7991e;
    public e2.u f7992f;
    public long f7993g;
    public i0 h;
    public Executor f7994i;
    public w f7995j;

    public e(y yVar, z zVar, h2.g0 g0Var) {
        this.f7988a = yVar;
        this.f7989b = zVar;
        yVar.f8107l = g0Var;
        this.f7990c = new e0(new q4.q(this), yVar, zVar);
        this.d = new ArrayDeque();
        this.f7992f = new e2.u(new e2.t());
        this.f7993g = -9223372036854775807L;
        this.h = i0.f8025k;
        this.f7994i = new b(0);
        this.f7995j = new Object();
    }

    @Override
    public final boolean a() {
        e0 e0Var = this.f7990c;
        long j3 = e0Var.f8003j;
        if (j3 != -9223372036854775807L && e0Var.f8002i == j3) {
            return true;
        }
        return false;
    }

    @Override
    public final Surface b() {
        Surface surface = this.f7991e;
        surface.getClass();
        return surface;
    }

    @Override
    public final void c(w wVar) {
        this.f7995j = wVar;
    }

    @Override
    public final void d(float f10) {
        this.f7988a.h(f10);
    }

    @Override
    public final void e(cb.c cVar) {
        this.h = cVar;
        this.f7994i = m9.r.f19999a;
    }

    @Override
    public final void f() {
        this.f7989b.b();
        y yVar = this.f7988a;
        yVar.d = false;
        yVar.f8104i = -9223372036854775807L;
        d0 d0Var = yVar.f8099b;
        d0Var.d = false;
        a0 a0Var = d0Var.f7973c;
        if (a0Var != null) {
            a0Var.b();
        }
        d0Var.a();
    }

    @Override
    public final void g(Surface surface, h2.y yVar) {
        this.f7991e = surface;
        this.f7988a.g(surface);
    }

    @Override
    public final void h() {
        this.f7989b.b();
        this.f7988a.d();
    }

    @Override
    public final void i(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean j(e2.u uVar) {
        return true;
    }

    @Override
    public final void k() {
        e0 e0Var = this.f7990c;
        if (e0Var.h == -9223372036854775807L) {
            e0Var.h = Long.MIN_VALUE;
            e0Var.f8002i = Long.MIN_VALUE;
        }
        e0Var.f8003j = e0Var.h;
    }

    @Override
    public final void l(int i7) {
        d0 d0Var = this.f7988a.f8099b;
        if (d0Var.f7978j == i7) {
            return;
        }
        d0Var.f7978j = i7;
        d0Var.d(true);
    }

    @Override
    public final void m() {
        this.f7991e = null;
        this.f7988a.g(null);
    }

    @Override
    public final boolean n(long j3, i iVar) {
        this.d.add(iVar);
        e0 e0Var = this.f7990c;
        h2.s sVar = e0Var.f8000f;
        int i7 = sVar.f14150c;
        long[] jArr = (long[]) sVar.f14151e;
        if (i7 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i10 = sVar.f14148a;
                int i11 = length2 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i11);
                System.arraycopy((long[]) sVar.f14151e, 0, jArr2, i11, i10);
                sVar.f14148a = 0;
                sVar.f14149b = sVar.f14150c - 1;
                sVar.f14151e = jArr2;
                sVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i12 = (sVar.f14149b + 1) & sVar.d;
        sVar.f14149b = i12;
        ((long[]) sVar.f14151e)[i12] = j3;
        sVar.f14150c++;
        e0Var.h = j3;
        e0Var.f8003j = -9223372036854775807L;
        this.f7994i.execute(new ab(this, 11));
        return true;
    }

    @Override
    public final void o(boolean z9) {
        boolean z10;
        boolean z11 = false;
        if (z9) {
            y yVar = this.f7988a;
            yVar.f8099b.b();
            yVar.h = -9223372036854775807L;
            yVar.f8102f = -9223372036854775807L;
            yVar.f8101e = Math.min(yVar.f8101e, 1);
            yVar.f8104i = -9223372036854775807L;
            yVar.f8109n = false;
        }
        this.f7989b.b();
        e0 e0Var = this.f7990c;
        h2.j0 j0Var = e0Var.d;
        h2.s sVar = e0Var.f8000f;
        sVar.f14148a = 0;
        sVar.f14149b = -1;
        sVar.f14150c = 0;
        e0Var.h = -9223372036854775807L;
        e0Var.f8002i = -9223372036854775807L;
        e0Var.f8003j = -9223372036854775807L;
        h2.j0 j0Var2 = e0Var.f7999e;
        if (j0Var2.p() > 0) {
            if (j0Var2.p() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ia.f(z10);
            while (j0Var2.p() > 1) {
                j0Var2.i();
            }
            Object i7 = j0Var2.i();
            i7.getClass();
            e0Var.f8005l = ((Long) i7).longValue();
        }
        if (j0Var.p() > 0) {
            if (j0Var.p() > 0) {
                z11 = true;
            }
            ia.f(z11);
            while (j0Var.p() > 1) {
                j0Var.i();
            }
            Object i10 = j0Var.i();
            i10.getClass();
            j0Var.a((x1) i10, 0L);
        }
        this.d.clear();
    }

    @Override
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void q(long j3, long j10) {
        try {
            this.f7990c.a(j3, j10);
        } catch (l2.l e10) {
            throw new j0(e10, this.f7992f);
        }
    }

    @Override
    public final void r(boolean z9) {
        this.f7988a.c(z9);
    }

    @Override
    public final boolean s(boolean z9) {
        return this.f7988a.b(z9);
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void u(e2.u uVar, long j3, int i7, List list) {
        long j10;
        long j11;
        ia.p(list.isEmpty());
        int i10 = uVar.f10626z;
        int i11 = uVar.A;
        e2.u uVar2 = this.f7992f;
        int i12 = uVar2.f10626z;
        e0 e0Var = this.f7990c;
        if (i10 != i12 || i11 != uVar2.A) {
            h2.j0 j0Var = e0Var.d;
            long j12 = e0Var.h;
            if (j12 == -9223372036854775807L) {
                j10 = 0;
            } else {
                j10 = j12 + 1;
            }
            j0Var.a(new x1(i10, i11), j10);
        }
        float f10 = uVar.D;
        if (f10 != this.f7992f.D) {
            this.f7988a.f(f10);
        }
        this.f7992f = uVar;
        if (j3 != this.f7993g) {
            if (e0Var.f8000f.f14150c == 0) {
                e0Var.f7997b.e(i7);
                e0Var.f8005l = j3;
            } else {
                h2.j0 j0Var2 = e0Var.f7999e;
                long j13 = e0Var.h;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                j0Var2.a(Long.valueOf(j3), j11);
            }
            this.f7993g = j3;
        }
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        y yVar = this.f7988a;
        if (yVar.f8101e == 0) {
            yVar.f8101e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
