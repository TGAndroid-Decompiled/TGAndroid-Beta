package jh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.km0;

public final class n4 extends km0 {
    public hh.m5 h;

    public final c5 f13697n;

    public n4(c5 c5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f13697n = c5Var;
    }

    @Override
    public final void a(String str) {
        hh.m5 m5Var = this.h;
        if (m5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m5Var);
        }
        this.h = new hh.m5(24, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            c5 c5Var = this.f13697n;
            if (c5Var.M) {
                return;
            }
            c5Var.M = true;
            c5Var.f13158w.E();
            c5Var.f13159x.h1(0, -c5Var.f13156r.getPaddingTop());
        }
    }
}
