package defpackage;

import android.util.SparseIntArray;
import android.view.View;
public final class j1b extends qie {
    public int a;
    public final b1b b;
    public final x46 c;
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

    public j1b(b1b b1bVar, x46 x46Var) {
        this.b = b1bVar;
        this.c = x46Var;
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
        b1b b1bVar = this.b;
        if (i3 == 13 && b1bVar.d(i2) == 13) {
            return true;
        }
        if (sparseIntArray.get(i) == 10 && b1bVar.d(i2) == 10) {
            return true;
        }
        int i4 = this.w;
        if (i >= i4 && i <= this.x) {
            if (i - i4 == i2 - b1bVar.J) {
                return true;
            }
            return false;
        } else if (i == this.e && i2 == b1bVar.e) {
            return true;
        } else {
            if (i == this.f && i2 == b1bVar.h) {
                return true;
            }
            if (i == this.g && i2 == b1bVar.r) {
                return true;
            }
            if (i == this.h && i2 == b1bVar.s) {
                return true;
            }
            if (i == this.i && i2 == b1bVar.w) {
                return true;
            }
            if (i == this.j && i2 == b1bVar.x) {
                return true;
            }
            if (i == this.k && i2 == b1bVar.y) {
                return true;
            }
            if (i == this.l && i2 == b1bVar.n) {
                return true;
            }
            if (i == this.m && i2 == b1bVar.E) {
                return true;
            }
            if (i == this.q && i2 == b1bVar.L) {
                return true;
            }
            if (i == this.r && i2 == b1bVar.M) {
                return true;
            }
            if (i == this.s && i2 == b1bVar.N) {
                return true;
            }
            if (i == this.t && i2 == b1bVar.O) {
                return true;
            }
            if (i == this.u && i2 == b1bVar.P) {
                return true;
            }
            if (i == this.v && i2 == b1bVar.Q) {
                return true;
            }
            if (i == this.n && i2 == b1bVar.F) {
                return true;
            }
            if (i == this.o && i2 == b1bVar.G) {
                return true;
            }
            if (i == this.p && i2 == b1bVar.H) {
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
        b1b b1bVar = this.b;
        this.a = b1bVar.d0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            sparseIntArray.put(i3, b1bVar.d(i3));
        }
        this.e = b1bVar.e;
        this.f = b1bVar.h;
        this.g = b1bVar.r;
        this.h = b1bVar.s;
        this.i = b1bVar.w;
        this.j = b1bVar.x;
        this.k = b1bVar.y;
        this.l = b1bVar.n;
        this.m = b1bVar.E;
        this.w = b1bVar.J;
        this.x = b1bVar.K;
        this.n = b1bVar.F;
        this.o = b1bVar.G;
        this.p = b1bVar.H;
        this.q = b1bVar.L;
        this.r = b1bVar.M;
        this.s = b1bVar.N;
        this.t = b1bVar.O;
        this.u = b1bVar.P;
        this.v = b1bVar.Q;
        b1bVar.E();
        x46 x46Var = this.c;
        int K0 = x46Var.K0();
        int M0 = x46Var.M0();
        while (true) {
            if (K0 <= M0) {
                if (b1bVar.c(K0) != -1 && (m = x46Var.m(K0)) != null) {
                    j = b1bVar.c(K0);
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
        cy7.a(this, true).c(b1bVar);
        if (j != -1) {
            while (true) {
                if (i2 < b1bVar.d0) {
                    if (b1bVar.c(i2) == j) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 > 0) {
                x46Var.g1(i2, i);
            }
        }
    }
}
