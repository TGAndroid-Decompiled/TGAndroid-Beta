package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kx0;
public final class m3 extends w3 {
    public final x3 f5037x;

    public m3(x3 x3Var) {
        super(x3Var);
        this.f5037x = x3Var;
    }

    @Override
    public final void F(boolean z10) {
        x3 x3Var = this.f5037x;
        org.telegram.ui.ActionBar.v0 v0Var = x3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        x3Var.f5748s.e(z10, true);
    }

    @Override
    public final void l() {
        kx0 kx0Var = this.f5037x.f5748s;
        super.l();
        if (TextUtils.isEmpty(this.f5688f)) {
            kx0Var.setStickerType(11);
            kx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        kx0Var.setStickerType(1);
        kx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5688f));
    }
}
