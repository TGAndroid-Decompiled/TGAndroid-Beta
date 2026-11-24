package defpackage;

import android.view.View;
public final class y25 implements View.OnClickListener {
    public final byte a;
    public final j35 b;

    public y25(j35 j35Var, byte b) {
        this.a = b;
        this.b = j35Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        j35 j35Var = this.b;
        switch (b) {
            case 0:
                if (!j35Var.a() && !j35Var.d) {
                    j35Var.d = false;
                    if (!j35Var.f) {
                        j35Var.f = true;
                        j35Var.b.c();
                    }
                    if (!j35Var.e) {
                        j35Var.a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!j35Var.a() && !j35Var.d) {
                    j35Var.d = false;
                    if (!j35Var.f) {
                        j35Var.f = true;
                        j35Var.b.c();
                    }
                    if (!j35Var.e) {
                        j35Var.a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
