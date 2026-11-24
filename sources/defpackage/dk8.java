package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class dk8 extends mz9 {
    public final PremiumPreviewFragment e;

    public dk8(PremiumPreviewFragment premiumPreviewFragment, ck8 ck8Var) {
        super(ck8Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
