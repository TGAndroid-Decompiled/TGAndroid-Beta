package defpackage;

import android.util.SparseArray;
public final class n41 implements u84 {
    public static final u21 s = new Object();
    public final s84 a;
    public final int b;
    public final go4 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public lx6 f;
    public long h;
    public ix9 n;
    public go4[] r;

    public n41(s84 s84Var, int i, go4 go4Var) {
        this.a = s84Var;
        this.b = i;
        this.c = go4Var;
    }

    @Override
    public final void B() {
        SparseArray sparseArray = this.d;
        go4[] go4VarArr = new go4[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            go4 go4Var = ((l41) sparseArray.valueAt(i)).d;
            go4Var.getClass();
            go4VarArr[i] = go4Var;
        }
        this.r = go4VarArr;
    }

    public final oi2 a() {
        ix9 ix9Var = this.n;
        if (ix9Var instanceof oi2) {
            return (oi2) ix9Var;
        }
        if (ix9Var instanceof rl6) {
            return ((rl6) ix9Var).a;
        }
        return null;
    }

    public final void b(lx6 lx6Var, long j, long j2) {
        this.f = lx6Var;
        this.h = j2;
        boolean z = this.e;
        s84 s84Var = this.a;
        if (!z) {
            s84Var.f(this);
            if (j != -9223372036854775807L) {
                s84Var.d(0L, j);
            }
            this.e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        s84Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i < sparseArray.size()) {
                l41 l41Var = (l41) sparseArray.valueAt(i);
                if (lx6Var == null) {
                    l41Var.e = l41Var.c;
                } else {
                    l41Var.f = j2;
                    yzb R = lx6Var.R(l41Var.a);
                    l41Var.e = R;
                    go4 go4Var = l41Var.d;
                    if (go4Var != null) {
                        R.g(go4Var);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final yzb c0(int i, int i2) {
        boolean z;
        go4 go4Var;
        SparseArray sparseArray = this.d;
        l41 l41Var = (l41) sparseArray.get(i);
        if (l41Var == null) {
            if (this.r == null) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
            if (i2 == this.b) {
                go4Var = this.c;
            } else {
                go4Var = null;
            }
            l41Var = new l41(i, i2, go4Var);
            lx6 lx6Var = this.f;
            long j = this.h;
            if (lx6Var == null) {
                l41Var.e = l41Var.c;
            } else {
                l41Var.f = j;
                yzb R = lx6Var.R(i2);
                l41Var.e = R;
                go4 go4Var2 = l41Var.d;
                if (go4Var2 != null) {
                    R.g(go4Var2);
                }
            }
            sparseArray.put(i, l41Var);
        }
        return l41Var;
    }

    @Override
    public final void f0(ix9 ix9Var) {
        this.n = ix9Var;
    }
}
