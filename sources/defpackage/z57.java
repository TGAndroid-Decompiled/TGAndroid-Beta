package defpackage;

import org.telegram.messenger.Utilities;
public final class z57 extends kw3 {
    public final int[] O;
    public final j67 P;

    public z57(j67 j67Var, y57 y57Var, int i) {
        super(i, y57Var);
        this.P = j67Var;
        this.O = new int[2];
    }

    @Override
    public final void g(jw3 jw3Var) {
        j67 j67Var = this.P;
        f67 f67Var = j67Var.K;
        if (jw3Var != null) {
            if (j67Var.l0 != null) {
                jw3Var.c = true;
                float f = (kw3.f() * gm.p) / 1.3f;
                float f2 = f / 3.0f;
                jw3Var.d = f2;
                jw3Var.e = f2;
                jw3Var.a = Utilities.i(j67Var.l0.right - (0.75f * f), gm.q.x - f, 0.0f);
                jw3Var.b = j67Var.l0.bottom - (f / 2.0f);
                return;
            }
            rc2 rc2Var = j67Var.Q;
            if (rc2Var != null && rc2Var.isAttachedToWindow() && j67Var.Q.getMessageObject() != null && j67Var.Q.getMessageObject().e1() == j67Var.R) {
                rc2 rc2Var2 = j67Var.Q;
                int[] iArr = this.O;
                rc2Var2.getLocationOnScreen(iArr);
                jw3Var.c = true;
                float f3 = (kw3.f() * gm.p) / 1.3f;
                float f4 = f3 / 3.0f;
                jw3Var.d = f4;
                jw3Var.e = f4;
                float f5 = f3 / 2.0f;
                jw3Var.a = Utilities.i(((f67Var.getScaleX() * j67Var.Q.getTimeX()) + iArr[0]) - f5, gm.q.x - f3, 0.0f);
                jw3Var.b = ((f67Var.getScaleY() * j67Var.Q.getTimeY()) + iArr[1]) - f5;
            }
        }
    }
}
