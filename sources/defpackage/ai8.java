package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PremiumPreviewFragment;
public final class ai8 extends tx9 {
    public final w77 f2;
    public final kx9[] g2;
    public final PremiumPreviewFragment h2;

    public ai8(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i, wjb wjbVar, int i2, w77 w77Var, kx9[] kx9VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i, true, wjbVar, i2);
        this.h2 = premiumPreviewFragment;
        this.f2 = w77Var;
        this.g2 = kx9VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l, num);
        kx9 kx9Var = this.g2[0];
        if (kx9Var != null) {
            this.h2.v0 = null;
            kx9Var.dismiss();
        }
    }
}
