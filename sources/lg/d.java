package lg;

import h3.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class d implements a {
    public final b6 f16863a;
    public c f16864b;
    public c f16865c;
    public c d;
    public c f16866e;
    public float f16867f;
    public float h;
    public float f16868n;
    public float f16869r;

    public d(b6 b6Var) {
        this.f16863a = b6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f16868n = dpf2;
        this.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f16867f = dpf23;
        this.h = dpf24;
    }

    public final int a(c cVar) {
        boolean a2;
        if (cVar != null) {
            b6 b6Var = this.f16863a;
            if (!(b6Var instanceof ih.b) && b6Var == null) {
                a2 = f6.I.q();
            } else {
                a2 = b6Var.a();
            }
            return cVar.g(b6Var, a2);
        }
        return 0;
    }

    public final void b(int i9, int i10) {
        this.f16864b = new z(i10, i9, 2);
    }

    public final void c(int i9, int i10) {
        this.d = new z(i10, i9, 2);
    }

    public final void d(int i9, int i10) {
        this.f16865c = new z(i10, i9, 2);
    }

    @Override
    public final int e() {
        return a(this.f16865c);
    }

    @Override
    public final int g() {
        return a(this.d);
    }

    @Override
    public final int j() {
        return a(this.f16864b);
    }

    @Override
    public final int k() {
        return a(this.f16866e);
    }
}
