package ii;

import android.view.View;
public final class m3 extends w7.j0 {
    public final v3 f12522a;
    public final x3 f12523b;

    public m3(x3 x3Var, v3 v3Var) {
        this.f12523b = x3Var;
        this.f12522a = v3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f12522a.w();
        x3 x3Var = this.f12523b;
        if (z10) {
            k3 k3Var = x3Var.f12781u3;
            x3Var.f12785w3 = k3Var.G0;
            x3Var.f12787x3 = k3Var.H0;
            x3Var.y3 = k3Var.I0;
            x3Var.setEditTextsLocked(true);
            x3Var.p3();
            x3Var.X2();
            return;
        }
        final int i10 = x3Var.f12785w3;
        final int i11 = x3Var.f12787x3;
        final int i12 = x3Var.y3;
        x3Var.f12785w3 = -1;
        x3Var.f12787x3 = -1;
        x3Var.y3 = 0;
        boolean z11 = x3Var.f12790z3;
        final float f7 = x3Var.A3;
        final float f10 = x3Var.B3;
        x3Var.f12790z3 = false;
        x3Var.setEditTextsLocked(false);
        x3Var.X2();
        if (z11) {
            x3Var.post(new Runnable() {
                @Override
                public final void run() {
                    x3 x3Var2 = m3.this.f12523b;
                    for (int i13 = 0; i13 < x3Var2.getChildCount(); i13++) {
                        View childAt = x3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof f6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            f6 f6Var = (f6) childAt;
                            if (!x3.j4(f6Var.getEditText(), f11, f12)) {
                                if (f6Var.n() && x3.j4(f6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof m0) {
                            if (x3.j4(((m0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof u0) && x3.j4(((u0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        x3.M1(x3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            x3Var.post(new ci.b0(this, i10, i12, i11, 2));
        } else {
            View findFocus = x3Var.findFocus();
            if (findFocus instanceof i1) {
                x3Var.post(new c1((i1) findFocus, 2));
            }
        }
    }
}
