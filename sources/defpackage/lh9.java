package defpackage;

import android.view.View;
public final class lh9 implements Runnable {
    public final byte a;
    public final pi9 b;
    public final mk0 c;
    public final int d;

    public lh9(pi9 pi9Var, mk0 mk0Var, int i, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = mk0Var;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = null;
        int i = this.d;
        mk0 mk0Var = this.c;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                if (mk0Var != null) {
                    view = pi9Var.D1(mk0Var);
                }
                if (view instanceof km9) {
                    km9 km9Var = (km9) view;
                    km9Var.A();
                    km9Var.getEditText().setSelection(Math.min(i, km9Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                if (mk0Var != null) {
                    view = pi9Var.D1(mk0Var);
                }
                if (view instanceof km9) {
                    km9 km9Var2 = (km9) view;
                    km9Var2.A();
                    km9Var2.getEditText().setSelection(Math.min(i, km9Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View D1 = pi9Var.D1(mk0Var);
                if (D1 instanceof km9) {
                    km9 km9Var3 = (km9) D1;
                    km9Var3.A();
                    km9Var3.getEditText().setSelection(Math.max(0, Math.min(i, km9Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View D12 = pi9Var.D1(mk0Var);
                if (D12 instanceof km9) {
                    km9 km9Var4 = (km9) D12;
                    km9Var4.A();
                    km9Var4.getEditText().setSelection(Math.max(0, Math.min(i, km9Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View D13 = pi9Var.D1(mk0Var);
                if (D13 instanceof km9) {
                    km9 km9Var5 = (km9) D13;
                    km9Var5.A();
                    km9Var5.getEditText().setSelection(Math.max(0, Math.min(i, km9Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View D14 = pi9Var.D1(mk0Var);
                if (D14 instanceof km9) {
                    km9 km9Var6 = (km9) D14;
                    km9Var6.A();
                    km9Var6.getEditText().setSelection(Math.max(0, Math.min(i, km9Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
