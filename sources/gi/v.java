package gi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o20;
public final class v implements Runnable {
    public final int f10275a;
    public final k0 f10276b;

    public v(k0 k0Var, int i10) {
        this.f10275a = i10;
        this.f10276b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f10275a) {
            case 0:
                k0 k0Var = this.f10276b;
                k0Var.v.d.V2.h1(1, k0Var.U.f10893b);
                k0Var.f10204b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                o20 o20Var = k0Var.f10212y;
                AndroidUtilities.hideKeyboard(o20Var.f27510r);
                o20Var.f27510r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f10276b;
                k0Var2.f10211x.d.V2.h1(1, k0Var2.U.f10893b);
                k0Var2.f10205c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                o20 o20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(o20Var2.f27510r);
                o20Var2.f27510r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f10276b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f10209s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
