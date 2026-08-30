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
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.wb0;
public final class y2 implements View.OnClickListener {
    public final int f10957a;
    public final boolean f10958b;
    public final FrameLayout f10959c;
    public final Object d;
    public final Object e;
    public final Object f10960f;

    public y2(FrameLayout frameLayout, boolean z4, Object obj, Object obj2, Object obj3, int i10) {
        this.f10957a = i10;
        this.f10959c = frameLayout;
        this.f10958b = z4;
        this.d = obj;
        this.e = obj2;
        this.f10960f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f10957a;
        Object obj = this.f10960f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z4 = this.f10958b;
        FrameLayout frameLayout = this.f10959c;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                o70 o70Var = (o70) obj;
                or0 or0Var = ((n3) frameLayout).f10719a;
                if (!z4) {
                    j7 j7Var = or0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j7Var.a(i11, arrayList);
                    qc.a0(or0Var.f10939a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, lh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    or0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    qc.a0(or0Var.f10939a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, lh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                o70Var.u();
                or0Var.n();
                return;
            default:
                qb0 qb0Var = (qb0) frameLayout;
                Context context = (Context) obj3;
                vb0 vb0Var = (vb0) obj2;
                vb0 vb0Var2 = (vb0) obj;
                wb0 wb0Var = qb0Var.W;
                MessagePreviewParams messagePreviewParams = wb0Var.d;
                if (!z4) {
                    new qc(wb0Var, wb0Var.C).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new bb0(qb0Var, context, 0))).j();
                    return;
                }
                boolean z10 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z10;
                wb0Var.f30293x = false;
                if (z10) {
                    messagePreviewParams.hideCaption = false;
                    if (vb0Var != null) {
                        vb0Var.a(false, true);
                    }
                }
                vb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                qb0Var.h();
                qb0Var.k(true);
                return;
        }
    }
}
