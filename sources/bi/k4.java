package bi;

import android.content.Context;
import android.graphics.Bitmap;
public final class k4 extends wa {
    public final sb H;
    public final q5 I;

    public k4(q5 q5Var, Context context, o4 o4Var, org.telegram.ui.ActionBar.c6 c6Var, sb sbVar) {
        super(context, o4Var, c6Var);
        this.I = q5Var;
        this.H = sbVar;
    }

    @Override
    public final void b(boolean z10) {
        j5 j5Var = this.I.Q1;
        if (j5Var != null) {
            sb sbVar = ((jb) j5Var).d;
            sbVar.f3681i1 = z10;
            sbVar.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
