package di;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class s3 implements org.telegram.ui.ActionBar.q1 {
    public final int f9704a;
    public final f6 f9705b;
    public final TL_stars.TL_starGiftUnique f9706c;

    public s3(f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f9704a = i7;
        this.f9705b = f6Var;
        this.f9706c = tL_starGiftUnique;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9704a) {
            case 0:
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                f6 f6Var = this.f9705b;
                updatestargiftprice.stargift = f6Var.G1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(f6Var.f30139a).sendRequest(updatestargiftprice, new bi.q1(f6Var, h, this.f9706c, 3));
                return;
            default:
                Context context = this.f9705b.getContext();
                vf.c.v(context, "https://fragment.com/gift/" + this.f9706c.slug, false);
                return;
        }
    }
}
