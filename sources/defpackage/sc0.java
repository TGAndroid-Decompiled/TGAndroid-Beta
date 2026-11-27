package defpackage;

import java.util.List;
public final class sc0 implements e84 {
    public final ey7 a;
    public final rc0 b;
    public final boolean c;
    public final uif d;
    public byte e;
    public g84 f;
    public tc0 g;
    public long h;
    public uh2[] i;
    public long j;
    public uh2 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public sc0(int i, uif uifVar) {
        this.d = uifVar;
        this.c = (i & 1) == 0;
        this.a = new ey7(12);
        this.b = new Object();
        this.f = new faf((byte) 22);
        this.i = new uh2[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final int b(defpackage.f84 r26, defpackage.v11 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc0.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        ey7 ey7Var = this.a;
        ((cb3) f84Var).d(ey7Var.a, 0, 12, false);
        ey7Var.N(0);
        if (ey7Var.o() == 1179011410) {
            ey7Var.O(4);
            if (ey7Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        uh2[] uh2VarArr;
        this.j = -1L;
        this.k = null;
        for (uh2 uh2Var : this.i) {
            if (uh2Var.l == 0) {
                uh2Var.j = 0;
            } else {
                uh2Var.j = uh2Var.o[gcc.f(uh2Var.n, j, true)];
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
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.e = (byte) 0;
        if (this.c) {
            g84Var = new vh4(g84Var, this.d);
        }
        this.f = g84Var;
        this.j = -1L;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
