package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gy0;
public final class k3 extends u3 {
    public final v3 f5312x;

    public k3(v3 v3Var) {
        super(v3Var);
        this.f5312x = v3Var;
    }

    @Override
    public final void F(boolean z10) {
        v3 v3Var = this.f5312x;
        org.telegram.ui.ActionBar.u0 u0Var = v3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        v3Var.f6142s.e(z10, true);
    }

    @Override
    public final void l() {
        gy0 gy0Var = this.f5312x.f6142s;
        super.l();
        if (TextUtils.isEmpty(this.f6056f)) {
            gy0Var.setStickerType(11);
            gy0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        gy0Var.setStickerType(1);
        gy0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f6056f));
    }
}
