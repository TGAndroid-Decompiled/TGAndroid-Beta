package ei;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.vx0;
public final class g3 extends p3 {
    public final q3 f9074x;

    public g3(q3 q3Var) {
        super(q3Var);
        this.f9074x = q3Var;
    }

    @Override
    public final void F(boolean z10) {
        q3 q3Var = this.f9074x;
        org.telegram.ui.ActionBar.u0 u0Var = q3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        q3Var.f9652s.e(z10, true);
    }

    @Override
    public final void l() {
        vx0 vx0Var = this.f9074x.f9652s;
        super.l();
        if (TextUtils.isEmpty(this.f9597f)) {
            vx0Var.setStickerType(11);
            vx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        vx0Var.setStickerType(1);
        vx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f9597f));
    }
}
