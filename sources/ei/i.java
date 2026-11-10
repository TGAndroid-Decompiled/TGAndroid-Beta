package ei;

import android.content.Context;
import di.r6;
import org.telegram.ui.Components.bv0;
public final class i extends m {
    public final n f10823w;

    public i(n nVar, Context context) {
        super(nVar, context);
        this.f10823w = nVar;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        n nVar = this.f10823w;
        if (nVar.f10840r.getVisibility() == 0) {
            nVar.f10843x.f();
        }
        bv0 bv0Var = nVar.D;
        if (bv0Var != null) {
            r6 r6Var = this.f10828e;
            if (r6Var != null && r6Var.k()) {
                z9 = true;
            } else {
                z9 = false;
            }
            bv0Var.e(z9, true);
        }
    }
}
