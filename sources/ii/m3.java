package ii;

import android.view.View;
public final class m3 extends w7.g0 {
    public final v3 f12570a;
    public final x3 f12571b;

    public m3(x3 x3Var, v3 v3Var) {
        this.f12571b = x3Var;
        this.f12570a = v3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f12570a.n();
        x3 x3Var = this.f12571b;
        if (z10) {
            k3 k3Var = x3Var.f12818l3;
            x3Var.f12821n3 = k3Var.B0;
            x3Var.f12823o3 = k3Var.C0;
            x3Var.f12825p3 = k3Var.D0;
            x3Var.setEditTextsLocked(true);
            x3Var.o3();
            x3Var.W2();
            return;
        }
        final int i10 = x3Var.f12821n3;
        final int i11 = x3Var.f12823o3;
        final int i12 = x3Var.f12825p3;
        x3Var.f12821n3 = -1;
        x3Var.f12823o3 = -1;
        x3Var.f12825p3 = 0;
        boolean z11 = x3Var.f12827q3;
        final float f7 = x3Var.f12828r3;
        final float f10 = x3Var.f12829s3;
        x3Var.f12827q3 = false;
        x3Var.setEditTextsLocked(false);
        x3Var.W2();
        if (z11) {
            x3Var.post(new Runnable() {
                @Override
                public final void run() {
                    x3 x3Var2 = m3.this.f12571b;
                    for (int i13 = 0; i13 < x3Var2.getChildCount(); i13++) {
                        View childAt = x3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof e6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            e6 e6Var = (e6) childAt;
                            if (!x3.i4(e6Var.getEditText(), f11, f12)) {
                                if (e6Var.n() && x3.i4(e6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof m0) {
                            if (x3.i4(((m0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof u0) && x3.i4(((u0) childAt).getEditText(), f11, f12)) {
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
            x3Var.post(new ci.b0(this, i10, i12, i11, 2));
        } else {
            View findFocus = x3Var.findFocus();
            if (findFocus instanceof i1) {
                x3Var.post(new c1((i1) findFocus, 2));
            }
        }
    }
}
