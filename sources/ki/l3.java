package ki;

import android.view.View;
public final class l3 extends w7.j0 {
    public final u3 f15435a;
    public final w3 f15436b;

    public l3(w3 w3Var, u3 u3Var) {
        this.f15436b = w3Var;
        this.f15435a = u3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f15435a.p();
        w3 w3Var = this.f15436b;
        if (z10) {
            j3 j3Var = w3Var.f15667o3;
            w3Var.f15671q3 = j3Var.B0;
            w3Var.f15673r3 = j3Var.C0;
            w3Var.f15675s3 = j3Var.D0;
            w3Var.setEditTextsLocked(true);
            w3Var.t3();
            w3Var.b3();
            return;
        }
        final int i10 = w3Var.f15671q3;
        final int i11 = w3Var.f15673r3;
        final int i12 = w3Var.f15675s3;
        w3Var.f15671q3 = -1;
        w3Var.f15673r3 = -1;
        w3Var.f15675s3 = 0;
        boolean z11 = w3Var.f15677t3;
        final float f7 = w3Var.f15678u3;
        final float f10 = w3Var.f15679v3;
        w3Var.f15677t3 = false;
        w3Var.setEditTextsLocked(false);
        w3Var.b3();
        if (z11) {
            w3Var.post(new Runnable() {
                @Override
                public final void run() {
                    w3 w3Var2 = l3.this.f15436b;
                    for (int i13 = 0; i13 < w3Var2.getChildCount(); i13++) {
                        View childAt = w3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof c6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            c6 c6Var = (c6) childAt;
                            if (!w3.n4(c6Var.getEditText(), f11, f12)) {
                                if (c6Var.m() && w3.n4(c6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (w3.n4(((l0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof t0) && w3.n4(((t0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        w3.Q1(w3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            w3Var.post(new ei.b0(this, i10, i12, i11, 2));
        } else {
            View findFocus = w3Var.findFocus();
            if (findFocus instanceof h1) {
                w3Var.post(new b1((h1) findFocus, 2));
            }
        }
    }
}
