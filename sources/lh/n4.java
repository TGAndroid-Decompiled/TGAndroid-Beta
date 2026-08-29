package lh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.um0;
public final class n4 extends um0 {
    public r3 h;
    public final c5 f15975n;

    public n4(c5 c5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f15975n = c5Var;
    }

    @Override
    public final void a(String str) {
        r3 r3Var = this.h;
        if (r3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r3Var);
        }
        this.h = new r3(1, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            c5 c5Var = this.f15975n;
            if (!c5Var.M) {
                c5Var.M = true;
                c5Var.f15440w.E();
                c5Var.f15441x.h1(0, -c5Var.f15438r.getPaddingTop());
            }
        }
    }
}
