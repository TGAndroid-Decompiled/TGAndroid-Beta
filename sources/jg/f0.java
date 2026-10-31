package jg;

import android.app.Activity;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.un;
public final class f0 extends un {
    public final r0 f9962jd;

    public f0(r0 r0Var) {
        super(null);
        this.f9962jd = r0Var;
    }

    @Override
    public final boolean J9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.f9962jd.getContext());
    }

    @Override
    public final p6 getResourceProvider() {
        return this.f9962jd.f10203z1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return d20.i(this.currentAccount).f();
    }
}
