package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import mh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yb0;
public final class x2 implements View.OnClickListener {
    public final int f13095a;
    public final boolean f13096b;
    public final FrameLayout f13097c;
    public final Object d;
    public final Object f13098e;
    public final Object f13099f;

    public x2(FrameLayout frameLayout, boolean z4, Object obj, Object obj2, Object obj3, int i10) {
        this.f13095a = i10;
        this.f13097c = frameLayout;
        this.f13096b = z4;
        this.d = obj;
        this.f13098e = obj2;
        this.f13099f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f13095a;
        Object obj = this.f13099f;
        Object obj2 = this.f13098e;
        Object obj3 = this.d;
        boolean z4 = this.f13096b;
        FrameLayout frameLayout = this.f13097c;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                q70 q70Var = (q70) obj;
                or0 or0Var = ((n3) frameLayout).f12862a;
                if (!z4) {
                    j7 j7Var = or0Var.f13103e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j7Var.a(i11, arrayList);
                    qc.a0(or0Var.f13100a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, mh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    or0Var.f13103e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    qc.a0(or0Var.f13100a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, mh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                q70Var.u();
                or0Var.n();
                return;
            default:
                sb0 sb0Var = (sb0) frameLayout;
                Context context = (Context) obj3;
                xb0 xb0Var = (xb0) obj2;
                xb0 xb0Var2 = (xb0) obj;
                yb0 yb0Var = sb0Var.W;
                MessagePreviewParams messagePreviewParams = yb0Var.d;
                if (!z4) {
                    new qc(yb0Var, yb0Var.C).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new db0(sb0Var, context, 0))).j();
                    return;
                }
                boolean z10 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z10;
                yb0Var.f33462x = false;
                if (z10) {
                    messagePreviewParams.hideCaption = false;
                    if (xb0Var != null) {
                        xb0Var.a(false, true);
                    }
                }
                xb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                sb0Var.h();
                sb0Var.k(true);
                return;
        }
    }
}
