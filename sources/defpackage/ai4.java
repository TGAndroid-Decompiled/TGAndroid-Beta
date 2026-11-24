package defpackage;

import java.util.List;
public final class ai4 implements j74 {
    public l74 f;
    public wxb g;
    public ld7 i;
    public ci4 j;
    public int k;
    public int l;
    public zh4 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final xu7 b = new xu7(0, new byte[32768]);
    public final boolean c = false;
    public final boolean d = false;
    public final m11 e = new Object();
    public byte h = 0;

    @Override
    public final int b(defpackage.k74 r32, defpackage.m11 r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai4.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        ja3 ja3Var = (ja3) k74Var;
        qge.a(ja3Var, false, false);
        xu7 xu7Var = new xu7(4);
        ja3Var.d(xu7Var.a, 0, 4, false);
        if (xu7Var.C() != 1716281667) {
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
            zh4 zh4Var = this.m;
            if (zh4Var != null) {
                zh4Var.d(j2);
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
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.f = l74Var;
        this.g = l74Var.S(0, 1);
        l74Var.z();
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
