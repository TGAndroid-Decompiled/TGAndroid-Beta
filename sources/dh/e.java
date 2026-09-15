package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class e implements a {
    public final e6 f7734a;
    public d f7735b;
    public d f7736c;
    public d d;
    public d e;
    public float f7737f;
    public float h;
    public float f7738n;
    public float f7739r;

    public e(e6 e6Var) {
        this.f7734a = e6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f7738n = dpf2;
        this.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f7737f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int H() {
        return b(this.e);
    }

    @Override
    public final int a() {
        return b(this.f7736c);
    }

    public final int b(d dVar) {
        boolean a2;
        if (dVar != null) {
            e6 e6Var = this.f7734a;
            if (!(e6Var instanceof ai.d) && e6Var == null) {
                a2 = i6.I.q();
            } else {
                a2 = e6Var.a();
            }
            return dVar.g(e6Var, a2);
        }
        return 0;
    }

    @Override
    public final int c() {
        return b(this.d);
    }

    public final void d(int i10, int i11) {
        this.f7735b = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.f7736c = new c(i11, i10, 0);
    }

    @Override
    public final int m() {
        return b(this.f7735b);
    }
}
