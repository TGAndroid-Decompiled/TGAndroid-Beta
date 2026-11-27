package defpackage;

import android.view.View;
public final class d55 implements View.OnClickListener {
    public final byte a;
    public final n55 b;

    public d55(n55 n55Var, byte b) {
        this.a = b;
        this.b = n55Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        n55 n55Var = this.b;
        switch (b) {
            case 0:
                if (!n55Var.a() && !n55Var.d) {
                    n55Var.d = false;
                    if (!n55Var.f) {
                        n55Var.f = true;
                        n55Var.b.c();
                    }
                    if (!n55Var.e) {
                        n55Var.a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!n55Var.a() && !n55Var.d) {
                    n55Var.d = false;
                    if (!n55Var.f) {
                        n55Var.f = true;
                        n55Var.b.c();
                    }
                    if (!n55Var.e) {
                        n55Var.a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
