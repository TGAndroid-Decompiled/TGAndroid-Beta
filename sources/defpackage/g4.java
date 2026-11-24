package defpackage;

import java.util.List;
public final class g4 implements j74 {
    public final f4 a = new f4(null, 0, "audio/ac4", (byte) 1);
    public final xu7 b = new xu7(16384);
    public boolean c;

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        xu7 xu7Var = this.b;
        int read = ((ja3) k74Var).read(xu7Var.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xu7Var.N(0);
        xu7Var.M(read);
        boolean z = this.c;
        f4 f4Var = this.a;
        if (!z) {
            f4Var.o = 0L;
            this.c = true;
        }
        f4Var.b(xu7Var);
        return 0;
    }

    @Override
    public final boolean c(defpackage.k74 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.c(k74):boolean");
    }

    @Override
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.a.h(l74Var, new l2c(0, 1));
        l74Var.B();
        l74Var.f0(new oc0(-9223372036854775807L));
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
