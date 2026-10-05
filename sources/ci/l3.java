package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ux0;
public final class l3 extends v3 {
    public final w3 f5488x;

    public l3(w3 w3Var) {
        super(w3Var);
        this.f5488x = w3Var;
    }

    @Override
    public final void F(boolean z10) {
        w3 w3Var = this.f5488x;
        org.telegram.ui.ActionBar.v0 v0Var = w3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        w3Var.f6224s.e(z10, true);
    }

    @Override
    public final void l() {
        ux0 ux0Var = this.f5488x.f6224s;
        super.l();
        if (TextUtils.isEmpty(this.f6108f)) {
            ux0Var.setStickerType(11);
            ux0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        ux0Var.setStickerType(1);
        ux0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f6108f));
    }
}
