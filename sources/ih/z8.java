package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
public final class z8 implements fb {
    public final float[] f12402a = new float[2];
    public final a9 f12403b;

    public z8(a9 a9Var) {
        this.f12403b = a9Var;
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
    public final int f(int i9) {
        a9 a9Var = this.f12403b;
        m9 m9Var = a9Var.E0;
        i4 t10 = m9Var.t();
        if (t10 == null) {
            return 0;
        }
        l3 l3Var = t10.Y0;
        a9 a9Var2 = m9Var.f11824s;
        float[] fArr = this.f12402a;
        AndroidUtilities.getViewPositionInParent(l3Var, a9Var2, fArr);
        return (int) (a9Var.getMeasuredHeight() - (fArr[1] + l3Var.getMeasuredHeight()));
    }

    @Override
    public final boolean g(int i9) {
        return false;
    }

    @Override
    public final int h(int i9) {
        return 0;
    }

    @Override
    public final void b(gc gcVar) {
    }

    @Override
    public final void c(float f10) {
    }

    @Override
    public final void d(gc gcVar) {
    }
}
