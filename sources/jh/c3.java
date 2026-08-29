package jh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 implements org.telegram.ui.ActionBar.b2 {
    public final int f11853a;
    public final h5 f11854b;
    public final TL_stars.TL_starGiftUnique f11855c;

    public c3(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f11853a = i10;
        this.f11854b = h5Var;
        this.f11855c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f11853a) {
            case 0:
                h5.N0(this.f11854b, this.f11855c, c2Var);
                return;
            default:
                Context context = this.f11854b.getContext();
                ye.d.u(context, "https://fragment.com/gift/" + this.f11855c.slug);
                return;
        }
    }
}
