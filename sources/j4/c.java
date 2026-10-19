package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class c implements c3.o {
    public final b f14001a = new b(0, 1, null, "audio/ac4");
    public final e2.x f14002b = new e2.x(16384);
    public boolean f14003c;

    @Override
    public final boolean a(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.p):boolean");
    }

    @Override
    public final void c(c3.q qVar) {
        this.f14001a.d(qVar, new f0(0, 1));
        qVar.H();
        qVar.g0(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f14003c = false;
        this.f14001a.c();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8476b;
        return x1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.f14002b;
        int read = pVar.read(xVar.f8293a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f14003c;
        b bVar = this.f14001a;
        if (!z10) {
            bVar.f13996o = 0L;
            this.f14003c = true;
        }
        bVar.a(xVar);
        return 0;
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
