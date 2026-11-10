package di;

import android.content.Context;
import android.graphics.Bitmap;
public final class f3 extends u8 {
    public final q9 H;
    public final j4 I;

    public f3(j4 j4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.h6 h6Var, q9 q9Var) {
        super(context, j3Var, h6Var);
        this.I = j4Var;
        this.H = q9Var;
    }

    @Override
    public final void b(boolean z9) {
        c4 c4Var = this.I.f9258z1;
        if (c4Var != null) {
            q9 q9Var = ((h9) c4Var).d;
            q9Var.f9619h1 = z9;
            q9Var.V();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
