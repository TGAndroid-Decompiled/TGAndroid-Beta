package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class pf7 implements j74 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public l74 F;
    public of7[] G;
    public long[][] H;
    public int I;
    public final sab a;
    public final int b;
    public final boolean c;
    public final xu7 d;
    public final xu7 e;
    public final xu7 f;
    public final xu7 g;
    public final ArrayDeque h;
    public final mv9 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public w59 m;
    public byte n;
    public int o;
    public long p;
    public int q;
    public xu7 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public pf7(sab sabVar, int i) {
        boolean z;
        byte b;
        this.a = sabVar;
        this.b = i;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        km5 km5Var = mm5.b;
        this.m = w59.e;
        if ((i & 4) != 0) {
            b = 3;
        } else {
            b = 0;
        }
        this.n = b;
        this.i = new mv9();
        this.j = new ArrayList();
        this.g = new xu7(16);
        this.h = new ArrayDeque();
        this.d = new xu7(yad.a);
        this.e = new xu7(6);
        this.f = new xu7();
        this.s = -1;
        this.F = l74.v;
        this.G = new of7[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    @Override
    public final int b(defpackage.k74 r44, defpackage.m11 r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf7.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        w59 w59Var;
        aka a = xcd.a(k74Var, false);
        if (a != null) {
            w59Var = mm5.u(a);
        } else {
            km5 km5Var = mm5.b;
            w59Var = w59.e;
        }
        this.m = w59Var;
        if (a != null) {
            return false;
        }
        return true;
    }

    @Override
    public final void d(long j, long j2) {
        of7[] of7VarArr;
        this.h.clear();
        this.q = 0;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.k.clear();
        this.l.clear();
        if (j == 0) {
            if (this.n != 3) {
                this.n = (byte) 0;
                this.q = 0;
                return;
            }
            mv9 mv9Var = this.i;
            mv9Var.a.clear();
            mv9Var.b = (byte) 0;
            this.j.clear();
            return;
        }
        for (of7 of7Var : this.G) {
            xxb xxbVar = of7Var.b;
            int a = xxbVar.a(j2);
            if (a == -1) {
                a = xxbVar.b(j2);
            }
            of7Var.g = a;
            g2c g2cVar = of7Var.d;
            if (g2cVar != null) {
                g2cVar.b = false;
                g2cVar.c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.m;
    }

    @Override
    public final void f(l74 l74Var) {
        if ((this.b & 16) == 0) {
            l74Var = new xf4(l74Var, this.a);
        }
        this.F = l74Var;
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf7.g(long):void");
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
