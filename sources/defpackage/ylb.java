package defpackage;

import android.view.Menu;
public final class ylb implements ez5, dz5 {
    public final ut3 a;
    public final Menu b;

    public ylb(ut3 ut3Var, Menu menu) {
        this.a = ut3Var;
        this.b = menu;
    }

    @Override
    public final void a(String str) {
        ut3 ut3Var = this.a;
        ut3Var.b = str;
        ut3Var.b(this.b);
    }

    @Override
    public final void l(Exception exc) {
        cc4.d("mlkit: failed to detect language in selection");
        cc4.g(exc, true);
        ut3 ut3Var = this.a;
        ut3Var.b = null;
        ut3Var.b(this.b);
    }
}
