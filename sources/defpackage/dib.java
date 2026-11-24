package defpackage;

import android.view.Menu;
public final class dib implements zw5, yw5 {
    public final dt3 a;
    public final Menu b;

    public dib(dt3 dt3Var, Menu menu) {
        this.a = dt3Var;
        this.b = menu;
    }

    @Override
    public final void a(String str) {
        dt3 dt3Var = this.a;
        dt3Var.b = str;
        dt3Var.b(this.b);
    }

    @Override
    public final void n(Exception exc) {
        fa4.d("mlkit: failed to detect language in selection");
        fa4.g(exc, true);
        dt3 dt3Var = this.a;
        dt3Var.b = null;
        dt3Var.b(this.b);
    }
}
