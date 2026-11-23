package hi;

import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.mv0;
public final class e3 extends l3 {
    public final m3 f14366y;

    public e3(m3 m3Var) {
        super(m3Var);
        this.f14366y = m3Var;
    }

    @Override
    public final void F(boolean z10) {
        m3 m3Var = this.f14366y;
        org.telegram.ui.ActionBar.q0 q0Var = m3Var.H;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
        m3Var.f14904s.e(z10, true);
    }

    @Override
    public final void f() {
        mv0 mv0Var = this.f14366y.f14904s;
        super.f();
        if (TextUtils.isEmpty(this.f14834f)) {
            mv0Var.setStickerType(11);
            mv0Var.d.setText(gd.N0(2131745564, null));
            return;
        }
        mv0Var.setStickerType(1);
        mv0Var.d.setText(gd.a0(null, null, 2131747973, this.f14834f));
    }
}
