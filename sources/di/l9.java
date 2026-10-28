package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
public final class l9 implements ob {
    public final float[] f8768a = new float[2];
    public final m9 f8769b;

    public l9(m9 m9Var) {
        this.f8769b = m9Var;
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
        m9 m9Var = this.f8769b;
        y9 y9Var = m9Var.f8806x0;
        q4 u10 = y9Var.u();
        if (u10 == null) {
            return 0;
        }
        q3 q3Var = u10.R0;
        m9 m9Var2 = y9Var.f9455s;
        float[] fArr = this.f8768a;
        AndroidUtilities.getViewPositionInParent(q3Var, m9Var2, fArr);
        return (int) (m9Var.getMeasuredHeight() - (fArr[1] + q3Var.getMeasuredHeight()));
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
    public final void b(qc qcVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(qc qcVar) {
    }
}
