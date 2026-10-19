package ci;

import android.content.Context;
import android.graphics.Bitmap;
public final class n3 extends e9 {
    public final aa H;
    public final q4 I;

    public n3(q4 q4Var, Context context, r3 r3Var, org.telegram.ui.ActionBar.d6 d6Var, aa aaVar) {
        super(context, r3Var, d6Var);
        this.I = q4Var;
        this.H = aaVar;
    }

    @Override
    public final void b(boolean z10) {
        j4 j4Var = this.I.Q1;
        if (j4Var != null) {
            aa aaVar = ((r9) j4Var).d;
            aaVar.f5197i1 = z10;
            aaVar.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
