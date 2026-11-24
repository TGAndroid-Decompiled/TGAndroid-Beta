package defpackage;

import android.content.Context;
public final class jca extends kfa {
    public final nfa H;

    public jca(nfa nfaVar, Context context) {
        super(nfaVar, context, 0, true);
        this.H = nfaVar;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        nfa nfaVar = this.H;
        iea P = nfaVar.P(9);
        if (P != null && P.n.getVisibility() == 0) {
            nfaVar.i0.f();
        }
        if (P != null) {
            eda edaVar = P.w;
            y1b y1bVar = this.s;
            if (y1bVar != null && (y1bVar.k() || (nfaVar.d0() && this.s.g() > 0))) {
                z = true;
            } else {
                z = false;
            }
            edaVar.e(z, true);
        }
    }
}
