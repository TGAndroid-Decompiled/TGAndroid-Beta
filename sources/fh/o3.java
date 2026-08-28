package fh;

import gh.l7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ProfileActivity;
public final class o3 implements Utilities.Callback {
    public final int f6662a;
    public final y3 f6663b;
    public final TL_stars.SavedStarGift f6664c;

    public o3(y3 y3Var, TL_stars.SavedStarGift savedStarGift, int i9) {
        this.f6662a = i9;
        this.f6663b = y3Var;
        this.f6664c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f6662a;
        TL_stars.SavedStarGift savedStarGift = this.f6664c;
        y3 y3Var = this.f6663b;
        switch (i9) {
            case 0:
                y3Var.f6880a.f6548e.b((String) obj, new o3(y3Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vq0 vq0Var = y3Var.f6880a;
                l7 l7Var = vq0Var.f6548e;
                int i10 = tL_starGiftCollection.collection_id;
                l7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                l7Var.a(i10, arrayList);
                vq0Var.f(true);
                m71 m71Var = vq0Var.f6550n;
                int i11 = tL_starGiftCollection.collection_id;
                m71Var.d(i11, vq0Var.f6548e.f(i11) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = vq0Var.f6545a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                vq0Var.n();
                oc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, gh.k5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
