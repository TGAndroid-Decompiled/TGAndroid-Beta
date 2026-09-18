package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class a implements c3.o {
    public final b f12607a = new b("audio/ac3");
    public final e2.v f12608b = new e2.v(2786);
    public boolean f12609c;

    @Override
    public final boolean a(c3.p r14) {
        throw new UnsupportedOperationException("Method not decompiled: j4.a.a(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        this.f12607a.d(qVar, new f0(0, 1));
        qVar.e1();
        qVar.X1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        this.f12609c = false;
        this.f12607a.c();
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8084b;
        return a1.e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.f12608b;
        int read = pVar.read(vVar.f7934a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.f12609c;
        b bVar = this.f12607a;
        if (!z10) {
            bVar.f12621o = 0L;
            this.f12609c = true;
        }
        bVar.a(vVar);
        return 0;
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
