package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class ev7 extends j79 {
    public final Context c;
    public final gv7 d;

    public ev7(gv7 gv7Var, Context context) {
        this.d = gv7Var;
        this.c = context;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        float f;
        fv7 fv7Var = (fv7) f89Var.a;
        ViewGroup.LayoutParams layoutParams = fv7Var.getLayoutParams();
        gv7 gv7Var = this.d;
        layoutParams.height = ((gv7Var.getHeight() - gv7Var.getPaddingTop()) - gv7Var.getPaddingBottom()) / 2;
        a78 a78Var = gv7Var.i3;
        if (a78Var != null) {
            fv7Var.a = a78Var.b(i);
            fv7Var.invalidate();
            if (gv7Var.h3 == i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fv7Var.b = f;
            fv7Var.invalidate();
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        return new f89(new fv7(this.d, this.c));
    }
}
