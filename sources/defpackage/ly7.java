package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class ly7 implements Runnable {
    public final byte a;
    public final PasscodeActivity b;

    public ly7(PasscodeActivity passcodeActivity, byte b) {
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
                se4 se4Var = passcodeActivity.W;
                if (se4Var != null) {
                    hl.c3(se4Var);
                    passcodeActivity.W = null;
                }
                passcodeActivity.finishFragment();
                return;
            case 2:
                passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                w56 w56Var = passcodeActivity.V;
                if (w56Var != null) {
                    hl.c3(w56Var);
                    passcodeActivity.V = null;
                    return;
                }
                return;
            case 3:
                ly7 ly7Var = new ly7(passcodeActivity, (byte) 4);
                if (passcodeActivity.p0()) {
                    j = 150;
                } else {
                    j = 1000;
                }
                hl.d3(ly7Var, j);
                return;
            case 4:
                if (passcodeActivity.p0()) {
                    for (ok2 ok2Var : passcodeActivity.n.f) {
                        ok2Var.A(0.0f);
                    }
                    return;
                }
                passcodeActivity.f.a(0.0f);
                return;
            case 5:
                passcodeActivity.S = false;
                hl.R3(passcodeActivity.r, false);
                return;
            default:
                passcodeActivity.x0();
                return;
        }
    }
}
