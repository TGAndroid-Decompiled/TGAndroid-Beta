package ei;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rx0;
public final class g3 extends p3 {
    public final q3 f9065x;

    public g3(q3 q3Var) {
        super(q3Var);
        this.f9065x = q3Var;
    }

    @Override
    public final void F(boolean z10) {
        q3 q3Var = this.f9065x;
        org.telegram.ui.ActionBar.u0 u0Var = q3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        q3Var.f9637s.e(z10, true);
    }

    @Override
    public final void l() {
        rx0 rx0Var = this.f9065x.f9637s;
        super.l();
        if (TextUtils.isEmpty(this.f9584f)) {
            rx0Var.setStickerType(11);
            rx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        rx0Var.setStickerType(1);
        rx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f9584f));
    }
}
