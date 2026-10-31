package jg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.er0;
public final class j0 extends ig.c1 {
    public final Bitmap E;
    public final er0 F;

    public j0(er0 er0Var, Context context, ig.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = er0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(ig.h hVar) {
        int indexOf = ig.h.f8315a.indexOf(hVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        er0 er0Var = this.F;
        er0Var.f10165c1.b(indexOf);
        er0Var.z(hVar);
    }
}
