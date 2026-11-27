package defpackage;

import android.view.View;
public final class jh9 implements Runnable {
    public final byte a;
    public final pi9 b;
    public final mk0 c;

    public jh9(pi9 pi9Var, mk0 mk0Var, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = mk0Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        mk0 mk0Var = this.c;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                pi9Var.a3(mk0Var);
                return;
            case 1:
                View D1 = pi9Var.D1(mk0Var);
                if (D1 instanceof km9) {
                    km9 km9Var = (km9) D1;
                    km9Var.A();
                    km9Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                pi9Var.a3(mk0Var);
                return;
            case 3:
                pi9Var.Z2(mk0Var, true);
                return;
            case 4:
                pi9Var.Z2(mk0Var, false);
                return;
            case 5:
                pi9Var.Z2(mk0Var, true);
                return;
            case 6:
                pi9Var.a3(mk0Var);
                return;
            case 7:
                pi9Var.Y2(mk0Var, false);
                return;
            case 8:
                pi9Var.Y2(mk0Var, true);
                return;
            case 9:
                pi9Var.Y2(mk0Var, true);
                return;
            case 10:
                pi9Var.a3(mk0Var);
                return;
            case 11:
                pi9Var.Z2(mk0Var, false);
                return;
            case 12:
                pi9Var.Y2(mk0Var, true);
                return;
            case 13:
                View D12 = pi9Var.D1(mk0Var);
                if (D12 instanceof zlb) {
                    pi9Var.v3.a0(0, 0, (zlb) D12);
                    return;
                }
                return;
            case 14:
                View D13 = pi9Var.D1(mk0Var);
                if (D13 instanceof zlb) {
                    if (D13 instanceof km9) {
                        i = ((km9) D13).getEditText().length();
                    } else {
                        i = 0;
                    }
                    pi9Var.v3.a0(0, i, (zlb) D13);
                    return;
                }
                return;
            case 15:
                pi9Var.c3(mk0Var);
                return;
            case 16:
                pi9Var.a3(mk0Var);
                return;
            case 17:
                View D14 = pi9Var.D1(mk0Var);
                if (D14 instanceof km9) {
                    km9 km9Var2 = (km9) D14;
                    km9Var2.A();
                    km9Var2.getEditText().setSelection(km9Var2.getEditText().length());
                    return;
                } else if (D14 instanceof xl9) {
                    xl9 xl9Var = (xl9) D14;
                    if (xl9Var.getGrid().getChildCount() > 0) {
                        View childAt = xl9Var.getGrid().getChildAt(0);
                        if (childAt instanceof am9) {
                            ((am9) childAt).a.O();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 18:
                pi9Var.b3(mk0Var);
                return;
            case 19:
                View D15 = pi9Var.D1(mk0Var);
                if (D15 instanceof rf9) {
                    ((rf9) D15).d.O();
                    return;
                }
                return;
            case 20:
                pi9Var.b3(mk0Var);
                return;
            case 21:
                View D16 = pi9Var.D1(mk0Var);
                if (D16 instanceof km9) {
                    km9 km9Var3 = (km9) D16;
                    km9Var3.A();
                    km9Var3.getEditText().setSelection(0);
                    return;
                }
                return;
            case 22:
                pi9Var.e5(mk0Var, "");
                return;
            case 23:
                pi9Var.b3(mk0Var);
                return;
            case 24:
                View D17 = pi9Var.D1(mk0Var);
                if (D17 instanceof km9) {
                    km9 km9Var4 = (km9) D17;
                    km9Var4.A();
                    km9Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 25:
                pi9Var.a3(mk0Var);
                return;
            case 26:
                pi9Var.a3(mk0Var);
                return;
            case 27:
                pi9Var.a3(mk0Var);
                return;
            case 28:
                pi9Var.a3(mk0Var);
                return;
            default:
                pi9Var.a3(mk0Var);
                return;
        }
    }
}
