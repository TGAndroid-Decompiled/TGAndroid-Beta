package ei;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k20;
public final class v implements Runnable {
    public final int f7640a;
    public final k0 f7641b;

    public v(k0 k0Var, int i10) {
        this.f7640a = i10;
        this.f7641b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f7640a) {
            case 0:
                k0 k0Var = this.f7641b;
                k0Var.v.d.X2.h1(1, k0Var.U.f10075b);
                k0Var.f7569b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                k20 k20Var = k0Var.f7577y;
                AndroidUtilities.hideKeyboard(k20Var.f24572r);
                k20Var.f24572r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f7641b;
                k0Var2.f7576x.d.X2.h1(1, k0Var2.U.f10075b);
                k0Var2.f7570c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                k20 k20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(k20Var2.f24572r);
                k20Var2.f24572r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f7641b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.f7574s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
