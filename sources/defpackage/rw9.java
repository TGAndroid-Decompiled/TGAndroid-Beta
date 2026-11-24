package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class rw9 extends ww9 {
    public final int n3;
    public final tx9 o3;

    public rw9(tx9 tx9Var, Context context, int i) {
        super(tx9Var, context);
        this.o3 = tx9Var;
        this.n3 = i;
    }

    @Override
    public final void l0(int i) {
        int i2;
        tx9 tx9Var = this.o3;
        lw9 lw9Var = tx9Var.g0;
        if (i == 0) {
            tx9Var.y1 = false;
            if (tx9Var.a != -1 && lw9Var.getVisibility() == 0 && lw9Var.getTranslationY() > (-gl.L(51.0f))) {
                if (lw9Var.getTranslationY() > (-gl.L(16.0f))) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                tx9Var.u(i2, 0);
            }
        }
    }

    @Override
    public final void m0(int i) {
        int i2;
        h04 h04Var;
        int min;
        int i3;
        int i4;
        tx9 tx9Var = this.o3;
        tx9Var.f();
        boolean z = false;
        if (!tx9Var.y1) {
            int H0 = tx9Var.s0.H0();
            ArrayList arrayList = tx9Var.E0;
            SparseIntArray sparseIntArray = tx9Var.x0;
            if (H0 != -1) {
                int i5 = 40;
                if (arrayList.size() <= 40 || tx9Var.D0) {
                    i5 = arrayList.size() + (tx9Var.O0 ? 1 : 0);
                }
                if (H0 > i5 && H0 > tx9Var.J0.size()) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i6);
                        int valueAt = sparseIntArray.valueAt(i6);
                        if (valueAt >= 0) {
                            h04Var = (h04) tx9Var.N0.get(valueAt);
                        } else {
                            h04Var = null;
                        }
                        if (h04Var != null) {
                            boolean z2 = h04Var.h;
                            ArrayList arrayList2 = h04Var.c;
                            if (z2) {
                                min = arrayList2.size();
                            } else {
                                min = Math.min(24, arrayList2.size());
                            }
                            if (H0 > keyAt && H0 <= keyAt + 1 + min) {
                                cy3 cy3Var = tx9Var.e0;
                                if (cy3Var.y != null) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if (cy3Var.E != null && cy3Var.b0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                cy3Var.j(i4 + i3 + valueAt, true);
                            }
                        }
                        i6++;
                    }
                } else {
                    tx9Var.e0.j(0, true);
                }
            }
        }
        tx9Var.C();
        mw9 mw9Var = tx9Var.f0;
        if (tx9Var.i0.computeVerticalScrollOffset() != 0 || (i2 = this.n3) == 0 || i2 == 12 || i2 == 10 || i2 == 1 || i2 == 11 || i2 == 6) {
            z = true;
        }
        gl.T3(mw9Var, z, 1.0f, true, true);
        tx9Var.l();
    }
}
