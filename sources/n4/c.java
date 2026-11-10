package n4;

import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class c implements o {
    public q f20395a;
    public j0 f20396b;
    public int f20397c;
    public long d;
    public b f20398e;
    public int f20399f;
    public long f20400g;

    @Override
    public final boolean b(p pVar) {
        return d.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f20395a = qVar;
        this.f20396b = qVar.O1(0, 1);
        qVar.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        int i7;
        if (j3 == 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.f20397c = i7;
        b bVar = this.f20398e;
        if (bVar != null) {
            bVar.b(j10);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
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
