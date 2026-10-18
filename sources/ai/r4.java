package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 implements org.telegram.ui.ActionBar.a2 {
    public final int f2101a;
    public final k7 f2102b;
    public final TL_stars.TL_starGiftUnique f2103c;

    public r4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2101a = i10;
        this.f2102b = k7Var;
        this.f2103c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2101a) {
            case 0:
                k7.X(this.f2102b, this.f2103c, b2Var);
                return;
            default:
                Context context = this.f2102b.getContext();
                pf.d.t(context, "https://fragment.com/gift/" + this.f2103c.slug);
                return;
        }
    }
}
