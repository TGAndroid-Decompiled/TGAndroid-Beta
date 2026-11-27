package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class zh7 implements e84 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public g84 F;
    public yh7[] G;
    public long[][] H;
    public int I;
    public final peb a;
    public final int b;
    public final boolean c;
    public final ey7 d;
    public final ey7 e;
    public final ey7 f;
    public final ey7 g;
    public final ArrayDeque h;
    public final gz9 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public j99 m;
    public byte n;
    public int o;
    public long p;
    public int q;
    public ey7 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public zh7(peb pebVar, int i) {
        boolean z;
        byte b;
        this.a = pebVar;
        this.b = i;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        no5 no5Var = po5.b;
        this.m = j99.e;
        if ((i & 4) != 0) {
            b = 3;
        } else {
            b = 0;
        }
        this.n = b;
        this.i = new gz9();
        this.j = new ArrayList();
        this.g = new ey7(16);
        this.h = new ArrayDeque();
        this.d = new ey7(rfd.a);
        this.e = new ey7(6);
        this.f = new ey7();
        this.s = -1;
        this.F = g84.v;
        this.G = new yh7[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    @Override
    public final int b(defpackage.f84 r44, defpackage.v11 r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh7.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        j99 j99Var;
        una a = qhd.a(f84Var, false);
        if (a != null) {
            j99Var = po5.u(a);
        } else {
            no5 no5Var = po5.b;
            j99Var = j99.e;
        }
        this.m = j99Var;
        if (a != null) {
            return false;
        }
        return true;
    }

    @Override
    public final void d(long j, long j2) {
        yh7[] yh7VarArr;
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
            gz9 gz9Var = this.i;
            gz9Var.a.clear();
            gz9Var.b = (byte) 0;
            this.j.clear();
            return;
        }
        for (yh7 yh7Var : this.G) {
            y1c y1cVar = yh7Var.b;
            int a = y1cVar.a(j2);
            if (a == -1) {
                a = y1cVar.b(j2);
            }
            yh7Var.g = a;
            g6c g6cVar = yh7Var.d;
            if (g6cVar != null) {
                g6cVar.b = false;
                g6cVar.c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.m;
    }

    @Override
    public final void f(g84 g84Var) {
        if ((this.b & 16) == 0) {
            g84Var = new vh4(g84Var, this.a);
        }
        this.F = g84Var;
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh7.g(long):void");
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
