package defpackage;

import android.util.SparseArray;
public final class f31 implements l74 {
    public static final m11 s = new Object();
    public final j74 a;
    public final int b;
    public final fm4 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public tg2 f;
    public long h;
    public fv9 n;
    public fm4[] r;

    public f31(j74 j74Var, int i, fm4 fm4Var) {
        this.a = j74Var;
        this.b = i;
        this.c = fm4Var;
    }

    @Override
    public final void B() {
        SparseArray sparseArray = this.d;
        fm4[] fm4VarArr = new fm4[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            fm4 fm4Var = ((d31) sparseArray.valueAt(i)).d;
            fm4Var.getClass();
            fm4VarArr[i] = fm4Var;
        }
        this.r = fm4VarArr;
    }

    @Override
    public final wxb T(int i, int i2) {
        boolean z;
        fm4 fm4Var;
        SparseArray sparseArray = this.d;
        d31 d31Var = (d31) sparseArray.get(i);
        if (d31Var == null) {
            if (this.r == null) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
            if (i2 == this.b) {
                fm4Var = this.c;
            } else {
                fm4Var = null;
            }
            d31Var = new d31(i, i2, fm4Var);
            tg2 tg2Var = this.f;
            long j = this.h;
            if (tg2Var == null) {
                d31Var.e = d31Var.c;
            } else {
                d31Var.f = j;
                wxb b0 = tg2Var.b0(i2);
                d31Var.e = b0;
                fm4 fm4Var2 = d31Var.d;
                if (fm4Var2 != null) {
                    b0.g(fm4Var2);
                }
            }
            sparseArray.put(i, d31Var);
        }
        return d31Var;
    }

    public final ah2 a() {
        fv9 fv9Var = this.n;
        if (fv9Var instanceof ah2) {
            return (ah2) fv9Var;
        }
        if (fv9Var instanceof oj6) {
            return ((oj6) fv9Var).a;
        }
        return null;
    }

    public final void b(tg2 tg2Var, long j, long j2) {
        this.f = tg2Var;
        this.h = j2;
        boolean z = this.e;
        j74 j74Var = this.a;
        if (!z) {
            j74Var.f(this);
            if (j != -9223372036854775807L) {
                j74Var.d(0L, j);
            }
            this.e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        j74Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i < sparseArray.size()) {
                d31 d31Var = (d31) sparseArray.valueAt(i);
                if (tg2Var == null) {
                    d31Var.e = d31Var.c;
                } else {
                    d31Var.f = j2;
                    wxb b0 = tg2Var.b0(d31Var.a);
                    d31Var.e = b0;
                    fm4 fm4Var = d31Var.d;
                    if (fm4Var != null) {
                        b0.g(fm4Var);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void f0(fv9 fv9Var) {
        this.n = fv9Var;
    }
}
