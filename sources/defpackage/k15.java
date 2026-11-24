package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k15 implements Runnable {
    public final byte a;
    public final d b;
    public final TwoStepVerificationActivity c;

    public k15(d dVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(twoStepVerificationActivity);
                return;
            default:
                ?? obj = new Object();
                obj.a = true;
                dVar.showAsSheet(twoStepVerificationActivity, obj);
                return;
        }
    }
}
