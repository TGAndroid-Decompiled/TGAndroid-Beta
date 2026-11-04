package mi;

import android.view.View;
import b8.hf;
public final class j3 extends hf {
    public final r3 f19701a;
    public final t3 f19702b;

    public j3(t3 t3Var, r3 r3Var) {
        this.f19702b = t3Var;
        this.f19701a = r3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f19701a.a0();
        t3 t3Var = this.f19702b;
        if (z10) {
            h3 h3Var = t3Var.f19928v3;
            t3Var.f19932x3 = h3Var.B0;
            t3Var.f19934y3 = h3Var.C0;
            t3Var.f19936z3 = h3Var.D0;
            t3Var.setEditTextsLocked(true);
            t3Var.q3();
            t3Var.Y2();
            return;
        }
        final int i3 = t3Var.f19932x3;
        final int i10 = t3Var.f19934y3;
        final int i11 = t3Var.f19936z3;
        t3Var.f19932x3 = -1;
        t3Var.f19934y3 = -1;
        t3Var.f19936z3 = 0;
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
                    t3 t3Var2 = j3.this.f19702b;
                    for (int i12 = 0; i12 < t3Var2.getChildCount(); i12++) {
                        View childAt = t3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof b6;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            b6 b6Var = (b6) childAt;
                            if (!t3.k4(b6Var.getEditText(), f12, f13)) {
                                if (b6Var.n() && t3.k4(b6Var.getAuthorEditText(), f12, f13)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (t3.k4(((l0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof s0) && t3.k4(((s0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i3;
                    if (i13 >= 0) {
                        t3.O1(t3Var2, i13, i11, i10);
                    }
                }
            });
        } else if (i3 >= 0) {
            t3Var.post(new gi.b0(this, i3, i11, i10, 2));
        } else {
            View findFocus = t3Var.findFocus();
            if (findFocus instanceof h1) {
                t3Var.post(new a1((h1) findFocus, 2));
            }
        }
    }
}
