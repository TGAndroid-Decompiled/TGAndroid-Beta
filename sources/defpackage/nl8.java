package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PremiumPreviewFragment;
public final class nl8 extends n1a {
    public final ia7 f2;
    public final d1a[] g2;
    public final PremiumPreviewFragment h2;

    public nl8(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i, vnb vnbVar, int i2, ia7 ia7Var, d1a[] d1aVarArr) {
        super(premiumPreviewFragment2, activity, true, num, i, true, vnbVar, i2);
        this.h2 = premiumPreviewFragment;
        this.f2 = ia7Var;
        this.g2 = d1aVarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l, num);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            this.h2.v0 = null;
            d1aVar.dismiss();
        }
    }
}
