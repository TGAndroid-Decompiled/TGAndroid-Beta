package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.mc;
public final class v8 implements kb {
    public final float[] f16344a = new float[2];
    public final w8 f16345b;

    public v8(w8 w8Var) {
        this.f16345b = w8Var;
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
        w8 w8Var = this.f16345b;
        i9 i9Var = w8Var.E0;
        d4 t10 = i9Var.t();
        if (t10 == null) {
            return 0;
        }
        h3 h3Var = t10.Y0;
        w8 w8Var2 = i9Var.f15783s;
        float[] fArr = this.f16344a;
        AndroidUtilities.getViewPositionInParent(h3Var, w8Var2, fArr);
        return (int) (w8Var.getMeasuredHeight() - (fArr[1] + h3Var.getMeasuredHeight()));
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
    public final void b(mc mcVar) {
    }

    @Override
    public final void c(float f9) {
    }

    @Override
    public final void d(mc mcVar) {
    }
}
