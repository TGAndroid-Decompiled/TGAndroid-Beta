package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class x29 extends vz9 {
    public final z29 f2;
    public final mz9[] g2;
    public final a39 h2;

    public x29(a39 a39Var, a39 a39Var2, Activity activity, Integer num, z29 z29Var, mz9[] mz9VarArr) {
        super(a39Var2, activity, false, num, 2, null);
        this.h2 = a39Var;
        this.f2 = z29Var;
        this.g2 = mz9VarArr;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        if (l != null) {
            a39 a39Var = this.h2;
            i = ((d) a39Var).currentAccount;
            hs6 d0 = hs6.d0(i);
            d0.c2("animated_" + l);
            this.f2.a(true);
            mz9 mz9Var = this.g2[0];
            if (mz9Var != null) {
                a39Var.n = null;
                mz9Var.dismiss();
            }
        }
    }

    @Override
    public final void q(fz9 fz9Var, k39 k39Var) {
        int i;
        a39 a39Var = this.h2;
        i = ((d) a39Var).currentAccount;
        hs6.d0(i).c2(k39Var.f);
        this.f2.a(true);
        mz9 mz9Var = this.g2[0];
        if (mz9Var != null) {
            a39Var.n = null;
            mz9Var.dismiss();
        }
    }
}
