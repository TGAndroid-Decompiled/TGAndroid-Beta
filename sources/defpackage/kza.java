package defpackage;

import android.util.SparseIntArray;
import android.view.View;
public final class kza extends age {
    public int a;
    public final bza b;
    public final u46 c;
    public final SparseIntArray d = new SparseIntArray();
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;

    public kza(bza bzaVar, u46 u46Var) {
        this.b = bzaVar;
        this.c = u46Var;
    }

    @Override
    public final boolean a(int i, int i2) {
        if (this.d.get(i) == this.b.d(i2)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(int i, int i2) {
        SparseIntArray sparseIntArray = this.d;
        int i3 = sparseIntArray.get(i);
        bza bzaVar = this.b;
        if (i3 == 13 && bzaVar.d(i2) == 13) {
            return true;
        }
        if (sparseIntArray.get(i) == 10 && bzaVar.d(i2) == 10) {
            return true;
        }
        int i4 = this.w;
        if (i >= i4 && i <= this.x) {
            if (i - i4 == i2 - bzaVar.J) {
                return true;
            }
            return false;
        } else if (i == this.e && i2 == bzaVar.e) {
            return true;
        } else {
            if (i == this.f && i2 == bzaVar.h) {
                return true;
            }
            if (i == this.g && i2 == bzaVar.r) {
                return true;
            }
            if (i == this.h && i2 == bzaVar.s) {
                return true;
            }
            if (i == this.i && i2 == bzaVar.w) {
                return true;
            }
            if (i == this.j && i2 == bzaVar.x) {
                return true;
            }
            if (i == this.k && i2 == bzaVar.y) {
                return true;
            }
            if (i == this.l && i2 == bzaVar.n) {
                return true;
            }
            if (i == this.m && i2 == bzaVar.E) {
                return true;
            }
            if (i == this.q && i2 == bzaVar.L) {
                return true;
            }
            if (i == this.r && i2 == bzaVar.M) {
                return true;
            }
            if (i == this.s && i2 == bzaVar.N) {
                return true;
            }
            if (i == this.t && i2 == bzaVar.O) {
                return true;
            }
            if (i == this.u && i2 == bzaVar.P) {
                return true;
            }
            if (i == this.v && i2 == bzaVar.Q) {
                return true;
            }
            if (i == this.n && i2 == bzaVar.F) {
                return true;
            }
            if (i == this.o && i2 == bzaVar.G) {
                return true;
            }
            if (i == this.p && i2 == bzaVar.H) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final int c() {
        return this.b.d0;
    }

    @Override
    public final int d() {
        return this.a;
    }

    public final void e() {
        int i;
        long j;
        View m;
        SparseIntArray sparseIntArray = this.d;
        sparseIntArray.clear();
        bza bzaVar = this.b;
        this.a = bzaVar.d0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            sparseIntArray.put(i3, bzaVar.d(i3));
        }
        this.e = bzaVar.e;
        this.f = bzaVar.h;
        this.g = bzaVar.r;
        this.h = bzaVar.s;
        this.i = bzaVar.w;
        this.j = bzaVar.x;
        this.k = bzaVar.y;
        this.l = bzaVar.n;
        this.m = bzaVar.E;
        this.w = bzaVar.J;
        this.x = bzaVar.K;
        this.n = bzaVar.F;
        this.o = bzaVar.G;
        this.p = bzaVar.H;
        this.q = bzaVar.L;
        this.r = bzaVar.M;
        this.s = bzaVar.N;
        this.t = bzaVar.O;
        this.u = bzaVar.P;
        this.v = bzaVar.Q;
        bzaVar.E();
        u46 u46Var = this.c;
        int K0 = u46Var.K0();
        int M0 = u46Var.M0();
        while (true) {
            if (K0 <= M0) {
                if (bzaVar.c(K0) != -1 && (m = u46Var.m(K0)) != null) {
                    j = bzaVar.c(K0);
                    i = m.getTop();
                    break;
                }
                K0++;
            } else {
                i = 0;
                j = -1;
                break;
            }
        }
        ww7.a(this, true).c(bzaVar);
        if (j != -1) {
            while (true) {
                if (i2 < bzaVar.d0) {
                    if (bzaVar.c(i2) == j) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 > 0) {
                u46Var.g1(i2, i);
            }
        }
    }
}
