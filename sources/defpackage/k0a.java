package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class k0a extends p0a {
    public final int n3;
    public final n1a o3;

    public k0a(n1a n1aVar, Context context, int i) {
        super(n1aVar, context);
        this.o3 = n1aVar;
        this.n3 = i;
    }

    @Override
    public final void m0(int i) {
        int i2;
        n1a n1aVar = this.o3;
        e0a e0aVar = n1aVar.g0;
        if (i == 0) {
            n1aVar.y1 = false;
            if (n1aVar.a != -1 && e0aVar.getVisibility() == 0 && e0aVar.getTranslationY() > (-hl.L(51.0f))) {
                if (e0aVar.getTranslationY() > (-hl.L(16.0f))) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                n1aVar.u(i2, 0);
            }
        }
    }

    @Override
    public final void n0(int i) {
        int i2;
        c14 c14Var;
        int min;
        int i3;
        int i4;
        n1a n1aVar = this.o3;
        n1aVar.f();
        boolean z = false;
        if (!n1aVar.y1) {
            int H0 = n1aVar.s0.H0();
            ArrayList arrayList = n1aVar.E0;
            SparseIntArray sparseIntArray = n1aVar.x0;
            if (H0 != -1) {
                int i5 = 40;
                if (arrayList.size() <= 40 || n1aVar.D0) {
                    i5 = arrayList.size() + (n1aVar.O0 ? 1 : 0);
                }
                if (H0 > i5 && H0 > n1aVar.J0.size()) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i6);
                        int valueAt = sparseIntArray.valueAt(i6);
                        if (valueAt >= 0) {
                            c14Var = (c14) n1aVar.N0.get(valueAt);
                        } else {
                            c14Var = null;
                        }
                        if (c14Var != null) {
                            boolean z2 = c14Var.h;
                            ArrayList arrayList2 = c14Var.c;
                            if (z2) {
                                min = arrayList2.size();
                            } else {
                                min = Math.min(24, arrayList2.size());
                            }
                            if (H0 > keyAt && H0 <= keyAt + 1 + min) {
                                xy3 xy3Var = n1aVar.e0;
                                if (xy3Var.y != null) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if (xy3Var.E != null && xy3Var.b0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                xy3Var.j(i4 + i3 + valueAt, true);
                            }
                        }
                        i6++;
                    }
                } else {
                    n1aVar.e0.j(0, true);
                }
            }
        }
        n1aVar.C();
        f0a f0aVar = n1aVar.f0;
        if (n1aVar.i0.computeVerticalScrollOffset() != 0 || (i2 = this.n3) == 0 || i2 == 12 || i2 == 10 || i2 == 1 || i2 == 11 || i2 == 6) {
            z = true;
        }
        hl.T3(f0aVar, z, 1.0f, true, true);
        n1aVar.l();
    }
}
