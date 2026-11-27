package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class eh1 extends n1a {
    public final zg1 f2;
    public final d1a[] g2;
    public final wh1 h2;

    public eh1(wh1 wh1Var, wh1 wh1Var2, Activity activity, Integer num, int i, vnb vnbVar, int i2, int i3, zg1 zg1Var, d1a[] d1aVarArr) {
        super(wh1Var2, activity, true, num, i, true, vnbVar, i2, i3);
        this.h2 = wh1Var;
        this.f2 = zg1Var;
        this.g2 = d1aVarArr;
    }

    @Override
    public final long getDialogId() {
        return this.h2.a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        this.f2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            this.h2.R = null;
            d1aVar.dismiss();
        }
    }
}
