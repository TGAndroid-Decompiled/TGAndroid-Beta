package di;

import android.content.Context;
import android.graphics.Bitmap;
public final class f3 extends t8 {
    public final p9 H;
    public final i4 I;

    public f3(i4 i4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.f6 f6Var, p9 p9Var) {
        super(context, j3Var, f6Var);
        this.I = i4Var;
        this.H = p9Var;
    }

    @Override
    public final void b(boolean z9) {
        b4 b4Var = this.I.f9221z1;
        if (b4Var != null) {
            p9 p9Var = ((g9) b4Var).d;
            p9Var.f9549h1 = z9;
            p9Var.V();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
