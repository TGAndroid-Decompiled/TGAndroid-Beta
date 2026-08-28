package ih;

import android.content.Context;
import android.graphics.Bitmap;
public final class g3 extends q8 {
    public final m9 D;
    public final i4 E;

    public g3(i4 i4Var, Context context, l3 l3Var, org.telegram.ui.ActionBar.b6 b6Var, m9 m9Var) {
        super(context, l3Var, b6Var);
        this.E = i4Var;
        this.D = m9Var;
    }

    @Override
    public final void b(boolean z10) {
        c4 c4Var = this.E.M1;
        if (c4Var != null) {
            m9 m9Var = ((d9) c4Var).d;
            m9Var.f11796e1 = z10;
            m9Var.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.E.getPlayingBitmap();
    }
}
