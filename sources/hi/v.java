package hi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k20;
public final class v implements Runnable {
    public final int f12238a;
    public final k0 f12239b;

    public v(k0 k0Var, int i10) {
        this.f12238a = i10;
        this.f12239b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f12238a) {
            case 0:
                k0 k0Var = this.f12239b;
                k0Var.v.d.V2.h1(1, k0Var.U.f12284b);
                k0Var.f12168b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                k20 k20Var = k0Var.f12176y;
                AndroidUtilities.hideKeyboard(k20Var.f27686r);
                k20Var.f27686r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f12239b;
                k0Var2.f12175x.d.V2.h1(1, k0Var2.U.f12284b);
                k0Var2.f12169c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                k20 k20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(k20Var2.f27686r);
                k20Var2.f27686r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f12239b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f12173s.presentFragment(new o(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
