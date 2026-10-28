package ii;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m20;
public final class u implements Runnable {
    public final int f14431a;
    public final j0 f14432b;

    public u(j0 j0Var, int i10) {
        this.f14431a = i10;
        this.f14432b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f14431a) {
            case 0:
                j0 j0Var = this.f14432b;
                j0Var.v.d.f32503f3.h1(1, j0Var.U.f13450b);
                j0Var.f14357b.a(false, true);
                j0Var.setAllowNestedScroll(true);
                m20 m20Var = j0Var.f14365y;
                AndroidUtilities.hideKeyboard(m20Var.f30347r);
                m20Var.f30347r.clearFocus();
                return;
            case 1:
                j0 j0Var2 = this.f14432b;
                j0Var2.f14364x.d.f32503f3.h1(1, j0Var2.U.f13450b);
                j0Var2.f14358c.a(false, true);
                j0Var2.setAllowNestedScroll(true);
                m20 m20Var2 = j0Var2.E;
                AndroidUtilities.hideKeyboard(m20Var2.f30347r);
                m20Var2.f30347r.clearFocus();
                return;
            default:
                j0 j0Var3 = this.f14432b;
                j0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", j0Var3.e);
                j0Var3.f14362s.presentFragment(new o(bundle));
                j0Var3.dismiss();
                return;
        }
    }
}
