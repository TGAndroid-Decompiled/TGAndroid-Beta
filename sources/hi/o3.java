package hi;

import android.view.View;
public final class o3 extends w7.w5 {
    public final x3 f9775a;
    public final z3 f9776b;

    public o3(z3 z3Var, x3 x3Var) {
        this.f9776b = z3Var;
        this.f9775a = x3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f9775a.s();
        z3 z3Var = this.f9776b;
        if (z10) {
            m3 m3Var = z3Var.f10011n3;
            z3Var.f10015p3 = m3Var.G0;
            z3Var.f10017q3 = m3Var.H0;
            z3Var.f10019r3 = m3Var.I0;
            z3Var.setEditTextsLocked(true);
            z3Var.m3();
            z3Var.U2();
            return;
        }
        final int i10 = z3Var.f10015p3;
        final int i11 = z3Var.f10017q3;
        final int i12 = z3Var.f10019r3;
        z3Var.f10015p3 = -1;
        z3Var.f10017q3 = -1;
        z3Var.f10019r3 = 0;
        boolean z11 = z3Var.f10021s3;
        final float f7 = z3Var.f10022t3;
        final float f10 = z3Var.f10023u3;
        z3Var.f10021s3 = false;
        z3Var.setEditTextsLocked(false);
        z3Var.U2();
        if (z11) {
            z3Var.post(new Runnable() {
                @Override
                public final void run() {
                    z3 z3Var2 = o3.this.f9776b;
                    for (int i13 = 0; i13 < z3Var2.getChildCount(); i13++) {
                        View childAt = z3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof g6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            g6 g6Var = (g6) childAt;
                            if (!z3.g4(g6Var.getEditText(), f11, f12)) {
                                if (g6Var.n() && z3.g4(g6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof n0) {
                            if (z3.g4(((n0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof w0) && z3.g4(((w0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        z3.J1(z3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            z3Var.post(new bi.g0(this, i10, i12, i11, 2));
        } else {
            View findFocus = z3Var.findFocus();
            if (findFocus instanceof k1) {
                z3Var.post(new e1((k1) findFocus, 2));
            }
        }
    }
}
