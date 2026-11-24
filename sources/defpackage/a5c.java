package defpackage;

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class a5c extends p5c {
    public final TwoStepVerificationActivity l0;

    public a5c(TwoStepVerificationActivity twoStepVerificationActivity, int i, TL_account.Password password) {
        super(i, 4, password);
        this.l0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.l0.O = true;
    }
}
