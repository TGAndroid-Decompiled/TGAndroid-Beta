package fh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import gh.l7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.x60;
public final class j3 implements View.OnClickListener {
    public final int f6540a;
    public final boolean f6541b;
    public final FrameLayout f6542c;
    public final Object d;
    public final Object f6543e;
    public final Object f6544f;

    public j3(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i9) {
        this.f6540a = i9;
        this.f6542c = frameLayout;
        this.f6541b = z10;
        this.d = obj;
        this.f6543e = obj2;
        this.f6544f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i9 = this.f6540a;
        Object obj = this.f6544f;
        Object obj2 = this.f6543e;
        Object obj3 = this.d;
        boolean z10 = this.f6541b;
        FrameLayout frameLayout = this.f6542c;
        switch (i9) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                x60 x60Var = (x60) obj;
                vq0 vq0Var = ((y3) frameLayout).f6880a;
                if (!z10) {
                    l7 l7Var = vq0Var.f6548e;
                    int i10 = tL_starGiftCollection.collection_id;
                    l7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    l7Var.a(i10, arrayList);
                    oc.a0(vq0Var.f6545a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, gh.k5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    vq0Var.f6548e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    oc.a0(vq0Var.f6545a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, gh.k5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                x60Var.u();
                vq0Var.n();
                return;
            default:
                wa0 wa0Var = (wa0) frameLayout;
                Context context = (Context) obj3;
                bb0 bb0Var = (bb0) obj2;
                bb0 bb0Var2 = (bb0) obj;
                cb0 cb0Var = wa0Var.V;
                MessagePreviewParams messagePreviewParams = cb0Var.d;
                if (!z10) {
                    new oc(cb0Var, cb0Var.B).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ia0(wa0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                cb0Var.f27463x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (bb0Var != null) {
                        bb0Var.a(false, true);
                    }
                }
                bb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                wa0Var.h();
                wa0Var.k(true);
                return;
        }
    }
}
