package bi;

import android.content.Context;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yo0;
public final class l0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f3829a;
    public final Context f3830b;
    public final org.telegram.ui.ActionBar.i6 f3831c;

    public l0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f3829a = starGift;
        this.f3830b = context;
        this.f3831c = i6Var;
    }

    @Override
    public final void b(int i7) {
        Context context = this.f3830b;
        TL_stars.StarGift starGift = this.f3829a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                m0.h1(context, starGift, this.f3831c);
                return;
            }
            return;
        }
        String str = mp.u1(j10.f24773t0).X2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            yo0.O0(context, null, str, false, str).show();
        }
    }
}
