package ai;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wm0;
public final class t6 extends wm0 {
    public a1.e h;
    public final j7 f1550n;

    public t6(j7 j7Var, Context context, d dVar) {
        super(context, 13.0f, dVar);
        this.f1550n = j7Var;
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
            j7 j7Var = this.f1550n;
            if (!j7Var.Q) {
                j7Var.Q = true;
                j7Var.f1049w.E();
                j7Var.f1050x.h1(0, -j7Var.f1047r.getPaddingTop());
            }
        }
    }
}
