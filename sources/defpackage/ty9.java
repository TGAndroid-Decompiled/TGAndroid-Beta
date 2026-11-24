package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class ty9 extends yy9 {
    public final int n3;
    public final vz9 o3;

    public ty9(vz9 vz9Var, Context context, int i) {
        super(vz9Var, context);
        this.o3 = vz9Var;
        this.n3 = i;
    }

    @Override
    public final void l0(int i) {
        int i2;
        vz9 vz9Var = this.o3;
        ny9 ny9Var = vz9Var.g0;
        if (i == 0) {
            vz9Var.y1 = false;
            if (vz9Var.a != -1 && ny9Var.getVisibility() == 0 && ny9Var.getTranslationY() > (-gm.L(51.0f))) {
                if (ny9Var.getTranslationY() > (-gm.L(16.0f))) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                vz9Var.u(i2, 0);
            }
        }
    }

    @Override
    public final void m0(int i) {
        int i2;
        s14 s14Var;
        int min;
        int i3;
        int i4;
        vz9 vz9Var = this.o3;
        vz9Var.f();
        boolean z = false;
        if (!vz9Var.y1) {
            int H0 = vz9Var.s0.H0();
            ArrayList arrayList = vz9Var.E0;
            SparseIntArray sparseIntArray = vz9Var.x0;
            if (H0 != -1) {
                int i5 = 40;
                if (arrayList.size() <= 40 || vz9Var.D0) {
                    i5 = arrayList.size() + (vz9Var.O0 ? 1 : 0);
                }
                if (H0 > i5 && H0 > vz9Var.J0.size()) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i6);
                        int valueAt = sparseIntArray.valueAt(i6);
                        if (valueAt >= 0) {
                            s14Var = (s14) vz9Var.N0.get(valueAt);
                        } else {
                            s14Var = null;
                        }
                        if (s14Var != null) {
                            boolean z2 = s14Var.h;
                            ArrayList arrayList2 = s14Var.c;
                            if (z2) {
                                min = arrayList2.size();
                            } else {
                                min = Math.min(24, arrayList2.size());
                            }
                            if (H0 > keyAt && H0 <= keyAt + 1 + min) {
                                mz3 mz3Var = vz9Var.e0;
                                if (mz3Var.y != null) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if (mz3Var.E != null && mz3Var.b0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                mz3Var.j(i4 + i3 + valueAt, true);
                            }
                        }
                        i6++;
                    }
                } else {
                    vz9Var.e0.j(0, true);
                }
            }
        }
        vz9Var.C();
        oy9 oy9Var = vz9Var.f0;
        if (vz9Var.i0.computeVerticalScrollOffset() != 0 || (i2 = this.n3) == 0 || i2 == 12 || i2 == 10 || i2 == 1 || i2 == 11 || i2 == 6) {
            z = true;
        }
        gm.T3(oy9Var, z, 1.0f, true, true);
        vz9Var.l();
    }
}
