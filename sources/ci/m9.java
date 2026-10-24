package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.oc;
public final class m9 implements mb {
    public final float[] f5584a = new float[2];
    public final n9 f5585b;

    public m9(n9 n9Var) {
        this.f5585b = n9Var;
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
        n9 n9Var = this.f5585b;
        z9 z9Var = n9Var.I0;
        p4 t10 = z9Var.t();
        if (t10 == null) {
            return 0;
        }
        q3 q3Var = t10.f5656c1;
        n9 n9Var2 = z9Var.f6260s;
        float[] fArr = this.f5584a;
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
    public final void b(oc ocVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(oc ocVar) {
    }
}
