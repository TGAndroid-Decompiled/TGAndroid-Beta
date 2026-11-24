package defpackage;

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
public final class o15 implements ee {
    public final byte a;
    public final TwoStepVerificationActivity b;

    public o15(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                twoStepVerificationActivity.presentFragment(new p5c(6, null));
                return;
            case 1:
                twoStepVerificationActivity.finishFragment();
                return;
            case 2:
                twoStepVerificationActivity.getConnectionsManager().sendRequest(new TL_account.declinePasswordReset(), new t4c(twoStepVerificationActivity, (byte) 2));
                return;
            case 3:
                twoStepVerificationActivity.d0();
                return;
            case 4:
                twoStepVerificationActivity.z0();
                return;
            default:
                twoStepVerificationActivity.z0();
                return;
        }
    }
}
