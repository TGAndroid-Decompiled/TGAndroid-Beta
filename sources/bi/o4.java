package bi;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class o4 implements org.telegram.ui.ActionBar.r1 {
    public final int f4455a;
    public final k7 f4456b;
    public final TL_stars.TL_starGiftUnique f4457c;

    public o4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f4455a = i7;
        this.f4456b = k7Var;
        this.f4457c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f4455a) {
            case 0:
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                k7 k7Var = this.f4456b;
                updatestargiftprice.stargift = k7Var.A1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(k7Var.f28669a).sendRequest(updatestargiftprice, new f2(k7Var, h, this.f4457c, 1));
                return;
            default:
                Context context = this.f4456b.getContext();
                vf.c.v(context, "https://fragment.com/gift/" + this.f4457c.slug, false);
                return;
        }
    }
}
