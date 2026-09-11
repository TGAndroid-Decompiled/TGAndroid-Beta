package bi;

import android.content.Context;
import android.graphics.Bitmap;
public final class h4 extends ta {
    public final pb H;
    public final o5 I;

    public h4(o5 o5Var, Context context, l4 l4Var, org.telegram.ui.ActionBar.f6 f6Var, pb pbVar) {
        super(context, l4Var, f6Var);
        this.I = o5Var;
        this.H = pbVar;
    }

    @Override
    public final void b(boolean z10) {
        h5 h5Var = this.I.Q1;
        if (h5Var != null) {
            pb pbVar = ((gb) h5Var).d;
            pbVar.f3553i1 = z10;
            pbVar.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
