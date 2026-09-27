package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kx0;
public final class l3 extends v3 {
    public final w3 f5093x;

    public l3(w3 w3Var) {
        super(w3Var);
        this.f5093x = w3Var;
    }

    @Override
    public final void F(boolean z10) {
        w3 w3Var = this.f5093x;
        org.telegram.ui.ActionBar.w0 w0Var = w3Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        w3Var.f5778s.e(z10, true);
    }

    @Override
    public final void l() {
        kx0 kx0Var = this.f5093x.f5778s;
        super.l();
        if (TextUtils.isEmpty(this.f5669f)) {
            kx0Var.setStickerType(11);
            kx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        kx0Var.setStickerType(1);
        kx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5669f));
    }
}
