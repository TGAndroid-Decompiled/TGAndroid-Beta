package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class ev7 implements Runnable {
    public final byte a;
    public final PasscodeActivity b;

    public ev7(PasscodeActivity passcodeActivity, byte b) {
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
                vc4 vc4Var = passcodeActivity.W;
                if (vc4Var != null) {
                    gl.c3(vc4Var);
                    passcodeActivity.W = null;
                }
                passcodeActivity.finishFragment();
                return;
            case 2:
                passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                t36 t36Var = passcodeActivity.V;
                if (t36Var != null) {
                    gl.c3(t36Var);
                    passcodeActivity.V = null;
                    return;
                }
                return;
            case 3:
                ev7 ev7Var = new ev7(passcodeActivity, (byte) 4);
                if (passcodeActivity.p0()) {
                    j = 150;
                } else {
                    j = 1000;
                }
                gl.d3(ev7Var, j);
                return;
            case 4:
                if (passcodeActivity.p0()) {
                    for (sj2 sj2Var : passcodeActivity.n.f) {
                        sj2Var.A(0.0f);
                    }
                    return;
                }
                passcodeActivity.f.a(0.0f);
                return;
            case 5:
                passcodeActivity.S = false;
                gl.R3(passcodeActivity.r, false);
                return;
            default:
                passcodeActivity.w0();
                return;
        }
    }
}
