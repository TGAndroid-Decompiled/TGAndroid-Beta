package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f20;
public final class v implements Runnable {
    public final int f9190a;
    public final k0 f9191b;

    public v(k0 k0Var, int i10) {
        this.f9190a = i10;
        this.f9191b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f9190a) {
            case 0:
                k0 k0Var = this.f9191b;
                k0Var.v.d.f28777e3.h1(1, k0Var.U.f10591b);
                k0Var.f9119b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                f20 f20Var = k0Var.f9127y;
                AndroidUtilities.hideKeyboard(f20Var.f24137r);
                f20Var.f24137r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f9191b;
                k0Var2.f9126x.d.f28777e3.h1(1, k0Var2.U.f10591b);
                k0Var2.f9120c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                f20 f20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(f20Var2.f24137r);
                f20Var2.f24137r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f9191b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f9124s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
