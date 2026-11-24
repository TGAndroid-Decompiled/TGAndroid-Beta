package defpackage;

import android.util.SparseIntArray;
import android.view.View;
public final class hxa extends zde {
    public int a;
    public final ywa b;
    public final t26 c;
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

    public hxa(ywa ywaVar, t26 t26Var) {
        this.b = ywaVar;
        this.c = t26Var;
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
        ywa ywaVar = this.b;
        if (i3 == 13 && ywaVar.d(i2) == 13) {
            return true;
        }
        if (sparseIntArray.get(i) == 10 && ywaVar.d(i2) == 10) {
            return true;
        }
        int i4 = this.w;
        if (i >= i4 && i <= this.x) {
            if (i - i4 == i2 - ywaVar.J) {
                return true;
            }
            return false;
        } else if (i == this.e && i2 == ywaVar.e) {
            return true;
        } else {
            if (i == this.f && i2 == ywaVar.h) {
                return true;
            }
            if (i == this.g && i2 == ywaVar.r) {
                return true;
            }
            if (i == this.h && i2 == ywaVar.s) {
                return true;
            }
            if (i == this.i && i2 == ywaVar.w) {
                return true;
            }
            if (i == this.j && i2 == ywaVar.x) {
                return true;
            }
            if (i == this.k && i2 == ywaVar.y) {
                return true;
            }
            if (i == this.l && i2 == ywaVar.n) {
                return true;
            }
            if (i == this.m && i2 == ywaVar.E) {
                return true;
            }
            if (i == this.q && i2 == ywaVar.L) {
                return true;
            }
            if (i == this.r && i2 == ywaVar.M) {
                return true;
            }
            if (i == this.s && i2 == ywaVar.N) {
                return true;
            }
            if (i == this.t && i2 == ywaVar.O) {
                return true;
            }
            if (i == this.u && i2 == ywaVar.P) {
                return true;
            }
            if (i == this.v && i2 == ywaVar.Q) {
                return true;
            }
            if (i == this.n && i2 == ywaVar.F) {
                return true;
            }
            if (i == this.o && i2 == ywaVar.G) {
                return true;
            }
            if (i == this.p && i2 == ywaVar.H) {
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
        ywa ywaVar = this.b;
        this.a = ywaVar.d0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            sparseIntArray.put(i3, ywaVar.d(i3));
        }
        this.e = ywaVar.e;
        this.f = ywaVar.h;
        this.g = ywaVar.r;
        this.h = ywaVar.s;
        this.i = ywaVar.w;
        this.j = ywaVar.x;
        this.k = ywaVar.y;
        this.l = ywaVar.n;
        this.m = ywaVar.E;
        this.w = ywaVar.J;
        this.x = ywaVar.K;
        this.n = ywaVar.F;
        this.o = ywaVar.G;
        this.p = ywaVar.H;
        this.q = ywaVar.L;
        this.r = ywaVar.M;
        this.s = ywaVar.N;
        this.t = ywaVar.O;
        this.u = ywaVar.P;
        this.v = ywaVar.Q;
        ywaVar.E();
        t26 t26Var = this.c;
        int K0 = t26Var.K0();
        int M0 = t26Var.M0();
        while (true) {
            if (K0 <= M0) {
                if (ywaVar.c(K0) != -1 && (m = t26Var.m(K0)) != null) {
                    j = ywaVar.c(K0);
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
        vu7.a(this, true).c(ywaVar);
        if (j != -1) {
            while (true) {
                if (i2 < ywaVar.d0) {
                    if (ywaVar.c(i2) == j) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 > 0) {
                t26Var.g1(i2, i);
            }
        }
    }
}
