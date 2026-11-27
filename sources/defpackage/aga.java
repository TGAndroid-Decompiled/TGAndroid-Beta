package defpackage;

import android.content.Context;
public final class aga extends bja {
    public final eja H;

    public aga(eja ejaVar, Context context) {
        super(ejaVar, context, 0, true);
        this.H = ejaVar;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        eja ejaVar = this.H;
        zha P = ejaVar.P(9);
        if (P != null && P.n.getVisibility() == 0) {
            ejaVar.i0.f();
        }
        if (P != null) {
            vga vgaVar = P.w;
            v5b v5bVar = this.s;
            if (v5bVar != null && (v5bVar.k() || (ejaVar.d0() && this.s.g() > 0))) {
                z = true;
            } else {
                z = false;
            }
            vgaVar.e(z, true);
        }
    }
}
