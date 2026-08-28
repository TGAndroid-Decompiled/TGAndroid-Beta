package ih;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hm0;
public final class r4 extends hm0 {
    public h3.g0 h;
    public final g5 f12067n;

    public r4(g5 g5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f12067n = g5Var;
    }

    @Override
    public final void a(String str) {
        h3.g0 g0Var = this.h;
        if (g0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g0Var);
        }
        this.h = new h3.g0(15, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            g5 g5Var = this.f12067n;
            if (!g5Var.M) {
                g5Var.M = true;
                g5Var.f11483w.E();
                g5Var.f11484x.h1(0, -g5Var.f11481r.getPaddingTop());
            }
        }
    }
}
