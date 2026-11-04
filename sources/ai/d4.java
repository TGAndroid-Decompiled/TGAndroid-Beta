package ai;

import ci.s8;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.ProfileActivity;
public final class d4 implements u10 {
    public final int f568a;
    public final o4 f569b;
    public final TL_stars.SavedStarGift f570c;

    public d4(o4 o4Var, TL_stars.SavedStarGift savedStarGift, int i3) {
        this.f568a = i3;
        this.f569b = o4Var;
        this.f570c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f568a;
        TL_stars.SavedStarGift savedStarGift = this.f570c;
        o4 o4Var = this.f569b;
        switch (i3) {
            case 0:
                o4Var.f856a.f1013e.b((String) obj, new d4(o4Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vp0 vp0Var = o4Var.f856a;
                s8 s8Var = vp0Var.f1013e;
                int i10 = tL_starGiftCollection.collection_id;
                s8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                s8Var.a(i10, arrayList);
                vp0Var.f(true);
                m61 m61Var = vp0Var.f1015n;
                int i11 = tL_starGiftCollection.collection_id;
                m61Var.d(i11, vp0Var.f1013e.f(i11) + 1);
                org.telegram.ui.ActionBar.d2 d2Var = vp0Var.f1010a;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).U4(true);
                }
                vp0Var.o();
                fc.a0(d2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750401, ci.l6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
