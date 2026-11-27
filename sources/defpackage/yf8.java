package defpackage;

import android.util.SparseBooleanArray;
public final class yf8 {
    public static final lk4 b;
    public static final lk4 c;
    public final n31 a;

    static {
        int[] iArr;
        int[] iArr2;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{16, 17, 18, 21, 22, 23, 28, 30}) {
            yve.p(!false);
            sparseBooleanArray.append(i, true);
        }
        yve.p(!false);
        b = new lk4(sparseBooleanArray);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i2 : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32}) {
            yve.p(!false);
            sparseBooleanArray2.append(i2, true);
        }
        yve.p(!false);
        c = new lk4(sparseBooleanArray2);
    }

    public yf8(zf8 zf8Var) {
        n31 n31Var = new n31();
        this.a = n31Var;
        n31Var.c(zf8Var.a);
    }

    public final void a(int i, boolean z) {
        if (z) {
            this.a.b(i);
        }
    }

    public final zf8 b() {
        return new zf8(this.a.f());
    }

    public yf8() {
        this.a = new n31();
    }
}
