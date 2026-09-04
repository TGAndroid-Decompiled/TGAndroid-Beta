package gi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b20;
public final class v implements Runnable {
    public final int f10787a;
    public final k0 f10788b;

    public v(k0 k0Var, int i10) {
        this.f10787a = i10;
        this.f10788b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f10787a) {
            case 0:
                k0 k0Var = this.f10788b;
                k0Var.v.d.X2.h1(1, k0Var.U.f11426b);
                k0Var.f10709b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                b20 b20Var = k0Var.f10718y;
                AndroidUtilities.hideKeyboard(b20Var.f24522r);
                b20Var.f24522r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f10788b;
                k0Var2.f10717x.d.X2.h1(1, k0Var2.U.f11426b);
                k0Var2.f10710c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                b20 b20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(b20Var2.f24522r);
                b20Var2.f24522r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f10788b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.f10711e);
                k0Var3.f10715s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
