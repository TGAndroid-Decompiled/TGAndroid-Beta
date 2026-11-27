package defpackage;

import java.util.List;
public final class h4 implements e84 {
    public final g4 a = new g4(null, 0, "audio/ac4", (byte) 1);
    public final ey7 b = new ey7(16384);
    public boolean c;

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        ey7 ey7Var = this.b;
        int read = ((cb3) f84Var).read(ey7Var.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        ey7Var.N(0);
        ey7Var.M(read);
        boolean z = this.c;
        g4 g4Var = this.a;
        if (!z) {
            g4Var.o = 0L;
            this.c = true;
        }
        g4Var.b(ey7Var);
        return 0;
    }

    @Override
    public final boolean c(defpackage.f84 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4.c(f84):boolean");
    }

    @Override
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.a.h(g84Var, new l6c(0, 1));
        g84Var.D();
        g84Var.m0(new qc0(-9223372036854775807L));
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
