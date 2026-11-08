package m4;

import h9.i0;
import h9.t1;
import java.util.List;
public final class c implements f3.o {
    public final b f19595a = new b(0, 1, null, "audio/ac4");
    public final h2.x f19596b = new h2.x(16384);
    public boolean f19597c;

    @Override
    public final boolean b(f3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.b(f3.p):boolean");
    }

    @Override
    public final void c(f3.q qVar) {
        this.f19595a.g(qVar, new g0(0, 1));
        qVar.U0();
        qVar.f(new f3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j3, long j10) {
        this.f19597c = false;
        this.f19595a.d();
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        h2.x xVar = this.f19596b;
        int read = pVar.read(xVar.f14162a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z9 = this.f19597c;
        b bVar = this.f19595a;
        if (!z9) {
            bVar.f19589o = 0L;
            this.f19597c = true;
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
