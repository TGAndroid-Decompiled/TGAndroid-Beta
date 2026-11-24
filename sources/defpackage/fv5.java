package defpackage;

import android.os.Bundle;
public final class fv5 extends v51 {
    public final cj3 f;

    public fv5(Bundle bundle, cj3 cj3Var) {
        super(bundle);
        this.f = cj3Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && !z2) {
            this.f.removeSelfFromStack();
        }
    }
}
