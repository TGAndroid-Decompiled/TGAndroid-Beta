package defpackage;

import android.content.Context;
public final class xda extends kfa {
    public final nfa H;

    public xda(nfa nfaVar, Context context) {
        super(nfaVar, context, 0, false);
        this.H = nfaVar;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        nfa nfaVar = this.H;
        iea P = nfaVar.P(8);
        if (P != null && P.n.getVisibility() == 0) {
            nfaVar.g0.f();
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
