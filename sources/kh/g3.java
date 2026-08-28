package kh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gw0;
public final class g3 extends p3 {
    public final q3 f15264x;

    public g3(q3 q3Var) {
        super(q3Var);
        this.f15264x = q3Var;
    }

    @Override
    public final void F(boolean z10) {
        q3 q3Var = this.f15264x;
        org.telegram.ui.ActionBar.w0 w0Var = q3Var.C;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        q3Var.f15870s.e(z10, true);
    }

    @Override
    public final void l() {
        gw0 gw0Var = this.f15264x.f15870s;
        super.l();
        if (TextUtils.isEmpty(this.f15828f)) {
            gw0Var.setStickerType(11);
            gw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        gw0Var.setStickerType(1);
        gw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f15828f));
    }
}
