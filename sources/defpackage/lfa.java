package defpackage;

import android.content.Context;
public final class lfa extends kfa {
    public final mfa H;

    public lfa(mfa mfaVar, Context context, int i) {
        super(mfaVar.e, context, i, false);
        this.H = mfaVar;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        mfa mfaVar = this.H;
        nfa nfaVar = mfaVar.e;
        int i = mfaVar.a;
        int[] iArr = nfa.t2;
        iea P = nfaVar.P(i);
        if (P != null && P.n.getVisibility() == 0) {
            mfaVar.d.f();
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
