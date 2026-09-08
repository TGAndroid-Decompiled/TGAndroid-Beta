package gi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b20;
public final class v implements Runnable {
    public final int f10815a;
    public final k0 f10816b;

    public v(k0 k0Var, int i10) {
        this.f10815a = i10;
        this.f10816b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f10815a) {
            case 0:
                k0 k0Var = this.f10816b;
                k0Var.v.d.X2.h1(1, k0Var.U.f11452b);
                k0Var.f10737b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                b20 b20Var = k0Var.f10746y;
                AndroidUtilities.hideKeyboard(b20Var.f24549r);
                b20Var.f24549r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f10816b;
                k0Var2.f10745x.d.X2.h1(1, k0Var2.U.f11452b);
                k0Var2.f10738c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                b20 b20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(b20Var2.f24549r);
                b20Var2.f24549r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f10816b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.f10739e);
                k0Var3.f10743s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
