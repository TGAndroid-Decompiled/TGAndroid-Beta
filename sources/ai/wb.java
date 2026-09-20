package ai;

import org.telegram.messenger.AndroidUtilities;
public final class wb implements org.telegram.ui.Components.nb {
    public final float[] f1678a = new float[2];
    public final xb f1679b;

    public wb(xb xbVar) {
        this.f1679b = xbVar;
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
        xb xbVar = this.f1679b;
        jc jcVar = xbVar.I0;
        f6 t10 = jcVar.t();
        if (t10 == null) {
            return 0;
        }
        a5 a5Var = t10.f803c1;
        xb xbVar2 = jcVar.f1107s;
        float[] fArr = this.f1678a;
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
    public final void b(org.telegram.ui.Components.pc pcVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(org.telegram.ui.Components.pc pcVar) {
    }
}
