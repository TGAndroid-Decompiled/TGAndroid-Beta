package defpackage;

import android.util.SparseBooleanArray;
public final class jc8 {
    public static final gi4 b;
    public static final gi4 c;
    public final e31 a;

    static {
        int[] iArr;
        int[] iArr2;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{16, 17, 18, 21, 22, 23, 28, 30}) {
            gre.p(!false);
            sparseBooleanArray.append(i, true);
        }
        gre.p(!false);
        b = new gi4(sparseBooleanArray);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i2 : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32}) {
            gre.p(!false);
            sparseBooleanArray2.append(i2, true);
        }
        gre.p(!false);
        c = new gi4(sparseBooleanArray2);
    }

    public jc8(kc8 kc8Var) {
        e31 e31Var = new e31();
        this.a = e31Var;
        e31Var.c(kc8Var.a);
    }

    public final void a(int i, boolean z) {
        if (z) {
            this.a.b(i);
        }
    }

    public final kc8 b() {
        return new kc8(this.a.f());
    }

    public jc8() {
        this.a = new e31();
    }
}
