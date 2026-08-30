package nh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.en0;
public final class o4 extends en0 {
    public n4 h;
    public final d5 f15706n;

    public o4(d5 d5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f15706n = d5Var;
    }

    @Override
    public final void a(String str) {
        n4 n4Var = this.h;
        if (n4Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n4Var);
        }
        this.h = new n4(0, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            d5 d5Var = this.f15706n;
            if (!d5Var.N) {
                d5Var.N = true;
                d5Var.f15272w.E();
                d5Var.f15273x.h1(0, -d5Var.f15270r.getPaddingTop());
            }
        }
    }
}
