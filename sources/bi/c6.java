package bi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wm0;
public final class c6 extends wm0 {
    public a1.e h;
    public final s6 f2819n;

    public c6(s6 s6Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f2819n = s6Var;
    }

    @Override
    public final void a(String str) {
        a1.e eVar = this.h;
        if (eVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
        }
        this.h = new a1.e(22, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            s6 s6Var = this.f2819n;
            if (!s6Var.Q) {
                s6Var.Q = true;
                s6Var.f3698w.E();
                s6Var.f3699x.h1(0, -s6Var.f3696r.getPaddingTop());
            }
        }
    }
}
