package jg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.cr0;
public final class j0 extends ig.c1 {
    public final Bitmap E;
    public final cr0 F;

    public j0(cr0 cr0Var, Context context, ig.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = cr0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(ig.h hVar) {
        int indexOf = ig.h.f8316a.indexOf(hVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        cr0 cr0Var = this.F;
        cr0Var.f10166c1.b(indexOf);
        cr0Var.z(hVar);
    }
}
