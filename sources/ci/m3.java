package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jx0;
public final class m3 extends w3 {
    public final x3 f5038x;

    public m3(x3 x3Var) {
        super(x3Var);
        this.f5038x = x3Var;
    }

    @Override
    public final void F(boolean z10) {
        x3 x3Var = this.f5038x;
        org.telegram.ui.ActionBar.v0 v0Var = x3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        x3Var.f5749s.e(z10, true);
    }

    @Override
    public final void l() {
        jx0 jx0Var = this.f5038x.f5749s;
        super.l();
        if (TextUtils.isEmpty(this.f5689f)) {
            jx0Var.setStickerType(11);
            jx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        jx0Var.setStickerType(1);
        jx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f5689f));
    }
}
