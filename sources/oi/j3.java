package oi;

import android.view.View;
import c8.ha;
public final class j3 extends ha {
    public final r3 f22196a;
    public final t3 f22197b;

    public j3(t3 t3Var, r3 r3Var) {
        this.f22197b = t3Var;
        this.f22196a = r3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f22196a.G();
        t3 t3Var = this.f22197b;
        if (z10) {
            h3 h3Var = t3Var.f22437v3;
            t3Var.f22441x3 = h3Var.B0;
            t3Var.f22443y3 = h3Var.C0;
            t3Var.f22445z3 = h3Var.D0;
            t3Var.setEditTextsLocked(true);
            t3Var.q3();
            t3Var.Y2();
            return;
        }
        final int i7 = t3Var.f22441x3;
        final int i10 = t3Var.f22443y3;
        final int i11 = t3Var.f22445z3;
        t3Var.f22441x3 = -1;
        t3Var.f22443y3 = -1;
        t3Var.f22445z3 = 0;
        boolean z11 = t3Var.A3;
        final float f10 = t3Var.B3;
        final float f11 = t3Var.C3;
        t3Var.A3 = false;
        t3Var.setEditTextsLocked(false);
        t3Var.Y2();
        if (z11) {
            t3Var.post(new Runnable() {
                @Override
                public final void run() {
                    t3 t3Var2 = j3.this.f22197b;
                    for (int i12 = 0; i12 < t3Var2.getChildCount(); i12++) {
                        View childAt = t3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof a6;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            a6 a6Var = (a6) childAt;
                            if (!t3.k4(a6Var.getEditText(), f12, f13)) {
                                if (a6Var.n() && t3.k4(a6Var.getAuthorEditText(), f12, f13)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof j0) {
                            if (t3.k4(((j0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && t3.k4(((q0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i7;
                    if (i13 >= 0) {
                        t3.O1(t3Var2, i13, i11, i10);
                    }
                }
            });
        } else if (i7 >= 0) {
            t3Var.post(new hi.d0(this, i7, i11, i10, 2));
        } else {
            View findFocus = t3Var.findFocus();
            if (findFocus instanceof f1) {
                t3Var.post(new y0((f1) findFocus, 2));
            }
        }
    }
}
