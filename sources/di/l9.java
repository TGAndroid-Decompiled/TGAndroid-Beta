package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
public final class l9 implements ob {
    public final float[] f8769a = new float[2];
    public final m9 f8770b;

    public l9(m9 m9Var) {
        this.f8770b = m9Var;
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
        m9 m9Var = this.f8770b;
        y9 y9Var = m9Var.f8807x0;
        q4 t10 = y9Var.t();
        if (t10 == null) {
            return 0;
        }
        q3 q3Var = t10.R0;
        m9 m9Var2 = y9Var.f9456s;
        float[] fArr = this.f8769a;
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
