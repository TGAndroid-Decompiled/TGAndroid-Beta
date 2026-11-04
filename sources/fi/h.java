package fi;

import android.content.Context;
import ei.r6;
import org.telegram.ui.Components.zu0;
public final class h extends l {
    public final m f11604w;

    public h(m mVar, Context context) {
        super(mVar, context);
        this.f11604w = mVar;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        m mVar = this.f11604w;
        if (mVar.f11622r.getVisibility() == 0) {
            mVar.f11625x.f();
        }
        zu0 zu0Var = mVar.E;
        if (zu0Var != null) {
            r6 r6Var = this.f11609e;
            if (r6Var != null && r6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            zu0Var.e(z10, true);
        }
    }
}
