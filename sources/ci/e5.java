package ci;

import ai.pa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.un0;
public final class e5 extends un0 {
    public pa h;
    public final u5 f5355n;

    public e5(u5 u5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f5355n = u5Var;
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
            u5 u5Var = this.f5355n;
            if (!u5Var.Q) {
                u5Var.Q = true;
                u5Var.f6053w.E();
                u5Var.f6054x.h1(0, -u5Var.f6051r.getPaddingTop());
            }
        }
    }
}
