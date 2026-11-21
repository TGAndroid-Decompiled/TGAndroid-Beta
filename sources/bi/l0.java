package bi;

import android.content.Context;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ap0;
public final class l0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f3809a;
    public final Context f3810b;
    public final org.telegram.ui.ActionBar.h6 f3811c;

    public l0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3809a = starGift;
        this.f3810b = context;
        this.f3811c = h6Var;
    }

    @Override
    public final void b(int i7) {
        Context context = this.f3810b;
        TL_stars.StarGift starGift = this.f3809a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                m0.h1(context, starGift, this.f3811c);
                return;
            }
            return;
        }
        String str = mp.u1(j10.f24798t0).X2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            ap0.O0(context, null, str, false, str).show();
        }
    }
}
