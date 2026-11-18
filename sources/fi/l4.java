package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.rl0;
public final class l4 extends rl0 {
    public di.w2 f12217f;
    public final a5 h;

    public l4(a5 a5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = a5Var;
    }

    @Override
    public final void a(String str) {
        di.w2 w2Var = this.f12217f;
        if (w2Var != null) {
            org.telegram.messenger.g0.r(w2Var);
        }
        this.f12217f = new di.w2(28, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.g0.h3(this.f12217f, 300L);
        } else {
            this.f12217f.run();
        }
        if (this.f12217f != null) {
            a5 a5Var = this.h;
            if (!a5Var.R) {
                a5Var.R = true;
                a5Var.f11734x.E();
                a5Var.f11735y.h1(0, -a5Var.f11731r.getPaddingTop());
            }
        }
    }
}
