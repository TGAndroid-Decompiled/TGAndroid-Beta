package defpackage;

import android.view.View;
public final class gg9 implements Runnable {
    public final byte a;
    public final ch9 b;
    public final ll0 c;

    public gg9(ch9 ch9Var, ll0 ll0Var, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = ll0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ll0 ll0Var = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                View C1 = ch9Var.C1(ll0Var);
                if (C1 instanceof xk9) {
                    xk9 xk9Var = (xk9) C1;
                    xk9Var.A();
                    xk9Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                ch9Var.Z2(ll0Var);
                return;
            case 2:
                ch9Var.Z2(ll0Var);
                return;
            case 3:
                ch9Var.a3(ll0Var);
                return;
            case 4:
                ch9Var.Z2(ll0Var);
                return;
            default:
                ch9Var.Z2(ll0Var);
                return;
        }
    }
}
