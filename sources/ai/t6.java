package ai;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xm0;
public final class t6 extends xm0 {
    public a1.e h;
    public final k7 f1555n;

    public t6(k7 k7Var, Context context, d dVar) {
        super(context, 13.0f, dVar);
        this.f1555n = k7Var;
    }

    @Override
    public final void a(String str) {
        a1.e eVar = this.h;
        if (eVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
        }
        this.h = new a1.e(13, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            k7 k7Var = this.f1555n;
            if (!k7Var.Q) {
                k7Var.Q = true;
                k7Var.f1135w.E();
                k7Var.f1136x.h1(0, -k7Var.f1133r.getPaddingTop());
            }
        }
    }
}
