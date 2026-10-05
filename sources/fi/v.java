package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f20;
public final class v implements Runnable {
    public final int f9993a;
    public final k0 f9994b;

    public v(k0 k0Var, int i10) {
        this.f9993a = i10;
        this.f9994b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f9993a) {
            case 0:
                k0 k0Var = this.f9994b;
                k0Var.v.d.f26033e3.h1(1, k0Var.U.f11527b);
                k0Var.f9915b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                f20 f20Var = k0Var.f9924y;
                AndroidUtilities.hideKeyboard(f20Var.f26295r);
                f20Var.f26295r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f9994b;
                k0Var2.f9923x.d.f26033e3.h1(1, k0Var2.U.f11527b);
                k0Var2.f9916c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                f20 f20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(f20Var2.f26295r);
                f20Var2.f26295r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f9994b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.f9917e);
                k0Var3.f9921s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
