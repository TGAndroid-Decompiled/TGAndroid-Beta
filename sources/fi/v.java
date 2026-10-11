package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t20;
public final class v implements Runnable {
    public final int f10067a;
    public final k0 f10068b;

    public v(k0 k0Var, int i10) {
        this.f10067a = i10;
        this.f10068b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f10067a) {
            case 0:
                k0 k0Var = this.f10068b;
                k0Var.v.d.V2.h1(1, k0Var.U.f11576b);
                k0Var.f9989b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                t20 t20Var = k0Var.f9998y;
                AndroidUtilities.hideKeyboard(t20Var.f30964r);
                t20Var.f30964r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f10068b;
                k0Var2.f9997x.d.V2.h1(1, k0Var2.U.f11576b);
                k0Var2.f9990c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                t20 t20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(t20Var2.f30964r);
                t20Var2.f30964r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f10068b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.f9991e);
                k0Var3.f9995s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
