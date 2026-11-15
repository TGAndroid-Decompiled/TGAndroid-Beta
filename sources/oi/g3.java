package oi;

import android.view.View;
import c8.fa;
public final class g3 extends fa {
    public final o3 f21711a;
    public final q3 f21712b;

    public g3(q3 q3Var, o3 o3Var) {
        this.f21712b = q3Var;
        this.f21711a = o3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f21711a.v();
        q3 q3Var = this.f21712b;
        if (z10) {
            e3 e3Var = q3Var.f21943v3;
            q3Var.f21947x3 = e3Var.B0;
            q3Var.f21949y3 = e3Var.C0;
            q3Var.f21951z3 = e3Var.D0;
            q3Var.setEditTextsLocked(true);
            q3Var.q3();
            q3Var.Y2();
            return;
        }
        final int i7 = q3Var.f21947x3;
        final int i10 = q3Var.f21949y3;
        final int i11 = q3Var.f21951z3;
        q3Var.f21947x3 = -1;
        q3Var.f21949y3 = -1;
        q3Var.f21951z3 = 0;
        boolean z11 = q3Var.A3;
        final float f10 = q3Var.B3;
        final float f11 = q3Var.C3;
        q3Var.A3 = false;
        q3Var.setEditTextsLocked(false);
        q3Var.Y2();
        if (z11) {
            q3Var.post(new Runnable() {
                @Override
                public final void run() {
                    q3 q3Var2 = g3.this.f21712b;
                    for (int i12 = 0; i12 < q3Var2.getChildCount(); i12++) {
                        View childAt = q3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof y5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            y5 y5Var = (y5) childAt;
                            if (!q3.k4(y5Var.getEditText(), f12, f13)) {
                                if (y5Var.n() && q3.k4(y5Var.getAuthorEditText(), f12, f13)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (q3.k4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof p0) && q3.k4(((p0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i7;
                    if (i13 >= 0) {
                        q3.O1(q3Var2, i13, i11, i10);
                    }
                }
            });
        } else if (i7 >= 0) {
            q3Var.post(new hi.b0(this, i7, i11, i10, 2));
        } else {
            View findFocus = q3Var.findFocus();
            if (findFocus instanceof e1) {
                q3Var.post(new x0((e1) findFocus, 2));
            }
        }
    }
}
