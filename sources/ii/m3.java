package ii;

import android.view.View;
public final class m3 extends w7.h0 {
    public final v3 f11500a;
    public final x3 f11501b;

    public m3(x3 x3Var, v3 v3Var) {
        this.f11501b = x3Var;
        this.f11500a = v3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f11500a.l();
        x3 x3Var = this.f11501b;
        if (z10) {
            k3 k3Var = x3Var.f11738n3;
            x3Var.f11742p3 = k3Var.G0;
            x3Var.f11744q3 = k3Var.H0;
            x3Var.f11746r3 = k3Var.I0;
            x3Var.setEditTextsLocked(true);
            x3Var.n3();
            x3Var.V2();
            return;
        }
        final int i10 = x3Var.f11742p3;
        final int i11 = x3Var.f11744q3;
        final int i12 = x3Var.f11746r3;
        x3Var.f11742p3 = -1;
        x3Var.f11744q3 = -1;
        x3Var.f11746r3 = 0;
        boolean z11 = x3Var.f11748s3;
        final float f7 = x3Var.f11749t3;
        final float f10 = x3Var.f11750u3;
        x3Var.f11748s3 = false;
        x3Var.setEditTextsLocked(false);
        x3Var.V2();
        if (z11) {
            x3Var.post(new Runnable() {
                @Override
                public final void run() {
                    x3 x3Var2 = m3.this.f11501b;
                    for (int i13 = 0; i13 < x3Var2.getChildCount(); i13++) {
                        View childAt = x3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof e6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            e6 e6Var = (e6) childAt;
                            if (!x3.h4(e6Var.getEditText(), f11, f12)) {
                                if (e6Var.n() && x3.h4(e6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof m0) {
                            if (x3.h4(((m0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof u0) && x3.h4(((u0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        x3.K1(x3Var2, i14, i12, i11);
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
