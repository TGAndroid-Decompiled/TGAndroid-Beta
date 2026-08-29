package og;

import j3.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class d implements a {
    public final c6 f19557a;
    public c f19558b;
    public c f19559c;
    public c d;
    public c f19560e;
    public float f19561f;
    public float h;
    public float f19562n;
    public float f19563r;

    public d(c6 c6Var) {
        this.f19557a = c6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f19562n = dpf2;
        this.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f19561f = dpf23;
        this.h = dpf24;
    }

    public final int a(c cVar) {
        boolean a2;
        if (cVar != null) {
            c6 c6Var = this.f19557a;
            if (!(c6Var instanceof lh.b) && c6Var == null) {
                a2 = g6.I.q();
            } else {
                a2 = c6Var.a();
            }
            return cVar.f(c6Var, a2);
        }
        return 0;
    }

    public final void b(int i10, int i11) {
        this.f19558b = new z(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new z(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.f19559c = new z(i11, i10, 2);
    }

    @Override
    public final int h() {
        return a(this.f19559c);
    }

    @Override
    public final int m() {
        return a(this.d);
    }

    @Override
    public final int v() {
        return a(this.f19558b);
    }

    @Override
    public final int z() {
        return a(this.f19560e);
    }
}
