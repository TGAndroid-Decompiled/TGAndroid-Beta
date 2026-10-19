package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 implements org.telegram.ui.ActionBar.a2 {
    public final int f2146a;
    public final l7 f2147b;
    public final TL_stars.TL_starGiftUnique f2148c;

    public s4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f2146a = i10;
        this.f2147b = l7Var;
        this.f2148c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2146a) {
            case 0:
                l7.W(this.f2147b, this.f2148c, b2Var);
                return;
            default:
                Context context = this.f2147b.getContext();
                pf.d.t(context, "https://fragment.com/gift/" + this.f2148c.slug);
                return;
        }
    }
}
