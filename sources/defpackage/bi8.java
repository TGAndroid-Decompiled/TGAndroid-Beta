package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class bi8 extends kx9 {
    public final PremiumPreviewFragment e;

    public bi8(PremiumPreviewFragment premiumPreviewFragment, ai8 ai8Var) {
        super(ai8Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
