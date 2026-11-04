package gi;

import android.text.TextUtils;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.zu0;
public final class v2 extends c3 {
    public final d3 f13682y;

    public v2(d3 d3Var) {
        super(d3Var);
        this.f13682y = d3Var;
    }

    @Override
    public final void F(boolean z10) {
        d3 d3Var = this.f13682y;
        org.telegram.ui.ActionBar.q0 q0Var = d3Var.H;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
        d3Var.f12576s.e(z10, true);
    }

    @Override
    public final void f() {
        zu0 zu0Var = this.f13682y.f12576s;
        super.f();
        if (TextUtils.isEmpty(this.f12481f)) {
            zu0Var.setStickerType(11);
            zu0Var.d.setText(bd.M0(2131745770, null));
            return;
        }
        zu0Var.setStickerType(1);
        zu0Var.d.setText(bd.a0(null, null, 2131748174, this.f12481f));
    }
}
