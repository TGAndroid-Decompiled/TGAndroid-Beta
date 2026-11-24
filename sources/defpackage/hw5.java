package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class hw5 extends mu1 {
    public final rw5 vd;

    public hw5(rw5 rw5Var) {
        super(null);
        this.vd = rw5Var;
    }

    @Override
    public final boolean O7() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return gl.W(this.vd.getContext());
    }

    @Override
    public final wjb getResourceProvider() {
        return this.vd.G1;
    }

    @Override
    public final TLRPC.User h() {
        return y6c.h(this.currentAccount).f();
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }
}
