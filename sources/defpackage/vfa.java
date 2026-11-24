package defpackage;

import android.content.Context;
import android.os.Bundle;
public final class vfa extends gw1 {
    public final nha f;

    public vfa(nha nhaVar, Context context, tk5 tk5Var, Bundle bundle) {
        super(context, tk5Var, bundle);
        this.f = nhaVar;
    }

    @Override
    public final void b(boolean z) {
        r7 r7Var = this.f.q0;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
    }
}
