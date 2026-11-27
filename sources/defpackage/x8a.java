package defpackage;

import android.view.View;
public final class x8a implements View.OnClickListener {
    public final f9a a;

    public x8a(f9a f9aVar) {
        this.a = f9aVar;
    }

    @Override
    public final void onClick(View view) {
        e29 e29Var = this.a.n1;
        if (!e29Var.b() && e29Var.getAnimatedDrawable() != null) {
            e29Var.getAnimatedDrawable().H(40);
            e29Var.d();
        }
    }
}
