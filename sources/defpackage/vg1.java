package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vg1 extends tx9 {
    public final qg1 f2;
    public final kx9[] g2;
    public final nh1 h2;

    public vg1(nh1 nh1Var, nh1 nh1Var2, Activity activity, Integer num, int i, wjb wjbVar, int i2, int i3, qg1 qg1Var, kx9[] kx9VarArr) {
        super(nh1Var2, activity, true, num, i, true, wjbVar, i2, i3);
        this.h2 = nh1Var;
        this.f2 = qg1Var;
        this.g2 = kx9VarArr;
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
        kx9 kx9Var = this.g2[0];
        if (kx9Var != null) {
            this.h2.R = null;
            kx9Var.dismiss();
        }
    }
}
