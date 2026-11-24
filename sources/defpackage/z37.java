package defpackage;

import org.telegram.messenger.Utilities;
public final class z37 extends zu3 {
    public final int[] O;
    public final j47 P;

    public z37(j47 j47Var, y37 y37Var, int i) {
        super(i, y37Var);
        this.P = j47Var;
        this.O = new int[2];
    }

    @Override
    public final void g(yu3 yu3Var) {
        j47 j47Var = this.P;
        f47 f47Var = j47Var.K;
        if (yu3Var != null) {
            if (j47Var.l0 != null) {
                yu3Var.c = true;
                float f = (zu3.f() * gl.p) / 1.3f;
                float f2 = f / 3.0f;
                yu3Var.d = f2;
                yu3Var.e = f2;
                yu3Var.a = Utilities.i(j47Var.l0.right - (0.75f * f), gl.q.x - f, 0.0f);
                yu3Var.b = j47Var.l0.bottom - (f / 2.0f);
                return;
            }
            gb2 gb2Var = j47Var.Q;
            if (gb2Var != null && gb2Var.isAttachedToWindow() && j47Var.Q.getMessageObject() != null && j47Var.Q.getMessageObject().e1() == j47Var.R) {
                gb2 gb2Var2 = j47Var.Q;
                int[] iArr = this.O;
                gb2Var2.getLocationOnScreen(iArr);
                yu3Var.c = true;
                float f3 = (zu3.f() * gl.p) / 1.3f;
                float f4 = f3 / 3.0f;
                yu3Var.d = f4;
                yu3Var.e = f4;
                float f5 = f3 / 2.0f;
                yu3Var.a = Utilities.i(((f47Var.getScaleX() * j47Var.Q.getTimeX()) + iArr[0]) - f5, gl.q.x - f3, 0.0f);
                yu3Var.b = ((f47Var.getScaleY() * j47Var.Q.getTimeY()) + iArr[1]) - f5;
            }
        }
    }
}
