package defpackage;

import android.content.Context;
import android.os.Bundle;
public final class vda extends uu1 {
    public final nfa f;

    public vda(nfa nfaVar, Context context, ui5 ui5Var, Bundle bundle) {
        super(context, ui5Var, bundle);
        this.f = nfaVar;
    }

    @Override
    public final void b(boolean z) {
        r7 r7Var = this.f.q0;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
    }
}
