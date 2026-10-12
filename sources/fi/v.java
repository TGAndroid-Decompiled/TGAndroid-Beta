package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v20;
public final class v implements Runnable {
    public final int f10066a;
    public final k0 f10067b;

    public v(k0 k0Var, int i10) {
        this.f10066a = i10;
        this.f10067b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f10066a) {
            case 0:
                k0 k0Var = this.f10067b;
                k0Var.v.d.V2.h1(1, k0Var.U.f11575b);
                k0Var.f9988b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                v20 v20Var = k0Var.f9997y;
                AndroidUtilities.hideKeyboard(v20Var.f31362r);
                v20Var.f31362r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f10067b;
                k0Var2.f9996x.d.V2.h1(1, k0Var2.U.f11575b);
                k0Var2.f9989c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                v20 v20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(v20Var2.f31362r);
                v20Var2.f31362r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f10067b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.f9990e);
                k0Var3.f9994s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
