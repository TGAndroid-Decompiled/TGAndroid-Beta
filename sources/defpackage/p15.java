package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p15 implements Runnable {
    public final byte a;
    public final e b;
    public final TwoStepVerificationActivity c;

    public p15(e eVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = eVar;
        this.c = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        e eVar = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(twoStepVerificationActivity);
                return;
            default:
                ?? obj = new Object();
                obj.a = true;
                eVar.showAsSheet(twoStepVerificationActivity, obj);
                return;
        }
    }
}
