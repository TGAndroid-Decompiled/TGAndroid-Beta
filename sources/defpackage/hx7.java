package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class hx7 implements Runnable {
    public final byte a;
    public final PasscodeActivity b;
    public final boolean c;

    public hx7(PasscodeActivity passcodeActivity, boolean z, byte b) {
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
                    t56 t56Var = passcodeActivity.V;
                    if (t56Var != null) {
                        gm.c3(t56Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                nm7.e().k(51, new Object[0]);
                return;
            default:
                passcodeActivity.x.e(true, z);
                gm.r(passcodeActivity.U);
                return;
        }
    }
}
