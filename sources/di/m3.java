package di;

import android.content.Context;
import android.graphics.Bitmap;
public final class m3 extends c9 {
    public final y9 H;
    public final q4 I;

    public m3(q4 q4Var, Context context, q3 q3Var, org.telegram.ui.ActionBar.u6 u6Var, y9 y9Var) {
        super(context, q3Var, u6Var);
        this.I = q4Var;
        this.H = y9Var;
    }

    @Override
    public final void b(boolean z10) {
        j4 j4Var = this.I.F1;
        if (j4Var != null) {
            y9 y9Var = ((p9) j4Var).d;
            y9Var.f9436i1 = z10;
            y9Var.Q();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
