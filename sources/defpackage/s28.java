package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class s28 extends vz9 {
    public final v28 f2;
    public final mz9[] g2;
    public final w28 h2;

    public s28(w28 w28Var, d dVar, Context context, Integer num, int i, ylb ylbVar, int i2, int i3, v28 v28Var, mz9[] mz9VarArr) {
        super(dVar, context, true, num, i, true, ylbVar, i2, i3);
        this.h2 = w28Var;
        this.f2 = v28Var;
        this.g2 = mz9VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        w28 w28Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (!w28Var.n0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    w28Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                    w28Var.r = null;
                } else {
                    return;
                }
            } else {
                w28Var.s = null;
                w28Var.r = oc7.n0(tL_starGiftUnique);
            }
            w28Var.J = null;
            w28Var.h = -1;
        } else {
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            w28Var.n = longValue;
            w28Var.r = null;
            w28Var.s = null;
            w28Var.J = null;
        }
        this.f2.b(true);
        w28Var.j(true);
        w28Var.i();
        w28Var.f(true);
        mz9 mz9Var = this.g2[0];
        if (mz9Var != null) {
            w28Var.p0 = null;
            mz9Var.dismiss();
        }
    }
}
