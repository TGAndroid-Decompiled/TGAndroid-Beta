package gh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import hh.k7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.wq0;

public final class e3 implements View.OnClickListener {

    public final int f7226a;

    public final boolean f7227b;

    public final FrameLayout f7228c;
    public final Object d;

    public final Object f7229e;

    public final Object f7230f;

    public e3(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f7226a = i10;
        this.f7228c = frameLayout;
        this.f7227b = z10;
        this.d = obj;
        this.f7229e = obj2;
        this.f7230f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f7226a;
        Object obj = this.f7230f;
        Object obj2 = this.f7229e;
        Object obj3 = this.d;
        boolean z10 = this.f7227b;
        FrameLayout frameLayout = this.f7228c;
        int i11 = 0;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                b70 b70Var = (b70) obj;
                wq0 wq0Var = ((t3) frameLayout).f7533a;
                if (z10) {
                    wq0Var.f7200e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    mc.a0(wq0Var.f7197a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, hh.i5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    k7 k7Var = wq0Var.f7200e;
                    int i12 = tL_starGiftCollection.collection_id;
                    k7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k7Var.a(i12, arrayList);
                    mc.a0(wq0Var.f7197a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, hh.i5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                b70Var.u();
                wq0Var.n();
                break;
            default:
                ab0 ab0Var = (ab0) frameLayout;
                Context context = (Context) obj3;
                fb0 fb0Var = (fb0) obj2;
                fb0 fb0Var2 = (fb0) obj;
                gb0 gb0Var = ab0Var.V;
                MessagePreviewParams messagePreviewParams = gb0Var.d;
                if (!z10) {
                    new mc(gb0Var, gb0Var.B).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ma0(ab0Var, context, i11))).j();
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    gb0Var.f28589x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (fb0Var != null) {
                            fb0Var.a(false, true);
                        }
                    }
                    fb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    ab0Var.h();
                    ab0Var.k(true);
                }
                break;
        }
    }
}
