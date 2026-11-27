package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class r58 extends v8b {
    public final lcb I;
    public final o68 J;

    public r58(o68 o68Var, Context context, t58 t58Var, x53 x53Var, lcb lcbVar) {
        super(context, t58Var, x53Var);
        this.J = o68Var;
        this.I = lcbVar;
    }

    @Override
    public final void b(boolean z) {
        k68 k68Var = this.J.A1;
        if (k68Var != null) {
            lcb lcbVar = ((ccb) k68Var).d;
            lcbVar.i1 = z;
            lcbVar.U();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
