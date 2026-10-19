package ei;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sx0;
public final class g3 extends p3 {
    public final q3 f9064x;

    public g3(q3 q3Var) {
        super(q3Var);
        this.f9064x = q3Var;
    }

    @Override
    public final void F(boolean z10) {
        q3 q3Var = this.f9064x;
        org.telegram.ui.ActionBar.u0 u0Var = q3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        q3Var.f9636s.e(z10, true);
    }

    @Override
    public final void l() {
        sx0 sx0Var = this.f9064x.f9636s;
        super.l();
        if (TextUtils.isEmpty(this.f9583f)) {
            sx0Var.setStickerType(11);
            sx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        sx0Var.setStickerType(1);
        sx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f9583f));
    }
}
