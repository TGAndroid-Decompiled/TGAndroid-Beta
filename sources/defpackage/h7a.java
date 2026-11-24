package defpackage;

import android.view.View;
public final class h7a implements View.OnClickListener {
    public final p7a a;

    public h7a(p7a p7aVar) {
        this.a = p7aVar;
    }

    @Override
    public final void onClick(View view) {
        s09 s09Var = this.a.n1;
        if (!s09Var.b() && s09Var.getAnimatedDrawable() != null) {
            s09Var.getAnimatedDrawable().H(40);
            s09Var.d();
        }
    }
}
