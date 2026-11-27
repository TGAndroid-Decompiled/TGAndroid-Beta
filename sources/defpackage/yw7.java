package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class yw7 extends pa9 {
    public final vab F;

    public yw7(vab vabVar, Context context, nx7 nx7Var, Bitmap bitmap, Bitmap bitmap2, tl0 tl0Var) {
        super(context, nx7Var, bitmap, bitmap2, tl0Var);
        this.F = vabVar;
    }

    @Override
    public final void g(v01 v01Var) {
        int indexOf = v01.a.indexOf(v01Var);
        int i = indexOf + 1;
        if (i <= 1) {
            indexOf = i;
        }
        vab vabVar = this.F;
        vabVar.U0.b(indexOf);
        vabVar.s(v01Var);
    }
}
