package di;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 implements org.telegram.ui.ActionBar.r1 {
    public final int f9709a;
    public final f6 f9710b;
    public final TL_stars.TL_starGiftUnique f9711c;

    public s3(f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f9709a = i7;
        this.f9710b = f6Var;
        this.f9711c = tL_starGiftUnique;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f9709a) {
            case 0:
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                f6 f6Var = this.f9710b;
                updatestargiftprice.stargift = f6Var.G1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(f6Var.f30189a).sendRequest(updatestargiftprice, new bi.m1(f6Var, h, this.f9711c, 3));
                return;
            default:
                Context context = this.f9710b.getContext();
                vf.c.v(context, "https://fragment.com/gift/" + this.f9711c.slug, false);
                return;
        }
    }
}
