package n4;

import f3.i0;
import f3.o;
import f3.p;
import f3.q;
import h9.g0;
import h9.t1;
import java.util.List;
public final class c implements o {
    public q f21323a;
    public i0 f21324b;
    public int f21325c;
    public long d;
    public b f21326e;
    public int f21327f;
    public long f21328g;

    @Override
    public final boolean b(p pVar) {
        return d.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f21323a = qVar;
        this.f21324b = qVar.d2(0, 1);
        qVar.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        int i7;
        if (j3 == 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.f21325c = i7;
        b bVar = this.f21326e;
        if (bVar != null) {
            bVar.b(j10);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14006b;
        return t1.f14074e;
    }

    @Override
    public final int f(f3.p r21, f3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: n4.c.f(f3.p, f3.s):int");
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
