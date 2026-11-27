package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class my7 implements Runnable {
    public final byte a;
    public final PasscodeActivity b;
    public final boolean c;

    public my7(PasscodeActivity passcodeActivity, boolean z, byte b) {
        this.a = b;
        this.b = passcodeActivity;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        PasscodeActivity passcodeActivity = this.b;
        switch (b) {
            case 0:
                passcodeActivity.getMediaDataController().o();
                if (z) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    w56 w56Var = passcodeActivity.V;
                    if (w56Var != null) {
                        hl.c3(w56Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                jn7.e().k(51, new Object[0]);
                return;
            default:
                passcodeActivity.x.e(true, z);
                hl.r(passcodeActivity.U);
                return;
        }
    }
}
