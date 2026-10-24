package hi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i20;
public final class v implements Runnable {
    public final int f12270a;
    public final k0 f12271b;

    public v(k0 k0Var, int i10) {
        this.f12270a = i10;
        this.f12271b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f12270a) {
            case 0:
                k0 k0Var = this.f12271b;
                k0Var.v.d.Y2.h1(1, k0Var.U.f12316b);
                k0Var.f12199b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                i20 i20Var = k0Var.f12207y;
                AndroidUtilities.hideKeyboard(i20Var.f27258r);
                i20Var.f27258r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f12271b;
                k0Var2.f12206x.d.Y2.h1(1, k0Var2.U.f12316b);
                k0Var2.f12200c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                i20 i20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(i20Var2.f27258r);
                i20Var2.f27258r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f12271b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f12204s.presentFragment(new o(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
