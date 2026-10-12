package bi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zn0;
public final class f6 extends zn0 {
    public a1.f h;
    public final w6 f3021n;

    public f6(w6 w6Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f3021n = w6Var;
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
            w6 w6Var = this.f3021n;
            if (!w6Var.Q) {
                w6Var.Q = true;
                w6Var.f3907w.E();
                w6Var.f3908x.h1(0, -w6Var.f3905r.getPaddingTop());
            }
        }
    }
}
