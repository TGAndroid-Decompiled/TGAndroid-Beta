package bi;

import android.view.View;
public final class s3 extends w7.x5 {
    public final b4 f3342a;
    public final d4 f3343b;

    public s3(d4 d4Var, b4 b4Var) {
        this.f3343b = d4Var;
        this.f3342a = b4Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f3342a.r();
        d4 d4Var = this.f3343b;
        if (z10) {
            q3 q3Var = d4Var.f2950u3;
            d4Var.f2954w3 = q3Var.B0;
            d4Var.f2956x3 = q3Var.C0;
            d4Var.y3 = q3Var.D0;
            d4Var.setEditTextsLocked(true);
            d4Var.q3();
            d4Var.Y2();
            return;
        }
        final int i10 = d4Var.f2954w3;
        final int i11 = d4Var.f2956x3;
        final int i12 = d4Var.y3;
        d4Var.f2954w3 = -1;
        d4Var.f2956x3 = -1;
        d4Var.y3 = 0;
        boolean z11 = d4Var.f2959z3;
        final float f7 = d4Var.A3;
        final float f10 = d4Var.B3;
        d4Var.f2959z3 = false;
        d4Var.setEditTextsLocked(false);
        d4Var.Y2();
        if (z11) {
            d4Var.post(new Runnable() {
                @Override
                public final void run() {
                    d4 d4Var2 = s3.this.f3343b;
                    for (int i13 = 0; i13 < d4Var2.getChildCount(); i13++) {
                        View childAt = d4Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof q6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            q6 q6Var = (q6) childAt;
                            if (!d4.k4(q6Var.getEditText(), f11, f12)) {
                                if (q6Var.n() && d4.k4(q6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof o0) {
                            if (d4.k4(((o0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof y0) && d4.k4(((y0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        d4.N1(d4Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            d4Var.post(new b3(this, i10, i12, i11, 1));
        } else {
            View findFocus = d4Var.findFocus();
            if (findFocus instanceof n1) {
                d4Var.post(new g1((n1) findFocus, 2));
            }
        }
    }
}
