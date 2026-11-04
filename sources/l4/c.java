package l4;

import g9.i0;
import g9.s1;
import java.util.List;
public final class c implements e3.o {
    public final b f17761a = new b(0, 1, null, "audio/ac4");
    public final g2.y f17762b = new g2.y(16384);
    public boolean f17763c;

    @Override
    public final boolean b(e3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: l4.c.b(e3.p):boolean");
    }

    @Override
    public final void c(e3.q qVar) {
        this.f17761a.f(qVar, new f0(0, 1));
        qVar.L();
        qVar.f(new e3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f17763c = false;
        this.f17761a.a();
    }

    @Override
    public final List e() {
        g9.g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p pVar, e3.s sVar) {
        g2.y yVar = this.f17762b;
        int read = pVar.read(yVar.f11923a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        yVar.N(0);
        yVar.M(read);
        boolean z10 = this.f17763c;
        b bVar = this.f17761a;
        if (!z10) {
            bVar.f17755o = 0L;
            this.f17763c = true;
        }
        bVar.c(yVar);
        return 0;
    }

    @Override
    public final e3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
