package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class fv7 implements Runnable {
    public final byte a;
    public final PasscodeActivity b;
    public final boolean c;

    public fv7(PasscodeActivity passcodeActivity, boolean z, byte b) {
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
                    t36 t36Var = passcodeActivity.V;
                    if (t36Var != null) {
                        gl.d3(t36Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                kk7.e().k(50, new Object[0]);
                return;
            default:
                passcodeActivity.x.e(true, z);
                gl.r(passcodeActivity.U);
                return;
        }
    }
}
