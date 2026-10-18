package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
public final class m9 implements ob {
    public final float[] f5580a = new float[2];
    public final n9 f5581b;

    public m9(n9 n9Var) {
        this.f5581b = n9Var;
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
        n9 n9Var = this.f5581b;
        z9 z9Var = n9Var.I0;
        p4 t10 = z9Var.t();
        if (t10 == null) {
            return 0;
        }
        q3 q3Var = t10.f5652c1;
        n9 n9Var2 = z9Var.f6249s;
        float[] fArr = this.f5580a;
        AndroidUtilities.getViewPositionInParent(q3Var, n9Var2, fArr);
        return (int) (n9Var.getMeasuredHeight() - (fArr[1] + q3Var.getMeasuredHeight()));
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
