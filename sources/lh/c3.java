package lh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 implements org.telegram.ui.ActionBar.c2 {
    public final int f12191a;
    public final g5 f12192b;
    public final TL_stars.TL_starGiftUnique f12193c;

    public c3(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f12191a = i10;
        this.f12192b = g5Var;
        this.f12193c = tL_starGiftUnique;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f12191a) {
            case 0:
                g5.N0(this.f12192b, this.f12193c, d2Var);
                return;
            default:
                Context context = this.f12192b.getContext();
                ze.d.u(context, "https://fragment.com/gift/" + this.f12193c.slug);
                return;
        }
    }
}
