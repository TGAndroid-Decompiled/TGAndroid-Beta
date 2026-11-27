package defpackage;

import android.content.Context;
public final class u83 extends z51 {
    public final v83 f0;

    public u83(v83 v83Var, Context context, int i, int[] iArr, int[] iArr2) {
        super(context, i, iArr, 1, iArr2);
        this.f0 = v83Var;
    }

    @Override
    public final int b() {
        return 216;
    }

    @Override
    public final void c(int i, boolean z) {
        int i2;
        x83 x83Var = (x83) this.f0.e;
        if (!z) {
            x83Var.n1();
        } else if (i >= 0 && i < x83Var.o3.length) {
            int i3 = 0;
            while (true) {
                w83[] w83VarArr = x83Var.o3;
                i2 = -1;
                if (i3 < w83VarArr.length) {
                    if (w83VarArr[i3].d == i) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 < x83Var.k3.size()) {
                    s83 s83Var = (s83) x83Var.k3.get(i4);
                    if (s83Var != null && s83Var.a == 2 && s83Var.h == i3) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            if (i2 >= 0) {
                x83Var.g1(new yd(i2, (byte) 2), 0, true);
            } else {
                x83Var.n1();
            }
        }
    }

    @Override
    public final int d() {
        return 10;
    }
}
