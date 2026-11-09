package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.fl0;
public final class w4 extends fl0 {
    public z0 f9896f;
    public final l5 h;

    public w4(l5 l5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = l5Var;
    }

    @Override
    public final void a(String str) {
        z0 z0Var = this.f9896f;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
        }
        this.f9896f = new z0(5, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.g0.i3(this.f9896f, 300L);
        } else {
            this.f9896f.run();
        }
        if (this.f9896f != null) {
            l5 l5Var = this.h;
            if (!l5Var.Q) {
                l5Var.Q = true;
                l5Var.f9332x.E();
                l5Var.f9333y.h1(0, -l5Var.f9329r.getPaddingTop());
            }
        }
    }
}
