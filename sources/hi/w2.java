package hi;

import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kv0;
public final class w2 extends d3 {
    public final e3 f15632y;

    public w2(e3 e3Var) {
        super(e3Var);
        this.f15632y = e3Var;
    }

    @Override
    public final void F(boolean z10) {
        e3 e3Var = this.f15632y;
        org.telegram.ui.ActionBar.r0 r0Var = e3Var.H;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z10);
        }
        e3Var.f14553s.e(z10, true);
    }

    @Override
    public final void f() {
        kv0 kv0Var = this.f15632y.f14553s;
        super.f();
        if (TextUtils.isEmpty(this.f14374f)) {
            kv0Var.setStickerType(11);
            kv0Var.d.setText(gd.M0(2131745565, null));
            return;
        }
        kv0Var.setStickerType(1);
        kv0Var.d.setText(gd.a0(null, null, 2131747974, this.f14374f));
    }
}
