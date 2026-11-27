package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class v38 extends n1a {
    public final z38 f2;
    public final d1a[] g2;
    public final a48 h2;

    public v38(a48 a48Var, e eVar, Context context, Integer num, int i, vnb vnbVar, int i2, int i3, z38 z38Var, d1a[] d1aVarArr) {
        super(eVar, context, true, num, i, true, vnbVar, i2, i3);
        this.h2 = a48Var;
        this.f2 = z38Var;
        this.g2 = d1aVarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        a48 a48Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (!a48Var.n0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    a48Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                    a48Var.r = null;
                } else {
                    return;
                }
            } else {
                a48Var.s = null;
                a48Var.r = uc7.p0(tL_starGiftUnique);
            }
            a48Var.J = null;
            a48Var.h = -1;
        } else {
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            a48Var.n = longValue;
            a48Var.r = null;
            a48Var.s = null;
            a48Var.J = null;
        }
        this.f2.b(true);
        a48Var.j(true);
        a48Var.i();
        a48Var.f(true);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            a48Var.p0 = null;
            d1aVar.dismiss();
        }
    }
}
