package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.el0;
public final class v4 extends el0 {
    public z0 f9868f;
    public final k5 h;

    public v4(k5 k5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = k5Var;
    }

    @Override
    public final void a(String str) {
        z0 z0Var = this.f9868f;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
        }
        this.f9868f = new z0(5, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.g0.i3(this.f9868f, 300L);
        } else {
            this.f9868f.run();
        }
        if (this.f9868f != null) {
            k5 k5Var = this.h;
            if (!k5Var.Q) {
                k5Var.Q = true;
                k5Var.f9308x.E();
                k5Var.f9309y.h1(0, -k5Var.f9305r.getPaddingTop());
            }
        }
    }
}
