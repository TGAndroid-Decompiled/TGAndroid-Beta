package defpackage;

import android.view.View;
public final class f5a implements View.OnClickListener {
    public final n5a a;

    public f5a(n5a n5aVar) {
        this.a = n5aVar;
    }

    @Override
    public final void onClick(View view) {
        ry8 ry8Var = this.a.n1;
        if (!ry8Var.b() && ry8Var.getAnimatedDrawable() != null) {
            ry8Var.getAnimatedDrawable().H(40);
            ry8Var.d();
        }
    }
}
