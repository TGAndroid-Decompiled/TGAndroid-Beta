package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zw0;
public final class m3 extends w3 {
    public final x3 f5037x;

    public m3(x3 x3Var) {
        super(x3Var);
        this.f5037x = x3Var;
    }

    @Override
    public final void F(boolean z10) {
        x3 x3Var = this.f5037x;
        org.telegram.ui.ActionBar.w0 w0Var = x3Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        x3Var.f5748s.e(z10, true);
    }

    @Override
    public final void l() {
        zw0 zw0Var = this.f5037x.f5748s;
        super.l();
        if (TextUtils.isEmpty(this.f5688f)) {
            zw0Var.setStickerType(11);
            zw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        zw0Var.setStickerType(1);
        zw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5688f));
    }
}
