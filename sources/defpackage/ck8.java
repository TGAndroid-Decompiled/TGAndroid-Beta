package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PremiumPreviewFragment;
public final class ck8 extends vz9 {
    public final s87 f2;
    public final mz9[] g2;
    public final PremiumPreviewFragment h2;

    public ck8(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i, ylb ylbVar, int i2, s87 s87Var, mz9[] mz9VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i, true, ylbVar, i2);
        this.h2 = premiumPreviewFragment;
        this.f2 = s87Var;
        this.g2 = mz9VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l, num);
        mz9 mz9Var = this.g2[0];
        if (mz9Var != null) {
            this.h2.v0 = null;
            mz9Var.dismiss();
        }
    }
}
