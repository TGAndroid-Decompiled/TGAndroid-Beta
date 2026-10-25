package fi;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ey0;
public final class e3 extends n3 {
    public final o3 f10775x;

    public e3(o3 o3Var) {
        super(o3Var);
        this.f10775x = o3Var;
    }

    @Override
    public final void F(boolean z10) {
        o3 o3Var = this.f10775x;
        org.telegram.ui.ActionBar.w0 w0Var = o3Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        o3Var.f11351s.e(z10, true);
    }

    @Override
    public final void l() {
        ey0 ey0Var = this.f10775x.f11351s;
        super.l();
        if (TextUtils.isEmpty(this.f11294f)) {
            ey0Var.setStickerType(11);
            ey0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        ey0Var.setStickerType(1);
        ey0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f11294f));
    }
}
