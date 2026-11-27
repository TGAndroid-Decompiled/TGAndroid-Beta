package defpackage;

import android.view.View;
public final class th9 implements Runnable {
    public final byte a;
    public final pi9 b;
    public final mk0 c;

    public th9(pi9 pi9Var, mk0 mk0Var, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = mk0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mk0 mk0Var = this.c;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                View D1 = pi9Var.D1(mk0Var);
                if (D1 instanceof km9) {
                    km9 km9Var = (km9) D1;
                    km9Var.A();
                    km9Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                pi9Var.a3(mk0Var);
                return;
            case 2:
                pi9Var.a3(mk0Var);
                return;
            case 3:
                pi9Var.b3(mk0Var);
                return;
            case 4:
                pi9Var.a3(mk0Var);
                return;
            default:
                pi9Var.a3(mk0Var);
                return;
        }
    }
}
