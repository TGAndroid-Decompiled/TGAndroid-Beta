package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class c implements c3.o {
    public final b f13999a = new b(0, 1, null, "audio/ac4");
    public final e2.x f14000b = new e2.x(16384);
    public boolean f14001c;

    @Override
    public final boolean a(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.p):boolean");
    }

    @Override
    public final void c(c3.q qVar) {
        this.f13999a.d(qVar, new f0(0, 1));
        qVar.H();
        qVar.g0(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f14001c = false;
        this.f13999a.c();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.f14000b;
        int read = pVar.read(xVar.f8291a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f14001c;
        b bVar = this.f13999a;
        if (!z10) {
            bVar.f13994o = 0L;
            this.f14001c = true;
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
