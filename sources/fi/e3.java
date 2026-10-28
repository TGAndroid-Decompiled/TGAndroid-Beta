package fi;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fy0;
public final class e3 extends n3 {
    public final o3 f10774x;

    public e3(o3 o3Var) {
        super(o3Var);
        this.f10774x = o3Var;
    }

    @Override
    public final void F(boolean z10) {
        o3 o3Var = this.f10774x;
        org.telegram.ui.ActionBar.w0 w0Var = o3Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        o3Var.f11350s.e(z10, true);
    }

    @Override
    public final void l() {
        fy0 fy0Var = this.f10774x.f11350s;
        super.l();
        if (TextUtils.isEmpty(this.f11293f)) {
            fy0Var.setStickerType(11);
            fy0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        fy0Var.setStickerType(1);
        fy0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f11293f));
    }
}
