package lh;

import java.util.ArrayList;
import mh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
public final class d3 implements Utilities.Callback {
    public final int f12666a;
    public final n3 f12667b;
    public final TL_stars.SavedStarGift f12668c;

    public d3(n3 n3Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f12666a = i10;
        this.f12667b = n3Var;
        this.f12668c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f12666a;
        TL_stars.SavedStarGift savedStarGift = this.f12668c;
        n3 n3Var = this.f12667b;
        switch (i10) {
            case 0:
                n3Var.f12860a.f13101e.b((String) obj, new d3(n3Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                pr0 pr0Var = n3Var.f12860a;
                j7 j7Var = pr0Var.f13101e;
                int i11 = tL_starGiftCollection.collection_id;
                j7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j7Var.a(i11, arrayList);
                pr0Var.f(true);
                l81 l81Var = pr0Var.f13103n;
                int i12 = tL_starGiftCollection.collection_id;
                l81Var.d(i12, pr0Var.f13101e.f(i12) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = pr0Var.f13098a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                pr0Var.n();
                qc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, mh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
