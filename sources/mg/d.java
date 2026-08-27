package mg;

import h3.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class d implements a {

    public final c6 f18047a;

    public c f18048b;

    public c f18049c;
    public c d;

    public c f18050e;

    public float f18051f;
    public float h;

    public float f18052n;

    public float f18053r;

    public d(c6 c6Var) {
        this.f18047a = c6Var;
        float fDpf2 = AndroidUtilities.dpf2(1.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33333334f);
        this.f18052n = fDpf2;
        this.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(1.0f);
        float fDpf5 = AndroidUtilities.dpf2(0.6666667f);
        this.f18051f = fDpf4;
        this.h = fDpf5;
    }

    @Override
    public final int J1() {
        return a(this.f18048b);
    }

    @Override
    public final int K0() {
        return a(this.d);
    }

    public final int a(c cVar) {
        if (cVar == null) {
            return 0;
        }
        c6 c6Var = this.f18047a;
        return cVar.i(c6Var, ((c6Var instanceof jh.b) || c6Var != null) ? c6Var.a() : g6.I.q());
    }

    public final void b(int i10, int i11) {
        this.f18048b = new a0(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new a0(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.f18049c = new a0(i11, i10, 2);
    }

    @Override
    public final int h0() {
        return a(this.f18049c);
    }

    @Override
    public final int p2() {
        return a(this.f18050e);
    }
}
