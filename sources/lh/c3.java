package lh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 implements org.telegram.ui.ActionBar.c2 {
    public final int f12207a;
    public final g5 f12208b;
    public final TL_stars.TL_starGiftUnique f12209c;

    public c3(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f12207a = i10;
        this.f12208b = g5Var;
        this.f12209c = tL_starGiftUnique;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f12207a) {
            case 0:
                g5.N0(this.f12208b, this.f12209c, d2Var);
                return;
            default:
                Context context = this.f12208b.getContext();
                af.g.u(context, "https://fragment.com/gift/" + this.f12209c.slug);
                return;
        }
    }
}
