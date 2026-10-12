package ji;

import android.view.View;
public final class m3 extends w7.w5 {
    public final v3 f13405a;
    public final x3 f13406b;

    public m3(x3 x3Var, v3 v3Var) {
        this.f13406b = x3Var;
        this.f13405a = v3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f13405a.o();
        x3 x3Var = this.f13406b;
        if (z10) {
            k3 k3Var = x3Var.f13639l3;
            x3Var.f13642n3 = k3Var.B0;
            x3Var.f13644o3 = k3Var.C0;
            x3Var.f13646p3 = k3Var.D0;
            x3Var.setEditTextsLocked(true);
            x3Var.o3();
            x3Var.W2();
            return;
        }
        final int i10 = x3Var.f13642n3;
        final int i11 = x3Var.f13644o3;
        final int i12 = x3Var.f13646p3;
        x3Var.f13642n3 = -1;
        x3Var.f13644o3 = -1;
        x3Var.f13646p3 = 0;
        boolean z11 = x3Var.f13648q3;
        final float f7 = x3Var.f13649r3;
        final float f10 = x3Var.f13650s3;
        x3Var.f13648q3 = false;
        x3Var.setEditTextsLocked(false);
        x3Var.W2();
        if (z11) {
            x3Var.post(new Runnable() {
                @Override
                public final void run() {
                    x3 x3Var2 = m3.this.f13406b;
                    for (int i13 = 0; i13 < x3Var2.getChildCount(); i13++) {
                        View childAt = x3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof i6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            i6 i6Var = (i6) childAt;
                            if (!x3.i4(i6Var.getEditText(), f11, f12)) {
                                if (i6Var.n() && x3.i4(i6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (x3.i4(((l0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof t0) && x3.i4(((t0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        x3.L1(x3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            x3Var.post(new di.b0(this, i10, i12, i11, 2));
        } else {
            View findFocus = x3Var.findFocus();
            if (findFocus instanceof h1) {
                x3Var.post(new b1((h1) findFocus, 2));
            }
        }
    }
}
