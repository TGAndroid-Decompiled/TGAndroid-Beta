package lh;

import android.content.Context;
import android.graphics.Bitmap;
public final class e3 extends m8 {
    public final i9 D;
    public final d4 E;

    public e3(d4 d4Var, Context context, h3 h3Var, org.telegram.ui.ActionBar.c6 c6Var, i9 i9Var) {
        super(context, h3Var, c6Var);
        this.E = d4Var;
        this.D = i9Var;
    }

    @Override
    public final void b(boolean z10) {
        x3 x3Var = this.E.M1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
            i9Var.f15755e1 = z10;
            i9Var.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.E.getPlayingBitmap();
    }
}
