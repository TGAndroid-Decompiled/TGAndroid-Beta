package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c20;
public final class v implements Runnable {
    public final int f9179a;
    public final k0 f9180b;

    public v(k0 k0Var, int i10) {
        this.f9179a = i10;
        this.f9180b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f9179a) {
            case 0:
                k0 k0Var = this.f9180b;
                k0Var.v.d.X2.h1(1, k0Var.U.f10577b);
                k0Var.f9108b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                c20 c20Var = k0Var.f9116y;
                AndroidUtilities.hideKeyboard(c20Var.f22890r);
                c20Var.f22890r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f9180b;
                k0Var2.f9115x.d.X2.h1(1, k0Var2.U.f10577b);
                k0Var2.f9109c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                c20 c20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(c20Var2.f22890r);
                c20Var2.f22890r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f9180b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f9113s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
