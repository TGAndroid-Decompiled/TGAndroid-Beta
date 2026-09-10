package ch;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class e implements a {
    public final f6 f4688a;
    public d f4689b;
    public d f4690c;
    public d d;
    public d e;
    public float f4691f;
    public float h;
    public float f4692n;
    public float f4693r;

    public e(f6 f6Var) {
        this.f4688a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f4692n = dpf2;
        this.f4693r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f4691f = dpf23;
        this.h = dpf24;
    }

    public final int a(d dVar) {
        boolean a2;
        if (dVar != null) {
            f6 f6Var = this.f4688a;
            if (!(f6Var instanceof zh.b) && f6Var == null) {
                a2 = j6.I.q();
            } else {
                a2 = f6Var.a();
            }
            return dVar.g(f6Var, a2);
        }
        return 0;
    }

    public final void b(int i10, int i11) {
        this.f4689b = new c(i11, i10, 0);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.f4690c = new c(i11, i10, 0);
    }

    @Override
    public final int h() {
        return a(this.f4690c);
    }

    @Override
    public final int p() {
        return a(this.d);
    }

    @Override
    public final int w() {
        return a(this.f4689b);
    }

    @Override
    public final int x() {
        return a(this.e);
    }
}
