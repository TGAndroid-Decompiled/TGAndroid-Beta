package jg;

import android.app.Activity;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.un;
public final class f0 extends un {
    public final r0 f9963kd;

    public f0(r0 r0Var) {
        super(null);
        this.f9963kd = r0Var;
    }

    @Override
    public final boolean O9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.f9963kd.getContext());
    }

    @Override
    public final p6 getResourceProvider() {
        return this.f9963kd.f10204z1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return e20.i(this.currentAccount).f();
    }
}
