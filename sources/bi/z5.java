package bi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;
public final class z5 implements x10 {
    public final int f4310a;
    public final k6 f4311b;
    public final TL_stars.SavedStarGift f4312c;

    public z5(k6 k6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f4310a = i7;
        this.f4311b = k6Var;
        this.f4312c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f4310a;
        TL_stars.SavedStarGift savedStarGift = this.f4312c;
        k6 k6Var = this.f4311b;
        switch (i7) {
            case 0:
                k6Var.f3813a.f4006e.b((String) obj, new z5(k6Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                eq0 eq0Var = k6Var.f3813a;
                di.m8 m8Var = eq0Var.f4006e;
                int i10 = tL_starGiftCollection.collection_id;
                m8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                m8Var.a(i10, arrayList);
                eq0Var.f(true);
                f71 f71Var = eq0Var.f4008n;
                int i11 = tL_starGiftCollection.collection_id;
                f71Var.e(i11, eq0Var.f4006e.f(i11) + 1);
                org.telegram.ui.ActionBar.h2 h2Var = eq0Var.f4003a;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).X4(true);
                }
                eq0Var.o();
                lc.b0(h2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750377, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
