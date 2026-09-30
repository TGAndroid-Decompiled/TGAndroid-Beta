package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kx0;
public final class l3 extends v3 {
    public final w3 f4954x;

    public l3(w3 w3Var) {
        super(w3Var);
        this.f4954x = w3Var;
    }

    @Override
    public final void F(boolean z10) {
        w3 w3Var = this.f4954x;
        org.telegram.ui.ActionBar.u0 u0Var = w3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        w3Var.f5719s.e(z10, true);
    }

    @Override
    public final void l() {
        kx0 kx0Var = this.f4954x.f5719s;
        super.l();
        if (TextUtils.isEmpty(this.f5663f)) {
            kx0Var.setStickerType(11);
            kx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        kx0Var.setStickerType(1);
        kx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5663f));
    }
}
