package ai;

import org.telegram.messenger.AndroidUtilities;
public final class xb implements org.telegram.ui.Components.qb {
    public final float[] f1926a = new float[2];
    public final yb f1927b;

    public xb(yb ybVar) {
        this.f1927b = ybVar;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(int i10) {
        yb ybVar = this.f1927b;
        kc kcVar = ybVar.I0;
        f6 t10 = kcVar.t();
        if (t10 == null) {
            return 0;
        }
        b5 b5Var = t10.f953c1;
        yb ybVar2 = kcVar.f1292s;
        float[] fArr = this.f1926a;
        AndroidUtilities.getViewPositionInParent(b5Var, ybVar2, fArr);
        return (int) (ybVar.getMeasuredHeight() - (fArr[1] + b5Var.getMeasuredHeight()));
    }

    @Override
    public final boolean g(int i10) {
        return false;
    }

    @Override
    public final int h(int i10) {
        return 0;
    }

    @Override
    public final void b(org.telegram.ui.Components.sc scVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(org.telegram.ui.Components.sc scVar) {
    }
}
