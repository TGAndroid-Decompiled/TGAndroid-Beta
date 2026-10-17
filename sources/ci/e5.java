package ci;

import ai.oa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.un0;
public final class e5 extends un0 {
    public oa h;
    public final u5 f5357n;

    public e5(u5 u5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f5357n = u5Var;
    }

    @Override
    public final void a(String str) {
        oa oaVar = this.h;
        if (oaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(oaVar);
        }
        this.h = new oa(17, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            u5 u5Var = this.f5357n;
            if (!u5Var.Q) {
                u5Var.Q = true;
                u5Var.f6055w.E();
                u5Var.f6056x.h1(0, -u5Var.f6053r.getPaddingTop());
            }
        }
    }
}
