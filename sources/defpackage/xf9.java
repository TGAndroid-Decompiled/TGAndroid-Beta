package defpackage;

import android.view.View;
public final class xf9 implements Runnable {
    public final byte a;
    public final ch9 b;
    public final ll0 c;
    public final int d;

    public xf9(ch9 ch9Var, ll0 ll0Var, int i, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = ll0Var;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = null;
        int i = this.d;
        ll0 ll0Var = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                if (ll0Var != null) {
                    view = ch9Var.C1(ll0Var);
                }
                if (view instanceof xk9) {
                    xk9 xk9Var = (xk9) view;
                    xk9Var.A();
                    xk9Var.getEditText().setSelection(Math.min(i, xk9Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                if (ll0Var != null) {
                    view = ch9Var.C1(ll0Var);
                }
                if (view instanceof xk9) {
                    xk9 xk9Var2 = (xk9) view;
                    xk9Var2.A();
                    xk9Var2.getEditText().setSelection(Math.min(i, xk9Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View C1 = ch9Var.C1(ll0Var);
                if (C1 instanceof xk9) {
                    xk9 xk9Var3 = (xk9) C1;
                    xk9Var3.A();
                    xk9Var3.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View C12 = ch9Var.C1(ll0Var);
                if (C12 instanceof xk9) {
                    xk9 xk9Var4 = (xk9) C12;
                    xk9Var4.A();
                    xk9Var4.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View C13 = ch9Var.C1(ll0Var);
                if (C13 instanceof xk9) {
                    xk9 xk9Var5 = (xk9) C13;
                    xk9Var5.A();
                    xk9Var5.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View C14 = ch9Var.C1(ll0Var);
                if (C14 instanceof xk9) {
                    xk9 xk9Var6 = (xk9) C14;
                    xk9Var6.A();
                    xk9Var6.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
