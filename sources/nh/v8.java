package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ic;
public final class v8 implements fb {
    public final float[] f15995a = new float[2];
    public final w8 f15996b;

    public v8(w8 w8Var) {
        this.f15996b = w8Var;
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
        w8 w8Var = this.f15996b;
        i9 i9Var = w8Var.F0;
        d4 t6 = i9Var.t();
        if (t6 == null) {
            return 0;
        }
        i3 i3Var = t6.Z0;
        w8 w8Var2 = i9Var.f15468s;
        float[] fArr = this.f15995a;
        AndroidUtilities.getViewPositionInParent(i3Var, w8Var2, fArr);
        return (int) (w8Var.getMeasuredHeight() - (fArr[1] + i3Var.getMeasuredHeight()));
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
    public final void b(ic icVar) {
    }

    @Override
    public final void c(float f10) {
    }

    @Override
    public final void d(ic icVar) {
    }
}
