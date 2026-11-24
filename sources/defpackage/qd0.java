package defpackage;

import java.util.List;
public final class qd0 implements s84 {
    public final yw7 a;
    public final pd0 b;
    public final boolean c;
    public final fgf d;
    public byte e;
    public u84 f;
    public rd0 g;
    public long h;
    public qi2[] i;
    public long j;
    public qi2 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public qd0(int i, fgf fgfVar) {
        this.d = fgfVar;
        this.c = (i & 1) == 0;
        this.a = new yw7(12);
        this.b = new Object();
        this.f = new q7f((byte) 22);
        this.i = new qi2[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final int b(defpackage.t84 r26, defpackage.u21 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd0.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        yw7 yw7Var = this.a;
        ((vb3) t84Var).d(yw7Var.a, 0, 12, false);
        yw7Var.N(0);
        if (yw7Var.o() == 1179011410) {
            yw7Var.O(4);
            if (yw7Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        qi2[] qi2VarArr;
        this.j = -1L;
        this.k = null;
        for (qi2 qi2Var : this.i) {
            if (qi2Var.l == 0) {
                qi2Var.j = 0;
            } else {
                qi2Var.j = qi2Var.o[hac.f(qi2Var.n, j, true)];
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
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.e = (byte) 0;
        if (this.c) {
            u84Var = new yh4(u84Var, this.d);
        }
        this.f = u84Var;
        this.j = -1L;
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
