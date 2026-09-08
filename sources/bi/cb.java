package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;
public final class cb implements org.telegram.ui.Components.ob {
    public final float[] f2870a = new float[2];
    public final db f2871b;

    public cb(db dbVar) {
        this.f2871b = dbVar;
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
        db dbVar = this.f2871b;
        pb pbVar = dbVar.I0;
        o5 t10 = pbVar.t();
        if (t10 == null) {
            return 0;
        }
        l4 l4Var = t10.f3436c1;
        db dbVar2 = pbVar.f3599s;
        float[] fArr = this.f2870a;
        AndroidUtilities.getViewPositionInParent(l4Var, dbVar2, fArr);
        return (int) (dbVar.getMeasuredHeight() - (fArr[1] + l4Var.getMeasuredHeight()));
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
