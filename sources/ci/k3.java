package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.by0;
public final class k3 extends u3 {
    public final v3 f5313x;

    public k3(v3 v3Var) {
        super(v3Var);
        this.f5313x = v3Var;
    }

    @Override
    public final void F(boolean z10) {
        v3 v3Var = this.f5313x;
        org.telegram.ui.ActionBar.u0 u0Var = v3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        v3Var.f6143s.e(z10, true);
    }

    @Override
    public final void l() {
        by0 by0Var = this.f5313x.f6143s;
        super.l();
        if (TextUtils.isEmpty(this.f6057f)) {
            by0Var.setStickerType(11);
            by0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        by0Var.setStickerType(1);
        by0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f6057f));
    }
}
