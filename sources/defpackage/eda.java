package defpackage;

import android.content.Context;
public final class eda extends zya {
    public final nfa L;

    public eda(nfa nfaVar, Context context, cda cdaVar) {
        super(context, cdaVar, 1, null);
        this.L = nfaVar;
    }

    @Override
    public final void a() {
        invalidate();
        this.L.K0();
    }
}
