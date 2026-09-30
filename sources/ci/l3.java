package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lx0;
public final class l3 extends v3 {
    public final w3 f4961x;

    public l3(w3 w3Var) {
        super(w3Var);
        this.f4961x = w3Var;
    }

    @Override
    public final void F(boolean z10) {
        w3 w3Var = this.f4961x;
        org.telegram.ui.ActionBar.u0 u0Var = w3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        w3Var.f5731s.e(z10, true);
    }

    @Override
    public final void l() {
        lx0 lx0Var = this.f4961x.f5731s;
        super.l();
        if (TextUtils.isEmpty(this.f5675f)) {
            lx0Var.setStickerType(11);
            lx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        lx0Var.setStickerType(1);
        lx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5675f));
    }
}
