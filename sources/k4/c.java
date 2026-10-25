package k4;

import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class c implements o {
    public q f16372a;
    public j0 f16373b;
    public int f16374c;
    public long d;
    public b e;
    public int f16375f;
    public long f16376g;

    @Override
    public final boolean a(p pVar) {
        return e.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f16372a = qVar;
        this.f16373b = qVar.F1(0, 1);
        qVar.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f16374c = i10;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
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
