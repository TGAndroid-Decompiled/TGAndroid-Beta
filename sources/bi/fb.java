package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sc;
public final class fb implements org.telegram.ui.Components.qb {
    public final float[] f3047a = new float[2];
    public final gb f3048b;

    public fb(gb gbVar) {
        this.f3048b = gbVar;
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
        gb gbVar = this.f3048b;
        sb sbVar = gbVar.I0;
        q5 t10 = sbVar.t();
        if (t10 == null) {
            return 0;
        }
        o4 o4Var = t10.f3515c1;
        gb gbVar2 = sbVar.f3704s;
        float[] fArr = this.f3047a;
        AndroidUtilities.getViewPositionInParent(o4Var, gbVar2, fArr);
        return (int) (gbVar.getMeasuredHeight() - (fArr[1] + o4Var.getMeasuredHeight()));
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
    public final void b(sc scVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(sc scVar) {
    }
}
