package ki;

import android.os.Bundle;
import org.telegram.ui.cx;
public final class f1 extends cx {
    public final bi.h0 G4;
    public final h1 H4;

    public f1(h1 h1Var, Bundle bundle, bi.h0 h0Var) {
        super(bundle);
        this.H4 = h1Var;
        this.G4 = h0Var;
    }

    @Override
    public final boolean U3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        h1 h1Var = this.H4;
        if (!h1Var.Y1) {
            h1Var.Y1 = true;
            this.G4.a("USER_DECLINED", null);
        }
    }
}
