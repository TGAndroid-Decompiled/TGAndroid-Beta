package j4;

import f9.i0;
import f9.s1;
import java.util.List;
public final class c implements c3.o {
    public final b f15256a = new b(0, 1, null, "audio/ac4");
    public final e2.x f15257b = new e2.x(16384);
    public boolean f15258c;

    @Override
    public final boolean a(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.p):boolean");
    }

    @Override
    public final void c(c3.q qVar) {
        this.f15256a.d(qVar, new f0(0, 1));
        qVar.Q0();
        qVar.D1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f15258c = false;
        this.f15256a.c();
    }

    @Override
    public final List e() {
        f9.g0 g0Var = i0.f10286b;
        return s1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.f15257b;
        int read = pVar.read(xVar.f9731a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f15258c;
        b bVar = this.f15256a;
        if (!z10) {
            bVar.f15251o = 0L;
            this.f15258c = true;
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
