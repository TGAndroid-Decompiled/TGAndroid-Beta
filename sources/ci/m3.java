package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yw0;
public final class m3 extends w3 {
    public final x3 f5034x;

    public m3(x3 x3Var) {
        super(x3Var);
        this.f5034x = x3Var;
    }

    @Override
    public final void F(boolean z10) {
        x3 x3Var = this.f5034x;
        org.telegram.ui.ActionBar.v0 v0Var = x3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        x3Var.f5745s.e(z10, true);
    }

    @Override
    public final void l() {
        yw0 yw0Var = this.f5034x.f5745s;
        super.l();
        if (TextUtils.isEmpty(this.f5685f)) {
            yw0Var.setStickerType(11);
            yw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        yw0Var.setStickerType(1);
        yw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5685f));
    }
}
