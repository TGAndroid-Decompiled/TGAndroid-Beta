package hi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k20;
public final class v implements Runnable {
    public final int f12241a;
    public final k0 f12242b;

    public v(k0 k0Var, int i10) {
        this.f12241a = i10;
        this.f12242b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f12241a) {
            case 0:
                k0 k0Var = this.f12242b;
                k0Var.v.d.V2.h1(1, k0Var.U.f12287b);
                k0Var.f12171b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                k20 k20Var = k0Var.f12179y;
                AndroidUtilities.hideKeyboard(k20Var.f27719r);
                k20Var.f27719r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f12242b;
                k0Var2.f12178x.d.V2.h1(1, k0Var2.U.f12287b);
                k0Var2.f12172c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                k20 k20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(k20Var2.f27719r);
                k20Var2.f27719r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f12242b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f12176s.presentFragment(new o(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
