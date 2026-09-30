package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class c implements c3.o {
    public final b f12615a = new b(0, 1, null, "audio/ac4");
    public final e2.v f12616b = new e2.v(16384);
    public boolean f12617c;

    @Override
    public final boolean a(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        this.f12615a.d(qVar, new f0(0, 1));
        qVar.e1();
        qVar.X1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        this.f12617c = false;
        this.f12615a.c();
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8066b;
        return a1.e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.f12616b;
        int read = pVar.read(vVar.f7916a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.f12617c;
        b bVar = this.f12615a;
        if (!z10) {
            bVar.f12610o = 0L;
            this.f12617c = true;
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
