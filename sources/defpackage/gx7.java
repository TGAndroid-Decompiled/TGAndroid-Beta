package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class gx7 implements Runnable {
    public final byte a;
    public final PasscodeActivity b;

    public gx7(PasscodeActivity passcodeActivity, byte b) {
        this.a = b;
        this.b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j;
        byte b = this.a;
        PasscodeActivity passcodeActivity = this.b;
        switch (b) {
            case 0:
                passcodeActivity.n.postDelayed(passcodeActivity.T, 3000L);
                passcodeActivity.S = true;
                return;
            case 1:
                ve4 ve4Var = passcodeActivity.W;
                if (ve4Var != null) {
                    gm.c3(ve4Var);
                    passcodeActivity.W = null;
                }
                passcodeActivity.finishFragment();
                return;
            case 2:
                passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                t56 t56Var = passcodeActivity.V;
                if (t56Var != null) {
                    gm.c3(t56Var);
                    passcodeActivity.V = null;
                    return;
                }
                return;
            case 3:
                gx7 gx7Var = new gx7(passcodeActivity, (byte) 4);
                if (passcodeActivity.q0()) {
                    j = 150;
                } else {
                    j = 1000;
                }
                gm.d3(gx7Var, j);
                return;
            case 4:
                if (passcodeActivity.q0()) {
                    for (gl2 gl2Var : passcodeActivity.n.f) {
                        gl2Var.A(0.0f);
                    }
                    return;
                }
                passcodeActivity.f.a(0.0f);
                return;
            case 5:
                passcodeActivity.S = false;
                gm.R3(passcodeActivity.r, false);
                return;
            default:
                passcodeActivity.x0();
                return;
        }
    }
}
