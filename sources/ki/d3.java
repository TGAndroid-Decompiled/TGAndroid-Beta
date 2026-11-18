package ki;

import android.os.Bundle;
import org.telegram.ui.bn;
public final class d3 extends bn {
    public final org.telegram.ui.ActionBar.x2 f18627vd;

    public d3(Bundle bundle, org.telegram.ui.ActionBar.x2 x2Var) {
        super(bundle);
        this.f18627vd = x2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.x2 x2Var = this.f18627vd;
        x2Var.a0(null);
        x2Var.show();
    }
}
