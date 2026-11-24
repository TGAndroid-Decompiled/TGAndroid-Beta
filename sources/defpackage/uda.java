package defpackage;

import android.content.Context;
public final class uda extends hfa {
    public final nfa h;

    public uda(nfa nfaVar, Context context) {
        super(nfaVar, context);
        this.h = nfaVar;
    }

    @Override
    public final void f() {
        super.f();
        nfa nfaVar = this.h;
        iea P = nfaVar.P(0);
        if (P != null && P.n.getVisibility() == 0) {
            nfaVar.L.f();
        }
    }
}
