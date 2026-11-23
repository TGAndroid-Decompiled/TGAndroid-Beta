package hi;

import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.nv0;
public final class v2 extends c3 {
    public final d3 f15521y;

    public v2(d3 d3Var) {
        super(d3Var);
        this.f15521y = d3Var;
    }

    @Override
    public final void F(boolean z10) {
        d3 d3Var = this.f15521y;
        org.telegram.ui.ActionBar.q0 q0Var = d3Var.H;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
        d3Var.f14350s.e(z10, true);
    }

    @Override
    public final void f() {
        nv0 nv0Var = this.f15521y.f14350s;
        super.f();
        if (TextUtils.isEmpty(this.f14266f)) {
            nv0Var.setStickerType(11);
            nv0Var.d.setText(hd.N0(2131745564, null));
            return;
        }
        nv0Var.setStickerType(1);
        nv0Var.d.setText(hd.a0(null, null, 2131747973, this.f14266f));
    }
}
