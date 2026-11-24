package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class dz extends c6 {
    public final TL_stars.StarGift a;
    public final Context b;
    public final wjb c;

    public dz(wjb wjbVar, Context context, TL_stars.StarGift starGift) {
        this.a = starGift;
        this.b = context;
        this.c = wjbVar;
    }

    @Override
    public final void b(int i) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i != 3 && i != 2) {
            if (i == 4) {
                ez.b1(this.c, context, starGift);
                return;
            }
            return;
        }
        String str = na7.q1(y6c.t0).N2 + "/auction/" + starGift.auction_slug;
        if (i == 3) {
            gl.g(str);
        } else {
            taa.G0(context, null, str, false, str).show();
        }
    }
}
