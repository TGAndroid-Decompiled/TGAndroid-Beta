package k4;

import c3.i0;
import c3.o;
import c3.p;
import c3.q;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class c implements o {
    public q f14090a;
    public i0 f14091b;
    public int f14092c;
    public long d;
    public b e;
    public int f14093f;
    public long f14094g;

    @Override
    public final boolean a(p pVar) {
        return e.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f14090a = qVar;
        this.f14091b = qVar.W(0, 1);
        qVar.D();
    }

    @Override
    public final void d(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f14092c = i10;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: k4.c.f(c3.p, c3.s):int");
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
