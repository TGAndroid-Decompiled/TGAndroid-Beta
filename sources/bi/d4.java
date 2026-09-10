package bi;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jx0;
public final class d4 extends o4 {
    public final p4 f2545x;

    public d4(p4 p4Var) {
        super(p4Var);
        this.f2545x = p4Var;
    }

    @Override
    public final void F(boolean z10) {
        p4 p4Var = this.f2545x;
        org.telegram.ui.ActionBar.w0 w0Var = p4Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        p4Var.f3383s.e(z10, true);
    }

    @Override
    public final void l() {
        jx0 jx0Var = this.f2545x.f3383s;
        super.l();
        if (TextUtils.isEmpty(this.f3305f)) {
            jx0Var.setStickerType(11);
            jx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        jx0Var.setStickerType(1);
        jx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f3305f));
    }
}
