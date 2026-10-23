package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 implements org.telegram.ui.ActionBar.z1 {
    public final int f2149a;
    public final l7 f2150b;
    public final TL_stars.TL_starGiftUnique f2151c;

    public s4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2149a = i10;
        this.f2150b = l7Var;
        this.f2151c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f2149a) {
            case 0:
                l7.V(this.f2150b, this.f2151c, c2Var);
                return;
            default:
                Context context = this.f2150b.getContext();
                pf.d.t(context, "https://fragment.com/gift/" + this.f2151c.slug);
                return;
        }
    }
}
