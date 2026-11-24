package defpackage;

import android.view.View;
public final class vf9 implements Runnable {
    public final byte a;
    public final ch9 b;
    public final ll0 c;

    public vf9(ch9 ch9Var, ll0 ll0Var, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = ll0Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        ll0 ll0Var = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                ch9Var.Z2(ll0Var);
                return;
            case 1:
                View C1 = ch9Var.C1(ll0Var);
                if (C1 instanceof xk9) {
                    xk9 xk9Var = (xk9) C1;
                    xk9Var.A();
                    xk9Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                ch9Var.Z2(ll0Var);
                return;
            case 3:
                ch9Var.Y2(ll0Var, true);
                return;
            case 4:
                ch9Var.Y2(ll0Var, false);
                return;
            case 5:
                ch9Var.Y2(ll0Var, true);
                return;
            case 6:
                ch9Var.Z2(ll0Var);
                return;
            case 7:
                ch9Var.X2(ll0Var, false);
                return;
            case 8:
                ch9Var.X2(ll0Var, true);
                return;
            case 9:
                ch9Var.Z2(ll0Var);
                return;
            case 10:
                ch9Var.X2(ll0Var, true);
                return;
            case 11:
                ch9Var.Z2(ll0Var);
                return;
            case 12:
                ch9Var.Y2(ll0Var, false);
                return;
            case 13:
                ch9Var.X2(ll0Var, true);
                return;
            case 14:
                View C12 = ch9Var.C1(ll0Var);
                if (C12 instanceof fkb) {
                    ch9Var.v3.a0(0, 0, (fkb) C12);
                    return;
                }
                return;
            case 15:
                View C13 = ch9Var.C1(ll0Var);
                if (C13 instanceof fkb) {
                    if (C13 instanceof xk9) {
                        i = ((xk9) C13).getEditText().length();
                    } else {
                        i = 0;
                    }
                    ch9Var.v3.a0(0, i, (fkb) C13);
                    return;
                }
                return;
            case 16:
                ch9Var.b3(ll0Var);
                return;
            case 17:
                View C14 = ch9Var.C1(ll0Var);
                if (C14 instanceof xk9) {
                    xk9 xk9Var2 = (xk9) C14;
                    xk9Var2.A();
                    xk9Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View C15 = ch9Var.C1(ll0Var);
                if (C15 instanceof xk9) {
                    xk9 xk9Var3 = (xk9) C15;
                    xk9Var3.A();
                    xk9Var3.getEditText().setSelection(xk9Var3.getEditText().length());
                    return;
                } else if (C15 instanceof kk9) {
                    kk9 kk9Var = (kk9) C15;
                    if (kk9Var.getGrid().getChildCount() > 0) {
                        View childAt = kk9Var.getGrid().getChildAt(0);
                        if (childAt instanceof nk9) {
                            ((nk9) childAt).a.O();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                ch9Var.a3(ll0Var);
                return;
            case 20:
                View C16 = ch9Var.C1(ll0Var);
                if (C16 instanceof be9) {
                    ((be9) C16).d.O();
                    return;
                }
                return;
            case 21:
                ch9Var.a3(ll0Var);
                return;
            case 22:
                ch9Var.a3(ll0Var);
                return;
            case 23:
                View C17 = ch9Var.C1(ll0Var);
                if (C17 instanceof xk9) {
                    xk9 xk9Var4 = (xk9) C17;
                    xk9Var4.A();
                    xk9Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                ch9Var.Z2(ll0Var);
                return;
            case 25:
                ch9Var.d5(ll0Var, "");
                return;
            case 26:
                ch9Var.Z2(ll0Var);
                return;
            case 27:
                ch9Var.Z2(ll0Var);
                return;
            case 28:
                ch9Var.Z2(ll0Var);
                return;
            default:
                ch9Var.Z2(ll0Var);
                return;
        }
    }
}
