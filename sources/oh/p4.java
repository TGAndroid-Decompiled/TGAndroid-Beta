package oh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.en0;
public final class p4 extends en0 {
    public z1 h;
    public final e5 f17627n;

    public p4(e5 e5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f17627n = e5Var;
    }

    @Override
    public final void a(String str) {
        z1 z1Var = this.h;
        if (z1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z1Var);
        }
        this.h = new z1(3, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            e5 e5Var = this.f17627n;
            if (!e5Var.N) {
                e5Var.N = true;
                e5Var.f17035w.E();
                e5Var.f17036x.h1(0, -e5Var.f17033r.getPaddingTop());
            }
        }
    }
}
