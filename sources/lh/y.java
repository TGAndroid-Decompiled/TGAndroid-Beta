package lh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
public final class y implements Runnable {
    public final int f13109a;
    public final Context f13110b;
    public final g6 f13111c;
    public final TL_stars.StarGift d;

    public y(Context context, g6 g6Var, TL_stars.StarGift starGift, int i10) {
        this.f13109a = i10;
        this.f13110b = context;
        this.f13111c = g6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f13109a) {
            case 0:
                g6 g6Var = this.f13111c;
                f0.U(this.f13110b, this.d, g6Var);
                return;
            default:
                g6 g6Var2 = this.f13111c;
                f0.U(this.f13110b, this.d, g6Var2);
                return;
        }
    }
}
