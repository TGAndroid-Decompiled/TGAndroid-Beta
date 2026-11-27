package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q0 extends n1a {
    public final d1a[] f2;
    public final s0 g2;

    public q0(s0 s0Var, Context context, Integer num, vnb vnbVar, d1a[] d1aVarArr) {
        super(null, context, true, num, 15, vnbVar);
        this.g2 = s0Var;
        this.f2 = d1aVarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && jxa.v(this.g2.a, false).k(tL_starGiftUnique.id) != null && uc7.e1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s0 s0Var = this.g2;
        s0Var.c2 = l;
        s0Var.b1();
        s0Var.a1();
        d1a d1aVar = this.f2[0];
        if (d1aVar != null) {
            s0Var.d2 = null;
            d1aVar.dismiss();
        }
    }
}
