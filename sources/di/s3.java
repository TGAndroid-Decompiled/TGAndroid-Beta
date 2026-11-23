package di;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 implements org.telegram.ui.ActionBar.q1 {
    public final int f9741a;
    public final f6 f9742b;
    public final TL_stars.TL_starGiftUnique f9743c;

    public s3(f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f9741a = i7;
        this.f9742b = f6Var;
        this.f9743c = tL_starGiftUnique;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9741a) {
            case 0:
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                f6 f6Var = this.f9742b;
                updatestargiftprice.stargift = f6Var.G1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(f6Var.f30173a).sendRequest(updatestargiftprice, new bi.q1(f6Var, h, this.f9743c, 3));
                return;
            default:
                Context context = this.f9742b.getContext();
                vf.c.v(context, "https://fragment.com/gift/" + this.f9743c.slug, false);
                return;
        }
    }
}
