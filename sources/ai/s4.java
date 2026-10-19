package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 implements org.telegram.ui.ActionBar.a2 {
    public final int f2139a;
    public final k7 f2140b;
    public final TL_stars.TL_starGiftUnique f2141c;

    public s4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2139a = i10;
        this.f2140b = k7Var;
        this.f2141c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2139a) {
            case 0:
                k7.X(this.f2140b, this.f2141c, b2Var);
                return;
            default:
                Context context = this.f2140b.getContext();
                pf.d.t(context, "https://fragment.com/gift/" + this.f2141c.slug);
                return;
        }
    }
}
