package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class c implements c3.o {
    public final b f12618a = new b(0, 1, null, "audio/ac4");
    public final e2.v f12619b = new e2.v(16384);
    public boolean f12620c;

    @Override
    public final boolean a(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        this.f12618a.d(qVar, new f0(0, 1));
        qVar.e1();
        qVar.X1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        this.f12620c = false;
        this.f12618a.c();
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8068b;
        return a1.e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.f12619b;
        int read = pVar.read(vVar.f7918a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.f12620c;
        b bVar = this.f12618a;
        if (!z10) {
            bVar.f12613o = 0L;
            this.f12620c = true;
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
