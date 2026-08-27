package jh;

import android.content.Context;
import android.graphics.Bitmap;

public final class f3 extends m8 {
    public final i9 D;
    public final e4 E;

    public f3(e4 e4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.c6 c6Var, i9 i9Var) {
        super(context, j3Var, c6Var);
        this.E = e4Var;
        this.D = i9Var;
    }

    @Override
    public final void b(boolean z10) {
        y3 y3Var = this.E.M1;
        if (y3Var != null) {
            i9 i9Var = ((z8) y3Var).d;
            i9Var.f13477e1 = z10;
            i9Var.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.E.getPlayingBitmap();
    }
}
