package bi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;
public final class c6 implements x10 {
    public final int f3482a;
    public final n6 f3483b;
    public final TL_stars.SavedStarGift f3484c;

    public c6(n6 n6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f3482a = i7;
        this.f3483b = n6Var;
        this.f3484c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3482a;
        TL_stars.SavedStarGift savedStarGift = this.f3484c;
        n6 n6Var = this.f3483b;
        switch (i7) {
            case 0:
                n6Var.f3944a.f4117e.b((String) obj, new c6(n6Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                gq0 gq0Var = n6Var.f3944a;
                di.n8 n8Var = gq0Var.f4117e;
                int i10 = tL_starGiftCollection.collection_id;
                n8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                n8Var.a(i10, arrayList);
                gq0Var.f(true);
                i71 i71Var = gq0Var.f4119n;
                int i11 = tL_starGiftCollection.collection_id;
                i71Var.e(i11, gq0Var.f4117e.f(i11) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = gq0Var.f4114a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                gq0Var.o();
                lc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
