package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class e implements a {
    public final f6 f9138a;
    public d f9139b;
    public d f9140c;
    public d d;
    public d f9141e;
    public float f9142f;
    public float h;
    public float f9143n;
    public float f9144r;

    public e(f6 f6Var) {
        this.f9138a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f9143n = dpf2;
        this.f9144r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f9142f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int G() {
        return a(this.d);
    }

    @Override
    public final int J() {
        return a(this.f9139b);
    }

    public final int a(d dVar) {
        boolean a2;
        if (dVar != null) {
            f6 f6Var = this.f9138a;
            if (!(f6Var instanceof bi.b) && f6Var == null) {
                a2 = j6.I.q();
            } else {
                a2 = f6Var.a();
            }
            return dVar.f(f6Var, a2);
        }
        return 0;
    }

    public final void b(int i10, int i11) {
        this.f9139b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f9140c = new c(i11, i10, 0);
    }

    @Override
    public final int k0() {
        return a(this.f9141e);
    }

    @Override
    public final int p() {
        return a(this.f9140c);
    }
}
