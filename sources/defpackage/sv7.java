package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class sv7 extends e99 {
    public final z8b F;

    public sv7(z8b z8bVar, Context context, hw7 hw7Var, Bitmap bitmap, Bitmap bitmap2, sm0 sm0Var) {
        super(context, hw7Var, bitmap, bitmap2, sm0Var);
        this.F = z8bVar;
    }

    @Override
    public final void g(u11 u11Var) {
        int indexOf = u11.a.indexOf(u11Var);
        int i = indexOf + 1;
        if (i <= 1) {
            indexOf = i;
        }
        z8b z8bVar = this.F;
        z8bVar.a1.b(indexOf);
        z8bVar.s(u11Var);
    }
}
