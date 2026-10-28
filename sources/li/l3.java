package li;

import a8.ye;
import android.view.View;
public final class l3 extends ye {
    public final t3 f17345a;
    public final v3 f17346b;

    public l3(v3 v3Var, t3 t3Var) {
        this.f17346b = v3Var;
        this.f17345a = t3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f17345a.n();
        v3 v3Var = this.f17346b;
        if (z10) {
            j3 j3Var = v3Var.f17568v3;
            v3Var.f17572x3 = j3Var.B0;
            v3Var.y3 = j3Var.C0;
            v3Var.f17575z3 = j3Var.D0;
            v3Var.setEditTextsLocked(true);
            v3Var.t3();
            v3Var.b3();
            return;
        }
        final int i10 = v3Var.f17572x3;
        final int i11 = v3Var.y3;
        final int i12 = v3Var.f17575z3;
        v3Var.f17572x3 = -1;
        v3Var.y3 = -1;
        v3Var.f17575z3 = 0;
        boolean z11 = v3Var.A3;
        final float f7 = v3Var.B3;
        final float f10 = v3Var.C3;
        v3Var.A3 = false;
        v3Var.setEditTextsLocked(false);
        v3Var.b3();
        if (z11) {
            v3Var.post(new Runnable() {
                @Override
                public final void run() {
                    v3 v3Var2 = l3.this.f17346b;
                    for (int i13 = 0; i13 < v3Var2.getChildCount(); i13++) {
                        View childAt = v3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof d6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            d6 d6Var = (d6) childAt;
                            if (!v3.n4(d6Var.getEditText(), f11, f12)) {
                                if (d6Var.m() && v3.n4(d6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof k0) {
                            if (v3.n4(((k0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof s0) && v3.n4(((s0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        v3.Q1(v3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            v3Var.post(new fi.b0(this, i10, i12, i11, 2));
        } else {
            View findFocus = v3Var.findFocus();
            if (findFocus instanceof g1) {
                v3Var.post(new a1((g1) findFocus, 2));
            }
        }
    }
}
