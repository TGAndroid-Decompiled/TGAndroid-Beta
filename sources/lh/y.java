package lh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
public final class y implements Runnable {
    public final int f13111a;
    public final Context f13112b;
    public final g6 f13113c;
    public final TL_stars.StarGift d;

    public y(Context context, g6 g6Var, TL_stars.StarGift starGift, int i10) {
        this.f13111a = i10;
        this.f13112b = context;
        this.f13113c = g6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f13111a) {
            case 0:
                g6 g6Var = this.f13113c;
                f0.U(this.f13112b, this.d, g6Var);
                return;
            default:
                g6 g6Var2 = this.f13113c;
                f0.U(this.f13112b, this.d, g6Var2);
                return;
        }
    }
}
