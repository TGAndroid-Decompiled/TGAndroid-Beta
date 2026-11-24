package defpackage;

import android.view.View;
public final class oe9 extends ive {
    public final we9 a;
    public final ye9 b;

    public oe9(ye9 ye9Var, we9 we9Var) {
        this.b = ye9Var;
        this.a = we9Var;
    }

    @Override
    public final void a(boolean z) {
        this.a.e();
        ye9 ye9Var = this.b;
        if (z) {
            me9 me9Var = ye9Var.v3;
            ye9Var.x3 = me9Var.B0;
            ye9Var.y3 = me9Var.C0;
            ye9Var.z3 = me9Var.D0;
            ye9Var.setEditTextsLocked(true);
            ye9Var.j3();
            ye9Var.R2();
            return;
        }
        final int i = ye9Var.x3;
        final int i2 = ye9Var.y3;
        final int i3 = ye9Var.z3;
        ye9Var.x3 = -1;
        ye9Var.y3 = -1;
        ye9Var.z3 = 0;
        boolean z2 = ye9Var.A3;
        final float f = ye9Var.B3;
        final float f2 = ye9Var.C3;
        ye9Var.A3 = false;
        ye9Var.setEditTextsLocked(false);
        ye9Var.R2();
        if (z2) {
            ye9Var.post(new Runnable() {
                @Override
                public final void run() {
                    ye9 ye9Var2 = oe9.this.b;
                    for (int i4 = 0; i4 < ye9Var2.getChildCount(); i4++) {
                        View childAt = ye9Var2.getChildAt(i4);
                        boolean z3 = childAt instanceof wi9;
                        float f3 = f;
                        float f4 = f2;
                        if (z3) {
                            wi9 wi9Var = (wi9) childAt;
                            if (!ye9.h4(wi9Var.getEditText(), f3, f4)) {
                                if (wi9Var.l() && ye9.h4(wi9Var.getAuthorEditText(), f3, f4)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof tb9) {
                            if (ye9.h4(((tb9) childAt).getCaptionEditText(), f3, f4)) {
                                return;
                            }
                        } else if ((childAt instanceof ac9) && ye9.h4(((ac9) childAt).getEditText(), f3, f4)) {
                            return;
                        }
                    }
                    int i5 = i;
                    if (i5 >= 0) {
                        ye9Var2.y4(i5, i3, i2);
                    }
                }
            });
        } else if (i >= 0) {
            ye9Var.post(new nk2(this, i, i3, i2, (byte) 3));
        } else {
            View findFocus = ye9Var.findFocus();
            if (findFocus instanceof mc9) {
                ye9Var.post(new hc9((mc9) findFocus, (byte) 2));
            }
        }
    }
}
