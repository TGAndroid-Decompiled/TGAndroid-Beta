package ci;

import android.content.Context;
import android.graphics.Bitmap;
public final class m3 extends d9 {
    public final z9 H;
    public final p4 I;

    public m3(p4 p4Var, Context context, q3 q3Var, org.telegram.ui.ActionBar.d6 d6Var, z9 z9Var) {
        super(context, q3Var, d6Var);
        this.I = p4Var;
        this.H = z9Var;
    }

    @Override
    public final void b(boolean z10) {
        i4 i4Var = this.I.Q1;
        if (i4Var != null) {
            z9 z9Var = ((q9) i4Var).d;
            z9Var.f6230i1 = z10;
            z9Var.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
