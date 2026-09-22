package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class e implements a {
    public final f6 f7738a;
    public d f7739b;
    public d f7740c;
    public d d;
    public d e;
    public float f7741f;
    public float h;
    public float f7742n;
    public float f7743r;

    public e(f6 f6Var) {
        this.f7738a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f7742n = dpf2;
        this.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f7741f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int H() {
        return a(this.e);
    }

    public final int a(d dVar) {
        boolean a2;
        if (dVar != null) {
            f6 f6Var = this.f7738a;
            if (!(f6Var instanceof ai.d) && f6Var == null) {
                a2 = j6.I.q();
            } else {
                a2 = f6Var.a();
            }
            return dVar.f(f6Var, a2);
        }
        return 0;
    }

    @Override
    public final int b() {
        return a(this.f7740c);
    }

    public final void c(int i10, int i11) {
        this.f7739b = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.f7740c = new c(i11, i10, 0);
    }

    @Override
    public final int g() {
        return a(this.d);
    }

    @Override
    public final int x() {
        return a(this.f7739b);
    }
}
