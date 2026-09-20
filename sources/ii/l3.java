package ii;

import android.view.View;
public final class l3 extends w7.i0 {
    public final u3 f11495a;
    public final w3 f11496b;

    public l3(w3 w3Var, u3 u3Var) {
        this.f11496b = w3Var;
        this.f11495a = u3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f11495a.n();
        w3 w3Var = this.f11496b;
        if (z10) {
            j3 j3Var = w3Var.f11725n3;
            w3Var.f11729p3 = j3Var.G0;
            w3Var.f11731q3 = j3Var.H0;
            w3Var.f11733r3 = j3Var.I0;
            w3Var.setEditTextsLocked(true);
            w3Var.o3();
            w3Var.W2();
            return;
        }
        final int i10 = w3Var.f11729p3;
        final int i11 = w3Var.f11731q3;
        final int i12 = w3Var.f11733r3;
        w3Var.f11729p3 = -1;
        w3Var.f11731q3 = -1;
        w3Var.f11733r3 = 0;
        boolean z11 = w3Var.f11735s3;
        final float f7 = w3Var.f11736t3;
        final float f10 = w3Var.f11737u3;
        w3Var.f11735s3 = false;
        w3Var.setEditTextsLocked(false);
        w3Var.W2();
        if (z11) {
            w3Var.post(new Runnable() {
                @Override
                public final void run() {
                    w3 w3Var2 = l3.this.f11496b;
                    for (int i13 = 0; i13 < w3Var2.getChildCount(); i13++) {
                        View childAt = w3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof d6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            d6 d6Var = (d6) childAt;
                            if (!w3.i4(d6Var.getEditText(), f11, f12)) {
                                if (d6Var.n() && w3.i4(d6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof m0) {
                            if (w3.i4(((m0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof u0) && w3.i4(((u0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        w3.L1(w3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            w3Var.post(new ci.b0(this, i10, i12, i11, 2));
        } else {
            View findFocus = w3Var.findFocus();
            if (findFocus instanceof i1) {
                w3Var.post(new c1((i1) findFocus, 2));
            }
        }
    }
}
