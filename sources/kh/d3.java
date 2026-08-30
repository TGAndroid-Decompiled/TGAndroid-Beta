package kh;

import java.util.ArrayList;
import lh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
public final class d3 implements Utilities.Callback {
    public final int f10533a;
    public final n3 f10534b;
    public final TL_stars.SavedStarGift f10535c;

    public d3(n3 n3Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f10533a = i10;
        this.f10534b = n3Var;
        this.f10535c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f10533a;
        TL_stars.SavedStarGift savedStarGift = this.f10535c;
        n3 n3Var = this.f10534b;
        switch (i10) {
            case 0:
                n3Var.f10719a.e.b((String) obj, new d3(n3Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                or0 or0Var = n3Var.f10719a;
                j7 j7Var = or0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                j7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j7Var.a(i11, arrayList);
                or0Var.f(true);
                k81 k81Var = or0Var.f10943n;
                int i12 = tL_starGiftCollection.collection_id;
                k81Var.d(i12, or0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = or0Var.f10939a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                or0Var.n();
                qc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, lh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
