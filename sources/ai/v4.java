package ai;

import android.content.Context;
import android.graphics.Bitmap;
public final class v4 extends mb {
    public final jc H;
    public final f6 I;

    public v4(f6 f6Var, Context context, a5 a5Var, org.telegram.ui.ActionBar.e6 e6Var, jc jcVar) {
        super(context, a5Var, e6Var);
        this.I = f6Var;
        this.H = jcVar;
    }

    @Override
    public final void b(boolean z10) {
        y5 y5Var = this.I.Q1;
        if (y5Var != null) {
            jc jcVar = ((ac) y5Var).d;
            jcVar.f1088i1 = z10;
            jcVar.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
