package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p0 extends tx9 {
    public final kx9[] f2;
    public final r0 g2;

    public p0(r0 r0Var, Context context, Integer num, wjb wjbVar, kx9[] kx9VarArr) {
        super(null, context, true, num, 15, wjbVar);
        this.g2 = r0Var;
        this.f2 = kx9VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && gta.v(this.g2.a, false).k(tL_starGiftUnique.id) != null && na7.c1().getInt("statusgiftpage", 0) < 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        r0 r0Var = this.g2;
        r0Var.c2 = l;
        r0Var.a1();
        r0Var.Z0();
        kx9 kx9Var = this.f2[0];
        if (kx9Var != null) {
            r0Var.d2 = null;
            kx9Var.dismiss();
        }
    }
}
