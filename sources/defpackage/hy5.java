package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class hy5 extends yv1 {
    public final ry5 Gd;

    public hy5(ry5 ry5Var) {
        super(null);
        this.Gd = ry5Var;
    }

    @Override
    public final boolean Y7() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return gm.W(this.Gd.getContext());
    }

    @Override
    public final ylb getResourceProvider() {
        return this.Gd.G1;
    }

    @Override
    public final TLRPC.User h() {
        return z8c.h(this.currentAccount).f();
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }
}
