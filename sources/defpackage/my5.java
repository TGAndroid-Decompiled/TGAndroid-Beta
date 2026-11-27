package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class my5 extends zu1 {
    public final wy5 Jd;

    public my5(wy5 wy5Var) {
        super(null);
        this.Jd = wy5Var;
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
        return hl.W(this.Jd.getContext());
    }

    @Override
    public final vnb getResourceProvider() {
        return this.Jd.A1;
    }

    @Override
    public final TLRPC.User h() {
        return yac.h(this.currentAccount).f();
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }
}
