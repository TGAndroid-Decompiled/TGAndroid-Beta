package m4;

import e3.i0;
import e3.o;
import e3.p;
import e3.q;
import g9.g0;
import g9.s1;
import java.util.List;
public final class c implements o {
    public q f19078a;
    public i0 f19079b;
    public int f19080c;
    public long d;
    public b f19081e;
    public int f19082f;
    public long f19083g;

    @Override
    public final boolean b(p pVar) {
        return d.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f19078a = qVar;
        this.f19079b = qVar.i0(0, 1);
        qVar.L();
    }

    @Override
    public final void d(long j10, long j11) {
        int i3;
        if (j10 == 0) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        this.f19080c = i3;
        b bVar = this.f19081e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = g9.i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r21, e3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.f(e3.p, e3.s):int");
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
