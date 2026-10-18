package hi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k20;
public final class v implements Runnable {
    public final int f12239a;
    public final k0 f12240b;

    public v(k0 k0Var, int i10) {
        this.f12239a = i10;
        this.f12240b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f12239a) {
            case 0:
                k0 k0Var = this.f12240b;
                k0Var.v.d.V2.h1(1, k0Var.U.f12285b);
                k0Var.f12169b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                k20 k20Var = k0Var.f12177y;
                AndroidUtilities.hideKeyboard(k20Var.f27712r);
                k20Var.f27712r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f12240b;
                k0Var2.f12176x.d.V2.h1(1, k0Var2.U.f12285b);
                k0Var2.f12170c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                k20 k20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(k20Var2.f27712r);
                k20Var2.f27712r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f12240b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f12174s.presentFragment(new o(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
