package defpackage;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class uqa implements ee {
    public final byte a;
    public final wsa b;
    public final TL_stars.TL_starGiftUnique c;

    public uqa(wsa wsaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = tL_starGiftUnique;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                k11 g = heVar.g(-1, true, true);
                g.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                updatestargiftprice.stargift = wsaVar.u1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(wsaVar.a).sendRequest(updatestargiftprice, new fm8(wsaVar, g, tL_starGiftUnique, (byte) 15));
                return;
            default:
                Context context = wsaVar.getContext();
                l11.w(context, "https://fragment.com/gift/" + tL_starGiftUnique.slug, false);
                return;
        }
    }
}
