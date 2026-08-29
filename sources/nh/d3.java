package nh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qw0;
public final class d3 extends m3 {
    public final n3 f17528x;

    public d3(n3 n3Var) {
        super(n3Var);
        this.f17528x = n3Var;
    }

    @Override
    public final void F(boolean z10) {
        n3 n3Var = this.f17528x;
        org.telegram.ui.ActionBar.w0 w0Var = n3Var.C;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        n3Var.f18179s.e(z10, true);
    }

    @Override
    public final void l() {
        qw0 qw0Var = this.f17528x.f18179s;
        super.l();
        if (TextUtils.isEmpty(this.f18126f)) {
            qw0Var.setStickerType(11);
            qw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        qw0Var.setStickerType(1);
        qw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f18126f));
    }
}
