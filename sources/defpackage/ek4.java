package defpackage;

import java.util.List;
public final class ek4 implements s84 {
    public u84 f;
    public yzb g;
    public nf7 i;
    public gk4 j;
    public int k;
    public int l;
    public dk4 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final yw7 b = new yw7(0, new byte[32768]);
    public final boolean c = false;
    public final boolean d = false;
    public final u21 e = new Object();
    public byte h = 0;

    @Override
    public final int b(defpackage.t84 r32, defpackage.u21 r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek4.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        vb3 vb3Var = (vb3) t84Var;
        rie.a(vb3Var, false, false);
        yw7 yw7Var = new yw7(4);
        vb3Var.d(yw7Var.a, 0, 4, false);
        if (yw7Var.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void d(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.h = (byte) 0;
        } else {
            dk4 dk4Var = this.m;
            if (dk4Var != null) {
                dk4Var.d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.o = j3;
        this.n = 0;
        this.b.K(0);
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.f = u84Var;
        this.g = u84Var.c0(0, 1);
        u84Var.B();
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
