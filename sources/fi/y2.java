package fi;

import android.content.Context;
import android.graphics.Bitmap;
public final class y2 extends j8 {
    public final f9 I;
    public final z3 J;

    public y2(z3 z3Var, Context context, c3 c3Var, org.telegram.ui.ActionBar.h6 h6Var, f9 f9Var) {
        super(context, c3Var, h6Var);
        this.J = z3Var;
        this.I = f9Var;
    }

    @Override
    public final void b(boolean z10) {
        s3 s3Var = this.J.A1;
        if (s3Var != null) {
            f9 f9Var = ((w8) s3Var).d;
            f9Var.f12018i1 = z10;
            f9Var.V();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
