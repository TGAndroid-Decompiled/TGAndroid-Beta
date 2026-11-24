package defpackage;

import java.util.List;
public final class g4 implements s84 {
    public final f4 a = new f4(null, 0, "audio/ac4", (byte) 1);
    public final yw7 b = new yw7(16384);
    public boolean c;

    @Override
    public final int b(t84 t84Var, u21 u21Var) {
        yw7 yw7Var = this.b;
        int read = ((vb3) t84Var).read(yw7Var.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        yw7Var.N(0);
        yw7Var.M(read);
        boolean z = this.c;
        f4 f4Var = this.a;
        if (!z) {
            f4Var.o = 0L;
            this.c = true;
        }
        f4Var.b(yw7Var);
        return 0;
    }

    @Override
    public final boolean c(defpackage.t84 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.c(t84):boolean");
    }

    @Override
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.a.h(u84Var, new l4c(0, 1));
        u84Var.B();
        u84Var.f0(new od0(-9223372036854775807L));
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
