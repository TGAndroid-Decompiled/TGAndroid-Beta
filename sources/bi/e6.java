package bi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.kc;
import org.telegram.ui.ProfileActivity;
public final class e6 implements w10 {
    public final int f3508a;
    public final p6 f3509b;
    public final TL_stars.SavedStarGift f3510c;

    public e6(p6 p6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f3508a = i7;
        this.f3509b = p6Var;
        this.f3510c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f3508a;
        TL_stars.SavedStarGift savedStarGift = this.f3510c;
        p6 p6Var = this.f3509b;
        switch (i7) {
            case 0:
                p6Var.f3966a.f4151e.b((String) obj, new e6(p6Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                fq0 fq0Var = p6Var.f3966a;
                di.n8 n8Var = fq0Var.f4151e;
                int i10 = tL_starGiftCollection.collection_id;
                n8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                n8Var.a(i10, arrayList);
                fq0Var.f(true);
                j71 j71Var = fq0Var.f4153n;
                int i11 = tL_starGiftCollection.collection_id;
                j71Var.e(i11, fq0Var.f4151e.f(i11) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = fq0Var.f4148a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                fq0Var.o();
                kc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
