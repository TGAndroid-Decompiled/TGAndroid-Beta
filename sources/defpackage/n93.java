package defpackage;

import android.content.Context;
public final class n93 extends y61 {
    public final o93 f0;

    public n93(o93 o93Var, Context context, int i, int[] iArr, int[] iArr2) {
        super(context, i, iArr, 1, iArr2);
        this.f0 = o93Var;
    }

    @Override
    public final int b() {
        return 216;
    }

    @Override
    public final void c(int i, boolean z) {
        int i2;
        q93 q93Var = (q93) this.f0.e;
        if (!z) {
            q93Var.m1();
        } else if (i >= 0 && i < q93Var.o3.length) {
            int i3 = 0;
            while (true) {
                p93[] p93VarArr = q93Var.o3;
                i2 = -1;
                if (i3 < p93VarArr.length) {
                    if (p93VarArr[i3].d == i) {
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
                if (i4 < q93Var.k3.size()) {
                    l93 l93Var = (l93) q93Var.k3.get(i4);
                    if (l93Var != null && l93Var.a == 2 && l93Var.h == i3) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            if (i2 >= 0) {
                q93Var.f1(new pg(i2, (byte) 2), 0, true);
            } else {
                q93Var.m1();
            }
        }
    }

    @Override
    public final int d() {
        return 10;
    }
}
