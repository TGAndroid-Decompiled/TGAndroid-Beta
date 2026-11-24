package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class xw0 implements dla {
    public final byte a;
    public final Object b;

    public xw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void L(int i, boolean z) {
        ch6 ch6Var;
        hx7 hx7Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                nx0 nx0Var = ((wx0) obj).x;
                if (i > gm.L(20.0f)) {
                    nx0Var.d(nx0Var.getTopActionBarOffsetY() + (-nx0Var.getOffsetY()));
                    return;
                }
                return;
            case 1:
                mh6 mh6Var = (mh6) obj;
                if (i > gm.L(20.0f) && mh6Var.s1()) {
                    gm.t1(mh6Var.fragmentView);
                }
                if (i <= gm.L(20.0f) && (ch6Var = mh6Var.U) != null) {
                    ch6Var.run();
                    mh6Var.U = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (i >= gm.L(20.0f) && (hx7Var = passcodeActivity.U) != null) {
                    hx7Var.run();
                    passcodeActivity.U = null;
                    return;
                }
                return;
            default:
                hsc hscVar = (hsc) obj;
                if (i <= gm.L(20.0f)) {
                    i = 0;
                }
                hscVar.n = i;
                hscVar.onInsets(hscVar.r, hscVar.s, hscVar.w, hscVar.x);
                return;
        }
    }
}
