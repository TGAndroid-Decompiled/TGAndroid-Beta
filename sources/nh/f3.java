package nh;

import android.content.Context;
import android.graphics.Bitmap;
public final class f3 extends m8 {
    public final i9 E;
    public final d4 F;

    public f3(d4 d4Var, Context context, i3 i3Var, org.telegram.ui.ActionBar.f6 f6Var, i9 i9Var) {
        super(context, i3Var, f6Var);
        this.F = d4Var;
        this.E = i9Var;
    }

    @Override
    public final void b(boolean z4) {
        x3 x3Var = this.F.N1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
            i9Var.f15463f1 = z4;
            i9Var.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.F.getPlayingBitmap();
    }
}
