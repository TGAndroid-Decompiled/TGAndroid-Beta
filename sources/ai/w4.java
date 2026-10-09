package ai;

import android.content.Context;
import android.graphics.Bitmap;
public final class w4 extends nb {
    public final kc H;
    public final f6 I;

    public w4(f6 f6Var, Context context, b5 b5Var, org.telegram.ui.ActionBar.e6 e6Var, kc kcVar) {
        super(context, b5Var, e6Var);
        this.I = f6Var;
        this.H = kcVar;
    }

    @Override
    public final void b(boolean z10) {
        y5 y5Var = this.I.Q1;
        if (y5Var != null) {
            kc kcVar = ((bc) y5Var).d;
            kcVar.f1275i1 = z10;
            kcVar.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
