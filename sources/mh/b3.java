package mh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class b3 implements org.telegram.ui.ActionBar.c2 {
    public final int f13730a;
    public final g5 f13731b;
    public final TL_stars.TL_starGiftUnique f13732c;

    public b3(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f13730a = i10;
        this.f13731b = g5Var;
        this.f13732c = tL_starGiftUnique;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f13730a) {
            case 0:
                g5.N0(this.f13731b, this.f13732c, d2Var);
                return;
            default:
                Context context = this.f13731b.getContext();
                af.g.u(context, "https://fragment.com/gift/" + this.f13732c.slug);
                return;
        }
    }
}
