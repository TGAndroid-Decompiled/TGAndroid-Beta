package gh;

import hh.k7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.ProfileActivity;

public final class j3 implements Utilities.Callback {

    public final int f7358a;

    public final t3 f7359b;

    public final TL_stars.SavedStarGift f7360c;

    public j3(t3 t3Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f7358a = i10;
        this.f7359b = t3Var;
        this.f7360c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f7358a;
        TL_stars.SavedStarGift savedStarGift = this.f7360c;
        t3 t3Var = this.f7359b;
        int i11 = 1;
        switch (i10) {
            case 0:
                t3Var.f7533a.f7200e.b((String) obj, new j3(t3Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wq0 wq0Var = t3Var.f7533a;
                k7 k7Var = wq0Var.f7200e;
                int i12 = tL_starGiftCollection.collection_id;
                k7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                k7Var.a(i12, arrayList);
                wq0Var.f(true);
                o71 o71Var = wq0Var.f7202n;
                int i13 = tL_starGiftCollection.collection_id;
                o71Var.d(i13, wq0Var.f7200e.f(i13) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = wq0Var.f7197a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                wq0Var.n();
                mc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, hh.i5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
