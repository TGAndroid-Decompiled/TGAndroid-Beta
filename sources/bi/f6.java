package bi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yn0;
public final class f6 extends yn0 {
    public a1.f h;
    public final w6 f3025n;

    public f6(w6 w6Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f3025n = w6Var;
    }

    @Override
    public final void a(String str) {
        a1.f fVar = this.h;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
        }
        this.h = new a1.f(24, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            w6 w6Var = this.f3025n;
            if (!w6Var.Q) {
                w6Var.Q = true;
                w6Var.f3911w.E();
                w6Var.f3912x.h1(0, -w6Var.f3909r.getPaddingTop());
            }
        }
    }
}
