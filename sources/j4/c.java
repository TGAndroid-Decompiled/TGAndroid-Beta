package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class c implements c3.o {
    public final b f9416a = new b(0, 1, null, "audio/ac4");
    public final e2.x f9417b = new e2.x(16384);
    public boolean f9418c;

    @Override
    public final boolean a(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.p):boolean");
    }

    @Override
    public final void c(c3.q qVar) {
        this.f9416a.f(qVar, new g0(0, 1));
        qVar.Q0();
        qVar.G1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f9418c = false;
        this.f9416a.e();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.f9417b;
        int read = pVar.read(xVar.f6207a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f9418c;
        b bVar = this.f9416a;
        if (!z10) {
            bVar.f9415o = 0L;
            this.f9418c = true;
        }
        bVar.c(xVar);
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
