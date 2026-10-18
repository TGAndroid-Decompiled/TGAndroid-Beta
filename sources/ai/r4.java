package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 implements org.telegram.ui.ActionBar.a2 {
    public final int f2100a;
    public final k7 f2101b;
    public final TL_stars.TL_starGiftUnique f2102c;

    public r4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2100a = i10;
        this.f2101b = k7Var;
        this.f2102c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2100a) {
            case 0:
                k7.W(this.f2101b, this.f2102c, b2Var);
                return;
            default:
                Context context = this.f2101b.getContext();
                pf.d.t(context, "https://fragment.com/gift/" + this.f2102c.slug);
                return;
        }
    }
}
