package defpackage;

import android.view.View;
public final class sg9 extends kxe {
    public final ah9 a;
    public final ch9 b;

    public sg9(ch9 ch9Var, ah9 ah9Var) {
        this.b = ch9Var;
        this.a = ah9Var;
    }

    @Override
    public final void a(boolean z) {
        this.a.e();
        ch9 ch9Var = this.b;
        if (z) {
            qg9 qg9Var = ch9Var.v3;
            ch9Var.x3 = qg9Var.B0;
            ch9Var.y3 = qg9Var.C0;
            ch9Var.z3 = qg9Var.D0;
            ch9Var.setEditTextsLocked(true);
            ch9Var.j3();
            ch9Var.R2();
            return;
        }
        final int i = ch9Var.x3;
        final int i2 = ch9Var.y3;
        final int i3 = ch9Var.z3;
        ch9Var.x3 = -1;
        ch9Var.y3 = -1;
        ch9Var.z3 = 0;
        boolean z2 = ch9Var.A3;
        final float f = ch9Var.B3;
        final float f2 = ch9Var.C3;
        ch9Var.A3 = false;
        ch9Var.setEditTextsLocked(false);
        ch9Var.R2();
        if (z2) {
            ch9Var.post(new Runnable() {
                @Override
                public final void run() {
                    ch9 ch9Var2 = sg9.this.b;
                    for (int i4 = 0; i4 < ch9Var2.getChildCount(); i4++) {
                        View childAt = ch9Var2.getChildAt(i4);
                        boolean z3 = childAt instanceof xk9;
                        float f3 = f;
                        float f4 = f2;
                        if (z3) {
                            xk9 xk9Var = (xk9) childAt;
                            if (!ch9.h4(xk9Var.getEditText(), f3, f4)) {
                                if (xk9Var.l() && ch9.h4(xk9Var.getAuthorEditText(), f3, f4)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof td9) {
                            if (ch9.h4(((td9) childAt).getCaptionEditText(), f3, f4)) {
                                return;
                            }
                        } else if ((childAt instanceof be9) && ch9.h4(((be9) childAt).getEditText(), f3, f4)) {
                            return;
                        }
                    }
                    int i5 = i;
                    if (i5 >= 0) {
                        ch9Var2.y4(i5, i3, i2);
                    }
                }
            });
        } else if (i >= 0) {
            ch9Var.post(new zl2(this, i, i3, i2, (byte) 3));
        } else {
            View findFocus = ch9Var.findFocus();
            if (findFocus instanceof ne9) {
                ch9Var.post(new ie9((ne9) findFocus, (byte) 2));
            }
        }
    }
}
