package defpackage;

import android.view.ViewGroup;
public final class dq3 implements Runnable {
    public final byte a;
    public final eq3 b;

    public dq3(eq3 eq3Var, byte b) {
        this.a = b;
        this.b = eq3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eq3 eq3Var = this.b;
        switch (b) {
            case 0:
                if (eq3Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) eq3Var.getParent()).removeView(eq3Var);
                    return;
                }
                return;
            default:
                eq3Var.a();
                return;
        }
    }
}
