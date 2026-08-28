package nh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m10;
public final class u implements Runnable {
    public final int f18726a;
    public final j0 f18727b;

    public u(j0 j0Var, int i9) {
        this.f18726a = i9;
        this.f18727b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f18726a) {
            case 0:
                j0 j0Var = this.f18727b;
                j0Var.v.d.T2.h1(1, j0Var.Q.f10849b);
                j0Var.f18649b.a(false, true);
                j0Var.setAllowNestedScroll(true);
                m10 m10Var = j0Var.f18658y;
                AndroidUtilities.hideKeyboard(m10Var.f30664r);
                m10Var.f30664r.clearFocus();
                return;
            case 1:
                j0 j0Var2 = this.f18727b;
                j0Var2.f18657x.d.T2.h1(1, j0Var2.Q.f10849b);
                j0Var2.f18650c.a(false, true);
                j0Var2.setAllowNestedScroll(true);
                m10 m10Var2 = j0Var2.A;
                AndroidUtilities.hideKeyboard(m10Var2.f30664r);
                m10Var2.f30664r.clearFocus();
                return;
            default:
                j0 j0Var3 = this.f18727b;
                j0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", j0Var3.f18651e);
                j0Var3.f18655s.presentFragment(new o(bundle));
                j0Var3.dismiss();
                return;
        }
    }
}
