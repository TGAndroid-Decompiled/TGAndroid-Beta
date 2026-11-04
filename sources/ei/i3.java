package ei;

import android.content.Context;
import android.graphics.Bitmap;
public final class i3 extends t8 {
    public final r9 I;
    public final j4 J;

    public i3(j4 j4Var, Context context, m3 m3Var, org.telegram.ui.ActionBar.e6 e6Var, r9 r9Var) {
        super(context, m3Var, e6Var);
        this.J = j4Var;
        this.I = r9Var;
    }

    @Override
    public final void b(boolean z10) {
        c4 c4Var = this.J.A1;
        if (c4Var != null) {
            r9 r9Var = ((i9) c4Var).d;
            r9Var.f10932j1 = z10;
            r9Var.d0();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
