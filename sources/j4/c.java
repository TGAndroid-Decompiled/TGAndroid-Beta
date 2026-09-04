package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class c implements c3.o {
    public final b f13233a = new b(0, 1, null, "audio/ac4");
    public final e2.v f13234b = new e2.v(16384);
    public boolean f13235c;

    @Override
    public final boolean b(c3.p r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.b(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        this.f13233a.e(qVar, new f0(0, 1));
        qVar.Z0();
        qVar.P1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13235c = false;
        this.f13233a.d();
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8957b;
        return a1.f8920e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.f13234b;
        int read = pVar.read(vVar.f8789a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.f13235c;
        b bVar = this.f13233a;
        if (!z10) {
            bVar.f13227o = 0L;
            this.f13235c = true;
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
