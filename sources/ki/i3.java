package ki;

import android.os.Bundle;
import org.telegram.ui.an;
public final class i3 extends an {
    public final org.telegram.ui.ActionBar.u2 f18365ud;

    public i3(Bundle bundle, org.telegram.ui.ActionBar.u2 u2Var) {
        super(bundle);
        this.f18365ud = u2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.u2 u2Var = this.f18365ud;
        u2Var.a0(null);
        u2Var.show();
    }
}
