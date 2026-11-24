package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class sh7 implements s84 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public u84 F;
    public rh7[] G;
    public long[][] H;
    public int I;
    public final tcb a;
    public final int b;
    public final boolean c;
    public final yw7 d;
    public final yw7 e;
    public final yw7 f;
    public final yw7 g;
    public final ArrayDeque h;
    public final px9 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public y79 m;
    public byte n;
    public int o;
    public long p;
    public int q;
    public yw7 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public sh7(tcb tcbVar, int i) {
        boolean z;
        byte b;
        this.a = tcbVar;
        this.b = i;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        ko5 ko5Var = mo5.b;
        this.m = y79.e;
        if ((i & 4) != 0) {
            b = 3;
        } else {
            b = 0;
        }
        this.n = b;
        this.i = new px9();
        this.j = new ArrayList();
        this.g = new yw7(16);
        this.h = new ArrayDeque();
        this.d = new yw7(add.a);
        this.e = new yw7(6);
        this.f = new yw7();
        this.s = -1;
        this.F = u84.v;
        this.G = new rh7[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    @Override
    public final int b(defpackage.t84 r44, defpackage.u21 r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh7.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        y79 y79Var;
        bma a = zed.a(t84Var, false);
        if (a != null) {
            y79Var = mo5.u(a);
        } else {
            ko5 ko5Var = mo5.b;
            y79Var = y79.e;
        }
        this.m = y79Var;
        if (a != null) {
            return false;
        }
        return true;
    }

    @Override
    public final void d(long j, long j2) {
        rh7[] rh7VarArr;
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
            px9 px9Var = this.i;
            px9Var.a.clear();
            px9Var.b = (byte) 0;
            this.j.clear();
            return;
        }
        for (rh7 rh7Var : this.G) {
            zzb zzbVar = rh7Var.b;
            int a = zzbVar.a(j2);
            if (a == -1) {
                a = zzbVar.b(j2);
            }
            rh7Var.g = a;
            g4c g4cVar = rh7Var.d;
            if (g4cVar != null) {
                g4cVar.b = false;
                g4cVar.c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.m;
    }

    @Override
    public final void f(u84 u84Var) {
        if ((this.b & 16) == 0) {
            u84Var = new yh4(u84Var, this.a);
        }
        this.F = u84Var;
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh7.g(long):void");
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
