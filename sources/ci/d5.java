package ci;

import ai.pa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.un0;
public final class d5 extends un0 {
    public pa h;
    public final t5 f5254n;

    public d5(t5 t5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f5254n = t5Var;
    }

    @Override
    public final void a(String str) {
        pa paVar = this.h;
        if (paVar != null) {
            AndroidUtilities.cancelRunOnUIThread(paVar);
        }
        this.h = new pa(17, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            t5 t5Var = this.f5254n;
            if (!t5Var.Q) {
                t5Var.Q = true;
                t5Var.f5954w.E();
                t5Var.f5955x.h1(0, -t5Var.f5952r.getPaddingTop());
            }
        }
    }
}
