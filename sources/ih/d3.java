package ih;

import java.util.ArrayList;
import jh.i7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y71;
import org.telegram.ui.ProfileActivity;
public final class d3 implements Utilities.Callback {
    public final int f9096a;
    public final n3 f9097b;
    public final TL_stars.SavedStarGift f9098c;

    public d3(n3 n3Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f9096a = i10;
        this.f9097b = n3Var;
        this.f9098c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f9096a;
        TL_stars.SavedStarGift savedStarGift = this.f9098c;
        n3 n3Var = this.f9097b;
        switch (i10) {
            case 0:
                n3Var.f9293a.f9504e.b((String) obj, new d3(n3Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                gr0 gr0Var = n3Var.f9293a;
                i7 i7Var = gr0Var.f9504e;
                int i11 = tL_starGiftCollection.collection_id;
                i7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                i7Var.a(i11, arrayList);
                gr0Var.f(true);
                y71 y71Var = gr0Var.f9506n;
                int i12 = tL_starGiftCollection.collection_id;
                y71Var.d(i12, gr0Var.f9504e.f(i12) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = gr0Var.f9501a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                gr0Var.n();
                tc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, jh.h5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
