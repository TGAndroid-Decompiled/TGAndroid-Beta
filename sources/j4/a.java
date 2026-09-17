package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class a implements c3.o {
    public final b f13212a = new b("audio/ac3");
    public final e2.v f13213b = new e2.v(2786);
    public boolean f13214c;

    @Override
    public final boolean b(c3.p r14) {
        throw new UnsupportedOperationException("Method not decompiled: j4.a.b(c3.p):boolean");
    }

    @Override
    public final void g(c3.q qVar) {
        this.f13212a.e(qVar, new f0(0, 1));
        qVar.Z0();
        qVar.P1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13214c = false;
        this.f13212a.d();
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8957b;
        return a1.f8920e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.f13213b;
        int read = pVar.read(vVar.f8789a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.f13214c;
        b bVar = this.f13212a;
        if (!z10) {
            bVar.f13227o = 0L;
            this.f13214c = true;
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
