package fi;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f20;
public final class v implements Runnable {
    public final int f9992a;
    public final k0 f9993b;

    public v(k0 k0Var, int i10) {
        this.f9992a = i10;
        this.f9993b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f9992a) {
            case 0:
                k0 k0Var = this.f9993b;
                k0Var.v.d.f25243e3.h1(1, k0Var.U.f11526b);
                k0Var.f9914b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                f20 f20Var = k0Var.f9923y;
                AndroidUtilities.hideKeyboard(f20Var.f26246r);
                f20Var.f26246r.clearFocus();
                return;
            case 1:
                k0 k0Var2 = this.f9993b;
                k0Var2.f9922x.d.f25243e3.h1(1, k0Var2.U.f11526b);
                k0Var2.f9915c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                f20 f20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(f20Var2.f26246r);
                f20Var2.f26246r.clearFocus();
                return;
            default:
                k0 k0Var3 = this.f9993b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.f9916e);
                k0Var3.f9920s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                return;
        }
    }
}
