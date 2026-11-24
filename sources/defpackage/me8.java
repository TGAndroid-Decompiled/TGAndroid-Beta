package defpackage;

import android.util.SparseBooleanArray;
public final class me8 {
    public static final lk4 b;
    public static final lk4 c;
    public final m41 a;

    static {
        int[] iArr;
        int[] iArr2;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{16, 17, 18, 21, 22, 23, 28, 30}) {
            jte.p(!false);
            sparseBooleanArray.append(i, true);
        }
        jte.p(!false);
        b = new lk4(sparseBooleanArray);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i2 : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32}) {
            jte.p(!false);
            sparseBooleanArray2.append(i2, true);
        }
        jte.p(!false);
        c = new lk4(sparseBooleanArray2);
    }

    public me8(ne8 ne8Var) {
        m41 m41Var = new m41();
        this.a = m41Var;
        m41Var.c(ne8Var.a);
    }

    public final void a(int i, boolean z) {
        if (z) {
            this.a.b(i);
        }
    }

    public final ne8 b() {
        return new ne8(this.a.f());
    }

    public me8() {
        this.a = new m41();
    }
}
