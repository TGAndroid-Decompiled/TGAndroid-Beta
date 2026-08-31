package oh;

import android.content.Context;
import android.graphics.Bitmap;
public final class g3 extends m8 {
    public final i9 E;
    public final f4 F;

    public g3(f4 f4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.g6 g6Var, i9 i9Var) {
        super(context, j3Var, g6Var);
        this.F = f4Var;
        this.E = i9Var;
    }

    @Override
    public final void b(boolean z4) {
        z3 z3Var = this.F.N1;
        if (z3Var != null) {
            i9 i9Var = ((z8) z3Var).d;
            i9Var.f17268f1 = z4;
            i9Var.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.F.getPlayingBitmap();
    }
}
