package ci;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 implements org.telegram.ui.ActionBar.p1 {
    public final int f6394a;
    public final l6 f6395b;
    public final TL_stars.TL_starGiftUnique f6396c;

    public y3(l6 l6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i3) {
        this.f6394a = i3;
        this.f6395b = l6Var;
        this.f6396c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f6394a) {
            case 0:
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                l6 l6Var = this.f6395b;
                updatestargiftprice.stargift = l6Var.B1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(l6Var.f28583a).sendRequest(updatestargiftprice, new ai.r6(l6Var, h, this.f6396c, 2));
                return;
            default:
                Context context = this.f6395b.getContext();
                sf.c.v(context, "https://fragment.com/gift/" + this.f6396c.slug, false);
                return;
        }
    }
}
