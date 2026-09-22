package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b20;
public final class v implements Runnable {
    public final int f9193a;
    public final k0 f9194b;

    public v(k0 k0Var, int i10) {
        this.f9193a = i10;
        this.f9194b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f9193a) {
            case 0:
                k0 k0Var = this.f9194b;
                k0Var.v.d.X2.h1(1, k0Var.U.f10591b);
                k0Var.f9122b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                b20 b20Var = k0Var.f9130y;
                AndroidUtilities.hideKeyboard(b20Var.f22569r);
                b20Var.f22569r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f9194b;
                k0Var2.f9129x.d.X2.h1(1, k0Var2.U.f10591b);
                k0Var2.f9123c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                b20 b20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(b20Var2.f22569r);
                b20Var2.f22569r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f9194b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f9127s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
