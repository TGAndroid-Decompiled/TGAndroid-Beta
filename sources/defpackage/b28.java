package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class b28 extends w4b {
    public final m8b I;
    public final y28 J;

    public b28(y28 y28Var, Context context, d28 d28Var, f53 f53Var, m8b m8bVar) {
        super(context, d28Var, f53Var);
        this.J = y28Var;
        this.I = m8bVar;
    }

    @Override
    public final void b(boolean z) {
        t28 t28Var = this.J.G1;
        if (t28Var != null) {
            m8b m8bVar = ((d8b) t28Var).d;
            m8bVar.i1 = z;
            m8bVar.U();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
