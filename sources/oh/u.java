package oh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p10;

public final class u implements Runnable {

    public final int f19575a;

    public final j0 f19576b;

    public u(j0 j0Var, int i10) {
        this.f19575a = i10;
        this.f19576b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f19575a) {
            case 0:
                j0 j0Var = this.f19576b;
                j0Var.v.d.T2.h1(1, j0Var.Q.f10490b);
                j0Var.f19498b.a(false, true);
                j0Var.setAllowNestedScroll(true);
                p10 p10Var = j0Var.f19507y;
                AndroidUtilities.hideKeyboard(p10Var.f31468r);
                p10Var.f31468r.clearFocus();
                break;
            case 1:
                j0 j0Var2 = this.f19576b;
                j0Var2.f19506x.d.T2.h1(1, j0Var2.Q.f10490b);
                j0Var2.f19499c.a(false, true);
                j0Var2.setAllowNestedScroll(true);
                p10 p10Var2 = j0Var2.A;
                AndroidUtilities.hideKeyboard(p10Var2.f31468r);
                p10Var2.f31468r.clearFocus();
                break;
            default:
                j0 j0Var3 = this.f19576b;
                j0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", j0Var3.f19500e);
                j0Var3.f19504s.presentFragment(new o(bundle));
                j0Var3.dismiss();
                break;
        }
    }
}
