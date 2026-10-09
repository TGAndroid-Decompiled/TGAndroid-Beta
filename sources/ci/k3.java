package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ay0;
public final class k3 extends u3 {
    public final v3 f5314x;

    public k3(v3 v3Var) {
        super(v3Var);
        this.f5314x = v3Var;
    }

    @Override
    public final void F(boolean z10) {
        v3 v3Var = this.f5314x;
        org.telegram.ui.ActionBar.v0 v0Var = v3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        v3Var.f6144s.e(z10, true);
    }

    @Override
    public final void l() {
        ay0 ay0Var = this.f5314x.f6144s;
        super.l();
        if (TextUtils.isEmpty(this.f6058f)) {
            ay0Var.setStickerType(11);
            ay0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        ay0Var.setStickerType(1);
        ay0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f6058f));
    }
}
