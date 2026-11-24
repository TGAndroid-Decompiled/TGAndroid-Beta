package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class v09 extends tx9 {
    public final x09 f2;
    public final kx9[] g2;
    public final y09 h2;

    public v09(y09 y09Var, y09 y09Var2, Activity activity, Integer num, x09 x09Var, kx9[] kx9VarArr) {
        super(y09Var2, activity, false, num, 2, null);
        this.h2 = y09Var;
        this.f2 = x09Var;
        this.g2 = kx9VarArr;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        if (l != null) {
            y09 y09Var = this.h2;
            i = ((d) y09Var).currentAccount;
            hq6 d0 = hq6.d0(i);
            d0.c2("animated_" + l);
            this.f2.a(true);
            kx9 kx9Var = this.g2[0];
            if (kx9Var != null) {
                y09Var.n = null;
                kx9Var.dismiss();
            }
        }
    }

    @Override
    public final void q(dx9 dx9Var, h19 h19Var) {
        int i;
        y09 y09Var = this.h2;
        i = ((d) y09Var).currentAccount;
        hq6.d0(i).c2(h19Var.f);
        this.f2.a(true);
        kx9 kx9Var = this.g2[0];
        if (kx9Var != null) {
            y09Var.n = null;
            kx9Var.dismiss();
        }
    }
}
