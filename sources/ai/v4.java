package ai;

import android.content.Context;
import android.graphics.Bitmap;
public final class v4 extends mb {
    public final jc H;
    public final e6 I;

    public v4(e6 e6Var, Context context, a5 a5Var, org.telegram.ui.ActionBar.d6 d6Var, jc jcVar) {
        super(context, a5Var, d6Var);
        this.I = e6Var;
        this.H = jcVar;
    }

    @Override
    public final void b(boolean z10) {
        x5 x5Var = this.I.Q1;
        if (x5Var != null) {
            jc jcVar = ((ac) x5Var).d;
            jcVar.f1079i1 = z10;
            jcVar.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
