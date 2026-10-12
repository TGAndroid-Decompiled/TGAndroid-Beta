package di;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wx0;
public final class k3 extends u3 {
    public final v3 f7162x;

    public k3(v3 v3Var) {
        super(v3Var);
        this.f7162x = v3Var;
    }

    @Override
    public final void F(boolean z10) {
        v3 v3Var = this.f7162x;
        org.telegram.ui.ActionBar.u0 u0Var = v3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        v3Var.f7992s.e(z10, true);
    }

    @Override
    public final void l() {
        wx0 wx0Var = this.f7162x.f7992s;
        super.l();
        if (TextUtils.isEmpty(this.f7886f)) {
            wx0Var.setStickerType(11);
            wx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        wx0Var.setStickerType(1);
        wx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f7886f));
    }
}
