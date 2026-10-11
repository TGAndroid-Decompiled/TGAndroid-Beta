package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class c implements c3.o {
    public final b f13746a = new b(0, 1, null, "audio/ac4");
    public final e2.v f13747b = new e2.v(16384);
    public boolean f13748c;

    @Override
    public final boolean a(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        this.f13746a.e(qVar, new f0(0, 1));
        qVar.k1();
        qVar.d2(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13748c = false;
        this.f13746a.d();
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8751b;
        return a1.f8714e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.f13747b;
        int read = pVar.read(vVar.f8583a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.f13748c;
        b bVar = this.f13746a;
        if (!z10) {
            bVar.f13740o = 0L;
            this.f13748c = true;
        }
        bVar.b(vVar);
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
