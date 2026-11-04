package ai;

import android.content.Context;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oo0;
public final class r0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f934a;
    public final Context f935b;
    public final org.telegram.ui.ActionBar.e6 f936c;

    public r0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f934a = starGift;
        this.f935b = context;
        this.f936c = e6Var;
    }

    @Override
    public final void b(int i3) {
        Context context = this.f935b;
        TL_stars.StarGift starGift = this.f934a;
        if (i3 != 3 && i3 != 2) {
            if (i3 == 4) {
                s0.g1(context, starGift, this.f936c);
                return;
            }
            return;
        }
        String str = hp.s1(h10.f22829t0).V2 + "/auction/" + starGift.auction_slug;
        if (i3 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            oo0.N0(context, null, str, false, str).show();
        }
    }
}
