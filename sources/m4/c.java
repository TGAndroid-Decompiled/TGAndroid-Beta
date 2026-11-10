package m4;

import h9.i0;
import h9.t1;
import java.util.List;
public final class c implements f3.o {
    public final b f19600a = new b(0, 1, null, "audio/ac4");
    public final h2.x f19601b = new h2.x(16384);
    public boolean f19602c;

    @Override
    public final boolean b(f3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.b(f3.p):boolean");
    }

    @Override
    public final void c(f3.q qVar) {
        this.f19600a.g(qVar, new g0(0, 1));
        qVar.U0();
        qVar.f(new f3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j3, long j10) {
        this.f19602c = false;
        this.f19600a.d();
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        h2.x xVar = this.f19601b;
        int read = pVar.read(xVar.f14164a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z9 = this.f19602c;
        b bVar = this.f19600a;
        if (!z9) {
            bVar.f19594o = 0L;
            this.f19602c = true;
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
