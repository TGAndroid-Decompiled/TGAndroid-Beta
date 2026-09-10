package di;

import android.os.Bundle;
import org.telegram.ui.wy;
public final class q1 extends wy {
    public final org.telegram.tgnet.g B4;
    public final s1 C4;

    public q1(s1 s1Var, Bundle bundle, org.telegram.tgnet.g gVar) {
        super(bundle);
        this.C4 = s1Var;
        this.B4 = gVar;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        s1 s1Var = this.C4;
        if (!s1Var.f6894c0) {
            s1Var.f6894c0 = true;
            this.B4.run("USER_DECLINED", null);
        }
    }
}
