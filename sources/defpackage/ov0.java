package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class ov0 implements bja {
    public final byte a;
    public final Object b;

    public ov0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void L(int i, boolean z) {
        bf6 bf6Var;
        fv7 fv7Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fw0 fw0Var = ((ow0) obj).x;
                if (i > gl.L(20.0f)) {
                    fw0Var.d(fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY()));
                    return;
                }
                return;
            case 1:
                mf6 mf6Var = (mf6) obj;
                if (i > gl.L(20.0f) && mf6Var.r1()) {
                    gl.t1(mf6Var.fragmentView);
                }
                if (i <= gl.L(20.0f) && (bf6Var = mf6Var.U) != null) {
                    bf6Var.run();
                    mf6Var.U = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (i >= gl.L(20.0f) && (fv7Var = passcodeActivity.U) != null) {
                    fv7Var.run();
                    passcodeActivity.U = null;
                    return;
                }
                return;
            default:
                fqc fqcVar = (fqc) obj;
                if (i <= gl.L(20.0f)) {
                    i = 0;
                }
                fqcVar.n = i;
                fqcVar.onInsets(fqcVar.r, fqcVar.s, fqcVar.w, fqcVar.x);
                return;
        }
    }
}
