package ki;

import android.view.View;
public final class l3 extends w7.j0 {
    public final u3 f15369a;
    public final w3 f15370b;

    public l3(w3 w3Var, u3 u3Var) {
        this.f15370b = w3Var;
        this.f15369a = u3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f15369a.o();
        w3 w3Var = this.f15370b;
        if (z10) {
            j3 j3Var = w3Var.f15598l3;
            w3Var.f15601n3 = j3Var.B0;
            w3Var.f15603o3 = j3Var.C0;
            w3Var.f15605p3 = j3Var.D0;
            w3Var.setEditTextsLocked(true);
            w3Var.o3();
            w3Var.W2();
            return;
        }
        final int i10 = w3Var.f15601n3;
        final int i11 = w3Var.f15603o3;
        final int i12 = w3Var.f15605p3;
        w3Var.f15601n3 = -1;
        w3Var.f15603o3 = -1;
        w3Var.f15605p3 = 0;
        boolean z11 = w3Var.f15607q3;
        final float f7 = w3Var.f15608r3;
        final float f10 = w3Var.f15609s3;
        w3Var.f15607q3 = false;
        w3Var.setEditTextsLocked(false);
        w3Var.W2();
        if (z11) {
            w3Var.post(new Runnable() {
                @Override
                public final void run() {
                    w3 w3Var2 = l3.this.f15370b;
                    for (int i13 = 0; i13 < w3Var2.getChildCount(); i13++) {
                        View childAt = w3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof c6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            c6 c6Var = (c6) childAt;
                            if (!w3.i4(c6Var.getEditText(), f11, f12)) {
                                if (c6Var.n() && w3.i4(c6Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (w3.i4(((l0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof t0) && w3.i4(((t0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        w3.L1(w3Var2, i14, i12, i11);
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
