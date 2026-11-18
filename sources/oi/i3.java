package oi;

import android.view.View;
import c8.ha;
public final class i3 extends ha {
    public final q3 f22108a;
    public final s3 f22109b;

    public i3(s3 s3Var, q3 q3Var) {
        this.f22109b = s3Var;
        this.f22108a = q3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f22108a.G();
        s3 s3Var = this.f22109b;
        if (z10) {
            g3 g3Var = s3Var.f22349v3;
            s3Var.f22353x3 = g3Var.B0;
            s3Var.f22355y3 = g3Var.C0;
            s3Var.f22357z3 = g3Var.D0;
            s3Var.setEditTextsLocked(true);
            s3Var.q3();
            s3Var.Y2();
            return;
        }
        final int i7 = s3Var.f22353x3;
        final int i10 = s3Var.f22355y3;
        final int i11 = s3Var.f22357z3;
        s3Var.f22353x3 = -1;
        s3Var.f22355y3 = -1;
        s3Var.f22357z3 = 0;
        boolean z11 = s3Var.A3;
        final float f10 = s3Var.B3;
        final float f11 = s3Var.C3;
        s3Var.A3 = false;
        s3Var.setEditTextsLocked(false);
        s3Var.Y2();
        if (z11) {
            s3Var.post(new Runnable() {
                @Override
                public final void run() {
                    s3 s3Var2 = i3.this.f22109b;
                    for (int i12 = 0; i12 < s3Var2.getChildCount(); i12++) {
                        View childAt = s3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof z5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            z5 z5Var = (z5) childAt;
                            if (!s3.k4(z5Var.getEditText(), f12, f13)) {
                                if (z5Var.n() && s3.k4(z5Var.getAuthorEditText(), f12, f13)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (s3.k4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof p0) && s3.k4(((p0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i7;
                    if (i13 >= 0) {
                        s3.O1(s3Var2, i13, i11, i10);
                    }
                }
            });
        } else if (i7 >= 0) {
            s3Var.post(new hi.c0(this, i7, i11, i10, 2));
        } else {
            View findFocus = s3Var.findFocus();
            if (findFocus instanceof e1) {
                s3Var.post(new x0((e1) findFocus, 2));
            }
        }
    }
}
