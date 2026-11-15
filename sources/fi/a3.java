package fi;

import android.content.Context;
import android.graphics.Bitmap;
public final class a3 extends m8 {
    public final i9 I;
    public final b4 J;

    public a3(b4 b4Var, Context context, e3 e3Var, org.telegram.ui.ActionBar.e6 e6Var, i9 i9Var) {
        super(context, e3Var, e6Var);
        this.J = b4Var;
        this.I = i9Var;
    }

    @Override
    public final void b(boolean z10) {
        u3 u3Var = this.J.A1;
        if (u3Var != null) {
            i9 i9Var = ((z8) u3Var).d;
            i9Var.f11852i1 = z10;
            i9Var.V();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
