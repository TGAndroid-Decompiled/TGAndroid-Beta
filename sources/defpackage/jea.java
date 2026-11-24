package defpackage;

import android.content.Context;
public final class jea extends kha {
    public final nha H;

    public jea(nha nhaVar, Context context) {
        super(nhaVar, context, 0, true);
        this.H = nhaVar;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        nha nhaVar = this.H;
        iga P = nhaVar.P(9);
        if (P != null && P.n.getVisibility() == 0) {
            nhaVar.i0.f();
        }
        if (P != null) {
            efa efaVar = P.w;
            z3b z3bVar = this.s;
            if (z3bVar != null && (z3bVar.k() || (nhaVar.d0() && this.s.g() > 0))) {
                z = true;
            } else {
                z = false;
            }
            efaVar.e(z, true);
        }
    }
}
