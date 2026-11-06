package ei;

import android.content.Context;
import di.q6;
import org.telegram.ui.Components.av0;
public final class i extends m {
    public final n f10818w;

    public i(n nVar, Context context) {
        super(nVar, context);
        this.f10818w = nVar;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        n nVar = this.f10818w;
        if (nVar.f10835r.getVisibility() == 0) {
            nVar.f10838x.f();
        }
        av0 av0Var = nVar.D;
        if (av0Var != null) {
            q6 q6Var = this.f10823e;
            if (q6Var != null && q6Var.k()) {
                z9 = true;
            } else {
                z9 = false;
            }
            av0Var.e(z9, true);
        }
    }
}
