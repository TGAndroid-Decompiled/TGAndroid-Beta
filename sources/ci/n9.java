package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
public final class n9 implements ob {
    public final float[] f5680a = new float[2];
    public final o9 f5681b;

    public n9(o9 o9Var) {
        this.f5681b = o9Var;
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
        o9 o9Var = this.f5681b;
        aa aaVar = o9Var.I0;
        q4 t10 = aaVar.t();
        if (t10 == null) {
            return 0;
        }
        r3 r3Var = t10.f5771c1;
        o9 o9Var2 = aaVar.f5216s;
        float[] fArr = this.f5680a;
        AndroidUtilities.getViewPositionInParent(r3Var, o9Var2, fArr);
        return (int) (o9Var.getMeasuredHeight() - (fArr[1] + r3Var.getMeasuredHeight()));
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
