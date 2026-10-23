package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class c implements c3.q {
    public final b f14044a = new b(0, 1, null, "audio/ac4");
    public final e2.x f14045b = new e2.x(16384);
    public boolean f14046c;

    @Override
    public final boolean a(c3.r r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.a(c3.r):boolean");
    }

    @Override
    public final void c(c3.s sVar) {
        this.f14044a.d(sVar, new f0(0, 1));
        sVar.C();
        sVar.g0(new c3.v(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f14046c = false;
        this.f14044a.c();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r rVar, c3.u uVar) {
        e2.x xVar = this.f14045b;
        int read = rVar.read(xVar.f8298a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f14046c;
        b bVar = this.f14044a;
        if (!z10) {
            bVar.f14039o = 0L;
            this.f14046c = true;
        }
        bVar.a(xVar);
        return 0;
    }

    @Override
    public final c3.q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
