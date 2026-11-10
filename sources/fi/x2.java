package fi;

import android.text.TextUtils;
import org.telegram.messenger.id;
import org.telegram.ui.Components.bv0;
public final class x2 extends e3 {
    public final f3 f13077y;

    public x2(f3 f3Var) {
        super(f3Var);
        this.f13077y = f3Var;
    }

    @Override
    public final void F(boolean z9) {
        f3 f3Var = this.f13077y;
        org.telegram.ui.ActionBar.r0 r0Var = f3Var.G;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
        f3Var.f11976s.e(z9, true);
    }

    @Override
    public final void f() {
        bv0 bv0Var = this.f13077y.f11976s;
        super.f();
        if (TextUtils.isEmpty(this.f11871f)) {
            bv0Var.setStickerType(11);
            bv0Var.d.setText(id.M0(2131745760, null));
            return;
        }
        bv0Var.setStickerType(1);
        bv0Var.d.setText(id.a0(null, null, 2131748166, this.f11871f));
    }
}
