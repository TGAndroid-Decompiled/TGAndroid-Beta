package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
public final class e48 extends x6b {
    public final oab I;
    public final a58 J;

    public e48(a58 a58Var, Context context, g48 g48Var, r63 r63Var, oab oabVar) {
        super(context, g48Var, r63Var);
        this.J = a58Var;
        this.I = oabVar;
    }

    @Override
    public final void b(boolean z) {
        w48 w48Var = this.J.G1;
        if (w48Var != null) {
            oab oabVar = ((fab) w48Var).d;
            oabVar.i1 = z;
            oabVar.U();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
