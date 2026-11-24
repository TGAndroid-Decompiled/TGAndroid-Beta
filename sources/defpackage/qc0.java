package defpackage;

import java.util.List;
public final class qc0 implements j74 {
    public final xu7 a;
    public final pc0 b;
    public final boolean c;
    public final eef d;
    public byte e;
    public l74 f;
    public rc0 g;
    public long h;
    public ch2[] i;
    public long j;
    public ch2 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public qc0(int i, eef eefVar) {
        this.d = eefVar;
        this.c = (i & 1) == 0;
        this.a = new xu7(12);
        this.b = new Object();
        this.f = new o5f((byte) 22);
        this.i = new ch2[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final int b(defpackage.k74 r26, defpackage.m11 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc0.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        xu7 xu7Var = this.a;
        ((ja3) k74Var).d(xu7Var.a, 0, 12, false);
        xu7Var.N(0);
        if (xu7Var.o() == 1179011410) {
            xu7Var.O(4);
            if (xu7Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        ch2[] ch2VarArr;
        this.j = -1L;
        this.k = null;
        for (ch2 ch2Var : this.i) {
            if (ch2Var.l == 0) {
                ch2Var.j = 0;
            } else {
                ch2Var.j = ch2Var.o[g8c.f(ch2Var.n, j, true)];
            }
        }
        if (j == 0) {
            if (this.i.length == 0) {
                this.e = (byte) 0;
                return;
            } else {
                this.e = (byte) 3;
                return;
            }
        }
        this.e = (byte) 6;
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.e = (byte) 0;
        if (this.c) {
            l74Var = new xf4(l74Var, this.d);
        }
        this.f = l74Var;
        this.j = -1L;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
