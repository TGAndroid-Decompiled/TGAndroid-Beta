package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class f0 implements Runnable {
    public final int f3609a;
    public final Context f3610b;
    public final org.telegram.ui.ActionBar.h6 f3611c;
    public final TL_stars.StarGift d;

    public f0(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3609a = i7;
        this.f3610b = context;
        this.f3611c = h6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f3609a) {
            case 0:
                org.telegram.ui.ActionBar.h6 h6Var = this.f3611c;
                m0.h1(this.f3610b, this.d, h6Var);
                return;
            default:
                org.telegram.ui.ActionBar.h6 h6Var2 = this.f3611c;
                m0.h1(this.f3610b, this.d, h6Var2);
                return;
        }
    }
}
