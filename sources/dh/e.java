package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class e implements a {
    public final f6 f7739a;
    public d f7740b;
    public d f7741c;
    public d d;
    public d e;
    public float f7742f;
    public float h;
    public float f7743n;
    public float f7744r;

    public e(f6 f6Var) {
        this.f7739a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f7743n = dpf2;
        this.f7744r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f7742f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int H() {
        return b(this.e);
    }

    @Override
    public final int a() {
        return b(this.f7741c);
    }

    public final int b(d dVar) {
        boolean a2;
        if (dVar != null) {
            f6 f6Var = this.f7739a;
            if (!(f6Var instanceof ai.d) && f6Var == null) {
                a2 = j6.I.q();
            } else {
                a2 = f6Var.a();
            }
            return dVar.g(f6Var, a2);
        }
        return 0;
    }

    @Override
    public final int c() {
        return b(this.d);
    }

    public final void d(int i10, int i11) {
        this.f7740b = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.f7741c = new c(i11, i10, 0);
    }

    @Override
    public final int m() {
        return b(this.f7740b);
    }
}
