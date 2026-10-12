package ai;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.io0;
public final class u6 extends io0 {
    public a1.f h;
    public final l7 f1799n;

    public u6(l7 l7Var, Context context, d dVar) {
        super(context, 13.0f, dVar);
        this.f1799n = l7Var;
    }

    @Override
    public final void a(String str) {
        a1.f fVar = this.h;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
        }
        this.h = new a1.f(13, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            l7 l7Var = this.f1799n;
            if (!l7Var.Q) {
                l7Var.Q = true;
                l7Var.f1340w.E();
                l7Var.f1341x.h1(0, -l7Var.f1338r.getPaddingTop());
            }
        }
    }
}
