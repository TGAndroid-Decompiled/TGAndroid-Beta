package gh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class d3 implements org.telegram.ui.ActionBar.b2 {
    public final int f7956a;
    public final k5 f7957b;
    public final TL_stars.TL_starGiftUnique f7958c;

    public d3(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i9) {
        this.f7956a = i9;
        this.f7957b = k5Var;
        this.f7958c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f7956a) {
            case 0:
                k5.N0(this.f7957b, this.f7958c, c2Var);
                return;
            default:
                Context context = this.f7957b.getContext();
                ve.e.u(context, "https://fragment.com/gift/" + this.f7958c.slug);
                return;
        }
    }
}
