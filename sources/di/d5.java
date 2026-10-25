package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.do0;
public final class d5 extends do0 {
    public b4 f8489f;
    public final t5 h;

    public d5(t5 t5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = t5Var;
    }

    @Override
    public final void a(String str) {
        b4 b4Var = this.f8489f;
        if (b4Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b4Var);
        }
        this.f8489f = new b4(1, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.f8489f, 300L);
        } else {
            this.f8489f.run();
        }
        if (this.f8489f != null) {
            t5 t5Var = this.h;
            if (!t5Var.Q) {
                t5Var.Q = true;
                t5Var.f9198w.E();
                t5Var.f9199x.h1(0, -t5Var.f9196r.getPaddingTop());
            }
        }
    }
}
