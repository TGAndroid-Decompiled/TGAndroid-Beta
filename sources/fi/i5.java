package fi;

import android.content.Context;
import android.graphics.Bitmap;
public final class i5 extends sg.w0 {
    public final x9 E;

    public i5(x9 x9Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.y9 y9Var) {
        super(context, j0Var, bitmap, bitmap2, y9Var);
        this.E = x9Var;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f54968a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        x9 x9Var = this.E;
        x9Var.T0.b(indexOf);
        x9Var.w(hVar);
    }
}
