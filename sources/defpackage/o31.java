package defpackage;

import android.util.SparseArray;
public final class o31 implements g84 {
    public static final v11 s = new Object();
    public final e84 a;
    public final int b;
    public final ko4 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public lh2 f;
    public long h;
    public zy9 n;
    public ko4[] r;

    public o31(e84 e84Var, int i, ko4 ko4Var) {
        this.a = e84Var;
        this.b = i;
        this.c = ko4Var;
    }

    @Override
    public final void D() {
        SparseArray sparseArray = this.d;
        ko4[] ko4VarArr = new ko4[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            ko4 ko4Var = ((m31) sparseArray.valueAt(i)).d;
            ko4Var.getClass();
            ko4VarArr[i] = ko4Var;
        }
        this.r = ko4VarArr;
    }

    public final sh2 a() {
        zy9 zy9Var = this.n;
        if (zy9Var instanceof sh2) {
            return (sh2) zy9Var;
        }
        if (zy9Var instanceof tl6) {
            return ((tl6) zy9Var).a;
        }
        return null;
    }

    public final void b(lh2 lh2Var, long j, long j2) {
        this.f = lh2Var;
        this.h = j2;
        boolean z = this.e;
        e84 e84Var = this.a;
        if (!z) {
            e84Var.f(this);
            if (j != -9223372036854775807L) {
                e84Var.d(0L, j);
            }
            this.e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        e84Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i < sparseArray.size()) {
                m31 m31Var = (m31) sparseArray.valueAt(i);
                if (lh2Var == null) {
                    m31Var.e = m31Var.c;
                } else {
                    m31Var.f = j2;
                    x1c V = lh2Var.V(m31Var.a);
                    m31Var.e = V;
                    ko4 ko4Var = m31Var.d;
                    if (ko4Var != null) {
                        V.g(ko4Var);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final x1c e0(int i, int i2) {
        boolean z;
        ko4 ko4Var;
        SparseArray sparseArray = this.d;
        m31 m31Var = (m31) sparseArray.get(i);
        if (m31Var == null) {
            if (this.r == null) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
            if (i2 == this.b) {
                ko4Var = this.c;
            } else {
                ko4Var = null;
            }
            m31Var = new m31(i, i2, ko4Var);
            lh2 lh2Var = this.f;
            long j = this.h;
            if (lh2Var == null) {
                m31Var.e = m31Var.c;
            } else {
                m31Var.f = j;
                x1c V = lh2Var.V(i2);
                m31Var.e = V;
                ko4 ko4Var2 = m31Var.d;
                if (ko4Var2 != null) {
                    V.g(ko4Var2);
                }
            }
            sparseArray.put(i, m31Var);
        }
        return m31Var;
    }

    @Override
    public final void m0(zy9 zy9Var) {
        this.n = zy9Var;
    }
}
