package defpackage;

import android.view.View;
public final class y45 implements View.OnClickListener {
    public final byte a;
    public final j55 b;

    public y45(j55 j55Var, byte b) {
        this.a = b;
        this.b = j55Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        j55 j55Var = this.b;
        switch (b) {
            case 0:
                if (!j55Var.a() && !j55Var.d) {
                    j55Var.d = false;
                    if (!j55Var.f) {
                        j55Var.f = true;
                        j55Var.b.c();
                    }
                    if (!j55Var.e) {
                        j55Var.a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!j55Var.a() && !j55Var.d) {
                    j55Var.d = false;
                    if (!j55Var.f) {
                        j55Var.f = true;
                        j55Var.b.c();
                    }
                    if (!j55Var.e) {
                        j55Var.a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
