package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import jh.i7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wa0;
public final class y2 implements View.OnClickListener {
    public final int f9539a;
    public final boolean f9540b;
    public final FrameLayout f9541c;
    public final Object d;
    public final Object f9542e;
    public final Object f9543f;

    public y2(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f9539a = i10;
        this.f9541c = frameLayout;
        this.f9540b = z10;
        this.d = obj;
        this.f9542e = obj2;
        this.f9543f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f9539a;
        Object obj = this.f9543f;
        Object obj2 = this.f9542e;
        Object obj3 = this.d;
        boolean z10 = this.f9540b;
        FrameLayout frameLayout = this.f9541c;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                j70 j70Var = (j70) obj;
                gr0 gr0Var = ((n3) frameLayout).f9293a;
                if (!z10) {
                    i7 i7Var = gr0Var.f9504e;
                    int i11 = tL_starGiftCollection.collection_id;
                    i7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    i7Var.a(i11, arrayList);
                    tc.a0(gr0Var.f9501a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, jh.h5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    gr0Var.f9504e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    tc.a0(gr0Var.f9501a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, jh.h5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                j70Var.u();
                gr0Var.n();
                return;
            default:
                lb0 lb0Var = (lb0) frameLayout;
                Context context = (Context) obj3;
                qb0 qb0Var = (qb0) obj2;
                qb0 qb0Var2 = (qb0) obj;
                rb0 rb0Var = lb0Var.V;
                MessagePreviewParams messagePreviewParams = rb0Var.d;
                if (!z10) {
                    new tc(rb0Var, rb0Var.B).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new wa0(lb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                rb0Var.f32258x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (qb0Var != null) {
                        qb0Var.a(false, true);
                    }
                }
                qb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                lb0Var.h();
                lb0Var.k(true);
                return;
        }
    }
}
