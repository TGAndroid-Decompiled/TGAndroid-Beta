package bi;

import di.j8;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.ProfileActivity;
public final class r3 implements z10 {
    public final int f3829a;
    public final c4 f3830b;
    public final TL_stars.SavedStarGift f3831c;

    public r3(c4 c4Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f3829a = i7;
        this.f3830b = c4Var;
        this.f3831c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3829a;
        TL_stars.SavedStarGift savedStarGift = this.f3831c;
        c4 c4Var = this.f3830b;
        switch (i7) {
            case 0:
                c4Var.f3412a.f3613e.b((String) obj, new r3(c4Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wp0 wp0Var = c4Var.f3412a;
                j8 j8Var = wp0Var.f3613e;
                int i10 = tL_starGiftCollection.collection_id;
                j8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j8Var.a(i10, arrayList);
                wp0Var.f(true);
                v61 v61Var = wp0Var.f3615n;
                int i11 = tL_starGiftCollection.collection_id;
                v61Var.d(i11, wp0Var.f3613e.f(i11) + 1);
                org.telegram.ui.ActionBar.e2 e2Var = wp0Var.f3610a;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W4(true);
                }
                wp0Var.o();
                cc.a0(e2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
