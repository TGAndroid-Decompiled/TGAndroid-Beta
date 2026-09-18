package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b20;
public final class v implements Runnable {
    public final int f9196a;
    public final k0 f9197b;

    public v(k0 k0Var, int i10) {
        this.f9196a = i10;
        this.f9197b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f9196a) {
            case 0:
                k0 k0Var = this.f9197b;
                k0Var.v.d.X2.h1(1, k0Var.U.f10592b);
                k0Var.f9125b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                b20 b20Var = k0Var.f9133y;
                AndroidUtilities.hideKeyboard(b20Var.f22546r);
                b20Var.f22546r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f9197b;
                k0Var2.f9132x.d.X2.h1(1, k0Var2.U.f10592b);
                k0Var2.f9126c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                b20 b20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(b20Var2.f22546r);
                b20Var2.f22546r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f9197b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f9130s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
