package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class di1 extends vz9 {
    public final yh1 f2;
    public final mz9[] g2;
    public final vi1 h2;

    public di1(vi1 vi1Var, vi1 vi1Var2, Activity activity, Integer num, int i, ylb ylbVar, int i2, int i3, yh1 yh1Var, mz9[] mz9VarArr) {
        super(vi1Var2, activity, true, num, i, true, ylbVar, i2, i3);
        this.h2 = vi1Var;
        this.f2 = yh1Var;
        this.g2 = mz9VarArr;
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
        mz9 mz9Var = this.g2[0];
        if (mz9Var != null) {
            this.h2.R = null;
            mz9Var.dismiss();
        }
    }
}
