package bi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;
public final class y5 implements x10 {
    public final int f4247a;
    public final j6 f4248b;
    public final TL_stars.SavedStarGift f4249c;

    public y5(j6 j6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f4247a = i7;
        this.f4248b = j6Var;
        this.f4249c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f4247a;
        TL_stars.SavedStarGift savedStarGift = this.f4249c;
        j6 j6Var = this.f4248b;
        switch (i7) {
            case 0:
                j6Var.f3756a.f3944e.b((String) obj, new y5(j6Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                eq0 eq0Var = j6Var.f3756a;
                di.m8 m8Var = eq0Var.f3944e;
                int i10 = tL_starGiftCollection.collection_id;
                m8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                m8Var.a(i10, arrayList);
                eq0Var.f(true);
                f71 f71Var = eq0Var.f3946n;
                int i11 = tL_starGiftCollection.collection_id;
                f71Var.e(i11, eq0Var.f3944e.f(i11) + 1);
                org.telegram.ui.ActionBar.h2 h2Var = eq0Var.f3941a;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).X4(true);
                }
                eq0Var.o();
                lc.b0(h2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750377, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
