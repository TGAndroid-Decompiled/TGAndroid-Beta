package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class n4 implements org.telegram.ui.ActionBar.b2 {
    public final int f5124a;
    public final h7 f5125b;
    public final TL_stars.TL_starGiftUnique f5126c;

    public n4(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f5124a = i10;
        this.f5125b = h7Var;
        this.f5126c = tL_starGiftUnique;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f5124a) {
            case 0:
                h7.V(this.f5125b, this.f5126c, e2Var);
                return;
            default:
                Context context = this.f5125b.getContext();
                qf.d.t(context, "https://fragment.com/gift/" + this.f5126c.slug);
                return;
        }
    }
}
