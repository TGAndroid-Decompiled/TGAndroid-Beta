package defpackage;

import android.content.Context;
public final class b83 extends r51 {
    public final c83 f0;

    public b83(c83 c83Var, Context context, int i, int[] iArr, int[] iArr2) {
        super(context, i, iArr, 1, iArr2);
        this.f0 = c83Var;
    }

    @Override
    public final int b() {
        return 216;
    }

    @Override
    public final void c(int i, boolean z) {
        int i2;
        e83 e83Var = (e83) this.f0.e;
        if (!z) {
            e83Var.m1();
        } else if (i >= 0 && i < e83Var.o3.length) {
            int i3 = 0;
            while (true) {
                d83[] d83VarArr = e83Var.o3;
                i2 = -1;
                if (i3 < d83VarArr.length) {
                    if (d83VarArr[i3].d == i) {
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
                if (i4 < e83Var.k3.size()) {
                    z73 z73Var = (z73) e83Var.k3.get(i4);
                    if (z73Var != null && z73Var.a == 2 && z73Var.h == i3) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            if (i2 >= 0) {
                e83Var.f1(new pf(i2, (byte) 2), 0, true);
            } else {
                e83Var.m1();
            }
        }
    }

    @Override
    public final int d() {
        return 10;
    }
}
