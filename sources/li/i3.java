package li;

import android.view.View;
import c8.da;
public final class i3 extends da {
    public final r3 f18636a;
    public final t3 f18637b;

    public i3(t3 t3Var, r3 r3Var) {
        this.f18637b = t3Var;
        this.f18636a = r3Var;
    }

    @Override
    public final void a(boolean z9) {
        this.f18636a.h();
        t3 t3Var = this.f18637b;
        if (z9) {
            g3 g3Var = t3Var.f18898u3;
            t3Var.f18902w3 = g3Var.B0;
            t3Var.f18904x3 = g3Var.C0;
            t3Var.f18906y3 = g3Var.D0;
            t3Var.setEditTextsLocked(true);
            t3Var.q3();
            t3Var.Y2();
            return;
        }
        final int i7 = t3Var.f18902w3;
        final int i10 = t3Var.f18904x3;
        final int i11 = t3Var.f18906y3;
        t3Var.f18902w3 = -1;
        t3Var.f18904x3 = -1;
        t3Var.f18906y3 = 0;
        boolean z10 = t3Var.f18908z3;
        final float f10 = t3Var.A3;
        final float f11 = t3Var.B3;
        t3Var.f18908z3 = false;
        t3Var.setEditTextsLocked(false);
        t3Var.Y2();
        if (z10) {
            t3Var.post(new Runnable() {
                @Override
                public final void run() {
                    t3 t3Var2 = i3.this.f18637b;
                    for (int i12 = 0; i12 < t3Var2.getChildCount(); i12++) {
                        View childAt = t3Var2.getChildAt(i12);
                        boolean z11 = childAt instanceof a6;
                        float f12 = f10;
                        float f13 = f11;
                        if (z11) {
                            a6 a6Var = (a6) childAt;
                            if (!t3.k4(a6Var.getEditText(), f12, f13)) {
                                if (a6Var.n() && t3.k4(a6Var.getAuthorEditText(), f12, f13)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof k0) {
                            if (t3.k4(((k0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof r0) && t3.k4(((r0) childAt).getEditText(), f12, f13)) {
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
            t3Var.post(new fi.b0(this, i7, i11, i10, 2));
        } else {
            View findFocus = t3Var.findFocus();
            if (findFocus instanceof g1) {
                t3Var.post(new z0((g1) findFocus, 2));
            }
        }
    }
}
