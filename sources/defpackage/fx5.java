package defpackage;

import android.os.Bundle;
public final class fx5 extends c71 {
    public final nk3 f;

    public fx5(Bundle bundle, nk3 nk3Var) {
        super(bundle);
        this.f = nk3Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && !z2) {
            this.f.removeSelfFromStack();
        }
    }
}
