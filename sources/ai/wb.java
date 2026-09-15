package ai;

import org.telegram.messenger.AndroidUtilities;
public final class wb implements org.telegram.ui.Components.mb {
    public final float[] f1673a = new float[2];
    public final xb f1674b;

    public wb(xb xbVar) {
        this.f1674b = xbVar;
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
        xb xbVar = this.f1674b;
        jc jcVar = xbVar.I0;
        f6 t10 = jcVar.t();
        if (t10 == null) {
            return 0;
        }
        a5 a5Var = t10.f798c1;
        xb xbVar2 = jcVar.f1102s;
        float[] fArr = this.f1673a;
        AndroidUtilities.getViewPositionInParent(a5Var, xbVar2, fArr);
        return (int) (xbVar.getMeasuredHeight() - (fArr[1] + a5Var.getMeasuredHeight()));
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
    public final void b(org.telegram.ui.Components.oc ocVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(org.telegram.ui.Components.oc ocVar) {
    }
}
