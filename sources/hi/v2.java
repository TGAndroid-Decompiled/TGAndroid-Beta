package hi;

import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cv0;
public final class v2 extends c3 {
    public final d3 f15215y;

    public v2(d3 d3Var) {
        super(d3Var);
        this.f15215y = d3Var;
    }

    @Override
    public final void F(boolean z10) {
        d3 d3Var = this.f15215y;
        org.telegram.ui.ActionBar.q0 q0Var = d3Var.H;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
        d3Var.f14116s.e(z10, true);
    }

    @Override
    public final void f() {
        cv0 cv0Var = this.f15215y.f14116s;
        super.f();
        if (TextUtils.isEmpty(this.f13972f)) {
            cv0Var.setStickerType(11);
            cv0Var.d.setText(hd.M0(2131745760, null));
            return;
        }
        cv0Var.setStickerType(1);
        cv0Var.d.setText(hd.a0(null, null, 2131748166, this.f13972f));
    }
}
