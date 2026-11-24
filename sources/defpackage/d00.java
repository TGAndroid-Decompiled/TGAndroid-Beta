package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class d00 extends c6 {
    public final TL_stars.StarGift a;
    public final Context b;
    public final ylb c;

    public d00(ylb ylbVar, Context context, TL_stars.StarGift starGift) {
        this.a = starGift;
        this.b = context;
        this.c = ylbVar;
    }

    @Override
    public final void b(int i) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i != 3 && i != 2) {
            if (i == 4) {
                e00.b1(this.c, context, starGift);
                return;
            }
            return;
        }
        String str = oc7.r1(z8c.t0).N2 + "/auction/" + starGift.auction_slug;
        if (i == 3) {
            gm.g(str);
        } else {
            tca.G0(context, null, str, false, str).show();
        }
    }
}
