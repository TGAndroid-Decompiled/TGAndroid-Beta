package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u6c implements Runnable {
    public final byte a;
    public final TwoStepVerificationActivity b;

    public u6c(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.s) != null) {
                    editTextBoldCursor.requestFocus();
                    hl.E3(twoStepVerificationActivity.s);
                    return;
                }
                return;
            case 1:
                u6c u6cVar = twoStepVerificationActivity.W;
                hl.r(u6cVar);
                hl.d3(u6cVar, 1500L);
                twoStepVerificationActivity.V = true;
                return;
            case 2:
                twoStepVerificationActivity.V = false;
                twoStepVerificationActivity.w.a(0.0f);
                return;
            default:
                twoStepVerificationActivity.D0();
                return;
        }
    }
}
