package mh;

import android.os.Bundle;
import org.telegram.ui.dy;
public final class j1 extends dy {
    public final bg.y0 f17926x4;
    public final l1 f17927y4;

    public j1(l1 l1Var, Bundle bundle, bg.y0 y0Var) {
        super(bundle);
        this.f17927y4 = l1Var;
        this.f17926x4 = y0Var;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l1 l1Var = this.f17927y4;
        if (!l1Var.Y) {
            l1Var.Y = true;
            this.f17926x4.run("USER_DECLINED", null);
        }
    }
}
