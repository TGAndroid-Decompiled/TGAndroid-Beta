package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class ol8 extends d1a {
    public final PremiumPreviewFragment e;

    public ol8(PremiumPreviewFragment premiumPreviewFragment, nl8 nl8Var) {
        super(nl8Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
