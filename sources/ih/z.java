package ih;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z implements Runnable {
    public final int f9550a;
    public final Context f9551b;
    public final org.telegram.ui.ActionBar.c6 f9552c;
    public final TL_stars.StarGift d;

    public z(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.StarGift starGift, int i10) {
        this.f9550a = i10;
        this.f9551b = context;
        this.f9552c = c6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f9550a) {
            case 0:
                org.telegram.ui.ActionBar.c6 c6Var = this.f9552c;
                g0.U(this.f9551b, this.d, c6Var);
                return;
            default:
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f9552c;
                g0.U(this.f9551b, this.d, c6Var2);
                return;
        }
    }
}
