package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lx0;
public final class m3 extends w3 {
    public final x3 f5036x;

    public m3(x3 x3Var) {
        super(x3Var);
        this.f5036x = x3Var;
    }

    @Override
    public final void F(boolean z10) {
        x3 x3Var = this.f5036x;
        org.telegram.ui.ActionBar.v0 v0Var = x3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        x3Var.f5747s.e(z10, true);
    }

    @Override
    public final void l() {
        lx0 lx0Var = this.f5036x.f5747s;
        super.l();
        if (TextUtils.isEmpty(this.f5687f)) {
            lx0Var.setStickerType(11);
            lx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        lx0Var.setStickerType(1);
        lx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5687f));
    }
}
