package defpackage;

import android.os.Bundle;
public final class kx5 extends d61 {
    public final uj3 f;

    public kx5(Bundle bundle, uj3 uj3Var) {
        super(bundle);
        this.f = uj3Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && !z2) {
            this.f.removeSelfFromStack();
        }
    }
}
