package defpackage;

import android.view.Menu;
public final class ekb implements zy5, yy5 {
    public final nu3 a;
    public final Menu b;

    public ekb(nu3 nu3Var, Menu menu) {
        this.a = nu3Var;
        this.b = menu;
    }

    @Override
    public final void a(String str) {
        nu3 nu3Var = this.a;
        nu3Var.b = str;
        nu3Var.b(this.b);
    }

    @Override
    public final void o(Exception exc) {
        fc4.d("mlkit: failed to detect language in selection");
        fc4.g(exc, true);
        nu3 nu3Var = this.a;
        nu3Var.b = null;
        nu3Var.b(this.b);
    }
}
