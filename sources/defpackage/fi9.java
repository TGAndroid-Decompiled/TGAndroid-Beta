package defpackage;

import android.view.View;
public final class fi9 extends b0f {
    public final ni9 a;
    public final pi9 b;

    public fi9(pi9 pi9Var, ni9 ni9Var) {
        this.b = pi9Var;
        this.a = ni9Var;
    }

    @Override
    public final void a(boolean z) {
        this.a.f();
        pi9 pi9Var = this.b;
        if (z) {
            di9 di9Var = pi9Var.v3;
            pi9Var.x3 = di9Var.B0;
            pi9Var.y3 = di9Var.C0;
            pi9Var.z3 = di9Var.D0;
            pi9Var.setEditTextsLocked(true);
            pi9Var.k3();
            pi9Var.S2();
            return;
        }
        final int i = pi9Var.x3;
        final int i2 = pi9Var.y3;
        final int i3 = pi9Var.z3;
        pi9Var.x3 = -1;
        pi9Var.y3 = -1;
        pi9Var.z3 = 0;
        boolean z2 = pi9Var.A3;
        final float f = pi9Var.B3;
        final float f2 = pi9Var.C3;
        pi9Var.A3 = false;
        pi9Var.setEditTextsLocked(false);
        pi9Var.S2();
        if (z2) {
            pi9Var.post(new Runnable() {
                @Override
                public final void run() {
                    pi9 pi9Var2 = fi9.this.b;
                    for (int i4 = 0; i4 < pi9Var2.getChildCount(); i4++) {
                        View childAt = pi9Var2.getChildAt(i4);
                        boolean z3 = childAt instanceof km9;
                        float f3 = f;
                        float f4 = f2;
                        if (z3) {
                            km9 km9Var = (km9) childAt;
                            if (!pi9.i4(km9Var.getEditText(), f3, f4)) {
                                if (km9Var.l() && pi9.i4(km9Var.getAuthorEditText(), f3, f4)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof jf9) {
                            if (pi9.i4(((jf9) childAt).getCaptionEditText(), f3, f4)) {
                                return;
                            }
                        } else if ((childAt instanceof rf9) && pi9.i4(((rf9) childAt).getEditText(), f3, f4)) {
                            return;
                        }
                    }
                    int i5 = i;
                    if (i5 >= 0) {
                        pi9Var2.z4(i5, i3, i2);
                    }
                }
            });
        } else if (i >= 0) {
            pi9Var.post(new hl2(this, i, i3, i2, (byte) 3));
        } else {
            View findFocus = pi9Var.findFocus();
            if (findFocus instanceof dg9) {
                pi9Var.post(new yf9((dg9) findFocus, (byte) 2));
            }
        }
    }
}
