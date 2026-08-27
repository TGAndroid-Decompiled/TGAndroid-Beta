package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ec;

public final class v8 implements db {

    public final float[] f14079a = new float[2];

    public final w8 f14080b;

    public v8(w8 w8Var) {
        this.f14080b = w8Var;
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
        w8 w8Var = this.f14080b;
        i9 i9Var = w8Var.E0;
        e4 e4VarT = i9Var.t();
        if (e4VarT == null) {
            return 0;
        }
        j3 j3Var = e4VarT.Y0;
        w8 w8Var2 = i9Var.f13505s;
        float[] fArr = this.f14079a;
        AndroidUtilities.getViewPositionInParent(j3Var, w8Var2, fArr);
        return (int) (w8Var.getMeasuredHeight() - (fArr[1] + j3Var.getMeasuredHeight()));
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
    public final void b(ec ecVar) {
    }

    @Override
    public final void c(float f10) {
    }

    @Override
    public final void d(ec ecVar) {
    }
}
