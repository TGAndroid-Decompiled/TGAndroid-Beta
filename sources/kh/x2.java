package kh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import lh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xb0;
public final class x2 implements View.OnClickListener {
    public final int f11051a;
    public final boolean f11052b;
    public final FrameLayout f11053c;
    public final Object d;
    public final Object e;
    public final Object f11054f;

    public x2(FrameLayout frameLayout, boolean z4, Object obj, Object obj2, Object obj3, int i10) {
        this.f11051a = i10;
        this.f11053c = frameLayout;
        this.f11052b = z4;
        this.d = obj;
        this.e = obj2;
        this.f11054f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f11051a;
        Object obj = this.f11054f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z4 = this.f11052b;
        FrameLayout frameLayout = this.f11053c;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                p70 p70Var = (p70) obj;
                or0 or0Var = ((m3) frameLayout).f10817a;
                if (!z4) {
                    j7 j7Var = or0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j7Var.a(i11, arrayList);
                    qc.a0(or0Var.f11015a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, lh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    or0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    qc.a0(or0Var.f11015a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, lh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                p70Var.u();
                or0Var.n();
                return;
            default:
                rb0 rb0Var = (rb0) frameLayout;
                Context context = (Context) obj3;
                wb0 wb0Var = (wb0) obj2;
                wb0 wb0Var2 = (wb0) obj;
                xb0 xb0Var = rb0Var.W;
                MessagePreviewParams messagePreviewParams = xb0Var.d;
                if (!z4) {
                    new qc(xb0Var, xb0Var.C).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new cb0(rb0Var, context, 0))).j();
                    return;
                }
                boolean z10 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z10;
                xb0Var.f30581x = false;
                if (z10) {
                    messagePreviewParams.hideCaption = false;
                    if (wb0Var != null) {
                        wb0Var.a(false, true);
                    }
                }
                wb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                rb0Var.h();
                rb0Var.k(true);
                return;
        }
    }
}
