package bi;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;
public final class b6 implements y10 {
    public final int f3442a;
    public final m6 f3443b;
    public final TL_stars.SavedStarGift f3444c;

    public b6(m6 m6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f3442a = i7;
        this.f3443b = m6Var;
        this.f3444c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3442a;
        TL_stars.SavedStarGift savedStarGift = this.f3444c;
        m6 m6Var = this.f3443b;
        switch (i7) {
            case 0:
                m6Var.f3897a.f4094e.b((String) obj, new b6(m6Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                gq0 gq0Var = m6Var.f3897a;
                di.n8 n8Var = gq0Var.f4094e;
                int i10 = tL_starGiftCollection.collection_id;
                n8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                n8Var.a(i10, arrayList);
                gq0Var.f(true);
                i71 i71Var = gq0Var.f4096n;
                int i11 = tL_starGiftCollection.collection_id;
                i71Var.e(i11, gq0Var.f4094e.f(i11) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = gq0Var.f4091a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                gq0Var.o();
                lc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
