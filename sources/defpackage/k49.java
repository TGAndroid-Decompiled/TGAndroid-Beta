package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class k49 extends n1a {
    public final m49 f2;
    public final d1a[] g2;
    public final n49 h2;

    public k49(n49 n49Var, n49 n49Var2, Activity activity, Integer num, m49 m49Var, d1a[] d1aVarArr) {
        super(n49Var2, activity, false, num, 2, null);
        this.h2 = n49Var;
        this.f2 = m49Var;
        this.g2 = d1aVarArr;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        if (l != null) {
            n49 n49Var = this.h2;
            i = ((e) n49Var).currentAccount;
            ls6 d0 = ls6.d0(i);
            d0.c2("animated_" + l);
            this.f2.a(true);
            d1a d1aVar = this.g2[0];
            if (d1aVar != null) {
                n49Var.n = null;
                d1aVar.dismiss();
            }
        }
    }

    @Override
    public final void q(w0a w0aVar, w49 w49Var) {
        int i;
        n49 n49Var = this.h2;
        i = ((e) n49Var).currentAccount;
        ls6.d0(i).c2(w49Var.f);
        this.f2.a(true);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            n49Var.n = null;
            d1aVar.dismiss();
        }
    }
}
