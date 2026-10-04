package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tx0;
public final class l3 extends v3 {
    public final w3 f5487x;

    public l3(w3 w3Var) {
        super(w3Var);
        this.f5487x = w3Var;
    }

    @Override
    public final void F(boolean z10) {
        w3 w3Var = this.f5487x;
        org.telegram.ui.ActionBar.v0 v0Var = w3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        w3Var.f6223s.e(z10, true);
    }

    @Override
    public final void l() {
        tx0 tx0Var = this.f5487x.f6223s;
        super.l();
        if (TextUtils.isEmpty(this.f6107f)) {
            tx0Var.setStickerType(11);
            tx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        tx0Var.setStickerType(1);
        tx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f6107f));
    }
}
