package m4;

import h9.i0;
import h9.t1;
import java.util.List;
public final class c implements f3.o {
    public final b f20583a = new b(0, 1, null, "audio/ac4");
    public final h2.x f20584b = new h2.x(16384);
    public boolean f20585c;

    @Override
    public final boolean b(f3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.b(f3.p):boolean");
    }

    @Override
    public final void c(f3.q qVar) {
        this.f20583a.g(qVar, new f0(0, 1));
        qVar.d1();
        qVar.j(new f3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j3, long j10) {
        this.f20585c = false;
        this.f20583a.d();
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f14035b;
        return t1.f14103e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        h2.x xVar = this.f20584b;
        int read = pVar.read(xVar.f13865a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f20585c;
        b bVar = this.f20583a;
        if (!z10) {
            bVar.f20577o = 0L;
            this.f20585c = true;
        }
        bVar.c(xVar);
        return 0;
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
