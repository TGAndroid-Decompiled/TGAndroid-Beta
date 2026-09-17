package ji;

import android.view.View;
public final class k3 extends w7.h0 {
    public final t3 f14015a;
    public final v3 f14016b;

    public k3(v3 v3Var, t3 t3Var) {
        this.f14016b = v3Var;
        this.f14015a = t3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f14015a.f();
        v3 v3Var = this.f14016b;
        if (z10) {
            i3 i3Var = v3Var.f14259n3;
            v3Var.f14263p3 = i3Var.G0;
            v3Var.f14265q3 = i3Var.H0;
            v3Var.f14267r3 = i3Var.I0;
            v3Var.setEditTextsLocked(true);
            v3Var.m3();
            v3Var.U2();
            return;
        }
        final int i10 = v3Var.f14263p3;
        final int i11 = v3Var.f14265q3;
        final int i12 = v3Var.f14267r3;
        v3Var.f14263p3 = -1;
        v3Var.f14265q3 = -1;
        v3Var.f14267r3 = 0;
        boolean z11 = v3Var.f14269s3;
        final float f7 = v3Var.f14270t3;
        final float f10 = v3Var.f14271u3;
        v3Var.f14269s3 = false;
        v3Var.setEditTextsLocked(false);
        v3Var.U2();
        if (z11) {
            v3Var.post(new Runnable() {
                @Override
                public final void run() {
                    v3 v3Var2 = k3.this.f14016b;
                    for (int i13 = 0; i13 < v3Var2.getChildCount(); i13++) {
                        View childAt = v3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof g6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            g6 g6Var = (g6) childAt;
                            if (!v3.g4(g6Var.getEditText(), f11, f12)) {
                                if (g6Var.n() && v3.g4(g6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (v3.g4(((l0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof t0) && v3.g4(((t0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        v3.J1(v3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            v3Var.post(new di.b0(this, i10, i12, i11, 2));
        } else {
            View findFocus = v3Var.findFocus();
            if (findFocus instanceof h1) {
                v3Var.post(new b1((h1) findFocus, 2));
            }
        }
    }
}
