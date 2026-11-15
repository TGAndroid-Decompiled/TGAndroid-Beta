package bi;

import android.content.Context;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.po0;
public final class l0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f3657a;
    public final Context f3658b;
    public final org.telegram.ui.ActionBar.e6 f3659c;

    public l0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f3657a = starGift;
        this.f3658b = context;
        this.f3659c = e6Var;
    }

    @Override
    public final void b(int i7) {
        Context context = this.f3658b;
        TL_stars.StarGift starGift = this.f3657a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                m0.g1(context, starGift, this.f3659c);
                return;
            }
            return;
        }
        String str = np.s1(m10.f24940t0).V2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            po0.N0(context, null, str, false, str).show();
        }
    }
}
