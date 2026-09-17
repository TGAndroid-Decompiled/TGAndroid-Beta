package di;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xw0;
public final class m3 extends w3 {
    public final x3 f7664x;

    public m3(x3 x3Var) {
        super(x3Var);
        this.f7664x = x3Var;
    }

    @Override
    public final void F(boolean z10) {
        x3 x3Var = this.f7664x;
        org.telegram.ui.ActionBar.v0 v0Var = x3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        x3Var.f8406s.e(z10, true);
    }

    @Override
    public final void l() {
        xw0 xw0Var = this.f7664x.f8406s;
        super.l();
        if (TextUtils.isEmpty(this.f8349f)) {
            xw0Var.setStickerType(11);
            xw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        xw0Var.setStickerType(1);
        xw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f8349f));
    }
}
