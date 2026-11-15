package di;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class p3 implements org.telegram.ui.ActionBar.q1 {
    public final int f9222a;
    public final c6 f9223b;
    public final TL_stars.TL_starGiftUnique f9224c;

    public p3(c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f9222a = i7;
        this.f9223b = c6Var;
        this.f9224c = tL_starGiftUnique;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9222a) {
            case 0:
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                c6 c6Var = this.f9223b;
                updatestargiftprice.stargift = c6Var.B1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(c6Var.f29679a).sendRequest(updatestargiftprice, new bi.j6(c6Var, h, this.f9224c, 2));
                return;
            default:
                Context context = this.f9223b.getContext();
                vf.c.v(context, "https://fragment.com/gift/" + this.f9224c.slug, false);
                return;
        }
    }
}
