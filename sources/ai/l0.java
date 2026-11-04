package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class l0 implements Runnable {
    public final int f777a;
    public final Context f778b;
    public final org.telegram.ui.ActionBar.e6 f779c;
    public final TL_stars.StarGift d;

    public l0(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift, int i3) {
        this.f777a = i3;
        this.f778b = context;
        this.f779c = e6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f777a) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = this.f779c;
                s0.g1(this.f778b, this.d, e6Var);
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = this.f779c;
                s0.g1(this.f778b, this.d, e6Var2);
                return;
        }
    }
}
