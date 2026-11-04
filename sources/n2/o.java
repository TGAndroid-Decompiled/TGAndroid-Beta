package n2;

import android.os.Handler;
import android.support.v4.media.session.a0;
import d2.s0;
import d2.v;
import d2.v0;
import e3.h0;
import e3.i0;
import g2.n0;
import g2.y;
import org.telegram.ui.Components.rm0;
import w2.c1;
public final class o implements i0 {
    public final c1 f20201a;
    public final tf.b f20202b = new Object();
    public final n3.a f20203c = new n3.a();
    public long d = -9223372036854775807L;
    public final p f20204e;

    public o(p pVar, a0 a0Var) {
        this.f20204e = pVar;
        this.f20201a = new c1(a0Var, null, null);
    }

    @Override
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override
    public final int c(d2.o oVar, int i3, boolean z10) {
        c1 c1Var = this.f20201a;
        c1Var.getClass();
        return c1Var.c(oVar, i3, z10);
    }

    @Override
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
        long j11;
        long j12;
        this.f20201a.d(j10, i3, i10, i11, h0Var);
        while (this.f20201a.A(false)) {
            n3.a aVar = this.f20203c;
            aVar.clear();
            if (this.f20201a.F(this.f20202b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.f16158e;
                s0 a10 = this.f20204e.f20207c.a(aVar);
                if (a10 != null) {
                    p3.a aVar2 = (p3.a) a10.f8366a[0];
                    String str = aVar2.f53138a;
                    String str2 = aVar2.f53139b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = n0.V(n0.r(aVar2.f53141e));
                        } catch (v0 unused) {
                            j12 = -9223372036854775807L;
                        }
                        if (j12 != -9223372036854775807L) {
                            n nVar = new n(j13, j12);
                            Handler handler = this.f20204e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.f20201a;
        rm0 rm0Var = c1Var.f57043a;
        synchronized (c1Var) {
            int i12 = c1Var.f57059s;
            if (i12 == 0) {
                j11 = -1;
            } else {
                j11 = c1Var.j(i12);
            }
        }
        rm0Var.b(j11);
    }

    @Override
    public final void e(int i3, y yVar) {
        f(yVar, i3, 0);
    }

    @Override
    public final void f(y yVar, int i3, int i10) {
        c1 c1Var = this.f20201a;
        c1Var.getClass();
        c1Var.f(yVar, i3, 0);
    }

    @Override
    public final void g(v vVar) {
        this.f20201a.g(vVar);
    }

    @Override
    public final void b(long j10) {
    }
}
