package lh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.iw0;

public final class f3 extends o3 {

    public final p3 f15955x;

    public f3(p3 p3Var) {
        super(p3Var);
        this.f15955x = p3Var;
    }

    @Override
    public final void F(boolean z10) {
        p3 p3Var = this.f15955x;
        org.telegram.ui.ActionBar.v0 v0Var = p3Var.C;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        p3Var.f16519s.e(z10, true);
    }

    @Override
    public final void l() {
        iw0 iw0Var = this.f15955x.f16519s;
        super.l();
        if (TextUtils.isEmpty(this.f16472f)) {
            iw0Var.setStickerType(11);
            iw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            iw0Var.setStickerType(1);
            iw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f16472f));
        }
    }
}
