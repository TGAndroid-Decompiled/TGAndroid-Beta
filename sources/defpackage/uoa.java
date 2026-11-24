package defpackage;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class uoa implements ed {
    public final byte a;
    public final vqa b;
    public final TL_stars.TL_starGiftUnique c;

    public uoa(vqa vqaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = tL_starGiftUnique;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                c01 g = hdVar.g(-1, true, true);
                g.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                updatestargiftprice.stargift = vqaVar.u1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(vqaVar.a).sendRequest(updatestargiftprice, new ck8(vqaVar, g, tL_starGiftUnique, (byte) 15));
                return;
            default:
                Context context = vqaVar.getContext();
                d01.v(context, "https://fragment.com/gift/" + tL_starGiftUnique.slug, false);
                return;
        }
    }
}
